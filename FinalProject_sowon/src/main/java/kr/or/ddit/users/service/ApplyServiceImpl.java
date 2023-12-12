package kr.or.ddit.users.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.or.ddit.common.ServiceResult;
import kr.or.ddit.common.vo.ResumeScoreVO;
import kr.or.ddit.company.vo.AProcedureVO;
import kr.or.ddit.users.dao.ApplyDAO;
import kr.or.ddit.users.vo.ApplyVO;
import kr.or.ddit.users.vo.ResumeAttatchVO;
import kr.or.ddit.users.vo.ResumeFileInfoVO;
import lombok.val;
import oracle.security.o5logon.d;

@Service
public class ApplyServiceImpl implements ApplyService{
	
	@Inject
	private ApplyDAO dao;
	
	
	
//	@Value("#{appInfo.resumeFiles}")
//	private Resource resumeFiles;
//	
//	private void processReFiles(ApplyVO apply) {
//		List<ResumeAttatchVO> attatchList = apply.getAttatchList();
//		
//		if(attatchList != null) {
//			attatchList.stream().forEach((atch)->{
//				try {
//					dao.createResumeAttatch(atch);
//					atch.saveTo(resumeFiles.getFile());
//					if(1==1) {
//						throw new IOException("강제 예외 발생");
//					}
//				}catch (Exception e) {
//					throw new RuntimeException(e);
//				}
//			});
//		}
//	}
	
	
	
	//지원!!!!!
	@Override
	//@Transactional  
	public ServiceResult createApply(ApplyVO applyvo) {
		ServiceResult result = null;
		int cnt =dao.createApply(applyvo); //지원 insert
		 if(cnt>0) {
			
			 AProcedureVO aprocedureVO= applyvo.getAprocedure();
			 aprocedureVO.setAplNo(applyvo.getAplNo());
			 int aprocedure = dao.creatAprocedure(aprocedureVO); //지원절차 1차로  insert
			 
			 // result = (attatchcnt > 0 && aprocedure > 0) ? ServiceResult.OK : ServiceResult.FAIL; //우선 주석
			 result = aprocedure > 0 ? ServiceResult.OK : ServiceResult.FAIL;
//			 result = ServiceResult.OK;
			 
		 }else{
			 result = ServiceResult.FAIL;
		 }
		return result;
	}

	//이미지 저장
	@Override
	public ServiceResult createResumeAttatch(ResumeAttatchVO attatch) {
		ServiceResult result = null;
		int rowcnt = dao.createResumeAttatch(attatch);
		if(rowcnt>0) {
			//예외 전환으로 
			result=ServiceResult.OK;
		
		}else {
			result = ServiceResult.FAIL;
		}
	     return result;
	}

	//입사 지원시 자신의 이력서 리스트
	@Override
	public List<ResumeFileInfoVO> retrieveResumeList(String usersId) {
		
		return dao.resumeList(usersId);
	}

	// 채용공고 중복 지원 막기
	@Override
	public ServiceResult selectCheckApply(ApplyVO applyVO) {
		
		ServiceResult result = null;
		int cnt = dao.selectCheckApply(applyVO);
		
		if(cnt>0) {
			//이미 지원함
			result = ServiceResult.FAIL;
		}else {
			result = ServiceResult.OK;
		}
		return result;
	}
//	@Override
//	public ServiceResult creatAprocedure(AProcedureVO aprocedure) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}

package kr.or.ddit.users.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kr.or.ddit.common.ServiceResult;
import kr.or.ddit.company.vo.AProcedureVO;
import kr.or.ddit.users.vo.ApplyVO;
import kr.or.ddit.users.vo.ResumeAttatchVO;
import kr.or.ddit.users.vo.ResumeFileInfoVO;

public interface ApplyService {
	
	/**
	 * 입사 지원시 자신의 이력서 리스트
	 * @return
	 */
	public List<ResumeFileInfoVO>retrieveResumeList(String usersId);	
	
	/**
	 * 채용 공고 지원
	 * @param applyvo
	 * @return
	 */
	public ServiceResult createApply(ApplyVO applyvo);

	
	/**
	 * 이력서 첨부파일 서비스가 필요한가????
	 * @param vo
	 * @return
	 */
	public ServiceResult createResumeAttatch(ResumeAttatchVO vo);
	
	/**
	 * 지원절차 1차 insert???
	 * @param aprocedure
	 * @return
	 */
//	public ServiceResult creatAprocedure(AProcedureVO aprocedure);

	
	/**
	 * 채용공고 중복 지원 막기
	 * @param applyVO
	 * @return
	 */
	public ServiceResult selectCheckApply(ApplyVO applyVO);
	

}

package kr.or.ddit.users.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.or.ddit.common.ServiceResult;
import kr.or.ddit.paging.vo.PaginationInfo;
import kr.or.ddit.users.dao.ResumeDAO;
import kr.or.ddit.users.vo.CareerVO;
import kr.or.ddit.users.vo.CertificateVO;
import kr.or.ddit.users.vo.CoverLetterVO;
import kr.or.ddit.users.vo.EducationVO;
import kr.or.ddit.users.vo.IntrnActvtVO;
import kr.or.ddit.users.vo.LanguageVO;
import kr.or.ddit.users.vo.OverseasStudyVO;
import kr.or.ddit.users.vo.ResumeFileInfoVO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ResumeServiceImpl implements ResumeService{
	
	private final ResumeDAO dao;

	@Override
	public ServiceResult createResume(ResumeFileInfoVO resumeVO) {
		int cnt = dao.insertResume(resumeVO);
		return cnt > 0 ? ServiceResult.OK : ServiceResult.FAIL;
	}

	@Override
	public ResumeFileInfoVO retrieveResume(String resumeNo) {
		return dao.selectResumeInfo(resumeNo);
	}
	
	@Override
	public List<EducationVO> retrieveEduInfo(String resumeNo) {
		return dao.selectEduInfo(resumeNo);
	}
	
	@Override
	public List<CertificateVO> retrieveCerInfo(String resumeNo) {
		return dao.selectCerInfo(resumeNo);
	}
	
	@Override
	public List<CoverLetterVO> retrieveCovList(String resumeNo) {
		return dao.selectCovInfo(resumeNo);
	}
	
	@Override
	public List<LanguageVO> retrieveLagList(String resumeNo) {
		return dao.selectLagInfo(resumeNo);
	}
	
	@Override
	public List<IntrnActvtVO> retrieveInaList(String resumeNo) {
		return dao.selectInaInfo(resumeNo);
	}
	
	@Override
	public List<OverseasStudyVO> retrieveOstList(String resumeNo) {
		return dao.selectOstInfo(resumeNo);
	}
	
	@Override
	public List<CareerVO> retrieveCarList(String resumeNo) {
		return dao.selectCarInfo(resumeNo);
	}
	
	@Override
	public void retrieveResumeList(PaginationInfo<ResumeFileInfoVO> paging) {
		int totalRecord =dao.selectTotalRecord(paging);
		paging.setTotalRecord(totalRecord);
		List<ResumeFileInfoVO>dataList = dao.selectResumeList(paging);
		paging.setDataList(dataList);
	}

	@Override
	public ServiceResult modifyResume(ResumeFileInfoVO resumeVO) {
		int cnt = dao.updateResume(resumeVO);
		return cnt > 0 ? ServiceResult.OK : ServiceResult.FAIL;
	}

	@Override
	public ServiceResult removeResume(ResumeFileInfoVO resumeVO) {
		int cnt = dao.deleteResume(resumeVO);
		return cnt > 0 ? ServiceResult.OK : ServiceResult.FAIL;
	}
}

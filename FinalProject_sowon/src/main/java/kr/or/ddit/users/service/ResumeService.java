package kr.or.ddit.users.service;

import java.util.List;

import kr.or.ddit.common.ServiceResult;
import kr.or.ddit.paging.vo.PaginationInfo;
import kr.or.ddit.users.vo.CareerVO;
import kr.or.ddit.users.vo.CertificateVO;
import kr.or.ddit.users.vo.CoverLetterVO;
import kr.or.ddit.users.vo.EducationVO;
import kr.or.ddit.users.vo.IntrnActvtVO;
import kr.or.ddit.users.vo.LanguageVO;
import kr.or.ddit.users.vo.OverseasStudyVO;
import kr.or.ddit.users.vo.ResumeFileInfoVO;

public interface ResumeService {

	/**
	 * 이력서 등록
	 * @param resumeVO
	 */
	public ServiceResult createResume(ResumeFileInfoVO resumeVO);

	/**
	 * 이력서 상세 조회
	 * @param resumeNo
	 * @return
	 */
	public ResumeFileInfoVO retrieveResume(String resumeNo);
	
	/**
	 * 학력 조회
	 * @param resumeNo
	 * @return
	 */
	public List<EducationVO> retrieveEduInfo(String resumeNo);
	
	/**
	 * 자격증 조회
	 * @param resumeNo
	 * @return
	 */
	public List<CertificateVO> retrieveCerInfo(String resumeNo);
	
	/**
	 * 자기소개서 조회
	 * @param resumeNo
	 * @return
	 */
	public List<CoverLetterVO> retrieveCovList(String resumeNo);
	
	/**
	 * 어학 조회
	 * @param resumeNo
	 * @return
	 */
	public List<LanguageVO> retrieveLagList(String resumeNo);
	
	/**
	 * 대외활동 조회
	 * @param resumeNo
	 * @return
	 */
	public List<IntrnActvtVO> retrieveInaList(String resumeNo);
	
	/**
	 * 해외연수 조회
	 * @param resumeNo
	 * @return
	 */
	public List<OverseasStudyVO> retrieveOstList(String resumeNo);
	
	/**
	 * 경력 사항 조회
	 * @param resumeNo
	 * @return
	 */
	public List<CareerVO> retrieveCarList(String resumeNo);
	
	/**
	 * 이력서 리스트 조회
	 * @param paging
	 */
	public void retrieveResumeList(PaginationInfo<ResumeFileInfoVO> paging);
	
	/**
	 * 이력서 수정
	 * @param resumeVO
	 */
	public ServiceResult modifyResume(ResumeFileInfoVO resumeVO);
	
	/**
	 * 이력서 삭제
	 * @param inputData
	 */
	public ServiceResult removeResume(ResumeFileInfoVO resumeVO);
}

package kr.or.ddit.users.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.multipart.MultipartFile;

import kr.or.ddit.common.vo.ResumeScoreVO;
import kr.or.ddit.company.vo.AProcedureVO;
import kr.or.ddit.users.vo.ApplyVO;
import kr.or.ddit.users.vo.ResumeAttatchVO;
import kr.or.ddit.users.vo.ResumeFileInfoVO;

@Mapper
public interface ApplyDAO {
	
	/**
	 * 입사 지원
	 * @param applyvo
	 * @return
	 */
	public int createApply(ApplyVO applyVO);
	
	/**
	 * 입사 지원시 자신의 이력서 리스트
	 * @return
	 */
	public List<ResumeFileInfoVO>resumeList(String usersId);	
	
	/**
	 * 이력서 첨부파일
	 * @param attatch
	 * @return
	 */
	public int createResumeAttatch(ResumeAttatchVO attatch);
	
	/**
	 * 지원절차 1차 insert
	 * @param aprocedure
	 * @return
	 */
	public int creatAprocedure(AProcedureVO aprocedure);

	/**
	 * 채용공고 중복 지원 막기
	 * @param applyVO
	 * @return
	 */
	public int selectCheckApply(ApplyVO applyVO);
	

}

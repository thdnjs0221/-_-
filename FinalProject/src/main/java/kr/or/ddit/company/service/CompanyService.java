package kr.or.ddit.company.service;

import org.apache.ibatis.annotations.Param;

import kr.or.ddit.common.ServiceResult;
import kr.or.ddit.company.vo.CompanyVO;

public interface CompanyService {
	
	/**
	 * 기업 회원가입
	 * @param companyVO
	 * @return
	 */
	public ServiceResult createCompany (CompanyVO companyVO); 
	
	
	/**
	 * 아이디 중복
	 * @param companyId
	 * @return
	 */
	public CompanyVO selectCompany(@Param("companyId")String companyId);
	
	

}

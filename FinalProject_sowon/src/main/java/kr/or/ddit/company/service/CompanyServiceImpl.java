package kr.or.ddit.company.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.or.ddit.common.ServiceResult;
import kr.or.ddit.company.dao.CompanyDAO;
import kr.or.ddit.company.vo.CompanyVO;

@Service
public class CompanyServiceImpl implements CompanyService {
	
	@Inject
	private CompanyDAO dao;
	
	

	@Override
	public ServiceResult createCompany(CompanyVO companyVO) {
		ServiceResult result = null;
			int cnt = dao.createCompany(companyVO);
			
			return result = cnt > 0 ? ServiceResult.OK : ServiceResult.FAIL;	
		}
		


	
	// 아이디 중복
	@Override
	public CompanyVO selectCompany(String companyId) {
		return dao.selectCompany(companyId);
	}

}

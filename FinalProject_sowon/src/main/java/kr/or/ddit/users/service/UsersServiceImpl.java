package kr.or.ddit.users.service;

import org.springframework.stereotype.Service;

import kr.or.ddit.common.ServiceResult;
import kr.or.ddit.users.dao.UsersDAO;
import kr.or.ddit.users.vo.UsersVO;
import lombok.RequiredArgsConstructor;
import oracle.security.o5logon.d;

@RequiredArgsConstructor
@Service
public class UsersServiceImpl implements UsersService{
	
	private final UsersDAO dao;

	


}

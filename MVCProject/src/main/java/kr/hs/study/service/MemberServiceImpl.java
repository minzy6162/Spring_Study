package kr.hs.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hs.study.model.dao.MemberDAO;
import kr.hs.study.model.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO dao;
	
	public List<MemberDTO> list() {
		List<MemberDTO> dao1=dao.list();
		return dao1;
	}

	public void insert(MemberDTO dto) {
		// TODO Auto-generated method stub

	}

	public MemberDTO read(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

}

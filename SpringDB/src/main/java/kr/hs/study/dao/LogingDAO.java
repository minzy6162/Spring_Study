package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.LoginDTO;

@Component
public class LogingDAO {
	// 멤버변수로 자동주입
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//추가
	public void insert_data(LoginDTO dto) {
		String sql = "insert into login values(?,?)";
		jdbcTemplate.update(sql,dto.getUserid(), dto.getUserpass());
	}

}

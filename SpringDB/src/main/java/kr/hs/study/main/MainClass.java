package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.LoginDAO;
import kr.hs.study.dto.LoginDTO;

public class MainClass {
public static void main(String ar[]) {
	AnnotationConfigApplicationContext  ctx=new AnnotationConfigApplicationContext(JavaConfig.class);
	LoginDAO dao=ctx.getBean(LoginDAO.class);
	//LoginDTO bean1=ctx.getBean(LoginDTO.class);
	/*
	 * bean1.setUserid("kim"); 
	 * bean1.setUserpass(1111); 
	 * dao.insert_data(bean1);
	 * System.out.println("저장완료");
	 */
	/*
	 * LoginDTO bean3=ctx.getBean(LoginDTO.class); bean3.setUserid("park");
	 * bean3.setUserpass(1111); dao.insert_data(bean3);
	 */
	//LoginDto  가져오기(id: bean2)
	//바꿀 비밀번호로 세팅
	//dao메서드 호출
 


	 LoginDTO bean2=ctx.getBean(LoginDTO.class); 
	 bean2.setUserid("kim");
	 bean2.setUserpass(3333); 
	 dao.update_data(bean2); 
	 System.out.println("수정완료");

	 
	List<LoginDTO> list=dao.select();
	for(LoginDTO dto: list) {
		System.out.println(dto.getUserid());
		System.out.println(dto.getUserpass());
		
	}
	ctx.close();
}
}

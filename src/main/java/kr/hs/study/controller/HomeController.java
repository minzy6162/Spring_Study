package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST}) //GET, POST로 둘다 접속해도 처리됨
	public String home() {
		System.out.println("home");
		return "index";
	}

	// get 방식으로 /test1으로 접속했을 때 콘솔에 test1출력
	// test1.jsp만들어서 web으로 출력
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public String menu() {
		System.out.println("menu");
		return "menu";
	}

}

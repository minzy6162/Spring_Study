package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST}) //GET, POST�� �Ѵ� �����ص� ó����
	public String home() {
		System.out.println("home");
		return "index";
	}

	// get ������� /test1���� �������� �� �ֿܼ� test1���
	// test1.jsp���� web���� ���
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public String menu() {
		System.out.println("menu");
		return "menu";
	}

}

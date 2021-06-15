package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.model.LoginDTO;
import kr.hs.study.model.ModelDTO;

@Controller
public class TestController {

	@GetMapping("/test1")
	public String test1(@ModelAttribute ModelDTO dto) {
		System.out.println("a: " + dto.getA());
		System.out.println("b: " + dto.getB());
		System.out.println("c: " + dto.getC());
		return "result";
	}

	@GetMapping("/test2")
	public String test2() {
		return "login_form";
	}

	@PostMapping("/test2")
	public String test2(@ModelAttribute LoginDTO dto) {
		System.out.println(dto.getUid());
		System.out.println(dto.getUpass());
		return "result";
	}

	@GetMapping("/test3")
	public String test3(@ModelAttribute ModelDTO dto) {
		System.out.println("a: " + dto.getA());
		System.out.println("b: " + dto.getB());
		System.out.println("c: " + dto.getC());
		return "result";
	}

}
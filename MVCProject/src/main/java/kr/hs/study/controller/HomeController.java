package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
    @GetMapping("/")
	public String home() {
		System.out.println("home");
		return "index";
	}
	
    @GetMapping("/sum")
	public String sum() {
		return "sum";
	}
	@PostMapping("/sum")
	public String sum2(@RequestParam int n, @RequestParam int m, Model model) {
		int sum = 0;
		
		if(n>m) {
			int temp = n;
			n = m;
			m = temp;
		}
		for(int i=n; i<=m; i++) {
			sum += i;
		}
		model.addAttribute("sum", n+"부터 "+m+"까지의 합은 "+sum);
		return "sum";
	}
	
	

}

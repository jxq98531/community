package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: community
 * @description
 * @author: 金晓强
 * @create: 2019-12-02 17:59
 **/
@Controller
public class IndexController {

	@GetMapping("/")
	public String index(){
		return "index";

	}
}

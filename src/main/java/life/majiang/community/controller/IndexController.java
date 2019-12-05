package life.majiang.community.controller;

import life.majiang.community.dto.PaginationDTO;
import life.majiang.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: community
 * @description
 * @author: 金晓强
 * @create: 2019-12-02 17:59
 **/
@Controller
public class IndexController {



	@Autowired
	private QuestionService questionService;

	@GetMapping("/")
	public String index(HttpServletRequest request,
	                    Model model,
	                    @RequestParam(name = "page", defaultValue = "1") Integer page,
	                    @RequestParam(name = "size", defaultValue = "5") Integer size) {


		PaginationDTO pagination = questionService.list(page,size);

		model.addAttribute("pagination", pagination);

		return "index";

	}
}

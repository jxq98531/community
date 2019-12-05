package life.majiang.community.controller;

import life.majiang.community.mapper.QuestionMapper;
import life.majiang.community.mapper.UserMapper;
import life.majiang.community.model.Question;
import life.majiang.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @program: community
 * @description
 * @author: 金晓强
 * @create: 2019-12-03 19:01
 **/
@Controller
public class PublishController {
	@Autowired
	private QuestionMapper questionMapper;
	@Autowired
	private UserMapper userMapper;

	@GetMapping("/publish")
	public String publish(){
		return "publish";
	}

	@PostMapping("/publish")
	public String doPublish(
			@RequestParam(value = "title")String title,
			@RequestParam(value = "description")String description,
			@RequestParam(value = "tag")String tag,
			HttpServletRequest request,
			Model model){
		model.addAttribute("title",title);
		model.addAttribute("description",description);
		model.addAttribute("tag",tag);

		if (title==null || title==""){
			model.addAttribute("error","标题不能为空");
			return  "publish";
		}
		if (description==null || description==""){
			model.addAttribute("error","问题补充不能为空");
			return  "publish";
		}
		if (tag==null || tag==""){
			model.addAttribute("error","标签不能为空");
			return  "publish";
		}


		User user = null;

		Cookie[] cookies = request.getCookies();
		if (cookies != null && cookies.length != 0) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("token")) {
					String token = cookie.getValue();
					user = userMapper.findByToken(token);

					if (user != null) {
						request.getSession().setAttribute("user", user);
					}
					break;
				}
			}
		}

		if (user == null){
			model.addAttribute("error","用户未登录");
			return "publish";
		}

		Question question = new Question();
		question.setTitle(title);
		question.setDescription(description);
		question.setTag(tag);
		question.setCreator(user.getId());
		question.setGmtCreate(System.currentTimeMillis());
		question.setGmtModified(question.getGmtCreate());


		questionMapper.create(question);

		return "redirect:/";

	}
}
package life.majiang.community.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: community
 * @description
 * @author: 金晓强
 * @create: 2019-12-05 21:25
 **/
@Configuration
public class WebConfig  implements WebMvcConfigurer {

	@Autowired
	private SessionInterceptor sessionInterceptor;

	public void addInterceptors(InterceptorRegistry regisytry){
		regisytry.addInterceptor(sessionInterceptor).addPathPatterns("/**");
	}

}

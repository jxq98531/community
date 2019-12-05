package life.majiang.community.dto;

import lombok.Data;

/**
 * @program: community
 * @description
 * @author: 金晓强
 * @create: 2019-12-02 22:19
 **/
@Data
public class GithubUser {

	private String name;
	private  Long id;
	private String bio;
	private String avatarUrl;


}

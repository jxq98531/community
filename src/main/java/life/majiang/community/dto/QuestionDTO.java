package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

/**
 * @program: community
 * @description
 * @author: 金晓强
 * @create: 2019-12-04 20:12
 **/
@Data
public class QuestionDTO {


	private Integer id;
	private String title;
	private String description;
	private String tag;
	private Long gmtCreate;
	private Long gmtModified;
	private Integer creator;
	private Integer viewCount;
	private Integer commentCount;
	private Integer likeCount;
	private User user;

}

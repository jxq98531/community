package life.majiang.community.model;

import lombok.Data;

/**
 * @program: community
 * @description
 * @author: 金晓强
 * @create: 2019-12-03 21:57
 **/
@Data
public class Question {
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


}

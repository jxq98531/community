package life.majiang.community.dto;

import lombok.Data;

/**
 * @program: community
 * @description
 * @author: 金晓强
 * @create: 2019-12-02 21:44
 **/
@Data
public class AccessTokenDTO {

	private String client_id;
	private String client_secret;
	private String code;
	private String redirect_uri;
	private String state;


}

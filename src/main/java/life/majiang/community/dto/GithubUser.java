package life.majiang.community.dto;

/**
 * @program: community
 * @description
 * @author: 金晓强
 * @create: 2019-12-02 22:19
 **/
public class GithubUser {

	private String name;
	private  Long id;
	private String bio;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}
}
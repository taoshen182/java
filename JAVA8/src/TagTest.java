import com.pojo.UserInfo;

public class TagTest {
	public static void main(String[] args) {
		UserInfo user = new UserInfo();
		user.setUsername("wangtao");
		String username = user.getUsername();
		System.out.println(username);
		
	}

}

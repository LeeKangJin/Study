package test;

import com.UserBiz;

import frame.Biz;
import vo.User;

public class UserModify {

	public static void main(String[] args) {
		String key = "id999";
		
		User modifyU = new User(key,"pwd111","MYMYNAME");
		
		Biz<String,User> biz = new UserBiz();
		
		try {
			biz.modify(modifyU);
			System.out.println("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

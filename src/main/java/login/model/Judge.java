package main.java.login.model;

/**
 * 判断是大几的学生
 * 
 * @author man
 * 
 */
public class Judge {

	int dayi = 20170000;
	int daer = 20160000;
	int dasan = 20150000;
	int dasi = 20140000;

	public String judge(String username) {
		try {
			
			int name = Integer.valueOf(username);
			if (name - dayi > 0 && name - dayi < 10000) {
				return "userone";
			} else if (name - daer > 0 && name - daer < 10000) {
				return "usertwo";
			} else if (name - dasan > 0 && name - dasan < 10000) {
				return "userthree";
			} else if (name - dasi > 0 && name - dasi < 10000) {
				return "userfour";
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("捕获异常，登录为教师登录方式");
			return "systeacher";
		}
		return "systeacher";
	}
}

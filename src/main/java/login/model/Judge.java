package main.java.login.model;

/**
 * �ж��Ǵ󼸵�ѧ��
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
			System.out.println("�����쳣����¼Ϊ��ʦ��¼��ʽ");
			return "systeacher";
		}
		return "systeacher";
	}
}

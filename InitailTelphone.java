package part2_11;

public class InitailTelphone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Std2_11 phone = new Std2_11();
		phone.sendMessage(); 
		//通常对实例变量进行两个操作
		//1.给实例变量赋值
		phone.screen = 5.0f;
		phone.cpu = 1.4f;
		phone.mem = 2.0f;
		//调用对象的方法
		phone.sendMessage();
	}

}

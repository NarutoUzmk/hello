package part2_11;

public class InitailTelphone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Std2_11 phone = new Std2_11();
		phone.sendMessage(); 
		//ͨ����ʵ������������������
		//1.��ʵ��������ֵ
		phone.screen = 5.0f;
		phone.cpu = 1.4f;
		phone.mem = 2.0f;
		//���ö���ķ���
		phone.sendMessage();
	}

}

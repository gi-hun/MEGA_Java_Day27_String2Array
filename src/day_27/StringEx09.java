//# ���ڿ� 2����
package day_27;

public class StringEx09 {
	public static void main(String[] args) {
		// ����) �̸��� ������ �ϳ��� ���ڿ��� ����
		// ����) "��ö��/87,�̸���/42,�̿���/95"
		
		String[] name = {"��ö��", "�̸���", "�̿���"};
		int[] score = {87, 42, 95};
		
		String str = "";
		
		for(int i=0;i<3;i++)
		{
			str += name[i];
			str += "/";
			System.out.println(str);
			str += score[i] + "";
			if(i != name.length-1)
			{
				str += ",";
			}
		}
		
		System.out.println(str);

	}
}

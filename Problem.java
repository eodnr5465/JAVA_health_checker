public class Problem{ 
	
	private static String pForm;
	private static String aForm;

	
	public static void printPForm(String x) {
	     System.out.println(x);
	}
	public static void printAForm(String y) {
		System.out.println(y);
	}
	
	
	public static void Question(int num) {
		if(num == 1) {
			    pForm = "1. �Ϸ翡 �� �� ���� ���� ���ô��� ���ÿ�.";
			    aForm = "(1) 1~3�� \n(2) 4~6�� \n(3) 7�� �̻� ";
			    printPForm(pForm);
			    printAForm(aForm);
			    
		} else if(num == 2) {
			    pForm = "2. �����Ͽ� ���ָ� �� �� �ϴ��� ���ÿ�.";
			    aForm = "(1) 4�� �̻�\n(2) 1~3��\n(3) ���Ѵ�";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		  else if(num == 3) {
				pForm = "3. �����Ͽ� Ŀ�Ǹ� �� �� ���ô��� ���ÿ�.";
				aForm = "(1) 5�� �̻�\n(2) 2~4��\n(3) 1�� ����";
			    printPForm(pForm);
			    printAForm(aForm);
			}
		else if(num == 4) {
				pForm = "4. �Ϸ翡 �� �� �Һ��� ������ ���ÿ�.";
				aForm = "(1) 1~4�� \n(2) 9�� �̻� \n(3) 5~8��";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		else if(num == 5) {
				pForm = "5. �Ϸ翡 ��͸� �� �� ����� ���ÿ�.";
				aForm = "(1) 8��~12��\n(2) 24�� �̻�\n(3) 16~20��";
			    printPForm(pForm);
			    printAForm(aForm);	
				
		}
		 else if(num == 6) {
			    pForm = "6. �Ϸ� �뺯 Ƚ���� ���ÿ�.";
			    aForm = "(1) 1~2��\n(2) 5�� �̻�\n(3) 3~4��";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 7) {
			    pForm = "7. �����Ͽ� 20���̻� ��ϴ� ���� ���� ���ÿ�.";
			    aForm = "(1) 0~1��\n(2) 2~3��\n(3) 4�� �̻�";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 8) {
			    pForm = "8. ���ϴ� ������ ���ÿ�.";
			    aForm = "(1) �Ϸ翡 �Ѱ� �̻�\n(2) �Ϸ翡 �ݰ� ����\n(3) ���Ѵ�";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 9) {
			    pForm = "9. �Ϸ� ���� �ð��� ���ÿ�.";
			    aForm = "(1) 1~3�ð�\n(2) 4~6�ð�\n(3) 7~9�ð�";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 10) {
			    pForm = "10. �Ϸ� �ұ� ���뷮�� ���ÿ�.";
			    aForm = "(1) 8g�̻�\n(2) 6~7g\n(3) 4~5g";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 11) {
			    pForm = "11. ź������ ���� ������ ���ÿ�.";
			    aForm = "(1) ���� ���Ŵ�\n(2) 2~3�Ͽ� �ѹ�\n(3) ���� ������ �ʴ´�";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 12) {
			    pForm = "12. �н�ƮǪ�峪 Ƣ������ ���� ������ ���ÿ�.";
			    aForm = "(1) ��4ȸ �̻�\n(2) ��1~3ȸ\n(3) ���� ���� �ʴ´�";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 13) {
			    pForm = "13. ���� ����ִ� ���� ���ÿ�.";
			    aForm = "(1) �뵵��\n(2) �߼ҵ���\n(3) �ð�";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 14) {
			    pForm = "14. ������ �� �ῡ�� ���� ���� ���� ���� ���ÿ�.";
			    aForm = "(1) 3�� �̻�\n(2) 1~2��\n(3) ����";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 15) {
			    pForm = "15. ������ �� ��Ʈ������ ���� �޴� ���� ���� ���ÿ�.";
			    aForm = "(1) 4�� �̻�\n(2) 1~3��\n(3) ����";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 16) {
			    pForm = "16. �ڽ��� ü�� ������ ���ÿ�.";
			    aForm = "(1) ��\n(2) ��ü��\n(3) ����ü��";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 17) {
			    pForm = "17. ������ �� �ǰ��ؼ� ������ �ڴ� ���� ���� ���ÿ�.";
			    aForm = "(1) 4�� �̻�\n(2) 2~3��\n(3) 1�� ����";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 18) {
			    pForm = "18. ������ �� �Ű����� ���ϰ� �������� ���� ���� ���ÿ�.";
			    aForm = "(1) 3�� �̻�\n(2) 1~2��\n(3) ����";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 19) {
			    pForm = "19. ������ �� ������ ���ϰ� �������� ���� ���� ���ÿ�.";
			    aForm = "(1) 4�� �̻�\n(2) 2~3��\n(3) 1�� ����";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 20) {
			    pForm = "20. ������ �� �̻�(�����)�� ���� ���� ���� ���ÿ�.";
			    aForm = "(1) 4�� �̻�\n(2) 2~3��\n(3) 1�� ����";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 21) {
			    pForm = "21. ���� ������ ���� �Ͼ�°�?";
			    aForm = "(1) ���� �����̴�\n(2) �����Ͽ� 1~2ȸ �Ͼ��\n(3) ���� �Ͼ�� �ʴ´�";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 22) {
			    pForm = "22. �ڸ��� ������ ���� �Ͼ�°�?";
			    aForm = "(1) ���� ���� �Ͼ��\n(2) �����Ͽ� 1~2ȸ �Ͼ��\n(3) ���� �Ͼ�� �ʴ´�";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 23) {
			    pForm = "23. �뺯 �ҿ�ð��� ���ÿ�.";
			    aForm = "(1) 8�� �̻�\n(2) 5~8��\n(3) 5�� ����";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 24) {
			    pForm = "24. �����Ͽ� ���� ��Ģ������ �Դ� ���� ���� ���ÿ�.";
			    aForm = "(1) 3�� ����\n(2) 4~5��\n(3) 6~7��";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 25) {
			    pForm = "25. ������ �߽� Ƚ���� ���ÿ�.";
			    aForm = "(1) 4ȸ �̻�\n(2) 2~3ȸ\n(3) 1ȸ ����";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 26) {
			    pForm = "26. �Ϸ翡 �� �ð� �ɾ��ִ��� ���ÿ�.";
			    aForm = "(1) 8�ð� �̻�\n(2) 4~7�ð�\n(3) 4�ð� ����";
			    printPForm(pForm);
			    printAForm(aForm);
		}
	
  }
}
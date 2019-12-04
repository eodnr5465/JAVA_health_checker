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
			    pForm = "1. 하루에 몇 컵 정도 물을 마시는지 고르시오.";
			    aForm = "(1) 1~3컵 \n(2) 4~6컵 \n(3) 7컵 이상 ";
			    printPForm(pForm);
			    printAForm(aForm);
			    
		} else if(num == 2) {
			    pForm = "2. 일주일에 음주를 몇 번 하는지 고르시오.";
			    aForm = "(1) 4번 이상\n(2) 1~3번\n(3) 안한다";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		  else if(num == 3) {
				pForm = "3. 일주일에 커피를 몇 번 마시는지 고르시오.";
				aForm = "(1) 5번 이상\n(2) 2~4번\n(3) 1번 이하";
			    printPForm(pForm);
			    printAForm(aForm);
			}
		else if(num == 4) {
				pForm = "4. 하루에 몇 번 소변을 누는지 고르시오.";
				aForm = "(1) 1~4번 \n(2) 9번 이상 \n(3) 5~8번";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		else if(num == 5) {
				pForm = "5. 하루에 방귀를 몇 번 뀌는지 고르시오.";
				aForm = "(1) 8번~12번\n(2) 24번 이상\n(3) 16~20번";
			    printPForm(pForm);
			    printAForm(aForm);	
				
		}
		 else if(num == 6) {
			    pForm = "6. 하루 대변 횟수를 고르시오.";
			    aForm = "(1) 1~2번\n(2) 5번 이상\n(3) 3~4번";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 7) {
			    pForm = "7. 일주일에 20분이상 운동하는 날의 수를 고르시오.";
			    aForm = "(1) 0~1일\n(2) 2~3일\n(3) 4일 이상";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 8) {
			    pForm = "8. 흡연하는 정도를 고르시오.";
			    aForm = "(1) 하루에 한갑 이상\n(2) 하루에 반갑 정도\n(3) 안한다";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 9) {
			    pForm = "9. 하루 수면 시간을 고르시오.";
			    aForm = "(1) 1~3시간\n(2) 4~6시간\n(3) 7~9시간";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 10) {
			    pForm = "10. 하루 소금 섭취량을 고르시오.";
			    aForm = "(1) 8g이상\n(2) 6~7g\n(3) 4~5g";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 11) {
			    pForm = "11. 탄산음료 섭취 정도를 고르시오.";
			    aForm = "(1) 매일 마신다\n(2) 2~3일에 한번\n(3) 거의 마시지 않는다";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 12) {
			    pForm = "12. 패스트푸드나 튀김음식 섭취 정도를 고르시오.";
			    aForm = "(1) 주4회 이상\n(2) 주1~3회\n(3) 거의 먹지 않는다";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 13) {
			    pForm = "13. 지금 살고있는 곳을 고르시오.";
			    aForm = "(1) 대도시\n(2) 중소도시\n(3) 시골";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 14) {
			    pForm = "14. 일주일 중 잠에서 깨기 힘든 날의 수를 고르시오.";
			    aForm = "(1) 3일 이상\n(2) 1~2일\n(3) 없다";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 15) {
			    pForm = "15. 일주일 중 스트레스를 많이 받는 날의 수를 고르시오.";
			    aForm = "(1) 4일 이상\n(2) 1~3일\n(3) 없다";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 16) {
			    pForm = "16. 자신의 체중 정도를 고르시오.";
			    aForm = "(1) 비만\n(2) 과체중\n(3) 정상체중";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 17) {
			    pForm = "17. 일주일 중 피곤해서 낮잠을 자는 날의 수를 고르시오.";
			    aForm = "(1) 4일 이상\n(2) 2~3일\n(3) 1일 이하";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 18) {
			    pForm = "18. 일주일 중 신경통이 심하게 느껴지는 날의 수를 고르시오.";
			    aForm = "(1) 3일 이상\n(2) 1~2일\n(3) 없다";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 19) {
			    pForm = "19. 일주일 중 복통이 심하게 느껴지는 날의 수를 고르시오.";
			    aForm = "(1) 4일 이상\n(2) 2~3일\n(3) 1일 이하";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 20) {
			    pForm = "20. 일주일 중 이상변(설사등)을 보는 날의 수를 고르시오.";
			    aForm = "(1) 4일 이상\n(2) 2~3일\n(3) 1일 이하";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 21) {
			    pForm = "21. 두통 증상이 자주 일어나는가?";
			    aForm = "(1) 만성 두통이다\n(2) 일주일에 1~2회 일어난다\n(3) 거의 일어나지 않는다";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 22) {
			    pForm = "22. 코막힘 증상이 자주 일어나는가?";
			    aForm = "(1) 거의 매일 일어난다\n(2) 일주일에 1~2회 일어난다\n(3) 거의 일어나지 않는다";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 23) {
			    pForm = "23. 대변 소요시간을 고르시오.";
			    aForm = "(1) 8분 이상\n(2) 5~8분\n(3) 5분 이하";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 24) {
			    pForm = "24. 일주일에 밥을 규칙적으로 먹는 날의 수를 고르시오.";
			    aForm = "(1) 3일 이하\n(2) 4~5일\n(3) 6~7일";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 25) {
			    pForm = "25. 일주일 야식 횟수를 고르시오.";
			    aForm = "(1) 4회 이상\n(2) 2~3회\n(3) 1회 이하";
			    printPForm(pForm);
			    printAForm(aForm);
		}
		 else if(num == 26) {
			    pForm = "26. 하루에 몇 시간 앉아있는지 고르시오.";
			    aForm = "(1) 8시간 이상\n(2) 4~7시간\n(3) 4시간 이하";
			    printPForm(pForm);
			    printAForm(aForm);
		}
	
  }
}
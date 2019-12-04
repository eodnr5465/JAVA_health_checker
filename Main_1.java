
import java.util.Scanner;
import java.io.*;


public class Main_1{
  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    
    int num=1;
    
    int answer=0;
    
    String name = null;
    String sex = null;
    
    int birth = 0;
    int case2 = 0;
	String str;
	File file = null;
	PrintWriter out = null;    
	FileWriter fw = null;
	ReadNWrite rnw = null;

    score s = new score();
   
    System.out.println("당신의 몸 상태는 어떤가요");
    System.out.println("지금 체크해보시겠습니까?(예:1,아니오:2)");
    int case1 = sc.nextInt(); 
    
    if(case1 ==1 ) {
    	System.out.println("기존에 사용하신 적이 있습니까?(예:1,아니오:2)");
    	case2 = sc.nextInt();
    	
    	if(case2 == 1) {//기존사용한사람
    		System.out.println("이름을 입력하세요");
    		name = sc.next();      
		System.out.println("생년월일을 입력하세요 (ex:951116)");
    		birth = sc.nextInt();
    		System.out.println("성별을 입력하세요 (남성:m, 여성:f)");
    		sex = sc.next();
		str = name+" "+birth+" "+sex+".txt";
		file = new File(str);
		fw = new FileWriter(str, true);
		out = new PrintWriter(fw);
		rnw = new ReadNWrite(str);

    		
    		System.out.println("문제를 잘 읽고 해당되는 문항의 숫자를 입력해주세요, 도중 프로그램을 종료하고 싶으면 0를 눌러주세요");
    		   while(true) {
    			   Problem.Question(num);
    			   answer = sc.nextInt();
    			   
             	   s.cscore(num,answer);
             	   s.escore(num,answer);
             	   s.dscore(num,answer);
             	   s.rscore(num,answer);
   
    			   num++;
    			   
    			   if((num>26) || (answer==0)) {break;}
    		   }	  
    		}
    	
    	else if(case2 == 2) { //신규회원
    		System.out.println("이름을 입력하세요");
    		name = sc.next();
    		System.out.println("생년월일을 입력하세요 (ex:951116)");
    		birth = sc.nextInt();
    		System.out.println("성별을 입력하세요 (남성:m, 여성:f)");
    		sex = sc.next();
    		


		str = name + " " + birth + " " + sex + ".txt";
		file = new File(str);
		fw = new FileWriter(file, false);
		out = new PrintWriter(file);

		
            System.out.println("문제를 잘 읽고 해당되는 문항의 숫자를 입력해주세요, 도중 프로그램을 종료시키고싶으면 0를 눌러주세요");
            while(true) {
         	   Problem.Question(num);
         	   answer = sc.nextInt();	 
         	
         	   s.cscore(num,answer);
         	   s.escore(num,answer);
         	   s.dscore(num,answer);
         	   s.rscore(num,answer);

         	   num++;

         	   if(num>26||answer==0) {break;}
            }      
         }
     
    	//여기까지가 소개, 질문
        //여기서 기존회원일때랑 신규회원일떄랑 나눠야하잖아
        if(case2 == 1) {    //기존회원일때
        	System.out.println("검사 결과");
        	s.tscore();

		//이전 기록
		System.out.println("최근 결과");
		rnw.printPreInfo();

		//이번 검사에 대한 피드백
		System.out.println("-----------------------------------------피드백------------------------------------------------");
        	s.feedback();
		System.out.println("-----------------------------------------------------------------------------------------------");
		//기록전에 옛날 기록이랑 비교한다.
		int[] scoreRNW = rnw.getScore();
		int[] score = {s.outc(), s.oute(), s.outr(), s.outd()};
		
		for(int i = 0; i<4; i++){
			int a = score[i]-scoreRNW[i];
			switch(i){
				case 0 : System.out.print("순환계 점수가 ");	break;
				case 1 : System.out.print("배설계 점수가 ");	break;
				case 2 : System.out.print("호흡계 점수가 ");	break;
				case 3 : System.out.print("소화계 점수가 ");	break;
			}
			if(a>=0){
				System.out.println(a+"만큼 증가했습니다.");
				System.out.println("좋은 습관을 가지고 있으므로 습관을 계속 유지하시기 바랍니다.");
				System.out.println("-------------------------------------------------------------------------------");
			}
			else{
				a = scoreRNW[i]-score[i];
				System.out.println(a+"만큼 감소했습니다.");
				System.out.println("나쁜 습관을 가지고 있으므로 위의 피드백을 보고 좋은 습관을 유지하시기 바랍니다.");
				System.out.println("-------------------------------------------------------------------------------");
			}
		}
				

		
		
		out.println("순환계 점수: "+s.outc()+"	배설계 점수: "+s.oute()+"	호흡계 점수: "+s.outr()+"	소화계 점수: "+s.outd());
        	// 
        	
        	
        }
        else if(case2 == 2) {  //신규회원일때
        	
        	s.tscore();
        	s.feedback();
        	
        	//각각의 결과 값 필요하면 
        	//s.outc()  s.oute()  s.outr()  s.outd()    << 얘네들이 각각 계의 총점임 
        	
		out.println("이름 : " + name + ", 생년월일 : " + birth + ", 성별 : " + sex);
		out.println("순환계 점수: "+s.outc()+"	배설계 점수: "+s.oute()+"	호흡계 점수: "+s.outr()+"	소화계 점수: "+s.outd());
        }
     
    
        
        
        
    }else if(case1 == 2) { System.out.println("다음에 이용해주세요");}

	try{
		fw.close();
		out.close();
	}catch(Exception ex){}
  }
}
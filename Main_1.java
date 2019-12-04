
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
   
    System.out.println("����� �� ���´� �����");
    System.out.println("���� üũ�غ��ðڽ��ϱ�?(��:1,�ƴϿ�:2)");
    int case1 = sc.nextInt(); 
    
    if(case1 ==1 ) {
    	System.out.println("������ ����Ͻ� ���� �ֽ��ϱ�?(��:1,�ƴϿ�:2)");
    	case2 = sc.nextInt();
    	
    	if(case2 == 1) {//��������ѻ��
    		System.out.println("�̸��� �Է��ϼ���");
    		name = sc.next();      
		System.out.println("��������� �Է��ϼ��� (ex:951116)");
    		birth = sc.nextInt();
    		System.out.println("������ �Է��ϼ��� (����:m, ����:f)");
    		sex = sc.next();
		str = name+" "+birth+" "+sex+".txt";
		file = new File(str);
		fw = new FileWriter(str, true);
		out = new PrintWriter(fw);
		rnw = new ReadNWrite(str);

    		
    		System.out.println("������ �� �а� �ش�Ǵ� ������ ���ڸ� �Է����ּ���, ���� ���α׷��� �����ϰ� ������ 0�� �����ּ���");
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
    	
    	else if(case2 == 2) { //�ű�ȸ��
    		System.out.println("�̸��� �Է��ϼ���");
    		name = sc.next();
    		System.out.println("��������� �Է��ϼ��� (ex:951116)");
    		birth = sc.nextInt();
    		System.out.println("������ �Է��ϼ��� (����:m, ����:f)");
    		sex = sc.next();
    		


		str = name + " " + birth + " " + sex + ".txt";
		file = new File(str);
		fw = new FileWriter(file, false);
		out = new PrintWriter(file);

		
            System.out.println("������ �� �а� �ش�Ǵ� ������ ���ڸ� �Է����ּ���, ���� ���α׷��� �����Ű������� 0�� �����ּ���");
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
     
    	//��������� �Ұ�, ����
        //���⼭ ����ȸ���϶��� �ű�ȸ���ϋ��� ���������ݾ�
        if(case2 == 1) {    //����ȸ���϶�
        	System.out.println("�˻� ���");
        	s.tscore();

		//���� ���
		System.out.println("�ֱ� ���");
		rnw.printPreInfo();

		//�̹� �˻翡 ���� �ǵ��
		System.out.println("-----------------------------------------�ǵ��------------------------------------------------");
        	s.feedback();
		System.out.println("-----------------------------------------------------------------------------------------------");
		//������� ���� ����̶� ���Ѵ�.
		int[] scoreRNW = rnw.getScore();
		int[] score = {s.outc(), s.oute(), s.outr(), s.outd()};
		
		for(int i = 0; i<4; i++){
			int a = score[i]-scoreRNW[i];
			switch(i){
				case 0 : System.out.print("��ȯ�� ������ ");	break;
				case 1 : System.out.print("�輳�� ������ ");	break;
				case 2 : System.out.print("ȣ��� ������ ");	break;
				case 3 : System.out.print("��ȭ�� ������ ");	break;
			}
			if(a>=0){
				System.out.println(a+"��ŭ �����߽��ϴ�.");
				System.out.println("���� ������ ������ �����Ƿ� ������ ��� �����Ͻñ� �ٶ��ϴ�.");
				System.out.println("-------------------------------------------------------------------------------");
			}
			else{
				a = scoreRNW[i]-score[i];
				System.out.println(a+"��ŭ �����߽��ϴ�.");
				System.out.println("���� ������ ������ �����Ƿ� ���� �ǵ���� ���� ���� ������ �����Ͻñ� �ٶ��ϴ�.");
				System.out.println("-------------------------------------------------------------------------------");
			}
		}
				

		
		
		out.println("��ȯ�� ����: "+s.outc()+"	�輳�� ����: "+s.oute()+"	ȣ��� ����: "+s.outr()+"	��ȭ�� ����: "+s.outd());
        	// 
        	
        	
        }
        else if(case2 == 2) {  //�ű�ȸ���϶�
        	
        	s.tscore();
        	s.feedback();
        	
        	//������ ��� �� �ʿ��ϸ� 
        	//s.outc()  s.oute()  s.outr()  s.outd()    << ��׵��� ���� ���� ������ 
        	
		out.println("�̸� : " + name + ", ������� : " + birth + ", ���� : " + sex);
		out.println("��ȯ�� ����: "+s.outc()+"	�輳�� ����: "+s.oute()+"	ȣ��� ����: "+s.outr()+"	��ȭ�� ����: "+s.outd());
        }
     
    
        
        
        
    }else if(case1 == 2) { System.out.println("������ �̿����ּ���");}

	try{
		fw.close();
		out.close();
	}catch(Exception ex){}
  }
}
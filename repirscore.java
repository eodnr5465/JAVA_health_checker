
public class repirscore {
	 public int RespirScore=0;
	  repirscore(){}
	  public void Score(int n, int num) {
		  if(n == 7) {
			  RespirScore+=num;  
		  }
		  if(n == 8) {
			  RespirScore+=num;  
		  }
		  if(n == 13) {
			  RespirScore+=num;  
		  }
		  if(n == 15) {
			  RespirScore+=num;  
		  }
		  if(n == 16) {
			  RespirScore+=num;  
		  }
		  if(n == 21) {
			  RespirScore+=num;  
		  }
		  if(n == 22) {
			  RespirScore+=num;  
		  }
		  else
			  RespirScore+=0;
	  }
	  public int OutRes(){
	    return (int)Math.round((RespirScore-7)*7.14);
	  }
	  
	}

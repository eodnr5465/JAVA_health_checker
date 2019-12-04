
public class circulscore {
	  
	  public int CirculScore=0;
	  
	  circulscore(){}
	  public void Score(int n, int num) {
		  if(n == 1) {
			  CirculScore+=num;  
		  }
		  if(n == 2) {
			  CirculScore+=num;  
		  }
		  if(n == 3) {
			  CirculScore+=num;  
		  }
		  if(n == 4) {
			  CirculScore+=num;  
		  }
		  if(n == 7) {
			  CirculScore+=num;  
		  }
		  if(n == 8) {
			  CirculScore+=num;  
		  }
		  if(n == 9) {
			  CirculScore+=num;  
		  }
		  if(n == 10) {
			  CirculScore+=num;  
		  }
		  if(n == 11) {
			  CirculScore+=num;  
		  }
		  if(n == 12) {
			  CirculScore+=num;  
		  }
		  if(n == 14) {
			  CirculScore+=num;  
		  }
		  if(n == 15) {
			  CirculScore+=num;  
		  }
		  if(n == 16) {
			  CirculScore+=num;  
		  }
		  if(n == 17) {
			  CirculScore+=num;  
		  }
		  if(n == 18) {
			  CirculScore+=num;  
		  }
		  if(n == 24) {
			  CirculScore+=num;  
		  }
		  if(n == 25) {
			  CirculScore+=num;  
		  }
		  if(n == 26) {
			  CirculScore+=num;  
		  }
		  else
			  CirculScore += 0;
	  }
	  public int OutCir(){
	    return (int)Math.round((CirculScore-18)*2.77);
	  }
	
	}
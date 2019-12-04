
public class excretscore {

	  public int excretScore=0;

	  public excretscore(){}
	  public void Score(int n , int num){

	      if(n==1) { 
			  excretScore+=num;
		      }
	      if(n==4) { 
			  excretScore+=num;
		      }
	      if(n==5) { 
			  excretScore+=num;
		      }
	      if(n==6) { 
			  excretScore+=num;
		      }
	      if(n==15) { 
			  excretScore+=num;
		      }
	      if(n==16) { 
			  excretScore+=num;
		      }
	      if(n==20) { 
			  excretScore+=num;
		      }
	      if(n==23) { 
			  excretScore+=num;
		      }
	      if(n==26) { 
			  excretScore+=num;
		      }
	      else {
	    	  excretScore+=0;
	      		}
	      }
	  	  public int OutExc(){
	    return (int)Math.round((excretScore-9)*5.55);
	  }
}
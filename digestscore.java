
public class digestscore {
	digestscore(){}
	
	  public int DigestScore=0;
	  public void Score(int n, int num) {
		  if(n == 1) {
			  DigestScore+=num;
		  }
		  if(n == 2) {
			  DigestScore+=num;
		  }
		  if(n == 3) {
			  DigestScore+=num;
		  }
		  if(n == 5) {
			  DigestScore+=num;
		  }
		  if(n == 6) {
			  DigestScore+=num;
		  }
		  if(n == 9) {
			  DigestScore+=num;
		  }
		  if(n == 10) {
			  DigestScore+=num;
		  }
		  if(n == 11) {
			  DigestScore+=num;
		  }
		  if(n == 12) {
			  DigestScore+=num;
		  }
		  if(n == 14) {
			  DigestScore+=num;
		  }
		  if(n == 15) {
			  DigestScore+=num;
		  }
		  if(n == 16) {
			  DigestScore+=num;
		  }
		  if(n == 17) {
			  DigestScore+=num;
		  }
		  if(n == 18) {
			  DigestScore+=num;
		  }
		  if(n == 19) {
			  DigestScore+=num;
		  }
		  if(n == 20) {
			  DigestScore+=num;
		  }
		  if(n == 24) {
			  DigestScore+=num;
		  }
		  if(n == 25) {
			  DigestScore+=num;
		  }
		  if(n == 26) {
			  DigestScore+=num;
		  }
		  else {
			  DigestScore+=0;
		  }
	  }
	  public int OutDig(){
	    return (int)Math.round((DigestScore-19)*2.63);
	  }
	
}
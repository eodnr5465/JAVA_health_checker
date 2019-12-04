
public class score {
   
   circulscore c = new circulscore();
   excretscore e = new excretscore();
   digestscore d = new digestscore();
   repirscore r = new repirscore();
  
   public void cscore(int n , int num) {
      c.Score(n, num);
   }
   public void escore(int n , int num) {
      e.Score(n, num);
   }
   public void dscore(int n , int num) {
      d.Score(n, num);
   }
   public void rscore(int n , int num) {
      r.Score(n, num);
   }
   
   public int outc() {
	      return c.OutCir();
	   }
	   public int oute() {
	      return e.OutExc();
	   }
	   public  int outd() {
	      return d.OutDig();
	   }
	   public int outr() {
	      return r.OutRes();
	   }
	   
   public void tscore(){
      System.out.println("순환계 점수 :" + c.OutCir());   
      System.out.println("배설계 점수 :" + e.OutExc());   
      System.out.println("호흡계 점수 :" + r.OutRes());   
      System.out.println("소화계 점수 :" + d.OutDig());   
   }
   public void feedback(){
      if((d.OutDig() >= 60) && (c.OutCir() >60) && (e.OutExc() > 60) && (r.OutRes() > 60)) {
         System.out.println("축하드립니다. 건강한 습관을 가지고 계십니다!!");
      }
      if(d.OutDig() < 60){
         System.out.println("\n<지금 습관은 소화계통에 별로 좋지 않습니다.>");
         System.out.println("위산 역류, 변비, 소화불량이나 과민성대장증후군과 같은 질병에 걸릴 가능성이 높습니다.");
         System.out.println("식사시간은 최소 20분 이상 천천히하는 것을 권합니다.\n" + 
               "과식, 폭식, 야식은 가능한 자제하셔야 합니다.\n" + 
               "삼시 세끼는 최대한 일정한 시간에 섭취하는 것을 권장합니다.\n" + 
               "소화계통에 좋은 음식은 귤, 매실, 무, 배, 생강등이 있으며, 이를 섭취하는 것을 권장합니다.");
      }
      if(r.OutRes() < 60) {
         System.out.println("\n<지금 습관은 호흡계통에 별로 좋지 않습니다.>\n" + 
               "가래, 천식, 축농증, 비염, 기침과 같은 질병에 걸릴 가능성이 높습니다.\n" + 
               "마스크 착용을 일상화 하셔야 합니다.\n" + 
               "가습기 사용을 권장합니다.\n" + 
               "흡연자이시면 되도록 흡연량을 줄이거나 흡연을 하시면 안됩니다.\n"+
               "냉난방기 사용은 될 수 있으면 자제하셔야됩니다.\n" + 
               "호흡계통에 좋은 음식은 당근, 녹차, 율무, 은행등이 있으며, 이를 섭취하는 것을 권장합니다.");
      }
      if(c.OutCir() < 60) {
         System.out.println("\n<지금 습관은 순환계통에 별로 좋지 않습니다.>\n" + 
               "심장병, 뇌졸증, 뇌출혈과 같은 질병에 걸릴 가능성이 높습니다.\n" + 
               "위 질병의 발생원인은 주로 콜레스트롤 수치가 높아져 지방이 혈관의 통로에 축척되어 혈압이\n" + 
               "높아져서 생기는 질병들입니다.\n" + 
               "틈틈이 스트레칭을 해주어 혈액순환이 잘 되도록 해주어야 합니다.\n" + 
               "식생활의 경우 불포화지방산이 포함되어 있는 음식, 과일, 채소 위주로 섭취하셔야됩니다.\n" + 
               "잦은 음주와 흡연은 멀리 하셔야 됩니다.");
      }
      
      if(e.OutExc() < 60) {
         System.out.println("\n<지금 습관은 배설계통에 별로 좋지 않습니다.>\n" + 
               "설사, 장염, 변비, 치질과 같은 질병에 걸릴 가능성이 높습니다.\n" + 
               "충분한 숙면을 취하셔야 됩니다.\n" + 
               "잠자는 시간에는 피로가 쌓인 조직의 노폐물을 정화하면서 면역기능을 높여주는데, 충분한 숙면을 \n" + 
               "취하지 않으면 장내세균의 균형이 무너지게 되어 유해한 균이 증식하게됩니다.\n" + 
               "유산균을 챙겨먹는 습관을 권장합니다.\n" + 
               "유산균은 장 건강을 개선하고 유익균을 늘려주는 역할을 합니다.\n" + 
               "아랫배를 따뜻하게 하고, 배꼽주위를 자주 마사지해주는 것을 권장합니다.\n" + 
               "배설계통에 좋은 음식은 당근, 쑥, 사과, 마등이 있으며, 이를 섭취하는 것을 권장합니다.");
      }
      
      
   }
   
}
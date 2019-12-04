import java.util.Scanner;
import java.io.*;


public class ReadNWrite{
	private Scanner sc_file = null;
	private File file = null;
	private String Info = null;

	ReadNWrite(String txt){
		try{
			file = new File(txt);
			sc_file = new Scanner(file);
		}catch(FileNotFoundException ex){ ex.printStackTrace();}
	}

	public void printPreInfo(){
		while(sc_file.hasNextLine()){
			Info = sc_file.nextLine();
		}

		System.out.println(Info);
	}

	public int[] getScore(){
		Scanner sc = new Scanner(Info);
		int[] score = new int[4];
		for(int i = 0; i<4; i++){
			String trash1 = sc.next();
			String trash2 = sc.next();
			score[i] = Integer.parseInt(sc.next());
		}

		return score;
	}
}
import java.io.*;
import java.util.Scanner;
class AptPersonCount extends ExamVariousArray{
	
	void Apstart() throws IOException
	{
	
	System.out.println("=============================== ");
	System.out.println("5층 아파트의 거주자 인원 파악하기");
	System.out.println("=============================== ");
	int studentCnt = 5;
	String apartstore[] = {"1층","2층","3층","4층","5층"};
	int apart[][] = new int[studentCnt][apartstore.length-2];
	double arrAvg[] = new double[studentCnt];
	apart = getReader(apartstore,apart);
	

	
	  for(int i = 0; i < apart.length; i++){
		   int tot = 0;

		   for(int j = 0; j < apart[i].length - 2; j++){
		    tot += apart[i][j];
		   }
		  }
	  
	  
	  
	  for(int i = 0; i < apart.length; i++){
		   System.out.println((i+1) + "호에 살고 있는 사람의 숫자:");
			Scanner s = new Scanner(System.in);
			s.
		   for(int j = 0; j < apart[i].length -2; j++){
		   System.out.println(apartstore[j] + " = " + apart[i][j] + " 점");
		    }
		    System.out.println("총점 = " + apart[i][apart[i].length -2]);
		   
		   
		   System.out.println();
		  }
		 }
	 static int[][] getReader(String []subject, int [][]score)throws IOException{
		  
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  boolean flag;
		  for(int i = 0; i < score.length; i++){
		 
		   System.out.println((i+1) + "번 학생의 성적을 입력합니다.");
		   for(int j = 0; j < score[i].length -2; j++){
		    do{
		     flag = false;
		     System.out.print(subject[j] + " = ");
		     score[i][j] = Integer.parseInt(br.readLine());
		     
		     if((score[i][j] > 100) || (score[i][j] < 0)){
		      flag = true;
		     }
		     
		    }while(flag);
		    
		   }
		  }
		  br.close();
		  return score;
		 }
		   
	
	
}
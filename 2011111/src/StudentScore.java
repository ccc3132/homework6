import java.io.*;
public class StudentScore extends ExamVariousArray{
	
	void Ststart() throws IOException
	{
	
	
	int studentCnt = 3;
	String subject[] = {"국어","영어","수학"};
	int score[][] = new int[studentCnt][subject.length+2];
	double arrAvg[] = new double[studentCnt];
	score = getReader(subject,score);
	
	  for(int i = 0; i < score.length; i++){
		   int tot = 0;
		   double avg = 0;
		   for(int j = 0; j < score[i].length - 2; j++){
		    tot += score[i][j];
		   }
		   score[i][score[i].length -2] = tot;
		   avg = (double)(tot / score[i].length);
		   arrAvg[i] = avg;
		   score[i][score[i].length -1] = 1;
		  }
	  
	  
	  
	  for(int i = 0; i < score.length; i++){
		   System.out.println((i+1) + "번 학생의 성적");
		   for(int j = 0; j < score[i].length -2; j++){
		   // System.out.println(subject[j] + " = " + score[i][j] + " 점");
		    }
		    System.out.println("총점 = " + score[i][score[i].length -2]);
		    System.out.println("평균 = " + arrAvg[i]);
		   
		   
		   
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
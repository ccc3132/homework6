import java.util.*;
public class ExamVariousArray {

	private int i;

	public void main(String args[])
	{
	System.out.println("*******************");
	System.out.println("배열 사용하기");
	System.out.println("*******************");
	System.out.println("1. 두번째로 큰 수 찾기");
	System.out.println("2. 심사 점수 계산");	
	System.out.println("3. 학생 총점, 평균값 구하기");	
	System.out.println("4. 5층 아파트의 거주자 숫자 구하기");	
	System.out.println("5. 겹치지 않는 숫자 10개입력받기");	
	System.out.println("6. 종료하기");		
	System.out.println("원하는 메뉴는>> :");		
	Scanner S = new Scanner(System.in);
			this.i=S.nextInt();
			
			if(i == 1)
			{
			SecondMax s= new SecondMax();
			s.Sestart();
			}

			else if(i == 2){
			AvgScore a = new AvgScore();
			a.Avstart();
			}
			
			else if(i == 3){
			StudentScore st = new StudentScore();
			st.Ststart();
			}
			else if(i == 4){
			AptPersonCount Ap = new AptPersonCount();
			Ap.Apstart();				
			}
			else if(i == 5){
			OnlyNumber On = new OnlyNumber();
			On.Onstart();
			}
			else if(i == 6){
			System.exit(0);
			}

						
															
			
	}
}


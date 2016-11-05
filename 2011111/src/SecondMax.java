import java.util.*;
 public class SecondMax extends ExamVariousArray{
		int o,input[],second;
	void Sestart()
	{
		System.out.println("2.1번메뉴 클래스 :SecondMax (배열사용)");
		System.out.println("10개의 숫자를 입력받아 배열에 저장하고 \n");
		System.out.println("두번째 큰 수를 출력하라..");
		System.out.println("=============================== ");				
		
		System.out.println("수를 입력하라.");
		Scanner s = new Scanner(System.in);
		
		if(input[0] > input[1])  
		   {
              o = input[0];
              second = input[1];
          }
          else 
          {
              o = input[1];
              second = input[0];
          }

          for(int i = 2; i < 10; i++) 
          {
              if((input[i] <= o) && input[i] > second)
              {
                  second = input[i];
              }

              if(input[i] > o) 
              {
                  second = o;
                  o = input[i];
              }
          }

  		System.out.println("두번째로 큰 수는"+second+"입니다.");
	}
	

}

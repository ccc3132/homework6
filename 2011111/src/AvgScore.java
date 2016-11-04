import java.util.*;
public class AvgScore {
int[] Score;
int Max = 0, Min=999;
int Sum, i;
double Avg;
public AvgScore(){
Score = new int[5]; 
for(i=0; i<Score.length; i++){ 

	Scanner s = new Scanner(System.in);
		this.Score[i] = s.nextByte();
		System.out.println(i+1+"번"+"번 심사점수 입력:");
}

for(i =0; i<Score.length; i++){ 
if(Max<Score[i]){
Max=Score[i];
}
if(Min>Score[i]){ 
Min = Score[i];
}

Sum += Score[i];
}
Sum = Sum-(Max + Min);
Avg = Sum/(i-2); 

System.out.println("가장큰 점수와 가장 작은 점수를 제외한 8개의 점수 평균은" +Avg +"입니다.");
}
public static void main(String[] args){
new AvgScore();
}
}
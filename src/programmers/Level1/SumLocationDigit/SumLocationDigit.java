package programmers.Level1.SumLocationDigit;


public class SumLocationDigit {
	public int solution(int n) {
        int sum = 0;
        while(n > 0){
            sum += n%10;
            n /=10;
        }


        return sum;
    }
}

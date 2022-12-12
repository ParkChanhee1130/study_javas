import java.util.Scanner;

// baekjoob8393_analysis
public class Main {
// - 테스트 케이스
// 3 --> 6
// 5 --> 15
// 1 --> 1
public int sum(int input) {
    int sum  = 0;
for(int i=1; i<=input; i++) {
    sum = sum+i;
}
    return sum;
}
    public static void main(String[] args) {
// - 프로그래밍 순서
// 반복값 입력
Scanner scanner = new Scanner(System.in);
int input = scanner.nextInt();
scanner.close();

// 합 구함
Main main = new Main();
int output = main.sum(input);


// 결과 값 출력 
System.out.println(output);
    }
}

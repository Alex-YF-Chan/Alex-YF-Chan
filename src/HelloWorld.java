import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入文字");
		String s1 = scanner.next();
		System.out.println("---------");
		System.out.println(s1);
		scanner.close();

	}

}

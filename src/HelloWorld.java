import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入文字");
		String s1 = scanner.next();
		System.out.println("---------");
		System.out.println(s1);

		String s2 = "test push1234567899";

		System.out.println("---------");
		String s3 = "test push";
		System.out.println(s3);
		System.out.println("-------");
		
		
		System.out.println("test2");
		System.out.println(s2);
		scanner.close();

	}

}

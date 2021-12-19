import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入文字");
		String s1 = scanner.next();
		System.out.println("---------");
		System.out.println(s1);
<<<<<<< HEAD
		String s2 = "test push12";
=======
		System.out.println("---------");
		String s2 = "test push";
>>>>>>> 1646aaa88feebddd237cdb95eafb023fe94bf2bb
		System.out.println(s2);
		scanner.close();

	}

}

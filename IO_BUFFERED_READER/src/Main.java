import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters");
		do {
			c = (char) br.read();
			System.out.println(c);

		} while (c != 'q');
	}
}

import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Enter Lines of Text");
		do {
			str=br.readLine();
			System.out.println(str);
		} while (!str.equals("stop"));
	}
}

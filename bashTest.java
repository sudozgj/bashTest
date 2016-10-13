import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bashTest {
	public static void main(String[] args) {
		try {
			// System.out.println("hello");
			// String str=args[0];
			String str = "sh /home/shc/ZGJ/bashTest/bs01.sh";
			Process proc = Runtime.getRuntime().exec(str);
			InputStreamReader isr = new InputStreamReader(proc.getInputStream());
			BufferedReader br = new BufferedReader(isr);

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

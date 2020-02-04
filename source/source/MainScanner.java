import java.io.*;
import java.util.*;

class MainScanner {
	
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);
		String str;
		
		long current = System.currentTimeMillis();
		while (sc.hasNextLine()) {
			str = sc.nextLine();
		}
		out.println("Total: " + (System.currentTimeMillis() - current) + " ms");
	}

}

import java.io.*;

class MainBufferReader {
	
	public static void main(String[] args) throws Exception
	{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out, true);
		String str;
		
		long current = System.currentTimeMillis();
		while ((str = sc.readLine()) != null) {
			;
		}
		out.println("Total: " + (System.currentTimeMillis() - current) + " ms");
	}

}

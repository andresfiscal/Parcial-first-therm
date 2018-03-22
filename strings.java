import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class strings {

	/**
	 * @param args
	 */
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int cases = Integer.parseInt(br.readLine());
		int strings;
		for(int i = 0; i < cases; i++){
			
			strings = Integer.parseInt(br.readLine());
			bw.write(strings + "");
			bw.flush();
			
			
		}
	}

}

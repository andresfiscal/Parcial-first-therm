import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class cubos {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int cases = Integer.parseInt(br.readLine());// lee el numero de veces que se va a realizar el proceso
		int mod = 0;
		int total=0, cubo, max_cubos = 0;//variables que guardan tamaños
		String[] array = new String[3];//arreglo de caracteres
		int[] arrayInt = new int[3];//arreglo de enteros
		for(int j =0; j < cases; j++){//ciclo
			String num = br.readLine();//lee los tamaños
			array = num.split(" ");//guarda los tamaños en tipo caracter
			for(int i=0; i < 3; i++){
				arrayInt[i] = Integer.parseInt(array[i]);//pasa los datos de caracter a un arreglo de enteros
				mod = MCD_Euclides(arrayInt[0], arrayInt[1]); //MAXIMO comun divisor de los primeros 2 numeros
				mod = MCD_Euclides(mod, arrayInt[2]); // MAXIMO comun divisor de el tercer numero con el resultado de los 2 anteriores
				total = (arrayInt[0]/mod)*(arrayInt[1]/mod)*(arrayInt[2]/mod);//se calcula el resultado, multiplicando los numeros sobre el mod
				}
			bw.write(mod+" "+total + "\n");//impresion de las respuestas
			bw.flush();
			}
		}
	public static int MCD_Euclides(int a, int b){
	    while(b != 0){
	         int t = b;
	         b = a % b;
	         a = t;
	    }
	    return a;
	}
}	
	
	
	

	
	
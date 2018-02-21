import java.util.Scanner;

/**
 * eliminarepes: Clase para eliminar caracteres repetidos. Problema del DomJudge para La Basura de M5
 * @author Marc Albareda
 * @version 1.0
 * @since Java 8.0
 */
public class eliminarepes {
	
	//ForgottenMains
	
	public static void main (String[] args) {
		
		//primer numero = ncasos
		//cada caso una string
		//devuelve la misma string eliminando todos los chars repes
		
		Scanner sc = new Scanner(System.in);
		
		int ncasos = sc.nextInt();
		
		for(int n=0;n<ncasos;n++) {
			String s = sc.nextLine();
			eliminarepes(s);
		}
		
		
	}
	/**
	 * eliminaRepes funcion que elimina todos los caracteres repetidos de una string.
	 * Si la llista es buida retorna "*";
	 * @param s String de la que se elimina
	 * @return res String con los caracteres eliminados
	 */
	public static String eliminarepes(String s) {
		
		String res="";
		for(char c : s.toCharArray()) {
			if(falti(c,s)) {
				res=res+c;
			}
		}
		if (res.isEmpty()) {
			res="*";
		}
		return res;
		
	}

	/**
	 * Falti: Dice si este caracter no esta repetido en la string S
	 * @param c  caracter de la string que analizamos
	 * @param s  String donde analizamos
	 * @return true si el caracter no esta repetido, false si lo esta
	 */
	public static boolean falti(char c, String s) {
		int cont = 0;
		s= s.toLowerCase();
		Character.toLowerCase(c);
		for(char ca : s.toCharArray()) {
			
			if(ca==c) {
				cont++;
			}
		}
		if (cont==1) return true;
		else return false;
		
		
	}

}

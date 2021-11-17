import java.util.Scanner;
 
public class ex1{
 
	public static void main (String []args){
		Scanner kb = new Scanner(System.in);
		int primer = 'a';
		int ultim ='l';
 
		System.out.print("Introduce el caracter pero ja  hhh: ");
		char letra = kb.next().charAt(0);
		System.out.print("El caracter complementario es: ");
		System.out.println("Em dic Marc Gutiérrez")
		int resultado = ultim-letra;
		System.out.println((char)(primer+resultado));
        kb.close();
	}
}
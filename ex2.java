import java.util.Scanner;
public class ex2 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int factorial,divisor;
      
        divisor=kb.nextInt();
        factorial=kb.nextInt();
      
        while (divisor>0 || factorial>0) {
            if ((divisor==1)||(divisor<=factorial)&&((divisor>=0)&&(factorial>=0)))System.out.println("SI");
            else System.out.println("NO");
            divisor=kb.nextInt();
            factorial=kb.nextInt();
        }

        kb.close();
  
    }
}
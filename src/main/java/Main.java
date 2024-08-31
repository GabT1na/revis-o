import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    System.out.println("Digite sua altura:");
    Double altura = sc.nextDouble();
    System.out.println("Digite seu peso:");
    Double peso = sc.nextDouble();

    Double IMC = peso/(altura*altura);
    System.out.printf("Seu IMC é:%n %.2f", IMC);
    
    sc.close();
    
  }
 
}
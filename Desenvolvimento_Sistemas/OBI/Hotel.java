import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    System.out.println("Digite o valor da diária para quem chegar ao primeiro dia, o aumento da diária a cada dia e o dia da chegada do professor.");
    int D = n.nextInt(); 
    int A = n.nextInt(); 
    int N = n.nextInt(); 
    int resultado = 0;

    if (D >= 1 && D <= 1000 && A >= 1 && A <= 1000 && N >=1 && N <= 31){
      if(N == 1){
        resultado = 31 * D;
      }
      else if(N > 1 && N <= 15){
        resultado = (31 - (N-1)) * (D + A * (N-1));
      }
      else if(N > 15){
        resultado = N * (D + A * 14);
      }
    }
    else {
      System.out.println("Valores inválidos");
    }
      System.out.println(resultado);
  }
}
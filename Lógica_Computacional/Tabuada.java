import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        int entrada;

        Scanner tabuada = new Scanner(System.in);
        System.out.println("Informe um número: ");
        entrada = tabuada.nextInt();

        int multiplicador = 0;
        while(multiplicador <= 10)
        {
            int resultado = entrada * multiplicador;
            System.out.println(resultado);   
            multiplicador++;
        }
    }
}

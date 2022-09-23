import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int idade1;
    int idade2;
    int idade3;
    int resultado = 0;

    Scanner idades = new Scanner(System.in);
    System.out.println(
        "Cibele, Camila e Celeste são irmãs, Camila é a irmã do meio, informe 3 idades para descobrirmos qual é a de Camila");
    idade1 = idades.nextInt();
    idade2 = idades.nextInt();
    idade3 = idades.nextInt();

    if (idade1 <= 100 && idade1 >= 5 && idade2 <= 100 && idade2 >= 5 && idade3 <= 100 && idade3 >= 5) {
      if (idade1 >= idade2 && idade1 <= idade3 || idade1 <= idade2 && idade1 >= idade3) {
        resultado = idade1;
      }
      else if (idade3 >= idade1 && idade3 <= idade2 || idade3 <= idade1 && idade3 >= idade2) {
        resultado = idade3;
      }
      else if (idade2 <= idade3 && idade2 >= idade1 || idade2 >= idade3 && idade2 <= idade1) {
        resultado = idade2;
      }
    }
    else{
      System.out.println("A idade digitada é superior a 100 ou inferior a 5");
    }
    System.out.println("______");
    System.out.println("Camila tem " +resultado);
  }
}
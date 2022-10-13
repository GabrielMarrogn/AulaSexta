import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Double salario, faltas, liquido;
        Scanner sc = new Scanner(System.in);
      
        Saudacao();

        System.out.println("Por favor insira seu salario bruto");
        salario = sc.nextDouble();
        System.out.println("Por favor insira sua quantidade de faltas");
        faltas = sc.nextDouble();

        liquido =  salario-((salario)/30*faltas);
        System.out.println("O seu salario liquido é: R$" +liquido);
        sc.close();

        Saudacao();
    }

    //Assinatura void NomeDoMetodo()
     static void Saudacao(){
     System.out.println("Programa de calculo de salario liquido");
        System.out.println("Desenvolvido pela turma TI");
        System.out.println("Disciplina de fundamentos da programação");
        System.out.println(" ");
    }
    
}

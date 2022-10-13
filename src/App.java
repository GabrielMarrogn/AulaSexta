import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Double salario;
        int faltas;

        Saudacao();

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor insira seu salario bruto");
        salario = sc.nextDouble();
        System.out.println("Por favor insira sua quantidade de faltas");
        faltas = sc.nextInt();

        double SalLiq = 0;
        SalLiq = Calcular(salario,faltas);
        System.out.println("O seu salario liquido é: R$" +SalLiq);
        sc.close();

        Saudacao();
    }

    static double Calcular(double salario, int faltas){
    Double liquido =  salario-((salario)/30*faltas);
    
    return liquido;
    
    }

    //Assinatura void NomeDoMetodo()
     static void Saudacao(){
     System.out.println(" ");
     System.out.println("Programa de calculo de salario liquido");
        System.out.println("Desenvolvido pela turma TI");
        System.out.println("Disciplina de fundamentos da programação");
        System.out.println(" ");
    }
    
}

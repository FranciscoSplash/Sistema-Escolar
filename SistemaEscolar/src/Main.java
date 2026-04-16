import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Digiteo nome");
        String nome = sc.next();
        System.out.println("Digiteo a idade");
        int idade = sc.nextInt();
        System.out.println("Digite a matircula");
        String matricula = sc.next();
        System.out.println("Digite  a Disciplina");
        String disciplina = sc.next();

        Pessoa pessoa=new Pessoa(nome, idade);
        Aluno aluno=new Aluno(nome, idade, matricula);
        Professor professor=new Professor("Joaquim", 10, "POO");
        Diretor diretor=new Diretor("Jorge", 30, 3) ;


        System.out.println(pessoa.apresentar());
        System.out.println(aluno.getMatricula());
        System.out.println(professor.apresentar());
        System.out.println(diretor.apresentar());
    }
}


package exercicio2;
import java.util.Scanner;
public class Main2 {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            Pessoa pessoa1 = new Pessoa();
            System.out.println("Insira o nome da pessoa: ");
            String Nomes = ler.next();
            pessoa1.setNome(Nomes);

            System.out.println("Insira a idade da pessoa: ");
            int Idades = ler.nextInt();
            pessoa1.setIdade(Idades);

            System.out.println("Insira o peso da pessoa: ");
            double Pesos = ler.nextDouble();
            pessoa1.setPeso(Pesos);

            System.out.println("Insira a altura da pessoa: ");
            double Alturas = ler.nextDouble();
            pessoa1.setAltura(Alturas);

            System.out.println(pessoa1);


        }
    }


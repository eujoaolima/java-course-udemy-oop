package Aula15;

import Aula15.Entities.Employee;
import Aula15.Entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Polimorfismo {
    public static void main(String[] args) {
        // Atividade - Herança e polimorfismo

        /*
           Uma empresa possui funcionários próprios e terceirizados. Para cada funcionário,
           deseja-se registrar ome, horas trabalhadas e valor por hora. Funcionários terceirizados
           possuem ainda uma despesa adicional.

           O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas,
           sendo que os funcionários terceirizados ainda recebem um bônus correspondente a 110%
           de sua despesa adicional.

           Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los
           em uma lista. Depois de ler todos os dados, mostrar nome e pagamento de cada funcionário na mesma ordem
           em que foram digitados.

           Construa o programa conforme projeto abaixo:

           Employee:
            - name : String
            - hours : Integer
            - valuePerHour : Double
            + payment() : Double

            OutsourceEmployee:
            - additionalCharge : Double

            Exemplo:

            Digite o número de funcionários: 3
            Dados do Empregado #1:
                Terceirizado (y/n): n
                Nome: Batata
                Horas: 50
                Valor por hora: 10

            Dados do Empregado #2:
                Terceirizado (y/n): y
                Nome: Potato
                Horas: 20
                Valor por hora: 70
                Despesa adicional: 110

            Dados do Empregado #3:
                Terceirizado (y/n): n
                Nome: Patata
                Horas: 70
                Valor por hora: 5

            Folha de pagamentos:
            Batata - $ 500
            Potato - $ 1510
            Patata - $ 350

        */

        Locale.setDefault(Locale.US);
        Scanner r = new Scanner(System.in);

        System.out.println("Digite o número de funcionários: ");
        int num = r.nextInt();
        List<Employee> list = new ArrayList<>();

        System.out.println("Dados dos funcionários:");

        for (int i = 0; i < num; i++) {
            System.out.println("Empregado #" + (i+1) + ":");
            System.out.println("Terceirizado (y/n)? ");
            char terceirizado = r.next().charAt(0);
            System.out.println("Nome: ");
            String name = r.next();
            System.out.println("Horas: ");
            int hours = r.nextInt();
            System.out.println("Valor por hora: ");
            double valuePerHour = r.nextDouble();

            if (terceirizado == 'y') {
                System.out.println("Despesa adicional: ");
                double additionalCharge = r.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                list.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("Folha de pagamentos:");
        for (Employee employee : list) {
            System.out.println(employee.getName() + " - $" + employee.payment());
        }

        r.close();
    }
}

package Aula17;

import Aula17.Entities.Circle;
import Aula17.Entities.Rectangle;
import Aula17.Entities.Shapes;
import Aula17.Enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Abstracoes {
    // Classes e métodos abstratos

    /*
        ATIVIDADE 1

        Fazer um programa para ler os dados de N figuras (N fornecido pelo usuário),
        e depois mostrar as áreas destasa figuras na mesma ordem em que foram digitados.

        _Shape_  :
            - color : Color
            + area() : Double

        Rectangle:
            - width : Double
            - height : Double

        Circle:
            - radius : Double


         <<enum>> Color:
            - BLACK : int
            - BLUE : int
            - RED : int

        Exemplo:

        Digite a quantidade de formas: 2
        Dados da Forma #1:
            Rectangle or Circle (r/c)? r
            Cor (BLACK/BLUE/RED): BLACK
            Largura: 4.0
            Altura: 5.0

        Dados da Forma #2:
            Rectangle or Circle (r/c)? c
            Cor (BLACK/BLUE/RED): RED
            Raio: 3.0

        Área das formas:
        20.00
        29.61
    */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner r = new Scanner(System.in);

        List<Shapes> list = new ArrayList<>();

        System.out.println("Digite a quantidade de formas: ");
        int num = r.nextInt();
        for(int i = 0; i < num; i++) {
            System.out.println("Dados da Forma #" + (i + 1) + ":");
            System.out.println("Rectangle or Circle (r/c)? ");
            char tipo = r.next().charAt(0);

            System.out.println("Cor (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(r.next());

            if (tipo == 'r') {
                System.out.println("Largura: ");
                double largura = r.nextDouble();
                System.out.println("Altura: ");
                double altura = r.nextDouble();

                list.add(new Rectangle(color, largura, altura));
            } else if(tipo == 'c') {
                System.out.println("Raio: ");
                double raio = r.nextDouble();

                list.add(new Circle(color, raio));
            }


        }

        System.out.println("Área das formas: ");
        for(Shapes s : list) {
            System.out.println(s.area());
        }

        r.close();
    }
}

package Aula14;

import Aula14.Entities.Client;
import Aula14.Entities.Order;
import Aula14.Entities.OrderItem;
import Aula14.Entities.Product;
import Aula14.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) throws ParseException {
        /*
            ATIVIDADE

            Ler os dados de um pedido com N itens (N fornecido pelo usuário).
            Depois, mostrar um sumário do pedido conforme exemplo.

            Nota: O instante do pedido deve ser o instante do sistema (new Date())


            Order:
                - moment : Date
                - status : OrderStatus
                + addItem(item : OrderItem) : void
                + removeItem(item : OrderItem) : void
                + total() : Double

            Client (1:1, recebe client)
                - name : String
                - email : String
                - birthDate : Date

            OrderItem (1:N, recebe item)
                - quantity : Integer
                - price : Double
                + subTotal() : Double

            Product (1:N, recebe product)
                - name : String
                - price : Double

            OrderStatus (enum)
                - PENDING_PAYMENT : int = 0
                - PROCESSING : int = 1
                - SHIPPED : int = 2
                - DELIVERED : int = 3



            Exemplo:
                Insira os dados do cliente:
                Nome: Batata
                Email: batata@gmail.com
                Data de nascimento: 01/01/2001

                Insira os dados dos itens do pedido:
                Status: PROCESSING
                Quantos itens para este pedido: 2

                Digite os dados do item #1:
                Nome do produto: TV
                Preço: 100.00
                Quantidade: 1

                Digite os dados do item #2:
                Nome do produto: Batata
                Preço: 400.00
                Quantidade: 2

                Detalhes do pedido:
                Momento do pedido: 28/05/2023
                Status do pedido: PENDING_PAYMENT
                Cliente: Batata (01/01/2001) - batata@gmail.com

                Lista de itens do pedido:
                TV, $100.00, Quantidade: 1, Subtotal: $100.00
                Batata, $400.00, Quantidade: 2, Subtotal: $800.00
                Valor total: $900.00
        */

        Locale.setDefault(Locale.US);
        Scanner r = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

//        Product p = new Product("TV", 1000.00, 1);
//
//        OrderItem oi1 = new OrderItem(1, 1000.00, p);
//        System.out.printf((oi1.toString()) + "%n");


//

        System.out.println("Digite os dados do cliente: ");
        System.out.println("Nome: ");
        String name = r.next();
        System.out.println("Email: ");
        String email = r.next();
        System.out.println("Data de nascimento: ");
        Date birthDate = sdf.parse(r.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Insira os dados dos itens do pedido: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(r.next());

        Order order = new Order(new Date(), status, client);

        System.out.println("Quantos itens para este pedido? ");
        int num = r.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Insira os dados do item #" + (i + 1) + ": ");
            System.out.println("Nome do produto: ");
            r.nextLine();
            String productName = r.nextLine();
            System.out.println("Preço: ");
            double productPrice = r.nextDouble();
            System.out.println("Quantidade: ");
            int quantity = r.nextInt();

            Product product = new Product(productName, productPrice);

            OrderItem item = new OrderItem(quantity, productPrice, product);
            order.addItem(item);
        }

        System.out.println("Detalhes do pedido: ");
        System.out.println("Momento do pedido: " + order.getMoment());
        System.out.println("Status do pedido: " + order.getStatus());
        System.out.println("Cliente: " + client.getName() + " - " + client.getEmail());
        System.out.println("Lista de itens do pedido: ");
        System.out.println(order);

        r.close();
    }
}

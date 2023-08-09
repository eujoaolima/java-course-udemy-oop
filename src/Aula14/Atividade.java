package Aula14;

public class Atividade {
    public static void main(String[] args) {
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


    }
}

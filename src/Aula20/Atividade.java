package Aula20;

import Aula20.Entities.Reservation;
import Aula20.Exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Atividade {
    public static void main(String[] args)  {
        // ATIVIDADE - Exceções Personalizadas


        /*
            Fazer um programa para ler os dados de uma reserva de hotel
            (número do quarto, data de entrada e data de saída) e mostrar os dados
            da reserva, inclusive sua duração em dias. Em seguida, ler novas datas
            de entrada e saída, atualizar a reserva, e mostrar novamente a reserva
            com os dados atualizados. O programa não deve aceitar dados inválidos
            para a reserva, conforme as seguintes regras:

                - Alterações de reserva só podem ocorrer para datas futuras
                - A data de saída deve ser maior que a data de entrada

                UML:

                Reservation:
                    - roomNumber: Integer
                    - checkIn: Date
                    - checkOut: Date
                    + duration(): Integer
                    + updateDates(checkin: Date, checkout: Date): void

            Exemplo:

            Quarto nº: 8021
            Data de entrada: 20/04/2020
            Data de saída: 21/04/2020
            Reserva: Quarto 8021, check-in: 20/04/2020, checkout: 21/04/2020, 1 noite

            Digite os dados para atualizar a reserva:
            Check-in (dd/MM/yyyy): 14/07/2021
            Check-out (dd/MM/yyyy): 18/07/2021
            Reserva: Quarto 8021, check-in: 14/07/2021, checkout: 18/07/2021, 4 noites

            Quarto nº: 8021
            Data de entrada: 18/09/2022
            Data de saída: 17/09/2022
            Error: A data do checkout precisa ser depois da data do checkin!

        */

        Scanner r = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = r.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(r.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(r.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(r.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(r.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        catch (ParseException e) {
            System.out.println("Invalid date format");
        }
        catch (DomainException err) {
            System.out.println("Error in reservation: " + err.getMessage());
        }
        catch (RuntimeException err) {
            System.out.println("Unexpected error");
        }

        r.close();


    }
}

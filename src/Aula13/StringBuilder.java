package Aula13;

import Aula13.Entities.Comment;
import Aula13.Entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class StringBuilder {
    public static void main(String[] args) throws ParseException {
        // ATIVIDADE

        /*
            Instancie manualmente (hard code) os objetos mostrados abaixo
            e mostre-os na tela do terminal, conforme exemplo.

            Post:
                - moment: Date
                - title: String
                - content: String
                - likes: Integer

            Comment:
                - text: String

            :Post
                moment = 21/06/2018 13:05:44
                title = Viajando para Nova Zelândia
                content = A passeio
                likes = 18

            :Comment
             text = Boa viagem!

            :Comment
             text = Batata



             :Post
             moment = 29/02/2021 17:05:49
             title = Batata
             content = Batata
             likes = 21

             :Comment
             text = Boa noite

             :Comment
             text = Batata


             Console output:
             Viajando para Nova Zelândia
             18 likes - 21/06/2018 13:05:44
             A passeio
             Comentários:
             Boa viagem!
             Batata


             Batata
             21 likes - 29/02/2021 17:05:49
             Batata
             Comentários:
             Boa noite
             Batata
        */

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Scanner r = new Scanner(System.in);

        Comment c1 = new Comment("Pamonhas");
        Comment c2 = new Comment("Batatas");

        Post p1 = new Post(
            sdf.parse("21/06/2018 13:05:44"),
            "Batata",
            "Batatao",
            123
        );

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

    }
}

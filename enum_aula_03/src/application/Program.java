package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment comment01 = new Comment("Que legal!");
        Comment comment02 = new Comment("UOOU, que legal!");

        Post post01 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Viajando para a Nova Zelandia",
                "Conhecendo esse pais maravilhoso",
                12);
        System.out.println(post01);

        post01.addComment(comment01);
        post01.addComment(comment02);

        Comment comment03 = new Comment("Rapaz...");
        Comment comment04 = new Comment("Olha, se voce nao me ama...");
        Post post02 = new Post(
                sdf.parse("12/01/2023 22:02:12"),
                "Lançamento musica Caneta Azul",
                "Musica em parceria com o nosso amigo Tierry",
                1921310);
        System.out.println(post02);
    }
}

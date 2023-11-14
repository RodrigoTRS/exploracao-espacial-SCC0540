package controllers;

import models.Galaxia;
import resources.Db;
import resources.Reader;

import java.sql.SQLException;
import java.sql.Statement;

public class GalaxiaController {

    public GalaxiaController() {}

    public Galaxia getInput() {
        Galaxia g = new Galaxia();
        Reader.getInstance().input.nextLine();
        System.out.println("Qual o nome da galaxia que deseja criar?");
        g.setNome(Reader.getInstance().input.nextLine());
        System.out.println("Qual o tipo da galaxia?");
        g.setTipo(Reader.getInstance().input.nextLine());
        System.out.println("Qual a massa total?");
        g.setMassaTotal(Reader.getInstance().input.nextLine());
        System.out.println("Qual a massa visivel?");
        g.setMassaVisivel(Reader.getInstance().input.nextLine());

        return g;
    }

    public void insertGalaxia(Galaxia g) throws SQLException {
        Statement statement = Db.getInstance().connection.createStatement();

        int result = statement.executeUpdate("INSERT INTO GALAXIA VALUES ('" + g.getNome() + "', '" + g.getTipo() + "', '" + g.getMassaTotal() + "', '" + g.getMassaVisivel() + "')");

        if (result > 0) {
            System.out.println("\n -- Insercao bem sucedida!");
        } else {
            System.out.println("\n -- Falha na insercao");
        }
    }
}

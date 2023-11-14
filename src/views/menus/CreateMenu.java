package views.menus;
import controllers.GalaxiaController;
import models.Galaxia;
import resources.Db;
import resources.Reader;
import resources.TableBuilder;

import java.sql.SQLException;
import java.sql.Statement;

public class CreateMenu {

    private TableBuilder tb;
    private int[] colWidths = {40, 10};
    private String[] headers = {"O que deseja criar?", "Digite"};
    private String[][] options = {
            {"Galaxia", "1"},
            {"Estrela", "2"},
    };

    private String[][] footer = {
            {"Sair", "0"},
    };

    public CreateMenu() {
        tb = new TableBuilder(this.colWidths);
        tb.clearConsole();
        tb.setHeaders(headers);
        tb.display(options);
        tb.displayFooter(footer);
    }

    public void handleInput(int input) throws SQLException {
        if (input == 0) {
            System.out.println("Voltando ao menu");
        }
        // Galaxia
        if (input == 1) {
            GalaxiaController controller = new GalaxiaController();
            Galaxia g = controller.getInput();
            controller.insertGalaxia(g);
        }
        // Estrela
        if (input == 2) {
            System.out.println("Criando uma estrela");
        }
    }
}

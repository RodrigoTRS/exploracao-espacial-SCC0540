package views.menus;

import resources.TableBuilder;

public class QueryMenu {
    private TableBuilder tb;
    private int[] colWidths = {40, 10};
    private String[] headers = {"Menu de consultas", "Digite"};
    private String[][] options = {
            {"Consultar planetas", "1"},
            {"Consultar estrelas", "2"}
    };

    private String[][] footer = {
            {"Menu principal", "M"},
    };

    public QueryMenu() {
        tb = new TableBuilder(this.colWidths);
        tb.clearConsole();
        tb.setHeaders(headers);
        tb.display(options);
        tb.displayFooter(footer);
    }
}

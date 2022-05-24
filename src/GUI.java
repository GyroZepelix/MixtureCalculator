import javax.swing.*;
import java.util.ArrayList;

public class GUI extends JFrame {
    GUI () {
        this.setSize(400,400);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ArrayList<ArrayList<String>> data = new ArrayList<>();
        data.add(new ArrayList<String>());
        data.add(new ArrayList<String>());
        data.add(new ArrayList<String>());

        data.get(0).add("Voda");
        data.get(0).add("Sol");
        data.get(0).add("Šečer");

        data.get(1).add("100");
        data.get(1).add("50");
        data.get(1).add("25");

        data.get(2).add("50%");
        data.get(2).add("25%");
        data.get(2).add("12.5%");

        String columns[] = {"Name", "Value", "%"};


        String[][] stringArray = data.stream().map(u -> u.toArray(new String[0])).toArray(String[][]::new);
        JTable table = new JTable(stringArray, columns);
        table.setBounds(0,0,200,300);
        table.setEnabled(false);

        add(table);
        this.setVisible(true);

    }
}

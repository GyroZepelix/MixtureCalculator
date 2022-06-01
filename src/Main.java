import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Substance> _subs = new ArrayList<>();
        _subs.add(new Substance("voda", 100));
        _subs.add(new Substance("secer", 40));
        _subs.add(new Substance("sirup", 60));

        Mixture mixture = new Mixture(_subs);
        mixture.displayValues();

        System.out.println(" -------------------------------- ");

        mixture.addSubstance(new Substance("zemlja", 50));
        mixture.displayValues();

        System.out.println(" -------------------------------- ");

        mixture.addSubstance(new Substance("voda", 50), MixtureAddMode.KEEP_PROCENTAGE.id);
        mixture.displayValues();

        new MainGUI();
    }
}

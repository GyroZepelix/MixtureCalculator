import java.util.ArrayList;
import java.util.HashMap;

public class Mixture {
    ArrayList<Substance> substances = new ArrayList<>();
    public double totalValue;

    Mixture() {}

    Mixture(ArrayList<Substance> _sub)
    {
        substances.addAll(_sub);
        recalculatePercent();
    }

    Mixture(Mixture _copy) {
        for (Substance _substance: _copy.substances) {
            substances.add(new Substance(_substance));
        }
        recalculatePercent();
    }

    public void displayValues() {
        for (Substance _substance: substances) {
            System.out.println(_substance);
        }
        System.out.println("| Ukupna Kolicina : " + totalValue + " |");
    }

    public void addSubstance(Substance _sub) {
        for (Substance _substance: substances) {
            if (_substance.equalsName(_sub)) {
                _substance.value += _sub.value;
                recalculatePercent();
                return;
            }
        }
        substances.add(_sub);
        recalculatePercent();
    }

    public void addSubstance(Substance _sub, int _MODE) {
        switch (_MODE) {
            default:
                Keep_Procentage(_sub);
                break;
            case 1:
                Keep_Value(_sub);
                break;

        }
    }


    void recalculatePercent() {
        totalValue = 0f;
        for (Substance _substance: substances) {
            totalValue += _substance.value;
        }
        for (Substance _substance: substances) {
            _substance.percent = _substance.value/totalValue;
        }
    }



    //---------------------------------------------------------------------
    public void Keep_Procentage(Substance _sub) {
        for (Substance _substance: substances) {
            if (!_substance.equalsName(_sub)) continue;

            double scaler = (_substance.value+_sub.value)/ _substance.value;
            for(Substance _substance2: substances)
                _substance2.value *= scaler;
            recalculatePercent();
            return;
        }
        throw new IllegalArgumentException("you cannot proportionaly add a Substance that doesn't exist in the Mixture to the Mixture!");
    }

    public void Keep_Value(Substance _sub) {
        HashMap<String, Double> _percent = new HashMap<>();
        for (Substance _substance: substances) _percent.put(_substance.name, _substance.percent);
        for (Substance _substance: substances) {

            if (!_substance.equalsName(_sub)) continue;
            double sumSubstanceProcentage = _substance.percent + _sub.percent;

            return;
        }
    }
}

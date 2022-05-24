public class Substance {
    public String name;
    public double value;
    public double percent;

    Substance(String name, double value) {
        this.name = name;
        this.value = value;
    }

    Substance(String name, double percent, int _MODE) {
        this.name = name;
        this.percent = percent;
    }

    Substance(Substance _copy){
        this.name = _copy.name;
        this.value = _copy.value;
    }

    public boolean equalsName(Substance _other) {
        if(this.name == _other.name)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "| " + name + " | " + value +
                " | " + percent*100 +
                "% |";
    }
}

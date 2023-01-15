package transport;

public enum LoadCapasity {

    N1(null, 3.5f), N2(3.5f, 12.0f), N3(12.0f, null);

    private Float min;
    private Float max;

    LoadCapasity(Float min, Float max) {
        this.min = min;
        this.max = max;
    }

    public Float getMin() {
        return min;
    }

    public void setMin(Float min) {
        this.min = min;
    }

    public Float getMax() {
        return max;
    }

    public void setMax(Float max) {
        this.max = max;
    }

    public static String printTaskMin(Float value) {
        if (value == null) {
            return "";
        }
        return " от " + value + " тонн";
    }

    public static String printTaskMax(Float value) {
        if (value == null) {
            return "";
        }
        return " до " + value + " тонн";
    }


    @Override
    public String toString() {
        return ", грузоподъёмность" + printTaskMin(min) +
                 printTaskMax(max);
    }

}
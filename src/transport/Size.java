package transport;

public enum Size {
    XS(null, 10), S(null, 25), M(40, 50), L(60, 80), XL(100, 120);

    private Integer min;
    private Integer max;

    Size(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public Integer getMax() {
        return max;
    }

    public static String printMinSize(Integer value) {
        if (value == null) {
            return "";
        }
        return " от " + value;
    }

    public static String printMaxSize(Integer value) {
        if (value == null) {
            return "";
        }
        return " до " + value;
    }

    @Override
    public String toString() {
        return ", вместимость" + printMinSize(getMin()) +
                printMaxSize(getMax()) +
                " мест";
    }
}


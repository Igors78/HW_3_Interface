import static java.lang.System.out;
import java.util.Objects;

class Country implements Measurable {

    private static String _name = "Undefined";
    private static double _measure = 0.0;
    public static double maxim = 0.0;
    public static int index;

    public Country(String name, double measure) {
        _name = name;
        _measure = measure;
        if (_name == "Undefined" || _measure <= 0) {
            out.println("User input is not valid, enter country name and measure");
            System.exit(1);
        }
    }

    public double getMeasure() {
        return _measure;
    }

    /**
     * @param objects
     * @return
     */
    public static Measurable maximum(Measurable[] objects) {
        if (objects.length == 0) {
            out.println("You are going to appraise empty object, invalid input");
            System.exit(1);
        }

        for (index = 0; index < objects.length; index++) {

            if (Objects.isNull(objects[index]))
                continue;
            if (maxim < objects[index].getMeasure()) {
                maxim = objects[index].getMeasure();
            }

        }
        out.println("Largest area from the list is " + maxim);
        return objects[--index];
    }
}

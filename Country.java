import static java.lang.System.out;
import java.util.Objects;

class Country implements Measurable {

    private static String _name = "Undefined";
    private static double _measure = 0.0;
    public static double maxim;
    public static int index;
    public static int place_in_array = 0;

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

    public static Measurable maximum(Measurable[] objects) {
        if (objects.length == 0) {
            out.println("You are going to appraise empty object, invalid input");
            System.exit(1);
        }
    
        for (index = 0; index < objects.length; index++) {
    
            if (Objects.isNull(objects[index])) // Only simple alternative to check, against straight comparision,
                                                // others
                // are not in our course for sure
                continue;
            if (maxim < objects[index]._measure) { //here is the error
                maxim = objects[index]._measure; // here is the error
                place_in_array = index;
            }
            
        }

        return objects[place_in_array]; // Printing all on the console, so return nothing
    }
}

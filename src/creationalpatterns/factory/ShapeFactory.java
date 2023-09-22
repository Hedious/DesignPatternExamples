package creationalpatterns.factory;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class ShapeFactory {
    public static Shape createShape(String shapeName) {

        switch (shapeName.toLowerCase()) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
        }
        throw new IllegalArgumentException("Invalid shape type");
    }
}

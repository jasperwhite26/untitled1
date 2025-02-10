import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Triangle");
        arrayList.add("Rectangle");
        arrayList.add("Circle");
        arrayList.add("Rhombus");
        arrayList.add("Square");
        arrayList.add("Oval");
        arrayList.add("Trapezoid");
        System.out.println("Shapes: " + arrayList);

        arrayList.remove(3);
        arrayList.sort(null);
        System.out.print(arrayList);
    }
}

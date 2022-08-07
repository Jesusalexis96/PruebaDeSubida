//Héctor Ramírez Gómez
//Crear una lista de tipo String
//Ejercicio 2

package main;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<DummyModel> dummyModels = new ArrayList<>();

        DummyModel dm1 = new DummyModel();
        dm1.setName("juan");
        DummyModel dm2 = new DummyModel();
        dm2.setName("pedro");
        DummyModel dm3 = new DummyModel();
        dm3.setName("maria");
        DummyModel dm4 = new DummyModel();
        dm4.setName("sofia");
        dummyModels.add(dm1);
        dummyModels.add(dm2);
        dummyModels.add(dm3);
        dummyModels.add(dm4);
        dummyModels.forEach(System.out::println);
    }
}

class DummyModel {

    String name;

    public void setName(String name) {
        this.name = name;
        String firstLtr = name.substring(0, 1);
        String restLtrs = name.substring(1, name.length());
        firstLtr = firstLtr.toUpperCase();
        this.name = firstLtr + restLtrs;
    }

    public String toString() {
        return name;
    }
}

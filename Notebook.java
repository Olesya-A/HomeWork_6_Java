import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Notebook {
    int id;
    String nameModel;
    String manufacturer;
    int ram;
    String HDDvolume;
    String OperSystem;
    int price;

    public Notebook(int id,
            String nameModel,
            String manufacturer,
            int ram,
            String HDDvolume,
            String OperSystem,
            int price) {
        this.id = id;
        this.nameModel = nameModel;
        this.manufacturer = manufacturer;
        this.ram = ram;
        this.HDDvolume = HDDvolume;
        this.OperSystem = OperSystem;
        this.price = price;
    }

    public String printNB() {
        return "Название модели: " + nameModel + ", производитель: " + manufacturer + ", RAM: " + ram + ", объем HDD: "
                + HDDvolume +
                ", операционная система: " + OperSystem + ", цена: " + price;
    }

    public List<Notebook> findManufacturer(HashSet<Notebook> nbSet, String manufacturer) {
        List<Notebook> nbList = new ArrayList<Notebook>();
        for (Notebook nb : nbSet) {
            if (nb.manufacturer.toLowerCase().equals(manufacturer.toLowerCase())) {
                nbList.add(nb);
            }
        }
        return nbList;
    }

    public List<Notebook> findRAM(HashSet<Notebook> nbSet, int ram) {
        List<Notebook> nbList = new ArrayList<Notebook>();
        for (Notebook nb : nbSet) {
            if (nb.ram == ram) {
                nbList.add(nb);
            }
        }
        return nbList;
    }

    public List<Notebook> findOS(HashSet<Notebook> nbSet, String OperSystem) {
        List<Notebook> nbList = new ArrayList<Notebook>();
        for (Notebook nb : nbSet) {
            if (nb.OperSystem.toLowerCase().equals(OperSystem.toLowerCase())) {
                nbList.add(nb);
            }
        }
        return nbList;
    }
}

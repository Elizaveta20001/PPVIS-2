import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private ArrayList<Pair<Product,Integer>> listOfProductsInWarehose;
    public Warehouse()
    {
        this.listOfProductsInWarehose = new ArrayList<>();
    }

    public ArrayList<Pair<Product, Integer>> getListOfProductsInWarehose() {
        return listOfProductsInWarehose;
    }

    public void setListOfProductsInWarehose(Product product, int number) {
        this.listOfProductsInWarehose.add(new Pair<>(product,number));
    }
}

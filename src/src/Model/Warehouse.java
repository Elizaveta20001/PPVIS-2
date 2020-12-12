package Model;

import Model.Product;
import javafx.util.Pair;

import java.util.ArrayList;

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

    public void setListOfProductsInWarehose(ArrayList<Pair<Product, Integer>> listOfProductsInWarehose) {
        this.listOfProductsInWarehose = listOfProductsInWarehose;
    }
}

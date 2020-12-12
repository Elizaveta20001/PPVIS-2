package Model;

import Model.Product;
import javafx.util.Pair;

import java.util.ArrayList;

public class Provider {
    private ArrayList<Pair<Product,Integer>> listOfProductsOfProvider;
    public Provider()
    {
        this.listOfProductsOfProvider = new ArrayList<>();
    }

    public ArrayList<Pair<Product, Integer>> getListOfProductsOfProvider() {
        return listOfProductsOfProvider;
    }

    public void setListOfOfProvider(Product product, int number) {
        this.listOfProductsOfProvider.add(new Pair<>(product,number));
    }

    public void setListOfProductsOfProvider(ArrayList<Pair<Product, Integer>> listOfProductsOfProvider) {
        this.listOfProductsOfProvider = listOfProductsOfProvider;
    }
}

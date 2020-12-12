package Model;

import Model.Product;
import javafx.util.Pair;

import java.util.ArrayList;

public class ShoppingRoom {
    private ArrayList<Pair<Product,Integer>> listOfProductsInShop;
    public void ShoppinRoom()
    {
        this.listOfProductsInShop = new ArrayList<>();
    }

    public ArrayList<Pair<Product, Integer>> getListOfProductsInShop() {
        return listOfProductsInShop;
    }

    public void setListOfProductsInShop(Product product,int number) {
        this.listOfProductsInShop.add(new Pair<>(product,number));
    }

    public void setListOfProductsInShop(ArrayList<Pair<Product, Integer>> listOfProductsInShop) {
        this.listOfProductsInShop = listOfProductsInShop;
    }
}

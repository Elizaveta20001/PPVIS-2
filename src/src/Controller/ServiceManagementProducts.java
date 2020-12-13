package Controller;

import Model.Product;
import Model.Provider;
import Model.ShoppingRoom;
import Model.Warehouse;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public interface ServiceManagementProducts {
    ArrayList<Pair<Product,Integer>> showNumberOfProductsInWarehouse(Warehouse warehouse);
    ArrayList<Pair<Product,Integer>> showNumberOfProductsInShoppingRoom(ShoppingRoom shoppingRoom);
    void addProductToWarehouse(String id, String name, int numberOfProductInWarehouse,int numberOfProductInShoppingRoom,int numberOfProductSold,float unitCost, float selligPrice,String date, String kind,Warehouse warehouse);
    void sendProductToShoppingRoom(ShoppingRoom shoppingRoom, Warehouse warehouse,Product product,int number);
    void editProduct(Product product,String id, String name, int numberOfProductInWarehouse,int numberOfProductInShoppingRoom,int numberOfProductSold,float unitCost, float selligPrice,String date, String kind);
    void orderProductAtProvider(Product product, int number, Provider provider);
    void getProductFromProvider(Product product, int number, Provider provider);
    void soldProduct(Product product, int number, ShoppingRoom shoppingRoom);
    ArrayList<Product> showOverdueProducts(ShoppingRoom shoppingRoom, Warehouse warehouse);

}

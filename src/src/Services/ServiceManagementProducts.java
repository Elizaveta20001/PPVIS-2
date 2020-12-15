package Services;

import Model.Product;
import Model.Provider;
import Model.Warehouse;
import javafx.util.Pair;

import java.util.ArrayList;

public interface ServiceManagementProducts {
    ArrayList<Pair<Product,Integer>> showNumberOfProductsInWarehouse();
    ArrayList<Pair<Product,Integer>> showNumberOfProductsInShoppingRoom();
    void addProductToWarehouse(String id, String name, int numberOfProductInWarehouse,int numberOfProductInShoppingRoom,int numberOfProductSold,float unitCost, float selligPrice,String date, String kind,Warehouse warehouse);
    void sendProductToShoppingRoom(Product product,int number);
    void editProduct(Product product,String id, String name, int numberOfProductInWarehouse,int numberOfProductInShoppingRoom,int numberOfProductSold,float unitCost, float selligPrice,String date, String kind);
    void orderProductAtProvider(Product product, int number, Provider provider);
    void getProductFromProvider(Product product, int number, Provider provider);
    void soldProduct(Product product, int number);
    ArrayList<Product> showOverdueProducts();

}

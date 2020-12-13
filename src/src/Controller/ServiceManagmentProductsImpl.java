package Controller;

import Model.Product;
import Model.ShoppingRoom;
import Model.Warehouse;
import javafx.util.Pair;

import java.util.ArrayList;

public class ServiceManagmentProductsImpl implements ServiceManagementProducts {
   /* @Override
    public ArrayList<Pair<Product,Integer>> showNumberOfProductsInWarehouse(Warehouse warehouse) {
       return warehouse.getListOfProductsInWarehose();
    }

    @Override
    public ArrayList<Pair<Product,Integer>> showNumberOfProductsInShoppingRoom(ShoppingRoom shoppingRoom) {
        return shoppingRoom.getListOfProductsInShop();
    }

    @Override
    public void addProductToWarehouse(String id, String name, int numberOfProductInWarehouse, int numberOfProductInShoppingRoom, int numberOfProductSold, float unitCost, float selligPrice, String date, String kind,Warehouse warehouse) {
        Product tempProduct = new Product();
        tempProduct.setId(id);
        tempProduct.setName(name);
        tempProduct.setNumberOfProductInWarehouse(numberOfProductInWarehouse);
        tempProduct.setNumberOfProductInShop(numberOfProductInShoppingRoom);
        tempProduct.setQuantityOfProductSold(numberOfProductSold);
        tempProduct.setUnitCost(unitCost);
        tempProduct.setSumOfUnitCosts();
        tempProduct.setSellingPrice(selligPrice);
        tempProduct.setSumOfSellingPrices();
        tempProduct.setDateOfManufactoring(date);
        tempProduct.setTypeOfProductByExpirationDate(kind);
        warehouse.setListOfProductsInWarehose(tempProduct,numberOfProductInWarehouse);

    }

    @Override
    public void sendProductToShoppingRoom(ShoppingRoom shoppingRoom, Warehouse warehouse, Product product, int number) {
        //shoppingRoom.setListOfProductsInShop(product, number);
        ArrayList<Pair<Product,Integer>> temp = warehouse.getListOfProductsInWarehose();
    }

    @Override
    public void editProduct(Product product,String id, String name, int numberOfProductInWarehouse, int numberOfProductInShoppingRoom, int numberOfProductSold, float unitCost, float selligPrice, String date, String kind)
    {
        product.setId(id);
        product.setName(name);
        product.setNumberOfProductInWarehouse(numberOfProductInWarehouse);
        product.setNumberOfProductInShop(numberOfProductInShoppingRoom);
        product.setQuantityOfProductSold(numberOfProductSold);
        product.setUnitCost(unitCost);
        product.setSumOfUnitCosts();
        product.setSellingPrice(selligPrice);
        product.setSumOfSellingPrices();
        product.setDateOfManufactoring(date);
        product.setTypeOfProductByExpirationDate(kind);
    }

    */
}

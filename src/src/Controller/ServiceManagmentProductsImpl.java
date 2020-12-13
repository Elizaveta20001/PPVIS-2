package Controller;

import Model.Product;
import Model.Provider;
import Model.ShoppingRoom;
import Model.Warehouse;
import javafx.util.Pair;

import java.util.ArrayList;

public class ServiceManagmentProductsImpl implements ServiceManagementProducts {
        @Override
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

    @Override
    public void orderProductAtProvider(Product product, int number, Provider provider) {
        provider.setListOfOfProvider(product,number);
    }

    @Override
    public void getProductFromProvider(Product product, int number, Provider provider) {
            ArrayList<Pair<Product,Integer>> tempArray;
            tempArray = provider.getListOfProductsOfProvider();
            for(Pair<Product,Integer> pair: tempArray)
            {
                if(pair.getKey().equals(product))
                {
                    if(pair.getValue() > number)
                    {
                        /////
                    }
                    else
                    {
                        tempArray.remove(pair);
                    }
                }
            }
            provider.setListOfProductsOfProvider(tempArray);
    }

    @Override
    public void soldProduct(Product product, int number, ShoppingRoom shoppingRoom) {
        ArrayList<Pair<Product,Integer>> tempArray;
        tempArray = shoppingRoom.getListOfProductsInShop();
        for(Pair<Product,Integer> pair: tempArray)
        {
            if(pair.getKey().equals(product))
            {
                if(pair.getValue() > number)
                {
                    /////
                }
                else
                {
                    tempArray.remove(pair);
                }
            }
        }
        shoppingRoom.setListOfProductsInShop(tempArray);
    }

    @Override
    public ArrayList<Product> showOverdueProducts(ShoppingRoom shoppingRoom, Warehouse warehouse) {
        ArrayList<Product> productArrayList = new ArrayList<>();
        /////
        return null;
    }
}

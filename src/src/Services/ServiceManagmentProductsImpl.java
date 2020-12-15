package Services;

import Model.Product;
import Model.Provider;
import Model.ShoppingRoom;
import Model.Warehouse;
import javafx.util.Pair;

import java.util.ArrayList;

public class ServiceManagmentProductsImpl implements ServiceManagementProducts {
        private Warehouse warehouse;
        private ShoppingRoom shoppingRoom;
        private ArrayList<Provider> provider;

    public ArrayList<Provider> getProvider() {
        return provider;
    }

    public ShoppingRoom getShoppingRoom() {
        return shoppingRoom;
    }

    public void setProvider(ArrayList<Provider> provider) {
        this.provider = provider;
    }

    public void setShoppingRoom(ShoppingRoom shoppingRoom) {
        this.shoppingRoom = shoppingRoom;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    @Override
        public ArrayList<Pair<Product,Integer>> showNumberOfProductsInWarehouse() {
           return warehouse.getListOfProductsInWarehose();
        }

        @Override
        public ArrayList<Pair<Product,Integer>> showNumberOfProductsInShoppingRoom() {
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
        public void sendProductToShoppingRoom(Product product, int number) {

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

    }

    @Override
    public void soldProduct(Product product, int number) {

    }

    @Override
    public ArrayList<Product> showOverdueProducts() {
        return null;
    }
}

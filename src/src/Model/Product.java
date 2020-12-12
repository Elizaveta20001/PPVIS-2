package Model;

public class Product {
    private String id;
    private String name;
    private int numberOfProductInWarehouse;
    private int numberOfProductInShop;
    private int quantityOfProductSold;
    private float unitCost;
    private float sumOfUnitCosts;
    private float sellingPrice;
    private float sumOfSellingPrices;
    private String dateOfManufactoring;
    private String typeOfProductByExpirationDate;


    public void setId(String id)
    {
        this.id =id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setNumberOfProductInWarehouse(int numberOfProductInWarehouse)
    {
        this.numberOfProductInWarehouse = numberOfProductInWarehouse;
    }
    public void setNumberOfProductInShop(int numberOfProductInShop)
    {
        this.numberOfProductInShop = numberOfProductInShop;
    }
    public void setQuantityOfProductSold(int quantityOfProductSold)
    {
        this.quantityOfProductSold = quantityOfProductSold;
    }
    public void setUnitCost(float unitCost)
    {
        this.unitCost = unitCost;
    }
    public void setSumOfUnitCosts()
    {
        this.sumOfUnitCosts = this.unitCost * (this.numberOfProductInShop + this.numberOfProductInWarehouse);
    }
    public void setSellingPrice(float sellingPrice)
    {
        this.sellingPrice = sellingPrice;
    }
    public void setSumOfSellingPrices()
    {
        this.sumOfSellingPrices = this.sellingPrice * (this.numberOfProductInShop + this.numberOfProductInWarehouse);
    }
    public void setDateOfManufactoring(String dateOfManufactoring)
    {
        this.dateOfManufactoring=dateOfManufactoring;
    }
    public void setTypeOfProductByExpirationDate(String typeOfProductByExpirationDate)
    {
        this.typeOfProductByExpirationDate = typeOfProductByExpirationDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSellingPrice() {
        return sellingPrice;
    }

    public float getSumOfSellingPrices() {
        return sumOfSellingPrices;
    }

    public float getSumOfUnitCosts() {
        return sumOfUnitCosts;
    }

    public float getUnitCost() {
        return unitCost;
    }

    public int getNumberOfProductInShop() {
        return numberOfProductInShop;
    }

    public int getNumberOfProductInWarehouse() {
        return numberOfProductInWarehouse;
    }

    public int getQuantityOfProductSold() {
        return quantityOfProductSold;
    }

    public String getDateOfManufactoring() {
        return dateOfManufactoring;
    }

    public String getTypeOfProductByExpirationDate() {
        return typeOfProductByExpirationDate;
    }

    public void setSumOfSellingPrices(float sumOfSellingPrices) {
        this.sumOfSellingPrices = sumOfSellingPrices;
    }

    public void setSumOfUnitCosts(float sumOfUnitCosts) {
        this.sumOfUnitCosts = sumOfUnitCosts;
    }
}

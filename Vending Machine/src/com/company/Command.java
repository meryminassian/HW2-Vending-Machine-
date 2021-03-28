package com.company;

public class Command {
    private ProductType productType;
    //private Product product;
    private int count;
    private int productIndex;

    public Command(){};

    public Command(ProductType productType, int count, int productIndex) {
        this.productType = productType;
        this.count = count;
        this.productIndex = productIndex;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getProductIndex() {
        return productIndex;
    }

    public void setProductIndex(int productIndex) {
        this.productIndex = productIndex;
    }
}

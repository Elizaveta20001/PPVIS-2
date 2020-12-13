package View;

import Controller.Shop;

import javax.swing.*;

public class UI {
    private Shop shop;
    private FrameStaff frameStaff;
    private FrameProduct frameProduct;
    private FrameManagementEmployee frameManagementEmployee;
    private FrameManagementProduct frameManagementProduct;
    private FrameShowNumber frameShowNumber;
    public void showLoginFrame()
    {

    }
    public void login()
    {

    }
    public void showMainFrame()
    {

    }

    public FrameManagementEmployee getFrameManagementEmployee() {
        return frameManagementEmployee;
    }

    public FrameProduct getFrameProduct() {
        return frameProduct;
    }

    public FrameManagementProduct getFrameManagementProduct() {
        return frameManagementProduct;
    }

    public FrameShowNumber getFrameShowNumber() {
        return frameShowNumber;
    }

    public void setFrameManagementEmployee(FrameManagementEmployee frameManagementEmployee) {
        this.frameManagementEmployee = frameManagementEmployee;
    }

    public void setFrameManagementProduct(FrameManagementProduct frameManagementProduct) {
        this.frameManagementProduct = frameManagementProduct;
    }

    public void setFrameProduct(FrameProduct frameProduct) {
        this.frameProduct = frameProduct;
    }

    public void setFrameShowNumber(FrameShowNumber frameShowNumber) {
        this.frameShowNumber = frameShowNumber;
    }

    public FrameStaff getFrameStaff() {
        return frameStaff;
    }

    public void setFrameStaff(FrameStaff frameStaff) {
        this.frameStaff = frameStaff;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}

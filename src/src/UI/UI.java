package UI;

import Controller.Shop;

public class UI {
    private Shop shop;
    private FrameStaff frameStaff;

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

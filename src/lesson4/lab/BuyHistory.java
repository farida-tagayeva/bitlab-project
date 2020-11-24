package lesson4.lab;

import java.util.Date;

public class BuyHistory {
    private String goodName;
    private int goodPrice;
    private Date buyTime;

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public int getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(int goodPrice) {
        this.goodPrice = goodPrice;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public BuyHistory(String goodName, int goodPrice){
        this.goodName = goodName;
        this.goodPrice = goodPrice;
        this.buyTime = new Date();
    }



    @Override
    public String toString() {
        return "BuyHistory{" +
                "goodName='" + goodName + '\'' +
                ", goodPrice=" + goodPrice +
                ", buyTime=" + buyTime +
                '}';
    }
}

package com.bizzmark.seller.sellerwithoutlogin.db;

/**
 * Created by Tharun on 23-02-2017.
 */

public class AcknowledgePoints {

    String status;
    String earnRedeemString;
    String type;
    String billAmount;
    String storeName;
    String points;
    String deviceId;
    String discountAmount;
    String time;
//    String oldBillAmount;
//    String newBillAmount;

    public AcknowledgePoints(){

    }

    public AcknowledgePoints(String status,String earnRedeemString){
        this.status=status;
        this.earnRedeemString=earnRedeemString;
    }
    public AcknowledgePoints(String status,
                             String type,
                             String billAmount,
                             String points,
                             String storeName,
                             String deviceId,
                             String time) {
        this.status = status;
        this.type = type;
        this.billAmount = billAmount;
        this.points = points;
        this.storeName = storeName;
        this.deviceId = deviceId;
//        this.discountAmount = discountAmount;
        this.time = time;
    }




    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(String billAmount) {
        this.billAmount = billAmount;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


// public String getStatus()  {return status;    }

//    public void setStatus(String status)  { this.status=status;   }


    public String getEarnRedeemString() {  return  earnRedeemString;   }

    public void setEarnRedeemString(String earnRedeemString) {

        this.earnRedeemString=earnRedeemString;
    }
}

package simple.example.motorpedia.model;

import java.io.Serializable;

public class Hewan implements Serializable {
    private String merek;
    private String brand;
    private String cc;
    private String deskripsi;
    private int drawableRes;

    public Hewan(String merek, String brand, String cc, String deskripsi, int drawableRes) {
        this.merek = merek;
        this.brand = brand;
        this.cc = cc;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}

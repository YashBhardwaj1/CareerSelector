package com.example.vishnukant.quiz;

public class SaveData {
    String name,phnno,address;
    Float tenth_percentage,twelfth_percentage;

    public SaveData(String name, String phnno, String address, Float tenth_percentage, Float twelfth_percentage) {
        this.name = name;
        this.phnno = phnno;
        this.address = address;
        this.tenth_percentage = tenth_percentage;
        this.twelfth_percentage = twelfth_percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhnno() {
        return phnno;
    }

    public void setPhnno(String phnno) {
        this.phnno = phnno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getTenth_percentage() {
        return tenth_percentage;
    }

    public void setTenth_percentage(Float tenth_percentage) {
        this.tenth_percentage = tenth_percentage;
    }

    public Float getTwelfth_percentage() {
        return twelfth_percentage;
    }

    public void setTwelfth_percentage(Float twelfth_percentage) {
        this.twelfth_percentage = twelfth_percentage;
    }
}

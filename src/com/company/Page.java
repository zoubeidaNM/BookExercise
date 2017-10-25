package com.company;

public class Page {
    private int number;
    private String description;

    public Page(int number, String description) {
        this.number = number;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        String str = "";
        str = str.format("%-4s%-7s%-30s", " ", "Page "+number,": "+description);
        str += "\n";
        return str;
    }
}

package com.company;

import java.util.ArrayList;

public class Chapter {

    private ArrayList<Page> pages;
    private String title;
    private int number;

    public Chapter() {
        pages = new ArrayList<Page>();
        title = "";
        number = 0;
    }

    public Chapter(String title, int number) {
        pages = new ArrayList<Page>();
        this.title = title;
        this.number = number;
    }

    public ArrayList<Page> getPages() {
        return pages;
    }

    public void setPages(ArrayList<Page> pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void addPage(Page page){
        pages.add(page);
    }
    public String toString(){
        String str="";
        str += "Chapter "+ number + ": " + title.toUpperCase() +"\n";
        for(Page page:pages){
            str += page ;
        }
        str+= "-----------------------------------------------------------------\n";
        return str;
    }
}

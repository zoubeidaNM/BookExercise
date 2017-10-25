package com.company;

import java.util.ArrayList;

public class Book {
    ArrayList<Chapter> chapters;
    String title;

    public Book() {
        chapters = new ArrayList<Chapter>();
        title ="";
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(ArrayList<Chapter> chapters) {
        this.chapters = chapters;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addChapter(Chapter chapter){
        chapters.add(chapter);
    }


    public String toString(){
        String str="";
        str+= "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n";
        str += "Book title: "+ title.toUpperCase() +"\n";
        str+= "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n";
        for(Chapter chapter:chapters){
            str += chapter;
        }
        return str;

    }
}

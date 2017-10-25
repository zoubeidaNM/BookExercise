package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Book book = new Book();
        String answer = "";

        System.out.print("Enter the title of the book: ");
        book.setTitle(keyboard.nextLine());
        addChaptersToBook(book);

        //adding pages to any chapter of the book
        addPagesToAnyChapter(book);

        //display book
        System.out.println(book);
    }

    public static void addPagesToAnyChapter(Book book){
        Scanner keyboard = new Scanner(System.in);
        String answer = "";


        do{
        System.out.println("\nPress (P) to add a new pages to any existing chapter.");
        System.out.println("Press (Q) to quit");
        answer = keyboard.next();
        keyboard.nextLine();
        if(answer.equalsIgnoreCase("P")) {
            // get the existing chapter
            System.out.println("Existing chapter are:");
            for(Chapter chapter:book.getChapters()) {
                System.out.println("Chapter "+ chapter.getNumber()+ "  "+ chapter.getTitle());
            }
            System.out.println("Enter the chapter title you want to add page to.");
            String chapterTitle = keyboard.nextLine();
            boolean chapterExists = false;
            for(Chapter chapter:book.getChapters()) {
                if (chapter.getTitle().equalsIgnoreCase(chapterTitle)) {
                    addPgesToChapter(chapter);
                    chapterExists = true;
                }
            }
             if(!chapterExists){
                    System.out.println("The chapter title entred does not exist in this book.");
                }
            }


        }while (!answer.equalsIgnoreCase("Q"));

    }


    public static void addPgesToChapter(Chapter chapter){
        Scanner keyboard = new Scanner(System.in);
        String answer = "";

        do {
            //get the page attributes from the user or Q to quit
            System.out.print("   Enter a page description or (Q) to quit: ");
            answer = keyboard.nextLine();

            if (!answer.equalsIgnoreCase("Q")) {

                String description = answer;
                System.out.print("   Enter a page number: ");
                int pNumber = keyboard.nextInt();
                keyboard.nextLine();

                //create a new page
                Page page = new Page(pNumber, description);

                //add page to the chapter
                chapter.addPage(page);
            }

        }while (!answer.equalsIgnoreCase("Q"));
    }

    public static void addChaptersToBook(Book book){
        Scanner keyboard = new Scanner(System.in);
        String answer = "";

        do {
            //ask the user if he wants to enter a chapter
            System.out.print("Press (C) to enter a new (C)hapter or (Q) to quit: ");
            answer = keyboard.next();
            keyboard.nextLine();

            if (answer.equalsIgnoreCase("C")) {
                //get the chapter attributes from the user
                System.out.print("   Enter a chapter title: ");
                String title = keyboard.nextLine();
                System.out.print("   Enter a chapter number: ");
                int number = keyboard.nextInt();

                // create a new chapter
                Chapter chapter = new Chapter(title, number);

                // ask the user if he wants to add pages to the chapter
                System.out.print("Press (P) to enter a chapter's (P)ages or (Q) to quit: ");
                String answer2 = "";
                answer2 = keyboard.next();
                keyboard.nextLine();
                if(answer2.equalsIgnoreCase("P")) {

                    addPgesToChapter(chapter);
                }

                // add the chapter to the book
                book.addChapter(chapter);
            }

        } while (!answer.equalsIgnoreCase("Q"));

    }


}

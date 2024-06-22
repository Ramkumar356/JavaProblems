package exerciseProblems;

import java.util.ArrayList;
import java.util.HashMap;

public class books {
    String title;
    String author;
    boolean isBorrowed;
    int serialNumber;

    books(String title,String author,boolean isBorrowed,int serialNumber){
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
        this.serialNumber = serialNumber;
    }
    public static void main(String[] args){
        ArrayList bookLists = new ArrayList<>();
        bookLists.add(new books("The Adventures of Tom","Mark Twain",false,1));
        bookLists.add(new books("The Adventures of Tom","Mark Twain",false,2));
        bookLists.add(new books("The Adventures of Tom","Mark Twain",false,3));
        bookLists.add(new books("The Adventures of Tom","Mark Twain",false,4));
        bookLists.add(new books("The Adventures of Tom","Mark Twain",false,5));
        bookLists.add(new books("The Adventures of Tom","Mark Twain",false,6));
        bookLists.add(new books("The Adventures of Tom","Mark Twain",false,7));
        bookLists.add(new books("The Adventures of Tom","Mark Twain",false,8));
        bookLists.add(new books("The Adventures of Tom","Mark Twain",false,9));
        bookLists.add(new books("The Adventures of Tom","Mark Twain",false,10));
        bookLists.add(new books("The Adventures of Tom","Mark Twain",false,11));
        bookLists.add(new books("The Adventures of Tom","Mark Twain",false,12));
        bookLists.add(new books("The Adventures of Tom","Mark Twain",false,13));
        bookLists.add(new books("The Adventures of Tom","Mark Twain",false,14));
        bookLists.add(new books("The Adventures of Tom","Mark Twain",false,15));
        bookLists.add(new books("The Adventures of Tom","Mark Twain",false,16));
        bookLists.add(new books("The Adventures of Tom","Mark Twain",false,17));
        getAuthor(bookLists);
        getTitle(bookLists);
        isBorrowed(bookLists);
        bookDetails(bookLists,1);
        String output = bookSearching(bookLists,17);
        System.out.println(output);
    }
    public static void getTitle(ArrayList bookLists){
        for (int i = 0; i < bookLists.size(); i++) {
            books title = (books) bookLists.get(i);
            System.out.println(title.title);
           // bookLists.add(i,currentBook.author);
        }
    }
    public static void getAuthor(ArrayList bookLists){
        for (int i = 0; i < bookLists.size(); i++){
            books title = (books) bookLists.get(i);
            System.out.println(title.author);
        }
    }
    public static void isBorrowed(ArrayList bookLists){
        for (int i = 0; i < bookLists.size(); i++) {
            books title = (books) bookLists.get(i);
            System.out.println(title.isBorrowed);
        }
    }
    public static void bookDetails(ArrayList bookLists, int booknumber){
        books book = (books) bookLists.get(booknumber);
        System.out.println(book.title + " " + book.author + " " + book.isBorrowed);
    }
    public static String bookSearching(ArrayList bookLists, int targetNumber){
        int startIndex = 0;
        int endIndex = bookLists.size();
        int midIndex = endIndex / 2;
        while(endIndex - startIndex != 1){
           books currentBookNumber = (books) bookLists.get(midIndex);
           if (currentBookNumber.serialNumber == targetNumber){
               return currentBookNumber.title;
           }else if (targetNumber > currentBookNumber.serialNumber){
               startIndex = midIndex;
               midIndex = (startIndex + endIndex) / 2;
           }else if (targetNumber < currentBookNumber.serialNumber){
               endIndex = midIndex;
               midIndex = (startIndex + endIndex) / 2;
           }
        }
        return "";
    }

}

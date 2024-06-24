package ProjectLibrary;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Library {
    public static void main(String[] args){
        Map<String,Integer> booksDetails = new HashMap();
        List bookList = new ArrayList();
        List memberList = new ArrayList();
        List borrowedBooks = new ArrayList();
        addBook(bookList,booksDetails,"Revolution 2020","Chetan Bhagat",bookList.size());
        addBook(bookList,booksDetails,"A Million Mutinies Now ","V.S. Naipaul",bookList.size());
        addBook(bookList,booksDetails,"A Bend in the River ","V.S. Naipaul",bookList.size());
        addBook(bookList,booksDetails,"The god of small things","Arundhati Roy",bookList.size());
        addBook(bookList,booksDetails,"The white tiger","Arvind Adiga",bookList.size());
        registerMember(memberList,"Gobi",1);
        registerMember(memberList,"Gokul",2);
        registerMember(memberList,"Dhaksith",3);
        borrowBook(borrowedBooks,bookList,booksDetails,"Revolution 2020","Chetan Bhagat","Gobi",1);
        getAvailableBooks(bookList);
        String output = findMember(memberList,3);
        System.out.println(output);
        findBook(booksDetails,"The white tiger");
    }
    public static void addBook(List bookList,Map booksDetails,String bookName,String authorName,int indexValue){
        bookList.add(new bookDetails(bookName,authorName,indexValue,false));
        booksDetails.put(bookName,indexValue);
    }
    public static void registerMember(List memberList,String name,int memberId){
        memberList.add(new memberDetails(name, memberId));
    }
    public static boolean borrowBook(List borrowedBooks,List bookList,Map booksDetails,String bookName,String authorName,String memberName,int memberId){
        int bookIndex = (int) booksDetails.get(bookName);
        bookDetails borrowBook = (bookDetails) bookList.remove(bookIndex);
        if (borrowBook.isBorrowed == false) {
            borrowedBooks.add(new borrowedBookDetails(bookName, memberName, memberId));
            bookList.set(bookIndex,new bookDetails(borrowBook.bookName,borrowBook.authorName,borrowBook.serialNumber,true));
            return true;
        }
        return false;
    }
    public static String findMember(List memberList,int memberId){
        int endIndex = memberList.size();
        int startIndex = 0;
        int midIndex = (endIndex + startIndex) / 2;
        while (endIndex-startIndex != 1){
            memberDetails currentMember = (memberDetails) memberList.get(midIndex);
            if (currentMember.memberId == memberId){
                return currentMember.name;
            }
            if (currentMember.memberId > memberId){
                endIndex = midIndex;
                midIndex = (endIndex + startIndex) / 2;
            }
            if (currentMember.memberId < memberId){
                startIndex = midIndex;
                midIndex = (endIndex + startIndex) / 2;
            }
        }
        return "";
    }
    public static void getAvailableBooks(List bookList){
        for (int i = 0; i < bookList.size();i++) {
            bookDetails currentBook = (bookDetails) bookList.get(i);
            if (currentBook.isBorrowed == false){
                System.out.println("Book Name :" + " " + currentBook.bookName + "  -  " + "Authour Name : " + " " + currentBook.authorName);
            }
        }
    }

    public static boolean isBookBorrowed(List borrowedBooks,String bookName){
        for (int i = 0; i < borrowedBooks.size();i++){
            borrowedBookDetails book = (borrowedBookDetails) borrowedBooks.get(i);
            if (book.bookName == bookName){
                return true;
            }
        }
        return false;
    }

    public static void findBook(Map bookDetails,String name){
        if (bookDetails.containsKey(name)){
            System.out.println("Book found");
        }else{
            System.out.println("Book not found");
        }
    }
//    public static void bookSearching (List bookList,Map bookDetails,String name)throws BookNotFound,BookBorrowed{
//        if (bookDetails.containsKey(name)){
//            throw new BookNotFound("Book not found");
//        }
//    }
}
class bookDetails{
    String bookName;
    String authorName;
    boolean isBorrowed;
    int serialNumber;
    bookDetails(String bookName,String authorName,int serialNumber,boolean isBorrowed){
        this.authorName = authorName;
        this.bookName = bookName;
        this.isBorrowed = false;
        this.serialNumber = serialNumber;
    }
}
class memberDetails{
    String name;
    int memberId;
    memberDetails(String name, int memberId){
        this.memberId = memberId;
        this.name = name;
    }
}
class borrowedBookDetails{
    String bookName;
    String member;
    int memberId;
    borrowedBookDetails(String bookName,String member,int memberId){
        this.bookName = bookName;
        this.member = member;
        this.memberId = memberId;
    }
}
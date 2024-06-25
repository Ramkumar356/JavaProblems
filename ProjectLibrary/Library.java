package ProjectLibrary;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Library {
    Map<String, Integer> booksDetails = new HashMap();
    List bookList = new ArrayList();
    List memberList = new ArrayList();
    Map<String, Integer> borrowedBooks = new HashMap<>();

    public void addBook(String bookName, String authorName, boolean isBorrowed) {
        bookList.add(new BookDetails(bookName, authorName , false));
        booksDetails.put(bookName, bookList.size());
    }

    public void registerMember(String name, int memberId) {
        memberList.add(new MemberDetails(name, memberId));
    }

    public void borrowBook(String bookName, int memberId) throws Exception {
        boolean isMemberFound = false;

        if (!booksDetails.containsKey(bookName)) {
            throw new Exception("Book not found");
        }
        for (int i = 0; i < memberList.size(); i++) {
            MemberDetails member = (MemberDetails) memberList.get(i);
            if (member.memberId == memberId) {
                isMemberFound = true;
                break;
            }
        }
        if (isMemberFound == false) {
            throw new Exception("Member not found");
        }
        for(int i = 0; i < bookList.size();i++){
            BookDetails book = (BookDetails) bookList.get(i);
            if (bookName == book.bookName){
                if (book.isBorrowed == true) {
                    throw new Exception("Book already Borrowed");
                }else{
                    bookList.remove(i);
                    borrowedBooks.put(bookName,memberId);
                    bookList.add(new BookDetails(book.bookName, book.authorName,true));
                    break;
                }
            }
        }
    }
    public boolean findMember(int memberId) {
        for (int i = 0; i < memberList.size();i++){
            MemberDetails member = (MemberDetails) memberList.get(i);
            if (memberId == member.memberId){
                return true;
            }
        }
        return false;
    }

    public List<String> getAvailableBooks() {
        List availableBooks = new ArrayList();
        for (int i = 0; i < bookList.size(); i++) {
            BookDetails currentBook = (BookDetails) bookList.get(i);
            if (currentBook.isBorrowed == false) {
                availableBooks.add(currentBook.bookName);
            }
        }
        return availableBooks;
    }

    public boolean isBookBorrowed(String bookName) {
            if (borrowedBooks.containsKey(bookName)) {
                return true;
            }
            return false;
    }
    public void returnBook(String bookName,int memberId){
        for (int i = 0; i < bookList.size(); i++) {
            BookDetails currentBook = (BookDetails) bookList.get(i);
            if (currentBook.bookName == bookName){
                bookList.remove(i);
                borrowedBooks.remove(bookName,memberId);
                bookList.add(new BookDetails(currentBook.bookName, currentBook.authorName, false));
                System.out.println("Book Returned");
                break;
            }
        }
    }
}

class BookDetails{
    String bookName;
    String authorName;
    boolean isBorrowed;
    BookDetails(String bookName,String authorName,boolean isBorrowed){
        this.authorName = authorName;
        this.bookName = bookName;
        this.isBorrowed = isBorrowed;
    }
}
class MemberDetails{
    String name;
    int memberId;
    MemberDetails(String name, int memberId){
        this.memberId = memberId;
        this.name = name;
    }
}
class BorrowedBookDetails{
    String bookName;
    int memberId;
    BorrowedBookDetails(String bookName,int memberId){
        this.bookName = bookName;
        this.memberId = memberId;
    }
}
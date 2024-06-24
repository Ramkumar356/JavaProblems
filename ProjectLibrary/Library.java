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
    List borrowedBooks = new ArrayList();

    public void addBook(String bookName, String authorName, int indexValue) {
        bookList.add(new BookDetails(bookName, authorName, indexValue, false));
        booksDetails.put(bookName, indexValue);
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
        int bookIndex = booksDetails.get(bookName);
        BookDetails book = (BookDetails) bookList.get(bookIndex);
        if (book.isBorrowed == true) {
            throw new Exception("Book is already borrowed");
        }
        borrowedBooks.add(new BorrowedBookDetails(bookName, memberId));
        bookList.set(bookIndex, new BookDetails(bookName, book.authorName, book.serialNumber, true));

    }

    public String findMember(int memberId) {
        int endIndex = memberList.size();
        int startIndex = 0;
        int midIndex = (endIndex + startIndex) / 2;
        while (endIndex - startIndex != 1) {
            MemberDetails currentMember = (MemberDetails) memberList.get(midIndex);
            if (currentMember.memberId == memberId) {
                return currentMember.name;
            }
            if (currentMember.memberId > memberId) {
                endIndex = midIndex;
                midIndex = (endIndex + startIndex) / 2;
            }
            if (currentMember.memberId < memberId) {
                startIndex = midIndex;
                midIndex = (endIndex + startIndex) / 2;
            }
        }
        return "Member Not Found";
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
        for (int i = 0; i < borrowedBooks.size(); i++) {
            BorrowedBookDetails book = (BorrowedBookDetails) borrowedBooks.get(i);
            if (book.bookName == bookName) {
                return true;
            }
        }
        return false;
    }
}

class BookDetails{
    String bookName;
    String authorName;
    boolean isBorrowed;
    int serialNumber;
    BookDetails(String bookName,String authorName,int serialNumber,boolean isBorrowed){
        this.authorName = authorName;
        this.bookName = bookName;
        this.isBorrowed = false;
        this.serialNumber = serialNumber;
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
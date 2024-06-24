package ProjectLibrary;

import java.util.List;

public class Main {
    public static void main(String[] args){
      Library library = new Library();
        library.addBook("Revolution 2020","Chetan Bhagat",library.bookList.size());
        library.addBook("A Million Mutinies Now ","V.S. Naipaul",library.bookList.size());
        library.addBook("A Bend in the River ","V.S. Naipaul",library.bookList.size());
        library.addBook("The god of small things","Arundhati Roy",library.bookList.size());
        library.addBook("The white tiger","Arvind Adiga",library.bookList.size());
        library.registerMember("Gobi",1);
        library.registerMember("Gokul",2);
        library.registerMember("Dhaksith",3);
        try {
            library.borrowBook("Revolution 2020", 3);
            library.borrowBook("Revolution 2020", 2);
            library.borrowBook("Revolution 2020", 1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        String output = library.findMember(27);
        System.out.println(output);
        List books = library.getAvailableBooks();
        for (int i = 0; i < books.size();i++){
            System.out.println(books.get(i));
        }
    }
}

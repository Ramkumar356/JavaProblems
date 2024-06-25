package ProjectLibrary;

import java.util.List;

public class Main {
    public static void main(String[] args){
      Library library = new Library();
        library.addBook("Revolution 2020","Chetan Bhagat",false);
        library.addBook("A Million Mutinies Now ","V.S. Naipaul",false);
        library.addBook("A Bend in the River ","V.S. Naipaul",false);
        library.addBook("The god of small things","Arundhati Roy",false);
        library.addBook("The white tiger","Arvind Adiga",false);
        library.registerMember("Gobi",1);
        library.registerMember("Gokul",2);
        library.registerMember("Dhaksith",3);
        try {
            library.borrowBook("Revolution 2020", 3);
            library.borrowBook("The god of small things", 9);
            library.borrowBook("The white tiger", 2);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        boolean output = library.findMember(27);
        System.out.println(output);

        List books = library.getAvailableBooks();
        System.out.println("Book list after book borrowed");
        for (int i = 0; i < books.size();i++){
            System.out.println(books.get(i));
        }

        library.returnBook("Revolution 2020",3);

        List books1 = library.getAvailableBooks();
        System.out.println("Book list after book returned");
        for (int i = 0; i < books1.size();i++){
            System.out.println(books1.get(i));
        }
    }
}

package library;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");
        Library library = new Library (bookOne, bookTwo,bookThree);

        Iterator<Book> libraryIterator = library.iterator();
        while (libraryIterator.hasNext()){
            System.out.println(libraryIterator.next().getTitle());
        }
    }
}

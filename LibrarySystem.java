import java.util.Scanner;

import com.exceptions.InvalidOptionFromMenu;
import com.libary.models.Book;
// import com.libary.services.Library;
import com.libary.services.Library;

public class LibrarySystem {
    // Main Menu.
    static int menu(Scanner scanner) throws InvalidOptionFromMenu {
        System.out.println("#######################################");
        System.out.println("# * SIMPLE LIBRARY MANAGMENT SYSTEM * #");
        System.out.println("#######################################");
        System.out.println("\t1) Query book");
        System.out.println("\t2) Query member");
        System.out.println("\t3) Borrow book");
        System.out.println("\t4) Return book");
        System.out.print("Choose an option from the list above:\s");
        
        int option = scanner.nextInt();

        if (option < 1 || option > 4) {
            throw new InvalidOptionFromMenu(1,4);
        }

        return option;
    }

    public static void main(String[] args) {
        
        Library lb = new Library();
        Scanner stdin = new Scanner(System.in);


        try {
            int option = LibrarySystem.menu(stdin);
            stdin.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter the title of the book (Leave blank for all): ");
                    String title = stdin.nextLine();

                    System.out.print("Enter the title of the author (Leave blank for all): ");
                    String author = stdin.nextLine();

                    lb.searchBooks(title,author);
                    break;

                case 2:
                    System.out.print("Enter name of the member (Leave blank for all): ");
                    String memberName = stdin.nextLine();

                    lb.searchMembers(memberName);
                    break;

                case 3:
                    lb.borrowBook(option, option);
                    break;

                case 4:
                    lb.returnBook(option, option);
                    break;

            }

        } catch (InvalidOptionFromMenu e) {
            System.out.println(e.getMessage());
            
        }
            
    }
}

/*import java.util.*;

class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author;
    }
}

class Borrower {
    private int borrowerId;
    private String name;

    public Borrower(int borrowerId, String name) {
        this.borrowerId = borrowerId;
        this.name = name;
    }

    public int getBorrowerId() {
        return borrowerId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Borrower ID: " + borrowerId + ", Name: " + name;
    }
}

class LibraryTransaction {
    private int transactionId;
    private int bookId;
    private int borrowerId;
    private Date issueDate;
    private Date returnDate;

    public LibraryTransaction(int transactionId, int bookId, int borrowerId, Date issueDate, Date returnDate) {
        this.transactionId = transactionId;
        this.bookId = bookId;
        this.borrowerId = borrowerId;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public int getBookId() {
        return bookId;
    }

    public int getBorrowerId() {
        return borrowerId;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionId + ", Book ID: " + bookId + ", Borrower ID: " + borrowerId + ", Issue Date: " + issueDate + ", Return Date: " + returnDate;
    }
}

public class L2_task1{
    private ArrayList<Book> books;
    private ArrayList<Borrower> borrowers;
    private ArrayList<LibraryTransaction> transactions;
    private HashMap<Integer, Book> bookMap;

    private int nextBookId;
    private int nextBorrowerId;
    private int nextTransactionId;

    public L2_task1() {
        books = new ArrayList<>();
        borrowers = new ArrayList<>();
        transactions = new ArrayList<>();
        bookMap = new HashMap<>();
        nextBookId = 1;
        nextBorrowerId = 1;
        nextTransactionId = 1;
    }

    public void addBook(String title, String author) {
        Book newBook = new Book(nextBookId, title, author);
        books.add(newBook);
        bookMap.put(nextBookId, newBook);
        nextBookId++;
    }

    public void removeBook(int bookId) {
        Book bookToRemove = bookMap.get(bookId);
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            bookMap.remove(bookId);
            System.out.println("The Book removed successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books found.");
            return;
        }

        System.out.println("Books in the Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void addBorrower(String name) {
        Borrower newBorrower = new Borrower(nextBorrowerId, name);
        borrowers.add(newBorrower);
        nextBorrowerId++;
    }

    public void displayBorrowers() {
        if (borrowers.isEmpty()) {
            System.out.println("No borrowers found.");
            return;
        }

        System.out.println("Borrowers in the Library:");
        for (Borrower borrower : borrowers) {
            System.out.println(borrower);
        }
    }

    public void issueBook(int bookId, int borrowerId) {
        Book book = bookMap.get(bookId);
        if (book == null) {
            System.out.println("This book is not found");
            return;
        }

        Borrower borrower = findBorrowerById(borrowerId);
        if (borrower == null) {
            System.out.println("Borrower not found");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Book is already issued");
            return;
        }

        Date issueDate = new Date();
        Date returnDate = null;

        LibraryTransaction transaction = new LibraryTransaction(nextTransactionId, bookId, borrowerId, issueDate, returnDate);
        transactions.add(transaction);
        book.setAvailable(false);
        nextTransactionId++;

        System.out.println("Book issued successfully!");
    }

    public void returnBook(int bookId) {
        Book book = bookMap.get(bookId);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        for (LibraryTransaction transaction : transactions) {
            if (transaction.getBookId() == bookId && transaction.getReturnDate() == null) {
                Date returnDate = new Date();
                transaction.setReturnDate(returnDate);
                book.setAvailable(true);
                System.out.println("Book returned successfully!");
                return;
            }
        }

        System.out.println("Book is not issued to any borrower");
    }

    private Borrower findBorrowerById(int borrowerId) {
        for (Borrower borrower : borrowers) {
            if (borrower.getBorrowerId() == borrowerId) {
                return borrower;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        L2_task1 library = new L2_task1();

        while (true) {
            System.out.println("Library Management System Menu:");
            System.out.println("1. Add new book");
            System.out.println("2. Remove a book");
            System.out.println("3. Display all books");
            System.out.println("4. Add new borrower");
            System.out.println("5. Display all borrowers");
            System.out.println("6. Issue a book");
            System.out.println("7. Return a book");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Welcome to our Library Management System");
                    scanner.close();
                    return;
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    library.addBook(title, author);
                    System.out.println("Book added successfully!");
                    break;
                case 2:
                    System.out.print("Enter book ID to remove: ");
                    int bookIdToRemove = scanner.nextInt();
                    library.removeBook(bookIdToRemove);
                    break;
                case 3:
                    library.displayBooks();
                    break;
                case 4:
                    System.out.print("Enter borrower name: ");
                    String borrowerName = scanner.nextLine();
                    library.addBorrower(borrowerName);
                    System.out.println("Borrower added successfully.");
                    break;
                case 5:
                    library.displayBorrowers();
                    break;
                case 6:
                    System.out.print("Enter book ID to issue: ");
                    int bookIdToIssue = scanner.nextInt();
                    System.out.print("Enter borrower ID: ");
                    int borrowerId = scanner.nextInt();
                    library.issueBook(bookIdToIssue, borrowerId);
                    break;
                case 7:
                    System.out.print("Enter book ID to return: ");
                    int bookIdToReturn = scanner.nextInt();
                    library.returnBook(bookIdToReturn);
                    break;
                default:
                    System.out.println("Your choice is not valid ");
            }

            System.out.println();
        }
    }
}
*/
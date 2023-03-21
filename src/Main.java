public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Война и мир", "Лев Толстой", 1999);
        System.out.println("bookName = " + book1.bookName);
        Book book2 = new Book("Преступление и наказание", "Федор Достоевский", 2015);
        System.out.println("bookName = " + book2.bookName);
    }
}
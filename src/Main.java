public class Main {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        System.out.println("author = " + author);
        Author author1 = new Author("Михаил", "Булгаков");
        System.out.println("author1 = " + author1);
        Book book = new Book("Война и мир", author, 1956);
        System.out.println("book = " + book);
        Book book1 = new Book("Собачье сердце", author1, 1984);
        System.out.println("book1 = " + book1);
        book.setYearOfPublication(1996);
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());
        System.out.println(author.equals(author1));
        System.out.println(book.equals(book1));
        System.out.println(author.hashCode());
        System.out.println(author1.hashCode());
        System.out.println(book.hashCode());
        System.out.println(book1.hashCode());

    }
}
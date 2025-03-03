public class Main {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        System.out.println("author.nameAuthor = " + author.getNameAuthor());
        System.out.println("author.surnameAuthor = " + author.getSurnameAuthor());
        Author author1 = new Author("Михаил", "Булгаков");
        System.out.println("author.nameAuthor1 = " + author1.getNameAuthor());
        System.out.println("author.surnameAuthor1 = " + author1.getSurnameAuthor());
        Book book = new Book("Война и мир", author, 1956);
        System.out.println("book.bookName = " + book.getBookName());
        System.out.println("book.author = " + book.getAuthor().getNameAuthor() + " " + book.getAuthor().getSurnameAuthor());
        System.out.println("book.yearOfPublication = " + book.getYearOfPublication());
        Book book1 = new Book("Собачье сердце", author1, 1984);
        System.out.println("book1.bookName = " + book1.getBookName());
        System.out.println("book1.author = " + book1.getAuthor().getNameAuthor() + " " + book1.getAuthor().getSurnameAuthor());
        System.out.println("book1.yearOfPublication = " + book1.getYearOfPublication());
        book.setYearOfPublication(1996);
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());
    }
}
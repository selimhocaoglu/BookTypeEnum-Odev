public class ReaderTest {
    public static void main(String[] args){
        /*Author author1 = new Author("Leo Perutz");
        Author author2 = new Author("Stefan Zweig");
        Book book1 = new Book(author1, "Dokuzla Dokuz Arasında", 200, "Roman", true, 50);
        Book book2 = new Book(author2, "Korku", 98, "Roman", false, 0);
        Reader reader1 = new Reader("Selim", 20, "Man");
        Reader reader2 = new Reader("Irmak", 19, "Women");
        reader2.read(book2);
        reader1.read(book1);*/

        System.out.println("****************GÜNCELLEME SONRASI***********************");
        Author author3 = new Author("Charlotte Bronte");
        BookType type1 = BookType.fiction;
        Book book3 = new Book(author3, "Jane Eyre", 800, type1, false,800);
        Reader reader1 = new Reader("Selim", 20, "Man");
        reader1.read(book3);

    }
}

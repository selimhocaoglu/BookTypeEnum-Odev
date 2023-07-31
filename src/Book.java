public class Book {
    private Author author;
    private String title;
    private int pageCount;
    private BookType type;
    private boolean hardCover;
    private int currentPage;

    public Book(Author author, String title, int pageCount, BookType type, boolean hardCover, int currentPage){
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        this.type = type;
        this.hardCover = hardCover;
        this.currentPage = currentPage;

    }
    public Author getAuthor(){
        return author;
    }
    public String getTitle() {
        return title;
    }
    public int getPageCount() {
        return pageCount;
    }
    public BookType getType() {
        return type;
    }
    public boolean getHardCover() {
        return hardCover;
    }
    public int getCurrentPage(){
        return currentPage;
    }




}
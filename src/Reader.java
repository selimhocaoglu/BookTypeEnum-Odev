public class Reader {
    private String name;
    private int age;
    private String sex;

    public Reader(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void read (Book book){
        System.out.println(book.getTitle() + " kitabının yazarı: " + book.getAuthor().getName() + " ve kitabın sayfa sayısı: " + book.getPageCount());
        System.out.println();
        //DEVAM ETMEYİ UNUTMA!!!
        //Diğer veriler de isteğe göre yazılıp alınabilir.
        System.out.println(this.name + " okuyucusunun şu anda bulunduğu sayfa sayısı: " + book.getCurrentPage());
        System.out.println(book.getTitle() + " kitabı sert kapaklı mı? " + book.getHardCover());
    }
}
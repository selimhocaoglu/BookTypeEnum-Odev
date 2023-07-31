public enum BookType {
    fiction("fiction"), nonFiction("non-fiction"), scientific("scientific");
    String description;
    BookType(String description){
        this.description=description;
    }

    public String getDescription(){
        return description;
    }
}

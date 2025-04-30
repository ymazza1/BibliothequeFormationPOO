public abstract class Document {
    private String title;
    private Integer id;

    public Document( String title) {
        this.title = title;
        this.id = (int)(Math.random() * 101); // 0 to 100;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }
}

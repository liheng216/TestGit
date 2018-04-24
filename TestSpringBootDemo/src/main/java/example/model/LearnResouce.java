package example.model;

public class LearnResouce {
    private String author;
    private String title;
    private String url;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LearnResouce(String author, String title, String url) {
        this.author = author;
        this.title = title;
        this.url = url;
    }
}

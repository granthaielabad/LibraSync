package model;

import javax.swing.Icon;

public class Model_Book {

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public Icon getRating() {
        return rating;
    }

    public void setRating(Icon rating) {
        this.rating = rating;
    }

    public Icon getBookmark() {
        return bookmark;
    }

    public void setBookmark(Icon bookmark) {
        this.bookmark = bookmark;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Model_Book(String title, String author, String publisher, String genre,String status, String description, String tags) {
        this.icon = icon;
        this.rating = rating;
        this.bookmark = bookmark;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
        this.status = status;
        this.description = description;
        this.tags = tags;
    }

    public Model_Book() {
    }
    
    private Icon icon;
    private Icon rating;
    private Icon bookmark;
    private String title;
    private String author;
    private String publisher;
    private String genre;
    private String status;
    private String description;
    private String tags;
    
}

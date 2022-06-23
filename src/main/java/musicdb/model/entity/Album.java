package musicdb.model.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "albums")
public class Album extends BaseEntity{

    @Column
    private String name;
    @Column
    private String imageURL;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Column
    private int copies;
    @Column
    private BigDecimal price;
    @Column
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date releaseDate;
    @Column
    private String producer;
    @Enumerated
    private GenreEum genreEum;
    @ManyToOne
    private Artist artist;
    @ManyToOne
    private User addedFrom;

    public Album() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public GenreEum getGenreEum() {
        return genreEum;
    }

    public void setGenreEum(GenreEum genreEum) {
        this.genreEum = genreEum;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public User getAddedFrom() {
        return addedFrom;
    }

    public void setAddedFrom(User addedFrom) {
        this.addedFrom = addedFrom;
    }
}

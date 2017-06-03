package Entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Yakov
 */
@Entity
@Table(name = "Campaign", schema = "advag")
public class Campaign implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 20)
    private String name;
    @Size(min = 1, max = 80)
    private String about;
    @NotNull
    private int price;
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date startdate;
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date enddate;
    @JoinColumn(name = "advertising_id")
    @ManyToMany(mappedBy = "campaigns", cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    private List<Advertising> advertisings;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Campaign campaign = (Campaign) o;

        return id != null ? id.equals(campaign.id) : campaign.id == null;
    }

    @Override
    public String toString() {
        return "Campaign{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", about='" + about + '\'' +
                ", price=" + price +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                '}';
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public List<Advertising> getAdvertisings() {
        return advertisings;
    }

    public void setAdvertisings(List<Advertising> advertisings) {
        this.advertisings = advertisings;
    }
}

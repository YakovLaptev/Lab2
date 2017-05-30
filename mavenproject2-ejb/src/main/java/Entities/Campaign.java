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
    @GeneratedValue(strategy = GenerationType.AUTO)
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
}

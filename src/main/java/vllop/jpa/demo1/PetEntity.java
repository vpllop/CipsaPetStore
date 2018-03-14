package vllop.jpa.demo1;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="PETS")
public class PetEntity {

    @Id
    private String id;
    @Column(nullable=false)
    String name;
    @Column(name = "BORN_DATE")
    Date bornDate;
    @Basic(optional = false)
    String breed;
    @Transient
    String formattedName;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getFormattedName() {
        return formattedName;
    }

    public void setFormattedName(String formattedName) {
        this.formattedName = formattedName;
    }
}

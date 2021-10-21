
package reto3.computer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author grupo7 
 */
@Entity
@Table(name = "computer")
public class Computer {

    @Id
    @GeneratedValue
    private Integer idcomputer;
    private Integer brand;
    private Integer year;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "id")
    @JsonIgnoreProperties("category")
    private Category category;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "computer")
    @JsonIgnoreProperties({"computer", "client"})
    private List<Message> messages;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "computer")
    @JsonIgnoreProperties({"computer", "client"})
    private List<Reservations> reservations;
    public Integer getIdcomputer() {
        return idcomputer;
    }

    public void setIdcomputer(Integer idcomputer) {
        this.idcomputer = idcomputer;
    }

    public Integer getBrand() {
        return brand;
    }

    public void setBrand(Integer brand) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

 
    
    
      

}

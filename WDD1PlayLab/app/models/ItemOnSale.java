@ManyToOne
private Category category;

package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class ItemOnSale extends Model {

    // Properties
    private Long id;
    private String name;
    private String description;
    private int stock;
    private double price;

    // Default Constructor
    public ItemOnSale() {
    }

    // Constructor to initialise object
    public ItemOnSale(Long id, String name, String description, int stock, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.price = price;
    }

    // Accessor methods
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
    public String getdescription() {
       return description;
    }
    public void setdescription(String name) {
        this.name = name;
    }
    public void setstock(String name) {
        this.name = name;
    }
    public int getstock() {
        return stock;
    }
    public void setprice(String name) {
        this.name = name;
    }
    public double getprice(String name) {
        return price;
    }

    public static final Finder<Long, ItemOnSale> find = new Finder<>(ItemOnSale.class);
			    
    public static final List<ItemOnSale> findAll() {
       return ItemOnSale.find.all();
    }

    <tbody>
   @* Loop for creating table rows from ItemOnSale data *@
   @for(i<-items) {
      <tr>
         <td>@i.getId</td>
         <td>@i.getName</td>
         <td>@i.getDescription</td>
         <td>@i.getStock</td>
         <td>&euro; @("%.2f".format(i.getPrice))</td>
      </tr>
   }
</tbody>
}
    

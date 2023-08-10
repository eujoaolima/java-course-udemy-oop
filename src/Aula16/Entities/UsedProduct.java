package Aula16.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    public final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;

    public UsedProduct(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return super.priceTag() + " (usado)";
    }
}

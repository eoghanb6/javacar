import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Engine {
    public String brand;
    public String fuelType;
    public float capacity;
    public float width;
    public float height;
    private String updateTime ;
    public Engine (String brand, String fuelType, float capacity, float width, float height ) {
    this.brand = brand ;
    this.fuelType = fuelType ;
    this.capacity = capacity ;
    this.width = width ;
    this.height = height;



    }
    public void  updateEngine(String brand, String fuelType, float capacity, float width, float height)   {
        this.brand = brand ;
        this.fuelType = fuelType ;
        this.capacity = capacity ;
        this.width = width ;
        this.height = height;

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        updateTime = dateFormat.format(date) ;

    }
    public String getEngine() {

        return (brand + " " + fuelType + " " + capacity + "" + width + "" +height) ;

    }
}
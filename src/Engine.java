import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
//creates Engine class
public class Engine {
    public String brand;
    public String fuelType;
    public float capacity;
    public float width;
    public float height;
    private String updateTime ;
      //creates constructor for Engine class
    public Engine (String brand, String fuelType, float capacity, float width, float height ) {
    this.brand = brand ;
    this.fuelType = fuelType ;
    this.capacity = capacity ;
    this.width = width ;
    this.height = height;



    }
          //created method for updating engine specs
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
         //created method for returning engine information
    public String getEngine() {

        return (brand + " " + fuelType + " " + capacity + "" + width + "" +height) ;

    }
}

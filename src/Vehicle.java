  import java.sql.Time;
  import java.text.SimpleDateFormat;
  import java.util.Calendar;
  import java.util.Date;
  import java.text.DateFormat;
  //Vehicle class
public class Vehicle {
    public  String vehicleName;
    private String brand;
    private String model;
    public Engine engine;        //references the engine class rather than a string
    private int numberOfWheels;
    //constructor
    public Vehicle (String vehicleName,String brand, String model, Engine engine) {

        this.vehicleName = vehicleName ;
        this.brand = brand ;
        this.model = model;
        this.engine = engine;

       //Asigns 2 wheels when vehicle is a suzuki gsx
        if ((this.brand == "suzuki") && (this.model == "gsx") ) {
            this.numberOfWheels = 2;
    }     //Assigns 4 wheels otherwise
        else { this.numberOfWheels = 4 ; }




}
       //method for gaining vehicle description
    public String getVehicleDescription () {

        return brand +" " + model ;

    }
  }



  import java.sql.Time;
  import java.text.SimpleDateFormat;
  import java.util.Calendar;
  import java.util.Date;
  import java.text.DateFormat;
public class Vehicle {
    public  String vehicleName;
    private String brand;
    private String model;
    public Engine engine;
    private int numberOfWheels;

    public Vehicle (String vehicleName, String brand, String model, String engine) {

        this.vehicleName = vehicleName ;
        this.brand = brand ;
        this.model = model;
        this.engine = Engine.class;


        if ((this.brand == "suzuki") && (this.model == "gsx") ) {
            this.numberOfWheels = 2;
    }
        else { this.numberOfWheels = 4 ; }




}
    public String getVehicleDescription () {

        return brand +" " + model ;

    }
    }



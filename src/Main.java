public class Main {

    public static void main(String[] args) {
       Engine E = new Engine("Honda", "Petrol", 12.5f, 14.5f, 15.5f)   ;
      Vehicle W = new Vehicle("bike", "suzuki", "ford", E)  ;

       // W.updateEngine("306");
        System.out.println(W.getVehicleDescription());



    }
}

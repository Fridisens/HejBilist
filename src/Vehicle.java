public abstract class Vehicle {
    private int miles;
    private Driver driver;
    protected int fuelConsumption;
    protected int canYouDrive;
    private String name;

    public Vehicle(int miles, String name) {
        this.miles = miles;
        this.name = name;
        System.out.println(name + " created. " + miles + " miles to go");
    }

    //For changing the driver and control the age
    public void setDriver(Driver driver) {
        if (driver.getAge() <= canYouDrive){
            this.driver = driver;
            System.out.println("Driver changed to " +driver.getName());

        } else {
            System.out.println("Driver not changed! " + driver.getName() + " is " + driver.getAge() + "," +
                    " but must be " + canYouDrive + " or older to drive " + name.toLowerCase());
        }

    }

// check if driver is set and if there is a driver set, simulate the drive and reduce miles based on fuel consumption
    public void drive(){
        if(!isDriverSet()){
            System.out.println(name + " didn´t drive - there´s no driver");
            return;

        }
        miles -= fuelConsumption;
        System.out.println(name + " drove " + fuelConsumption + " miles - " + miles + " miles to go");
        }

    //control for driver is set on a vehicle
    public boolean isDriverSet(){
        if(this.driver == null){
            return false;

        }
        return true;
    }
}

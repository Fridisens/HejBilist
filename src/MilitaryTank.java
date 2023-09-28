public class MilitaryTank extends Vehicle{

    public MilitaryTank(){
        //call the superclass Vehicle constructor
        super(2000, "Tank");

        //Set the fuelconsumption and minimum age for military tank
        this.fuelConsumption = 5;
        this.canYouDrive = 25;
    }

}

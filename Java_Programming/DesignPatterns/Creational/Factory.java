
//  below code is without factory method
// problems 
//  tight coupling difficult to maintain
// Violation of single responsibility Principle. 
// client class is responsible not only for detemining which type of vehicle to instantiate based on input type but also manage life cycle of the vehicle object
//  limited scalabity: adding a new type of vehicle requires modifying the Client class which violates the open closed principle 
abstract class Vehicle{
    public abstract void printVehicle();
}

class TwoWheeler extends Vehicle{

    public void printVehicle(){
        System.out.println("I am two wheeler");
    }

}

class FourWheeler  extends Vehicle{
    public void printVehicle{
        System.out.println("I am four wheeler");
    }
}

class Client{

    private Vehicle pVehicle;

    public Client (int type){
        if(type ==1){
            pVehicle = new TwoWheeler();
        }
        else if (type ==2){
            pVehicle = new FourWheeler();
        }
        else{
            pVehicle = null
        }
    }
    public cleanUp(){
        if(pVehicle !=null){
            pVehicle = null
        }
    }

    public Vehicle getVehicle(){
        return pVehicle;
    }
}

class Factory(){
    public static void main(String args[]){
        Client pClient = new Client(1);
        Vehicle pVehicle = pClient.getVehicle();
        if(pVehicle!=null){
            pVehicle.printVehicle();
        }
        pClient.cleanUp();
    }
}

// Factory design approach

public abstract class Vehicle{
    public abstract void printVehicle();
}


public class TwoWheeler extends Vehicle{
    public void printVehicle(){
        System.out.println("I am Two Wheeler");
    }
}

public class FourWheeler extends Vehicle{
    public void printVeicle(){
        System.out.println("I am FourWheeler");
    }
}

public interface VehilceFactory(){
    Vehicle createVehicle();
}

class TwoWheelerFactory implements VehilceFactory{
    public Vehicle createVehicle(){
        return new TwoWheeler();
    }
}

class FourWheelerFactory implements VehilceFactory{
    public Vehicle createVehicle(){
        return new FourWheeler();
    }
}

class Client {
    private Vehicle pVehicle;

    public Client(VehilceFactory factory){
        pVehicle = factory.getVehicle();
    }
    public Vehicle getVehicle(){
        return pVehicle;
    }
}

class GFG {
    public static void main(String[] args){
        VehilceFactory twoWheelerFactory = new TwoWheelerFactory();

        Client twoWheelerClient = new Client(twoWheelerClient);

        Vehicle twoWheeler = twoWheelerClient.getVehicle();
        twoWheeler.printVehicle();

        VehilceFactory fourWheelerFactory = new FourWheelerFactory;

        Client fourWheelerClient = new Client(fourWheelerClient);

        Vehicle fourWheeler = fourWheelerClient.getVehicle();
        fourWheeler.printVehicle();
    }
}
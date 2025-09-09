public class car {
    //property class
    int numDoors;
    boolean isElectric;

    //constructor
    public car() {
        numDoors = 4;
        isElectric = false;

    }
    
    public car(int numDoors, boolean isElectric) {
        this.numDoors = numDoors;
        this.isElectric = isElectric;

    }

    public void print() {
        System.out.println("numDoors:" + numDoors);
        System.out.println("isElectric:" + isElectric);
    }
}

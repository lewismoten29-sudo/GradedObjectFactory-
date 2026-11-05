public class Factory {
  //Instance Variables
public int yearFounded = 2026;
public boolean isOperational = true;
public String director = "Lewis Moten";

//psvm
public static void main(String[] args){
    Factory lab = new Factory();
} //end of psvm

    public Cell cell1; //Makes cell 1
    public Cell cell2;
    public Cell cell3;

    //factory constructor
    public Factory(){
        System.out.println("Welcome to " + director +"'s cell factory.");
        System.out.println("This factory was founded in " + yearFounded);
        System.out.println("Factory is operational: " + isOperational);

        //cell 1
        cell1 = new Cell();
        cell1.printInfo();//Prints the info for cell 1

        //cell 2
        cell2 = new Cell();
        cell2.isCancerous = true;
        cell2.size = 10;
        cell2.printInfo();

        //cell3
        cell3 = new Cell();
        cell3.randomIsdividing();
        cell3.printInfo();

    }//end of cellFactory constructor




} //end of the file

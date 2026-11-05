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
    public Cell cell2; //Makes cell 2
    public Cell cell3; //Make cell 3

    //factory constructor
    public Factory(){
        System.out.println("Welcome to " + director +"'s cell factory."); //Prints out Instance variables
        System.out.println("This factory was founded in " + yearFounded); //Prints out Instance variables
        System.out.println("Factory is operational: " + isOperational); //Prints out Instance variables

        //cell 1
        cell1 = new Cell(2); //makes cell 1 and gives it a size of 2
        cell1.printInfo();//Prints the info for cell 1

        //cell 2
        cell2 = new Cell(10); //makes cell 2 and gives it a size of 10
        cell2.isCancerous = true; // sets instance varible isCancerous to true
        cell2.printInfo(); //prints cell 2 information

        //cell3
        cell3 = new Cell(5); //makes cell 3 and gives it a size of 5
        cell3.randomIsdividing(); //assigns cell 3 a random true/false value for isDividing variable
        cell3.printInfo(); //prints the information for cell 3

    }//end of cellFactory constructor




} //end of the file

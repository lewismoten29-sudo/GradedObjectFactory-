public class Cell {
 //Instance varibles
public int size; //variable: size
public boolean isDividing;//variable: is dividing
public String cellType;// variable: cell type
public boolean isCancerous; //variable: is cancerous
    public int randNum;
public Cell( int cSize) {
    size = cSize; //default value of size is 2
    isDividing = true; // default value of isDividing is true
    cellType = "nerve cell"; //default value of cellType is nerve cell
    isCancerous = false; //default value of isCancerous is false
    randomCellname(); //calls the random cell name method
} //end of cell method

public void printInfo(){    //print info method
    System.out.println("-----------------"); // prints dashes for readibility
    System.out.println("The cell size is: " + size); //prints the cell size method
    System.out.println("Is the cell dividing: " + isDividing); //prints information for the is cell dividing method
    System.out.println("Cell type: " + cellType); //prints the cell type
    System.out.println("Is the cell cancerous: " + isCancerous); // prints the true/false value for is cancerous

}  //end of print info method
public void randomCellname(){  //if statments to generate a random cell name

    randNum = (int)(Math.random() * 2);
        if (randNum == 0) {
           cellType = "Nerve cell";
        }


        if (randNum == 1) {
            cellType = "Skin cell";

        }
        if (randNum == 2) {
            cellType = "Blood cell";

        }

} //end of random cellname

public void randomIsdividing(){ //randomly asigns true/false value to isDividing
    randNum = (int)(Math.random() * 2);
    if (randNum == 0) { // if 0 -> then isDividing is true
        isDividing=  true ;
    }


    if (randNum == 1) {  // if 1 -> then isDividing is false
        isDividing = false;

    }
    if (randNum == 2) { // if 2 -> then isDividing is true
        isDividing = true;

    }


}//end of randomisDividing method

} //end of file

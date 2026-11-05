public class Cell {
 //Instance varibles
public int size; //variable: size
public boolean isDividing;//variable: is dividing
public String cellType;// variable: cell type
public boolean isCancerous; //variable: is cancerous
    public int randNum;
public Cell() {
    size = 2; //default value of size is 2
    isDividing = true; // default value of isDividing is true
    cellType = "nerve cell"; //default value of cellType is nerve cell
    isCancerous = false; //default value of isCancerous is false
    randomCellname();
} //end of cell method

public void printInfo(){
    System.out.println("The cell size is: " + size);
    System.out.println("Is the cell dividing: " + isDividing);
    System.out.println("Cell type: " + cellType);
    System.out.println("Is the cell cancerous: " + isCancerous);

}  //end of print info method
public void randomCellname(){  //if statments generate number to name a cell *geoprograms varible

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

public void randomIsdividing(){
    randNum = (int)(Math.random() * 2);
    if (randNum == 0) {
        isDividing=  true ;
    }


    if (randNum == 1) {
        isDividing = false;

    }
    if (randNum == 2) {
        isDividing = true;

    }


}//end of randomisDividing method

} //end of file

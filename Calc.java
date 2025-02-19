public class Calc{
    //private fields
    private double n1 = 0;
    private double n2 = 0;
    //constructor
    public Calc(){
        this.toString();
    }
    //methods
    //set
    public void setNum1(double n1){
        this.n1 = n1;
    }
    public void setNum2(double n2){
        this.n2 = n2;
    }
    //get
    public double getNum1(){
        return this.n1;
    }
    public double getNum2(){
        return this.n2;
    }
    public String toString(){
        String output = "Displaying private data fields using toString():";
        output += "\nNum 1: " + n1;
        output += "\nNum 2: " + n2;
        return output;
    }
    public double add(){
        double added = this.n1 + this.n2;
        return added;
    }
    public double subtract(){
        double subtracted = this.n1 - this.n2;
        return subtracted;
    }
    public double multiply(){
        double multiplied = this.n1 * this.n2;
        return multiplied;
    }
    public double divide(){
        double divided = this.n1 / this.n2;
        return divided;
    }

}
public class Square {
    private int length;
    public Square(){}
    public Square(int length){
        this.length = length;
    }
    public int calcArea(){
        return length*length;
    }
    public void enlarge(int x){
        if(x > length)
            length = x;
        else
            System.out.println("This value is equal or less than the current length");
    }
    public void draw(){
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                if(i>0 && i < length-1 && j>0 && j < length-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }
}

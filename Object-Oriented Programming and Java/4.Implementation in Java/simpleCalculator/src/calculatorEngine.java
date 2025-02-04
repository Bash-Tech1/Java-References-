public class calculatorEngine {
    private  long  value;
    private  long  keep;
    private  char toDo;

    public long  getValue() {
        return value;
    }

    public long  getKeep() {
        return keep;
    }
    public  void binaryOperation(char operator){
        keep = value;
        value = 0;
        toDo = operator;
    }
    public void factorial(long  x){
        long it = x;
        while (x != 1){
            x = x - 1;
            it = it * x;
        }
        keep =  it;
    }
    calculatorEngine(){clear();}
    public  void add(){binaryOperation('+');}
    public  void subtract(){binaryOperation('-');}
    public  void multiply(){binaryOperation('*');}
    public  void divide(){binaryOperation('/');}
    public  void squareOf(){binaryOperation('^');}
    public  void compute(){
        if(toDo == '+'){keep += value;}
        else if(toDo == '-'){keep -= value;}
        else if(toDo == '*'){keep *= value;}
        else if(toDo == '/'){keep /= value;}
        else if(toDo == '^'){
            for(long  i = 0; i < value - 1; i++){
                keep *= keep;
            }
        }
    }
    public  void clear(){
        value = 0;
        keep = 0;
    }
    public  void digit(long  x){
        value = value * 10 + x;
    }
    public  long  display(){
        return keep;
    }
}

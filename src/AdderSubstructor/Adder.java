package AdderSubstructor;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value v;

//    constructor
    Adder(Value x){
        v = x;  //value object we are passing
    }

    public Void call(){
      for(int i=1;i<=500;i++){
          this.v.value += i;
      }
      return null;
    }
}

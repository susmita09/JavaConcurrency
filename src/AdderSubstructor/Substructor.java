package AdderSubstructor;

import java.util.concurrent.Callable;

public class Substructor implements Callable<Void> {
    private Value v;

    public Substructor(Value x){
        v = x;
    }
    public Void call(){
        for(int i=1;i<=500;i++){
            this.v.value -= i;
        }
        return null;
    }
}

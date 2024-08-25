package lk.ijse.AOP;

import org.springframework.stereotype.Component;

@Component("transaction")
public class TranceAction {
    public void startTransaction(){
        System.out.println("starting transaction");
    }
    public void endTransaction(){
        System.out.println("ending transaction");
    }
}

package lk.ijse.bean;

import lk.ijse.contract.GoodGirl;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Kavindi implements GoodGirl {
    @Override
    public void love() {
        System.out.println("hi!!");
        System.out.println("hi!!");
        System.out.println("hi!!");
    }
}

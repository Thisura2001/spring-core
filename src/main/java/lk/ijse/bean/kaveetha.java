package lk.ijse.bean;

import lk.ijse.contract.GoodGirl;
import org.springframework.stereotype.Component;

@Component
public class kaveetha implements GoodGirl {
    @Override
    public void love() {
        System.out.println("love u");
    }
}

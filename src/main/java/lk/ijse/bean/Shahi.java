package lk.ijse.bean;

import lk.ijse.contract.GoodGirl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Long Hair")
public class Shahi implements GoodGirl {
    @Override
    public void love() {
        System.out.println("miss u");
        System.out.println("miss u");
        System.out.println("miss u");
    }
}

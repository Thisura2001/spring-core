package lk.ijse.user;

import jakarta.annotation.PostConstruct;
import lk.ijse.contract.GoodGirl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Eranga {
    @Autowired
    GoodGirl goodGirl;

    public Eranga(){
        System.out.println("CONSTRUCTOR "+goodGirl);
    }
    @PostConstruct
    public void init(){
        System.out.println(goodGirl);
        goodGirl.love();
    }
}

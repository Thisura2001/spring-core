package lk.ijse.user;

import jakarta.annotation.PostConstruct;
import lk.ijse.contract.GoodGirl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Eranga {

   private GoodGirl goodGirl;
    @Autowired
    public Eranga(GoodGirl goodGirl){
        this.goodGirl = goodGirl;
        System.out.println("CONSTRUCTOR "+goodGirl);
    }
    @PostConstruct
    public void init(){
        System.out.println(goodGirl);
        goodGirl.love();
    }
}

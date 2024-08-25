package lk.ijse.Obj;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("myObj")//me class eken hdna object manage krnna one spring
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // call krnana warayak gane aluth object hdnwa
public class MyObj {
    public MyObj(){
        System.out.println("myObj");
    }
}

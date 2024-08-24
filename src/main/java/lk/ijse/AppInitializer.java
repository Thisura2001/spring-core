package lk.ijse;

import lk.ijse.config.AppConfig;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();//
        ctx.register(AppConfig.class);
        ctx.refresh();
//        var myObj = ctx.getBean("myObj");
//        System.out.println(myObj);
//        ConfigurableBeanFactory beanFactory = ctx.getBeanFactory();
//        System.out.println("Is bean SingleTon "+beanFactory.isSingleton("myObj"));//return false because myObj scope change into PROTOTYPE
        ctx.registerShutdownHook();//jvm eka shoutDown wenna poddkt kalin run wnne
    }
}

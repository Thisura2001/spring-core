package lk.ijse;

import lk.ijse.AOP.TranceAction;
import lk.ijse.config.AppConfig;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();//
        ctx.register(AppConfig.class);
        ctx.refresh();
        TranceAction tranceAction = (TranceAction) ctx.getBean("transaction");
        tranceAction.startTransaction();
        tranceAction.endTransaction();
        ctx.registerShutdownHook();//jvm eka shoutDown wenna poddkt kalin run wnne
    }
}

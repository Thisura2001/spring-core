package lk.ijse.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Logs {
    @Before("execution( public void startTransaction())")
    public static void startTransLog(){
        System.out.println("Start transaction log");
    }
    @After("execution( public void endTransaction())")
    public static void endTransLog(){
        System.out.println("End Transaction log ");
    }
}

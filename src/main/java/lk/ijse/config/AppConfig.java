package lk.ijse.config;

import lk.ijse.Obj.OtherObj;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse")//spring ta manage krnn puluwn object thiynwd blnwa(mema dunnot sub classes wlt blnwa)
//@ComponentScan(basePackageClasses = {MyObj.class})//spring ta manage krnn puluwn class eka select krnwa(mema dmmot dunna class eke withry blnne)
public class AppConfig {
//source for beans definition
//    @Bean
//    OtherObj otherObj(){
//        return new OtherObj();
//    }
}

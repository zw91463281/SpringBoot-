package com.gzw.bootstudy;

import com.gzw.bootstudy.initialize.SecondInitiailize;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gzw.bootstudy.mapper")
public class BootstudyApplication {

   public static void main(String[] args) {
 //      SpringApplication.run(BootstudyApplication.class, args);

       SpringApplication application = new SpringApplication(BootstudyApplication.class);
       application.addInitializers(new SecondInitiailize());
       application.run(args);
   }


}

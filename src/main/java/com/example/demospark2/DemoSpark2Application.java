package com.example.demospark2;

import com.example.demospark2.service.DoWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
 *  本demo主要是为spark2脚本的编写和测试
 * @author hbdrawn
 * @date
 */
@SpringBootApplication
public class DemoSpark2Application implements CommandLineRunner {

    @Autowired
    private DoWork doWork;
    public static void main(String[] args) {
        SpringApplication.run(DemoSpark2Application.class, args);
    }

    @Override
    public void run(String... args) {
        doWork.work();
    }
}

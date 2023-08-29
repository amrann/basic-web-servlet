package com.belajar.javawebservlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class MainJvServletApp {
    public static void main(String[] args) {
        /*
        Cukup membuat class sperti ini aja, otomatis akan memanfaatkan fitur yang ada di SpringBoot
        untuk menjalankan embedded tomcat. Fitur ini juga akan membaca semua servlet yang ada di project
        kita dan memasukkan ke dalam embedded tomcatnya.

        Cara ini memudahkan kita untuk running project java web servlet sehingga kita tdk build-deploy war lagi
        saat melakukan pengembangan apps

        Jadi cukup running class Main-nya aja, kemudian access kembali http://localhost:8080
         */

        SpringApplication.run(MainJvServletApp.class);
    }
}

package testAws;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;



@SpringBootApplication
public class SpringApplication {

  public static void main(String[] args) {
    new SpringApplicationBuilder(SpringApplication.class)
        .bannerMode(Banner.Mode.OFF)
        .run();
  }
}

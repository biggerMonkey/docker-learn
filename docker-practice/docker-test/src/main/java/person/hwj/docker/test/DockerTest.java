package person.hwj.docker.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class DockerTest {
    public static void main(String[] args) {
        new SpringApplication(DockerTest.class).run(args);
        System.out.println("Hello World!");
    }
}

package com.amigoscode;

import com.amigoscode.customer.Customer;
import com.amigoscode.customer.CustomerRepository;
import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Random;


@SpringBootApplication
public class Main {


    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(Main.class, args);


    }

    @Bean
    CommandLineRunner runner(CustomerRepository customerRepository){
        return args -> {
            var faker = new Faker();
            Random random = new Random();
            Name name = faker.name();
            String firstName = name.firstName();
            String lastName = name.lastName();
            Customer customer = new Customer(
                    firstName + " " + lastName,
                    firstName.toLowerCase() + "." + lastName.toLowerCase() + "@amigoscode.com",
                    random.nextInt(16, 99)
            );

            customerRepository.save(customer);
        };
    }

    @Bean("foo")
    public Foo getFoo() {
        return new Foo("bar");
    }

    record Foo(String name) {}


    private static void printBeans(ConfigurableApplicationContext ctx){
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionName :
                beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }


    //    @GetMapping("/greet")
//    public GreetResponse greet(
//            @RequestParam(value = "name", required = false) String name) {
//        String greetMessage = name ==null || name.isBlank() ? "Hello" : "Hello " + name;
//        GreetResponse response = new GreetResponse(
//                greetMessage,
//                List.of("Java", "Golang", "Javascript"),
//                new Person("Alex", 22, 30_000)
//        );
//        return response;
//    }
//
//    record Person(String name, int age, double savings){}
//
//    record GreetResponse(
//            String greet,
//            List<String> favProgrammingLanguages,
//            Person person
//    ) {}

}


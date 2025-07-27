package hello.springmvc2.basic;

import lombok.Data;

@Data //getter setter 등 자동으로 다 만든다
public class HelloData {
    private String username;
    private int age;
}

package com.example.lombokstudy.beans;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class ManTest {

    @Test
    public void manTest() {
        Man man1 = new Man();
        man1.setAge(1);
        man1.setName("charles");
        man1.setGender('m');

        log.info(man1.toString());

        log.info("a man have an age of {}, a name of {}, a gender of {}",
                man1.getAge(), man1.getName(), man1.getGender());
        assertEquals(1, man1.getAge());
        assertEquals("charles", man1.getName());
        assertEquals('m', man1.getGender());

    }

    @Test
    public void manBuilderTest() {

        Man man = Man.builder()
                    .age(1)
                    .name("charles")
                    .gender('m')
                    .build();

        log.info(man.toString());

        assertEquals(1, man.age);

    }

    @Test
    public void manLambdaTest() {

        List<Man> men = Arrays.asList(1, 2, 3, 4, 5).stream()
                .map(age -> Man.builder()
                                .age(age)
                                .name("a man at the age of " + age)
                                .gender('m')
                            .build()
                ).collect(Collectors.toList());

        log.info(men.get(0).toString());

        assertEquals(5, men.size());

    }

    @Test
    public void manNonNullTest() {

        Man m = new Man(null);
        log.info(m.getAddress());
        assertNotEquals(null, m.getAddress());

    }

}
package com.sparata.week02.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor // 기본생성자를 대신 생성해준다.
@Entity // 테이블임을 나타낸다.
public class Student {

    @Id // ID 값, Primary Key로 사용하겠다 라는 뜻
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동 증가 명령
    private Long id;

    @Column(nullable = false) // 컬럼 값이고 반드시 값이 존재해야 함 을 나타냄
    private  String name;

    @Column(nullable = false)
    private int age;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

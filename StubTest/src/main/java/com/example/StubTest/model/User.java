package com.example.StubTest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    private String login;
    private String passwd;
    private String date;

    public User(String login, String passwd) {
        this.login = login;
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", passwd='" + passwd + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}

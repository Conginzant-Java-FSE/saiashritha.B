package org.example.dao;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class UserDaoTest {
    static UserDao userDao;
    @BeforeAll
    static void setup() {
        userDao = new UserDao();
    }
    @Test
    @Order(1)
    void testGetAllUser() {


    }
}
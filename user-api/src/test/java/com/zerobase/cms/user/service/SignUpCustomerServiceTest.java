package com.zerobase.cms.user.service;

import com.zerobase.cms.user.domain.SignUpForm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SignUpCustomerServiceTest {

    @Autowired
    private SignUpCustomerService service;

    @Test
    void signUp() {
        SignUpForm form = SignUpForm.builder()
                .name("name")
                .birth(LocalDate.now())
                .email("abcd@gmail.com")
                .password("1")
                .phone("01000000000")
                .build();

        assertNotNull(service.signUp(form).getId(), "Customer ID should not be null");
        assertEquals("name", service.signUp(form).getName(), "Customer name should match");
        assertEquals("abcd@gmail.com", service.signUp(form).getEmail(), "Customer email should match");
        assertEquals("01000000000", service.signUp(form).getPhone(), "Customer phone should match");
    }
}
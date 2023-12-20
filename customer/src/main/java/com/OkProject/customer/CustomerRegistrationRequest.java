package com.OkProject.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}

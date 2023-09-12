package com.amigoscode.auth;

import com.amigoscode.customer.CustomerDTO;

public record AuthenticationResponse(CustomerDTO customerDTO, String token) {

}

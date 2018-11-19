package com.example.demogemfire.products;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Could not find this resource")
public class ResourceNotFoundException extends RuntimeException {
}

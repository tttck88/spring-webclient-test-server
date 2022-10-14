package com.example.webclient.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@Getter
@Builder
public class ResponseDTO {
	private final HttpStatus httpStatus;
	private final String message;
}

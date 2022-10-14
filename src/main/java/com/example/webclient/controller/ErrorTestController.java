package com.example.webclient.controller;

import com.example.webclient.dto.ResponseDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class ErrorTestController {

	@PostMapping(value = "/200")
	public ResponseEntity<ResponseDTO> res200() {
		return ResponseEntity.status(HttpStatus.OK).body(ResponseDTO.builder().httpStatus(HttpStatus.OK).build());
	}

	@PostMapping(value = "/400")
	public ResponseEntity<ResponseDTO> res400() {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ResponseDTO.builder().httpStatus(HttpStatus.BAD_REQUEST).build());
	}


	@PostMapping(value = "/500")
	public ResponseEntity<ResponseDTO> res500() {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ResponseDTO.builder().httpStatus(HttpStatus.INTERNAL_SERVER_ERROR).build());
	}


	@PostMapping(value = "/timeout")
	public ResponseEntity<ResponseDTO> timeout() throws InterruptedException {
		Thread.sleep(10_000);
		return ResponseEntity.status(HttpStatus.OK).body(ResponseDTO.builder().httpStatus(HttpStatus.OK).build());
	}
}

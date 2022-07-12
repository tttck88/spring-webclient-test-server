package com.example.webclient.controller;

import com.example.webclient.dto.Worker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.Charset;

@RestController
@Slf4j
public class WebserverController {

    @GetMapping("/webclient/{param}")
    public ResponseEntity<Worker> testWebClient(@PathVariable String param) throws InterruptedException {

        log.info("### Received: /webclient/" + param);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        Worker worker = Worker.builder()
                .name("한정택")
                .sex("남자")
                .num(010)
                .build();

        return new ResponseEntity<>(worker ,headers, HttpStatus.OK);
    }
}

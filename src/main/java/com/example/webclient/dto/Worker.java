package com.example.webclient.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class Worker {
    private final String name;
    private final String sex;
    private final int num;
}

package com.ssg.springex.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@ToString
@Service
@RequiredArgsConstructor // 생성자 주입 방식으로 세팅
public class SampleService {

    @Qualifier("normal")
    private final SampleDAO sampleDAO;
}

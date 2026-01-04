package com.sanyue.sanyueaiagent.agent;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SanyueManusTest {

    @Resource
    private SanyueManus manus;

    @Test
    void run() {
        String userPrompt = """  
                我的另一半居住在上海静安区，请帮我找到 5 公里内合适的约会地点,无论如何，你必须给出几个地点
                """;
        String answer = manus.run(userPrompt);
        Assertions.assertNotNull(answer);
    }
}
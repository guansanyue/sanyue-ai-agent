package com.sanyue.sanyueaiagent.tools;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ResourceDownloadToolTest {

    @Test
    public void testDownloadResource() {
        ResourceDownloadTool tool = new ResourceDownloadTool();
        String url = "https://cdn.jsdelivr.net/gh/fjc0k/placekitten/images/200/200.jpg";
        String fileName = "logo.png";
        String result = tool.downloadResource(url, fileName);
        System.out.println("result = " + result);
        assertNotNull(result);
    }


}

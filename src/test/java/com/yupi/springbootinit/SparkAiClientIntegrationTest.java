package com.yupi.springbootinit;


import com.yupi.springbootinit.client.SparkAiClient;
import com.yupi.springbootinit.config.SparkAiConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class SparkAiClientIntegrationTest {

    @Autowired
    private SparkAiClient sparkAiClient;

    @Autowired
    private SparkAiConfig sparkAiConfig;

    @BeforeEach
    public void setUp() {
        // 确保API密钥和URL在测试环境中被正确设置
        assertNotNull(sparkAiConfig.getApiKey(), "API key must not be null");
        assertNotNull(sparkAiConfig.getApiUrl(), "API URL must not be null");
    }

    @Test
    public void testCallAiService() {
        // 设置一个示例输入
        String userInput = "来一个只有程序员能听懂的笑话";

        // 调用实际的AI服务
        String response = sparkAiClient.callAiService(userInput);
        System.out.println(response);
        // 验证返回的结果
        assertNotNull(response, "Response should not be null");
        // 假设返回的结果中包含"程序员"作为验证（根据实际API的返回内容调整）
        assertTrue(response.contains("程序员"), "Response should contain the expected answer");
    }
}


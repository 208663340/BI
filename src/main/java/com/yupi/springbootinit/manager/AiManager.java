package com.yupi.springbootinit.manager;

import com.yupi.springbootinit.client.SparkAiClient;
import com.yupi.springbootinit.common.ErrorCode;
import com.yupi.springbootinit.exception.BusinessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AiManager {

    @Resource
    private SparkAiClient sparkAiClient;

    /**
     * AI 对话
     *
     * @param message
     * @return
     */
    public String doChat( String message) {
       return sparkAiClient.callAiService(message);
    }
}
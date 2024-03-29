package ai.turbochain.ipex.controller;

import ai.turbochain.ipex.service.AdvertiseService;
import ai.turbochain.ipex.service.OrderService;

import ai.turbochain.ipex.entity.*;
import ai.turbochain.ipex.handler.MessageHandler;
import ai.turbochain.ipex.handler.NettyHandler;
import ai.turbochain.ipex.utils.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class WebSocketController {
    private  final Logger logger = LoggerFactory.getLogger(WebSocketController.class);
    @Autowired
    private NettyHandler nettyHandler;

    /**
     * ORDER-GENERATED:若接收到该内容，发送订单广告的自动回复（如果广告设置了自动回复的话）
     * @param message
     */
    @MessageMapping("/message/chat")
    public void chat(RealTimeChatMessage message){
        logger.info("message={}",message);
        nettyHandler.handleMessage(message);
    }


}

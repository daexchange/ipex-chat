package ai.turbochain.ipex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ai.turbochain.ipex.entity.HistoryChatMessage;
import ai.turbochain.ipex.entity.HistoryMessagePage;
import ai.turbochain.ipex.handler.MessageHandler;

@RestController
public class HistoryMessageController {

    @Autowired
    private MessageHandler chatMessageHandler ;

    @RequestMapping("/getHistoryMessage")
    public HistoryMessagePage getHistoryMessage(HistoryChatMessage message){
        return chatMessageHandler.getHistoryMessage(message);
    }
}

package ai.turbochain.ipex.handler;

import ai.turbochain.ipex.entity.ChatMessageRecord;
import ai.turbochain.ipex.entity.HistoryChatMessage;
import ai.turbochain.ipex.entity.HistoryMessagePage;

public interface MessageHandler {

    void handleMessage(ChatMessageRecord message);

    HistoryMessagePage getHistoryMessage(HistoryChatMessage message);
}

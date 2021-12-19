package com.bytedance.p1399im.core.p1408d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.proto.DeleteMessageRequestBody;
import com.bytedance.p1399im.core.proto.DeleteStrangerMessageRequestBody;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.bytedance.im.core.d.o */
public class C19666o implements Serializable {
    @AbstractC27891c(mo46611a = "cid")
    public String conversationId;
    @AbstractC27891c(mo46611a = "short_id")
    public Long conversationShortId;
    @AbstractC27891c(mo46611a = "c_type")
    public Integer conversationType;
    @AbstractC27891c(mo46611a = "inbox")
    public Integer inboxType;
    @AbstractC27891c(mo46611a = "is_stranger")
    public boolean isStranger = false;
    @AbstractC27891c(mo46611a = "retry_times")
    public Integer retryTimes = 0;
    @AbstractC27891c(mo46611a = "server_message_id")
    public Long server_message_id;
    @AbstractC27891c(mo46611a = "del_time")
    public Long userDelTime;

    static {
        Covode.recordClassIndex(22510);
    }

    public DeleteStrangerMessageRequestBody toStrangeMsgReqBody() {
        return new DeleteStrangerMessageRequestBody.Builder().conversation_short_id(this.conversationShortId).server_message_id(this.server_message_id).build();
    }

    public DeleteMessageRequestBody toMsgReqBody() {
        return new DeleteMessageRequestBody.Builder().conversation_id(this.conversationId).conversation_short_id(this.conversationShortId).conversation_type(this.conversationType).message_id(this.server_message_id).build();
    }

    public static C19666o fromReqBody(int i, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody) {
        C19666o oVar = new C19666o();
        oVar.inboxType = Integer.valueOf(i);
        oVar.conversationShortId = deleteStrangerMessageRequestBody.conversation_short_id;
        oVar.isStranger = true;
        oVar.userDelTime = Long.valueOf(System.currentTimeMillis());
        return oVar;
    }

    public static C19666o fromReqBody(int i, DeleteMessageRequestBody deleteMessageRequestBody) {
        C19666o oVar = new C19666o();
        oVar.inboxType = Integer.valueOf(i);
        oVar.conversationId = deleteMessageRequestBody.conversation_id;
        oVar.conversationShortId = deleteMessageRequestBody.conversation_short_id;
        oVar.conversationType = deleteMessageRequestBody.conversation_type;
        oVar.server_message_id = deleteMessageRequestBody.message_id;
        oVar.isStranger = false;
        oVar.userDelTime = Long.valueOf(System.currentTimeMillis());
        return oVar;
    }
}

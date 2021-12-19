package com.bytedance.p1399im.core.p1408d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.proto.DeleteConversationRequestBody;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.bytedance.im.core.d.n */
public class C19665n implements Serializable {
    @AbstractC27891c(mo46611a = "badge")
    public int badgeCount;
    @AbstractC27891c(mo46611a = "cid")
    public String conversationId;
    @AbstractC27891c(mo46611a = "short_id")
    public long conversationShortId;
    @AbstractC27891c(mo46611a = "c_type")
    public int conversationType;
    @AbstractC27891c(mo46611a = "inbox")
    public int inboxType;
    @AbstractC27891c(mo46611a = "index")
    public long lastMsgIndex;
    @AbstractC27891c(mo46611a = "index_v2")
    public long lastMsgIndexV2;
    @AbstractC27891c(mo46611a = "retry_times")
    public int retryTimes;
    @AbstractC27891c(mo46611a = "del_time")
    public long userDelTime;

    static {
        Covode.recordClassIndex(22509);
    }

    public DeleteConversationRequestBody toReqBody() {
        return new DeleteConversationRequestBody.Builder().conversation_id(this.conversationId).conversation_short_id(Long.valueOf(this.conversationShortId)).conversation_type(Integer.valueOf(this.conversationType)).last_message_index(Long.valueOf(this.lastMsgIndex)).last_message_index_v2(Long.valueOf(this.lastMsgIndexV2)).badge_count(Integer.valueOf(this.badgeCount)).build();
    }

    public static C19665n fromReqBody(int i, String str, DeleteConversationRequestBody deleteConversationRequestBody) {
        C19665n nVar = new C19665n();
        nVar.inboxType = i;
        nVar.conversationId = str;
        nVar.conversationShortId = deleteConversationRequestBody.conversation_short_id.longValue();
        nVar.conversationType = deleteConversationRequestBody.conversation_type.intValue();
        nVar.lastMsgIndex = deleteConversationRequestBody.last_message_index.longValue();
        nVar.lastMsgIndexV2 = deleteConversationRequestBody.last_message_index_v2.longValue();
        nVar.badgeCount = deleteConversationRequestBody.badge_count.intValue();
        nVar.userDelTime = System.currentTimeMillis();
        return nVar;
    }
}

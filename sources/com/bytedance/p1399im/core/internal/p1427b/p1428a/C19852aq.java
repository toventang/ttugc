package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19994c;
import com.bytedance.p1399im.core.p1404a.AbstractC19482c;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19607bc;
import com.bytedance.p1399im.core.p1408d.C19608bd;
import com.bytedance.p1399im.core.p1417i.C19730f;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.MessageBody;
import com.bytedance.p1399im.core.proto.ResponseBody;
import java.util.HashMap;
import java.util.UUID;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.im.core.internal.b.a.aq */
public final class C19852aq extends AbstractC19860b {
    static {
        Covode.recordClassIndex(22696);
    }

    C19852aq() {
        super(IMCMD.STRANGER_NEW_MSG_NOTIFY.getValue());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19860b
    /* renamed from: a */
    public final void mo31749a(int i, ResponseBody responseBody, C19608bd bdVar) {
        String str;
        Long l;
        String str2;
        int i2;
        HashMap hashMap;
        if (responseBody != null && responseBody.has_new_message_notify != null) {
            MessageBody messageBody = responseBody.has_new_message_notify.message;
            C19607bc a = C19607bc.m36619a();
            if (messageBody != null) {
                if (messageBody.ext == null || !messageBody.ext.containsKey("s:client_message_id") || TextUtils.isEmpty(messageBody.ext.get("s:client_message_id"))) {
                    str2 = "";
                } else {
                    str2 = messageBody.ext.get("s:client_message_id");
                }
                C19538ai aiVar = new C19538ai();
                aiVar.setMsgId(messageBody.server_message_id.longValue());
                aiVar.setSecSender(messageBody.sec_sender);
                if (TextUtils.isEmpty(str2)) {
                    str2 = UUID.randomUUID().toString();
                }
                aiVar.setUuid(str2);
                if (messageBody.create_time != null) {
                    aiVar.setCreatedAt(messageBody.create_time.longValue());
                }
                aiVar.setMsgType(messageBody.message_type.intValue());
                aiVar.setConversationId(messageBody.conversation_id);
                aiVar.setConversationType(messageBody.conversation_type.intValue());
                aiVar.setSender(messageBody.sender.longValue());
                aiVar.setContent(messageBody.content);
                aiVar.setDeleted(0);
                aiVar.setMsgStatus(5);
                if (C19483d.m36365a().mo31141b().f46192A) {
                    aiVar = C19994c.m37743b(aiVar);
                }
                aiVar.setConversationShortId(messageBody.conversation_short_id.longValue());
                if (messageBody.index_in_conversation != null) {
                    aiVar.setIndex(messageBody.index_in_conversation.longValue());
                    aiVar.getLocalExt().remove("s:message_index_is_local");
                }
                if (messageBody.index_in_conversation_v2 != null) {
                    aiVar.setIndexInConversationV2(messageBody.index_in_conversation_v2.longValue());
                }
                aiVar.setOrderIndex(0);
                if (messageBody.status != null) {
                    i2 = messageBody.status.intValue();
                } else {
                    i2 = 0;
                }
                aiVar.setSvrStatus(i2);
                aiVar.updatePropertyFromServer(messageBody);
                if (messageBody.version != null && messageBody.version.longValue() >= aiVar.getVersion()) {
                    aiVar.setVersion(messageBody.version.longValue());
                    if (messageBody.ext == null) {
                        hashMap = null;
                    } else {
                        hashMap = new HashMap(messageBody.ext);
                    }
                    aiVar.setExt(hashMap);
                }
                aiVar.setReadStatus(1);
                AbstractC19482c j = C19483d.m36365a().f46157b.mo27969j();
                if (aiVar.getSvrStatus() == 0 && j != null) {
                    aiVar.setSvrStatus(0);
                }
                if (messageBody.reference_info != null && aiVar.getReferenceInfo() == null) {
                    aiVar.setRefMsg(messageBody.reference_info);
                }
            }
            a.mo31389b();
            StringBuilder sb = new StringBuilder("receive new stranger msg, cid:");
            if (messageBody == null) {
                str = null;
            } else {
                str = messageBody.conversation_id;
            }
            StringBuilder append = sb.append(str).append(", msgId:");
            if (messageBody == null) {
                l = null;
            } else {
                l = messageBody.server_message_id;
            }
            C19512f.m36457b("imsdk", append.append(l).toString(), (Throwable) null);
            C19730f a2 = C19730f.m36907a();
            if (responseBody.has_new_message_notify != null) {
                C19512f.m36457b("imsdk", "StrangerManager receiveStrangerMsg", (Throwable) null);
                a2.mo31679b();
            }
        }
    }
}

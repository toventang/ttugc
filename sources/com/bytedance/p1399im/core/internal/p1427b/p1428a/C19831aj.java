package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19777i;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19608bd;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.MessageType;
import com.bytedance.p1399im.core.proto.NewP2PMessageNotify;
import com.bytedance.p1399im.core.proto.ResponseBody;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.internal.b.a.aj */
public final class C19831aj extends AbstractC19860b {
    static {
        Covode.recordClassIndex(22675);
    }

    C19831aj() {
        super(IMCMD.NEW_P2P_MSG_NOTIFY.getValue());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19860b
    /* renamed from: a */
    public final void mo31749a(int i, ResponseBody responseBody, C19608bd bdVar) {
        int value;
        C19538ai a;
        NewP2PMessageNotify newP2PMessageNotify = responseBody.has_new_p2p_message_notify;
        if (newP2PMessageNotify == null) {
            C19512f.m36457b("imsdk", "NewP2PMsgNotifyHandler receive NewP2PMessageNotify:null", (Throwable) null);
            return;
        }
        if (newP2PMessageNotify.send_type == null) {
            value = 0;
        } else {
            value = newP2PMessageNotify.send_type.getValue();
        }
        C19512f.m36457b("imsdk", "NewP2PMsgNotifyHandler receive NewP2PMessageNotify, inbox:" + i + ", sendType:" + value, (Throwable) null);
        C19538ai aiVar = new C19538ai();
        aiVar.setSender(newP2PMessageNotify.sender.longValue());
        aiVar.setSecSender(newP2PMessageNotify.sec_sender);
        aiVar.setConversationId(newP2PMessageNotify.conversation_id);
        aiVar.setConversationShortId(newP2PMessageNotify.conversation_short_id.longValue());
        aiVar.setConversationType(newP2PMessageNotify.conversation_type.intValue());
        aiVar.setMsgType(newP2PMessageNotify.message_type.intValue());
        aiVar.setContent(newP2PMessageNotify.content);
        aiVar.setExt(newP2PMessageNotify.ext);
        aiVar.setCreatedAt(newP2PMessageNotify.create_time.longValue());
        C20014q.m37816a().mo31890a(i, value, aiVar);
        if (aiVar.getMsgType() == MessageType.MESSAGE_TYPE_READ_COMMAND.getValue()) {
            C19863d a2 = C19863d.m37399a();
            if (aiVar.getMsgType() == MessageType.MESSAGE_TYPE_READ_COMMAND.getValue()) {
                try {
                    JSONObject jSONObject = new JSONObject(aiVar.getContent());
                    long optLong = jSONObject.optLong("UserId");
                    long optLong2 = jSONObject.optLong("MessageId");
                    jSONObject.optLong("ConShortId");
                    if (optLong > 0 && optLong2 > 0 && (a = C19777i.m37172a(optLong2)) != null) {
                        a2.f47164a.add(a);
                        if (!a2.f47165b.hasMessages(100)) {
                            a2.f47165b.sendEmptyMessageDelayed(100, C19483d.m36365a().mo31141b().f46259ax);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

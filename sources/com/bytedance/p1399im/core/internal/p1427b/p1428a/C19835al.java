package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19777i;
import com.bytedance.p1399im.core.internal.p1427b.C19786a;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.p1429a.C19790a;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C19994c;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.internal.utils.C20043t;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19509d;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19600ay;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.ReferenceInfo;
import com.bytedance.p1399im.core.proto.ReferencedMessageInfo;
import com.bytedance.p1399im.core.proto.RequestBody;
import com.bytedance.p1399im.core.proto.SendMessageRequestBody;
import com.bytedance.p1399im.core.proto.SendMessageResponseBody;
import com.bytedance.p1399im.core.proto.SendMessageStatus;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.b.a.al */
public final class C19835al extends AbstractC19927w<C19538ai> {

    /* renamed from: a */
    public final C19600ay f47106a = new C19600ay();

    /* renamed from: b */
    public C19538ai f47107b;

    /* renamed from: c */
    public volatile boolean f47108c = false;

    /* renamed from: d */
    private int f47109d;

    /* renamed from: e */
    private volatile C19790a f47110e;

    static {
        Covode.recordClassIndex(22679);
    }

    C19835al() {
        super(IMCMD.SEND_MESSAGE.getValue());
    }

    /* renamed from: c */
    public final String mo31753c() {
        if (this.f47107b == null) {
            return "";
        }
        return "{" + this.f47107b.getUuid() + ", " + this.f47107b.getMsgStatus() + "}";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f.body == null || kVar.f47482f.body.send_message_body == null) {
            return false;
        }
        return true;
    }

    C19835al(AbstractC19479b<C19538ai> bVar) {
        super(IMCMD.SEND_MESSAGE.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: d */
    public final void mo31754d(C19978k kVar) {
        super.mo31754d(kVar);
        if (C19483d.m36365a().mo31141b().f46260ay.enableNetworkTrace) {
            this.f47110e = new C19790a(this.f47106a);
            C19790a aVar = this.f47110e;
            if (C19483d.m36365a().mo31141b().f46260ay.enableNetworkTrace) {
                kVar.f47497u = aVar;
            }
        }
    }

    /* renamed from: a */
    public final void mo31751a(C19538ai aiVar) {
        this.f47106a.f46557k = SystemClock.uptimeMillis();
        C19600ay ayVar = this.f47106a;
        ayVar.f46556j = ayVar.f46557k - this.f47106a.f46547a;
        C19638h a = C19640j.m36671a().mo31586a(aiVar.getConversationId());
        if (a == null) {
            mo31803b(C19978k.m37686a(-1017));
            return;
        }
        if (C19483d.m36365a().mo31141b().f46192A) {
            aiVar = C19994c.m37742a(aiVar);
        }
        SendMessageRequestBody.Builder builder = new SendMessageRequestBody.Builder();
        List<Long> mentionIds = aiVar.getMentionIds();
        if (mentionIds != null) {
            builder.mentioned_users(mentionIds);
        }
        ReferenceInfo referenceInfo = aiVar.getReferenceInfo();
        if (referenceInfo != null && referenceInfo.referenced_message_id.longValue() > 0) {
            builder.ref_msg_info(new ReferencedMessageInfo.Builder().referenced_message_id(referenceInfo.referenced_message_id).hint(referenceInfo.hint).root_message_id(referenceInfo.root_message_id).root_message_conv_index(referenceInfo.root_message_conv_index).build());
        }
        RequestBody build = new RequestBody.Builder().send_message_body(builder.conversation_id(aiVar.getConversationId()).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).content(aiVar.getContent()).ext(aiVar.getExt()).message_type(Integer.valueOf(aiVar.getMsgType())).ticket(a.getTicket()).client_message_id(aiVar.getUuid()).build()).build();
        this.f47109d = a.getInboxType();
        if (C19483d.m36365a().mo31141b().f46286z) {
            String uuid = aiVar.getUuid();
            if (!TextUtils.isEmpty(uuid)) {
                C19786a.f46977m.put(uuid, new WeakReference<>(this));
            }
        }
        mo31798a(this.f47109d, build, null, aiVar, true);
    }

    /* renamed from: a */
    private void m37352a(C19638h hVar, final C19538ai aiVar) {
        if (hVar == null) {
            mo31803b(C19978k.m37686a(-1017));
        } else if (TextUtils.isEmpty(hVar.getTicket())) {
            this.f47106a.f46554h = true;
            final long uptimeMillis = SystemClock.uptimeMillis();
            C19930x.m37536a();
            C19930x.m37538a(hVar.getInboxType(), hVar.getConversationId(), hVar.getConversationShortId(), hVar.getConversationType(), new AbstractC19479b<C19638h>() {
                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19835al.C198438 */

                static {
                    Covode.recordClassIndex(22687);
                }

                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final void mo27860a(C19672u uVar) {
                    C19835al.this.f47106a.f46555i = SystemClock.uptimeMillis() - uptimeMillis;
                    C19835al.this.mo31751a(aiVar);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final /* synthetic */ void mo27861a(C19638h hVar) {
                    C19835al.this.f47106a.f46555i = SystemClock.uptimeMillis() - uptimeMillis;
                    C19835al.this.mo31751a(aiVar);
                }
            });
        } else {
            mo31751a(aiVar);
        }
    }

    /* renamed from: a */
    public final void mo31752a(C19538ai aiVar, boolean z) {
        long uptimeMillis = SystemClock.uptimeMillis();
        C19600ay ayVar = this.f47106a;
        ayVar.f46550d = uptimeMillis - ayVar.f46549c;
        C19600ay ayVar2 = this.f47106a;
        ayVar2.f46551e = uptimeMillis - ayVar2.f46547a;
        int i = -3001;
        if (z) {
            C19512f.m36457b("imsdk", "SendMsgHandler afterSaveMsg saveSuccess", (Throwable) null);
            C19638h a = C19640j.m36671a().mo31586a(aiVar.getConversationId());
            if (a != null) {
                C19538ai lastMessage = a.getLastMessage();
                if (lastMessage != null) {
                    C19512f.m36457b("imsdk", "SendMsgHandler afterSaveMsg lastMsg.getIndex() = " + lastMessage.getIndex() + ",lastMsg.getOrderIndex() = " + lastMessage.getOrderIndex() + "，lastMsg.getContent()" + lastMessage.getContent(), (Throwable) null);
                }
                C19512f.m36457b("imsdk", "SendMsgHandler afterSaveMsg msg.getIndex() = " + aiVar.getIndex() + ",msg.getOrderIndex() = " + aiVar.getOrderIndex() + ",msg.getIndex() = " + aiVar.getContent(), (Throwable) null);
                if (lastMessage == null || lastMessage.getIndex() < aiVar.getIndex()) {
                    a.setLastMessage(aiVar);
                    a.setLastMessageIndex(aiVar.getIndex());
                    a.setUpdatedTime(aiVar.getCreatedAt());
                    C19640j.m36671a().mo31590a(a, 2);
                    this.f47106a.f46552f = SystemClock.uptimeMillis() - uptimeMillis;
                }
            }
            m37352a(a, aiVar);
        } else {
            aiVar.setMsgStatus(3);
            mo31803b(C19978k.m37686a(-3001));
        }
        this.f47106a.f46553g = SystemClock.uptimeMillis();
        C20014q a2 = C20014q.m37816a();
        if (z) {
            i = C19489e.AbstractC19491b.f46184a;
        }
        a2.mo31891a(i, aiVar, this.f47106a);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(final C19978k kVar, Runnable runnable) {
        final boolean z;
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            z = false;
        } else {
            z = true;
        }
        final C19538ai aiVar = (C19538ai) kVar.f47480d[0];
        this.f47106a.f46558l = SystemClock.uptimeMillis();
        C19600ay ayVar = this.f47106a;
        ayVar.f46559m = ayVar.f46558l - this.f47106a.f46557k;
        this.f47108c = true;
        C19786a.m37243d(aiVar.getUuid());
        C19512f.m36457b("imsdk", "SendMsgHandler handleResponse, seqId:" + kVar.f47477a + ", isSuccess:" + z + ", msg_uuid:" + aiVar.getUuid() + ", push_msg:" + mo31753c(), (Throwable) null);
        RunnableC19987d.m37729a(new AbstractC19986c<C19538ai>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19835al.C198361 */

            static {
                Covode.recordClassIndex(22680);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
            /* renamed from: a */
            public final /* synthetic */ C19538ai mo31187a() {
                C19835al.this.f47106a.f46568v = kVar.f47490n;
                C19835al.this.f47106a.f46560n = SystemClock.uptimeMillis() - C19835al.this.f47106a.f46558l;
                C19538ai a = C20043t.m37921a().mo31916a(aiVar.getUuid());
                if (a == null && (a = C19777i.m37195c(aiVar.getUuid())) == null) {
                    a = aiVar;
                }
                C19512f.m36457b("imsdk", "SendMsgHandler handleResponse task onRun, seqId:" + kVar.f47477a + ", msg_uuid:" + a.getUuid() + ", push_msg:" + C19835al.this.mo31753c(), (Throwable) null);
                if (z) {
                    SendMessageResponseBody sendMessageResponseBody = kVar.f47482f.body.send_message_body;
                    if (sendMessageResponseBody.status != null) {
                        a.addLocalExt("s:send_response_extra_code", String.valueOf(sendMessageResponseBody.status));
                    }
                    if (!TextUtils.isEmpty(sendMessageResponseBody.filtered_content)) {
                        a.setContent(sendMessageResponseBody.filtered_content);
                    }
                    C19835al.m37351a(a, "s:send_response_extra_msg", sendMessageResponseBody.extra_info);
                    C19835al.m37351a(a, "s:send_response_check_code", sendMessageResponseBody.check_code);
                    C19835al.m37351a(a, "s:send_response_check_msg", sendMessageResponseBody.check_message);
                    if (sendMessageResponseBody.is_async_send != null && sendMessageResponseBody.is_async_send.booleanValue()) {
                        C19835al.this.f47106a.f46570x = true;
                        String uuid = a.getUuid();
                        if (!TextUtils.isEmpty(uuid)) {
                            C19786a.f46978n.add(uuid);
                        }
                    }
                    if (sendMessageResponseBody.status == null || !(sendMessageResponseBody.status.intValue() == SendMessageStatus.SEND_SUCCEED.getValue() || sendMessageResponseBody.status.intValue() == SendMessageStatus.CHECK_MSG_NOT_PASS_BUT_SELF_VISIBLE.getValue())) {
                        a.setMsgStatus(3);
                        a.addLocalExt("s:err_code", new StringBuilder().append(kVar.f47485i).toString());
                        a.addLocalExt("s:err_msg", kVar.mo31870m());
                    } else {
                        a.setMsgStatus(2);
                        if (sendMessageResponseBody.server_message_id != null && sendMessageResponseBody.server_message_id.longValue() >= a.getMsgId()) {
                            a.setMsgId(sendMessageResponseBody.server_message_id.longValue());
                        }
                        a.clearLocalExt("s:err_code");
                        a.clearLocalExt("s:err_msg");
                    }
                } else {
                    if (C19835al.this.f47107b != null) {
                        a = C19835al.this.f47107b;
                        a.setMsgStatus(2);
                        C19835al.this.f47106a.f46567u = true;
                        C19512f.m36457b("imsdk", "SendMsgHandler handleResponse use push msg", (Throwable) null);
                    } else {
                        a.setMsgStatus(3);
                    }
                    a.addLocalExt("s:err_code", new StringBuilder().append(kVar.f47485i).toString());
                    a.addLocalExt("s:err_msg", kVar.mo31870m());
                }
                C20043t a2 = C20043t.m37921a();
                if (!TextUtils.isEmpty(a.getUuid())) {
                    C19512f.m36457b("imsdk", "SendMsgCache updateMsg, uuid:" + a.getUuid() + ", opt:" + C20043t.m37922b(), (Throwable) null);
                    if (!C20043t.m37922b()) {
                        C19777i.m37185a(a, false, false);
                    } else {
                        a2.f47633a.put(a.getUuid(), a);
                        RunnableC19987d.m37729a(new AbstractC19986c<Boolean>(a) {
                            /* class com.bytedance.p1399im.core.internal.utils.C20043t.C200441 */

                            /* renamed from: a */
                            final /* synthetic */ C19538ai f47634a;

                            /* renamed from: b */
                            final /* synthetic */ boolean f47635b = false;

                            /* renamed from: c */
                            final /* synthetic */ boolean f47636c = false;

                            static {
                                Covode.recordClassIndex(22889);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                            /* renamed from: a */
                            public final /* synthetic */ Boolean mo31187a() {
                                C19512f.m36457b("imsdk", "SendMsgCache updateMsg onRun start, uuid:" + this.f47634a.getUuid(), (Throwable) null);
                                boolean a = C19777i.m37185a(this.f47634a, this.f47635b, this.f47636c);
                                C19512f.m36457b("imsdk", "SendMsgCache updateMsg onRun end, uuid:" + this.f47634a.getUuid() + ", result:" + a, (Throwable) null);
                                return Boolean.valueOf(a);
                            }

                            {
                                this.f47634a = r3;
                            }
                        }, null, C19983a.m37721c());
                    }
                }
                C19509d dVar = new C19509d();
                dVar.f46304a = "core";
                dVar.f46305b = "send_insert";
                dVar.mo31164a("duration", Long.valueOf(SystemClock.uptimeMillis() - kVar.f47486j)).mo31164a("create_time", Long.valueOf(a.getCreatedAt())).mo31164a("conversation_id", a.getConversationId()).mo31164a("message_type", Integer.valueOf(a.getMsgType())).mo31164a("message_uuid", a.getUuid()).mo31165a();
                return a;
            }
        }, new AbstractC19985b<C19538ai>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19835al.C198372 */

            static {
                Covode.recordClassIndex(22681);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r10v0 */
            /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r10v2 */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0150  */
            /* JADX WARNING: Unknown variable types count: 1 */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void mo31188a(com.bytedance.p1399im.core.p1408d.C19538ai r18) {
                /*
                // Method dump skipped, instructions count: 971
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1427b.p1428a.C19835al.C198372.mo31188a(java.lang.Object):void");
            }
        }, C19983a.m37721c());
    }

    /* renamed from: a */
    static void m37351a(C19538ai aiVar, String str, Object obj) {
        if (obj != null) {
            aiVar.addLocalExt(str, String.valueOf(obj));
        } else {
            aiVar.clearLocalExt(str);
        }
    }
}

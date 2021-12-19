package com.bytedance.p1399im.p1400a.p1401a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.internal.utils.C20041s;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.AbstractC19675w;
import com.bytedance.p1399im.core.proto.ApplyStatusCode;
import com.bytedance.p1399im.core.proto.ConversationApplyInfo;
import com.bytedance.p1399im.core.proto.GetConversationAuditSwitchRequestBody;
import com.bytedance.p1399im.core.proto.MessageBody;
import com.bytedance.p1399im.core.proto.MessageType;
import com.bytedance.p1399im.core.proto.NewMessageNotify;
import com.bytedance.p1399im.core.proto.RequestBody;
import com.bytedance.p1399im.p1400a.p1401a.p1402a.C19471e;
import com.bytedance.p1399im.p1400a.p1401a.p1403b.C19475b;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.im.a.a.a */
public class C19464a implements AbstractC19675w {

    /* renamed from: d */
    private static volatile C19464a f46127d;

    /* renamed from: a */
    public Set<AbstractC19473b> f46128a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public volatile Pair<Long, ConversationApplyInfo> f46129b;

    /* renamed from: c */
    public volatile long f46130c = 0;

    /* renamed from: e */
    private volatile long f46131e = 0;

    static {
        Covode.recordClassIndex(22308);
    }

    private C19464a() {
        C20041s.m37876a();
        this.f46131e = C20041s.f47627a.mo27994b(C20041s.m37878a(C20041s.m37877a(0, "delete_audit_create_time")), (Long) 0L);
        C20014q.m37816a().f47560f.add(this);
    }

    /* renamed from: a */
    public static C19464a m36302a() {
        MethodCollector.m26663i(5723);
        if (f46127d == null) {
            synchronized (C19464a.class) {
                try {
                    if (f46127d == null) {
                        f46127d = new C19464a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5723);
                    throw th;
                }
            }
        }
        C19464a aVar = f46127d;
        MethodCollector.m26664o(5723);
        return aVar;
    }

    /* renamed from: b */
    private void m36305b(ConversationApplyInfo conversationApplyInfo) {
        if (!this.f46128a.isEmpty()) {
            for (AbstractC19473b bVar : this.f46128a) {
                bVar.mo31133b(conversationApplyInfo);
            }
        }
    }

    /* renamed from: a */
    private void m36304a(ConversationApplyInfo conversationApplyInfo) {
        if (this.f46129b == null) {
            this.f46129b = new Pair<>(0L, null);
        }
        long longValue = ((Long) this.f46129b.first).longValue();
        ConversationApplyInfo conversationApplyInfo2 = (ConversationApplyInfo) this.f46129b.second;
        if (conversationApplyInfo2 != null && conversationApplyInfo.create_time.longValue() > conversationApplyInfo2.create_time.longValue()) {
            this.f46129b = new Pair<>(Long.valueOf(longValue), conversationApplyInfo);
            C20041s.m37876a().mo31915b(C19999h.f47538a.mo46674b(conversationApplyInfo));
        }
        if (!this.f46128a.isEmpty()) {
            for (AbstractC19473b bVar : this.f46128a) {
                bVar.mo31132a(conversationApplyInfo);
            }
        }
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19675w
    /* renamed from: a */
    public final boolean mo31128a(NewMessageNotify newMessageNotify) {
        MessageBody messageBody = newMessageNotify.message;
        if (messageBody.message_type.intValue() == MessageType.MESSAGE_TYPE_CONVERSATION_APPLY_NOTIFY.getValue()) {
            C19512f.m36450a("imsdk", "ConversationAuditModel handle:" + messageBody.message_type, (Throwable) null);
            C19475b bVar = (C19475b) C19999h.f47538a.mo46670a(messageBody.content, C19475b.class);
            if (bVar == null) {
                return true;
            }
            m36304a(new ConversationApplyInfo(Long.valueOf(bVar.f46137a), Long.valueOf(bVar.f46139c), Integer.valueOf(bVar.f46140d), ApplyStatusCode.fromValue(bVar.f46141e), Long.valueOf(bVar.f46142f), Long.valueOf(bVar.f46143g), Long.valueOf(bVar.f46145i), Long.valueOf(bVar.f46144h), bVar.f46138b, Long.valueOf(bVar.f46137a), bVar.f46149m, bVar.mo31134a(), bVar.f46151o));
            return true;
        } else if (messageBody.message_type.intValue() != MessageType.MESSAGE_TYPE_CONVERSATION_AUDIT_ACK_NOTIFY.getValue()) {
            return false;
        } else {
            C19512f.m36450a("imsdk", "ConversationAuditModel handle:" + messageBody.message_type, (Throwable) null);
            C19475b bVar2 = (C19475b) C19999h.f47538a.mo46670a(messageBody.content, C19475b.class);
            if (bVar2 == null) {
                return true;
            }
            m36305b(new ConversationApplyInfo(Long.valueOf(bVar2.f46137a), Long.valueOf(bVar2.f46139c), Integer.valueOf(bVar2.f46140d), ApplyStatusCode.fromValue(bVar2.f46141e), Long.valueOf(bVar2.f46142f), Long.valueOf(bVar2.f46143g), Long.valueOf(bVar2.f46145i), Long.valueOf(bVar2.f46144h), bVar2.f46138b, Long.valueOf(bVar2.f46148l), bVar2.f46149m, bVar2.mo31134a(), bVar2.f46151o));
            return true;
        }
    }

    /* renamed from: a */
    public static void m36303a(long j, int i, AbstractC19479b<Boolean> bVar) {
        C19471e eVar = new C19471e(bVar);
        C19512f.m36450a("imsdk", "GetConversationAuditSwitchHandler, conversationShortId = " + j + " &conversationType = " + i, (Throwable) null);
        eVar.mo31798a(0, new RequestBody.Builder().addExtension(2022, GetConversationAuditSwitchRequestBody.ADAPTER, new GetConversationAuditSwitchRequestBody.Builder().conv_short_id(Long.valueOf(j)).conversation_type(Integer.valueOf(i)).build()).build(), null, new Object[0]);
    }
}

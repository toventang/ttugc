package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1427b.C19786a;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C19995d;
import com.bytedance.p1399im.core.internal.utils.C19996e;
import com.bytedance.p1399im.core.internal.utils.C20004l;
import com.bytedance.p1399im.core.internal.utils.C20041s;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1415g.C19696b;
import com.bytedance.p1399im.core.p1417i.C19730f;
import com.bytedance.p1399im.core.proto.GetCmdMessageReqBody;
import com.bytedance.p1399im.core.proto.GetCmdMessageRespBody;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.MessageBody;
import com.bytedance.p1399im.core.proto.RequestBody;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.b.a.m */
public final class C19898m extends AbstractC19927w {

    /* renamed from: a */
    public int f47258a;

    /* renamed from: b */
    public String f47259b;

    /* renamed from: c */
    private int f47260c;

    static {
        Covode.recordClassIndex(22742);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31644a() {
        return true;
    }

    C19898m(int i) {
        super(IMCMD.GET_CMD_MESSAGE.getValue());
        this.f47258a = i;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f.body == null || kVar.f47482f.body.get_cmd_message_body == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo31779a(int i) {
        if (!(i == 9 || C20004l.m37794a().mo31880b() == 1)) {
            C19696b.m36812a(5, i);
        }
        this.f47260c = i;
        String a = C19996e.m37749a(i);
        if (C19786a.f46969e.contains(Integer.valueOf(this.f47258a))) {
            C19512f.m36457b("imsdk", "GetCmdMsgByUserHandler pull, source:" + a + ", inbox:" + this.f47258a + ", already doing, return", (Throwable) null);
            return;
        }
        C20041s.m37876a();
        mo31780a(a, C20041s.m37886c(this.f47258a));
    }

    /* renamed from: a */
    public final boolean mo31781a(GetCmdMessageRespBody getCmdMessageRespBody) {
        long j;
        C20041s.m37876a();
        long d = C20041s.m37891d(this.f47258a);
        Long l = getCmdMessageRespBody.next_user_message_cursor;
        long j2 = -1;
        if (l == null || l.longValue() <= d) {
            StringBuilder sb = new StringBuilder("GetCmdMsgByUserHandler updateCursor cursor invalid: cursor:");
            if (l != null) {
                j = l.longValue();
            } else {
                j = -1;
            }
            C19512f.m36457b("imsdk", sb.append(j).append(", local:").append(d).toString(), (Throwable) null);
        } else {
            C20041s.m37876a();
            C20041s.m37892d(this.f47258a, l.longValue());
        }
        C20041s.m37876a();
        long c = C20041s.m37886c(this.f47258a);
        Long l2 = getCmdMessageRespBody.next_cmd_index;
        if (l2 == null || l2.longValue() <= c) {
            StringBuilder sb2 = new StringBuilder("GetCmdMsgByUserHandler updateCursor index invalid, next:");
            if (l2 != null) {
                j2 = l2.longValue();
            }
            C19512f.m36457b("imsdk", sb2.append(j2).append(", local:").append(c).toString(), (Throwable) null);
            return false;
        }
        C20041s.m37876a();
        C20041s.m37887c(this.f47258a, l2.longValue());
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(final C19978k kVar, Runnable runnable) {
        boolean z;
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            z = false;
        } else {
            z = true;
        }
        C19512f.m36457b("imsdk", "GetCmdMsgByUserHandler handleResponse, seqId:" + kVar.f47477a + ", success:" + z, (Throwable) null);
        if (!z) {
            C19786a.m37248h(this.f47258a);
            C19510e.m36435a(kVar, false).mo31165a();
            return;
        }
        final GetCmdMessageRespBody getCmdMessageRespBody = kVar.f47482f.body.get_cmd_message_body;
        RunnableC19987d.m37729a(new AbstractC19986c<Boolean>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19898m.C198991 */

            static {
                Covode.recordClassIndex(22743);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public Boolean mo31187a() {
                try {
                    C19898m mVar = C19898m.this;
                    List<MessageBody> list = getCmdMessageRespBody.messages;
                    if (!C19995d.m37744a(list)) {
                        for (MessageBody messageBody : list) {
                            if (C19730f.m36908a(messageBody)) {
                                C19730f.m36907a().mo31673a(mVar.f47258a, messageBody);
                            } else {
                                C19821ai.m37325a(messageBody, false, (Pair<String, String>) null, 5);
                            }
                        }
                    }
                    return Boolean.valueOf(C19898m.this.mo31781a(getCmdMessageRespBody));
                } catch (Exception e) {
                    C19512f.m36457b("imsdk", "GetCmdMsgByUserHandler handleResponse handleCommands error", e);
                    C19510e.m36439a(e);
                    C19696b.m36814a(5, e);
                    C20041s.m37876a();
                    String a = C20041s.m37877a(C19898m.this.f47258a, "error_cmd_index");
                    boolean z = true;
                    int a2 = C20041s.f47627a.mo27987a(a) + 1;
                    if (a2 <= 2) {
                        C19512f.m36457b("imsdk", "SPUtils shouldIgnoreCmdIndexError, key:" + a + ", errorCount:" + a2 + ", return forbid", (Throwable) null);
                        C20041s.f47627a.mo27989a(a, a2);
                        z = false;
                    } else {
                        C19512f.m36457b("imsdk", "SPUtils shouldIgnoreCmdIndexError, key:" + a + ", errorCount:" + a2 + ", return ignore", (Throwable) null);
                        C20041s.f47627a.mo27989a(a, 0);
                    }
                    if (z) {
                        return Boolean.valueOf(C19898m.this.mo31781a(getCmdMessageRespBody));
                    }
                    C19512f.m36457b("imsdk", "GetCmdMsgByUserHandler handleResponse forbid update cursor", (Throwable) null);
                    return false;
                }
            }
        }, new AbstractC19985b<Boolean>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19898m.C199002 */

            static {
                Covode.recordClassIndex(22744);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* synthetic */ void mo31188a(Boolean bool) {
                Boolean bool2 = bool;
                C19512f.m36457b("imsdk", "GetCmdMsgByUserHandler handleResponse onCallback, seqId:" + kVar.f47477a + ", result:" + bool2, (Throwable) null);
                if (!bool2.booleanValue() || !getCmdMessageRespBody.has_more.booleanValue()) {
                    C19786a.m37248h(C19898m.this.f47258a);
                    C19510e.m36435a(kVar, true).mo31165a();
                    return;
                }
                C19898m mVar = C19898m.this;
                mVar.mo31780a(mVar.f47259b, getCmdMessageRespBody.next_cmd_index.longValue());
            }
        }, C19983a.m37721c());
    }

    /* renamed from: a */
    public final void mo31780a(String str, long j) {
        C19512f.m36457b("imsdk", "GetCmdMsgByUserHandler pull, source:" + str + ", inbox:" + this.f47258a + ", index:" + j, (Throwable) null);
        this.f47259b = str;
        C19786a.m37247g(this.f47258a);
        GetCmdMessageReqBody.Builder source = new GetCmdMessageReqBody.Builder().cmd_index(Long.valueOf(j)).source(str);
        if (this.f47260c == 0) {
            C19483d.m36365a();
        }
        mo31798a(this.f47258a, new RequestBody.Builder().get_cmd_message_body(source.build()).build(), null, new Object[0]);
    }
}

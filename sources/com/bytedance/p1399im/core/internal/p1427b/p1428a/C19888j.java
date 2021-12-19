package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1427b.C19786a;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1407c.C19517i;
import com.bytedance.p1399im.core.p1408d.C19610bf;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.p1408d.C19665n;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.proto.DeleteConversationRequestBody;
import com.bytedance.p1399im.core.proto.DeleteStrangerConversationRequestBody;
import com.bytedance.p1399im.core.proto.RequestBody;

/* renamed from: com.bytedance.im.core.internal.b.a.j */
public final class C19888j extends AbstractC19927w<String> {

    /* renamed from: a */
    boolean f47225a;

    /* renamed from: b */
    private boolean f47226b;

    /* renamed from: c */
    private long f47227c;

    /* renamed from: d */
    private int f47228d;

    /* renamed from: e */
    private int f47229e;

    /* renamed from: f */
    private RequestBody f47230f;

    static {
        Covode.recordClassIndex(22732);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        return true;
    }

    public C19888j() {
        this(false, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31775a(final C19638h hVar) {
        RunnableC19987d.m37728a(new AbstractC19986c<Boolean>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19888j.C198902 */

            static {
                Covode.recordClassIndex(22734);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
            /* renamed from: a */
            public final /* synthetic */ Boolean mo31187a() {
                return Boolean.valueOf(C19749c.m37026e(hVar.getConversationId()));
            }
        }, new AbstractC19985b<Boolean>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19888j.C198913 */

            static {
                Covode.recordClassIndex(22735);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* synthetic */ void mo31188a(Boolean bool) {
                if (bool.booleanValue()) {
                    C19888j.this.mo31800a(hVar.getConversationId());
                    C19640j.m36671a().mo31597b(hVar);
                    return;
                }
                C19888j.this.mo31803b(C19978k.m37686a(-3001));
            }
        });
    }

    /* renamed from: a */
    public final void mo31776a(C19665n nVar) {
        if (nVar == null) {
            C19512f.m36457b("imsdk", "DeleteConversationHandler retryDeleteReq, request invalid", (Throwable) null);
            return;
        }
        this.f47226b = true;
        this.f47225a = false;
        this.f47228d = nVar.retryTimes;
        this.f47227c = nVar.userDelTime;
        C19512f.m36457b("imsdk", "DeleteConversationHandler retryDeleteReq, cid:" + nVar.conversationId + ", retryTimes:" + this.f47228d + ", userDelTime:" + this.f47227c, (Throwable) null);
        RequestBody build = new RequestBody.Builder().delete_conversation_body(nVar.toReqBody()).build();
        mo31798a(nVar.inboxType, build, null, nVar.conversationId);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo31777b(C19638h hVar) {
        int inboxType = hVar.getInboxType();
        String conversationId = hVar.getConversationId();
        C19786a.m37237b(inboxType, conversationId);
        this.f47229e = inboxType;
        this.f47227c = System.currentTimeMillis();
        if (this.f47225a) {
            mo31798a(inboxType, new RequestBody.Builder().delete_stranger_conversation_body(new DeleteStrangerConversationRequestBody.Builder().conversation_short_id(Long.valueOf(hVar.getConversationShortId())).build()).build(), null, conversationId);
            return;
        }
        RequestBody build = new RequestBody.Builder().delete_conversation_body(new DeleteConversationRequestBody.Builder().conversation_id(conversationId).conversation_short_id(Long.valueOf(hVar.getConversationShortId())).conversation_type(Integer.valueOf(hVar.getConversationType())).last_message_index(Long.valueOf(hVar.getLastMessageIndex())).last_message_index_v2(Long.valueOf(hVar.getMaxIndexV2())).badge_count(Integer.valueOf(hVar.getBadgeCount())).build()).build();
        this.f47230f = build;
        mo31798a(inboxType, build, null, conversationId);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C19888j(boolean r2, com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b<java.lang.String> r3) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000e
            com.bytedance.im.core.proto.IMCMD r0 = com.bytedance.p1399im.core.proto.IMCMD.DELETE_STRANGER_CONVERSATION
        L_0x0004:
            int r0 = r0.getValue()
            r1.<init>(r0, r3)
            r1.f47225a = r2
            return
        L_0x000e:
            com.bytedance.im.core.proto.IMCMD r0 = com.bytedance.p1399im.core.proto.IMCMD.MARK_CONVERSATION_DELETE
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1427b.p1428a.C19888j.<init>(boolean, com.bytedance.im.core.a.a.b):void");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(C19978k kVar, Runnable runnable) {
        String str;
        String str2;
        RequestBody requestBody;
        C19512f.m36457b("imsdk", "DeleteConversationHandler handleResponse, isSuccess:" + kVar.mo31869l() + ", mStranger:" + this.f47225a + ", mIsRetry:" + this.f47226b, (Throwable) null);
        String str3 = (String) kVar.f47480d[0];
        if (!this.f47225a) {
            if (kVar.mo31869l()) {
                if (C19610bf.f46606b != null) {
                    C19610bf.f46606b.mo31402a(str3);
                }
            } else if (!this.f47226b && (requestBody = this.f47230f) != null) {
                int i = this.f47229e;
                DeleteConversationRequestBody deleteConversationRequestBody = requestBody.delete_conversation_body;
                if (C19610bf.f46606b != null) {
                    C19610bf.f46606b.mo31401a(i, str3, deleteConversationRequestBody);
                }
            }
        } else if (kVar.mo31869l()) {
            C19638h a = C19640j.m36671a().mo31586a(str3);
            if (a == null || a.isTemp()) {
                mo31803b(C19978k.m37686a(-1017));
                return;
            }
            mo31775a(a);
        } else {
            mo31803b(C19978k.m37686a(-9999));
        }
        boolean z = this.f47225a;
        boolean z2 = this.f47226b;
        int i2 = this.f47228d;
        long j = this.f47227c;
        boolean l = kVar.mo31869l();
        C19672u a2 = C19672u.m36756a(kVar);
        C19517i a3 = new C19517i().mo31179a("im_sdk_delete_conversation").mo31180a("conversation_id", str3);
        String str4 = "1";
        if (z) {
            str = str4;
        } else {
            str = "0";
        }
        C19517i a4 = a3.mo31180a("is_stranger", str);
        if (z2) {
            str2 = str4;
        } else {
            str2 = "0";
        }
        C19517i a5 = a4.mo31180a("is_retry", str2).mo31180a("retry_cnt", Integer.valueOf(i2)).mo31180a("del_time", Long.valueOf(j));
        if (!l) {
            str4 = "0";
        }
        C19517i a6 = a5.mo31180a("is_success", str4).mo31180a("is_net_available", Integer.valueOf(C19483d.m36365a().f46157b.mo27964e() ? 1 : 0));
        if (!l) {
            a6.mo31180a("error_code", Integer.valueOf(a2.f46728a));
            a6.mo31180a("log_id", a2.f46733f);
        }
        a6.mo31182c();
    }
}

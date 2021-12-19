package com.bytedance.p1399im.p1400a.p1401a.p1402a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.proto.ClearConversationAuditUnreadRequestBody;
import com.bytedance.p1399im.core.proto.ClearConversationAuditUnreadResponseBody;
import com.bytedance.p1399im.core.proto.IMCMD;

/* renamed from: com.bytedance.im.a.a.a.c */
public final class C19469c extends AbstractC19927w<String> {
    static {
        Covode.recordClassIndex(22313);
        ClearConversationAuditUnreadRequestBody.registerAdapter();
        ClearConversationAuditUnreadResponseBody.registerAdapter();
    }

    public C19469c() {
        super(IMCMD.CLEAR_CONVERSATION_AUDIT_UNREAD.getValue());
    }

    public C19469c(AbstractC19479b<String> bVar) {
        super(IMCMD.CLEAR_CONVERSATION_AUDIT_UNREAD.getValue(), bVar);
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f == null || kVar.f47482f.body == null || kVar.f47482f.body.getExtension(2029) == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(C19978k kVar, Runnable runnable) {
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            mo31803b(kVar);
        } else {
            mo31800a("Success");
        }
    }
}

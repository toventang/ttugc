package com.bytedance.p1399im.p1400a.p1401a.p1402a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.proto.BatchGetConversationAuditUnreadRequestBody;
import com.bytedance.p1399im.core.proto.BatchGetConversationAuditUnreadResponseBody;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.p1400a.p1401a.p1403b.C19474a;

/* renamed from: com.bytedance.im.a.a.a.b */
public final class C19468b extends AbstractC19927w<C19474a> {
    static {
        Covode.recordClassIndex(22312);
        BatchGetConversationAuditUnreadRequestBody.registerAdapter();
        BatchGetConversationAuditUnreadResponseBody.registerAdapter();
    }

    public C19468b() {
        super(IMCMD.BATCH_GET_CONVERSATION_AUDIT_UNREAD.getValue());
    }

    public C19468b(AbstractC19479b<C19474a> bVar) {
        super(IMCMD.BATCH_GET_CONVERSATION_AUDIT_UNREAD.getValue(), bVar);
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f == null || kVar.f47482f.body == null || kVar.f47482f.body.getExtension(2042) == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(C19978k kVar, Runnable runnable) {
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            C19512f.m36457b("imsdk", "GetConversationAuditUnReadHandler Failed, code = " + kVar.f47485i + " &status = " + kVar.mo31853b() + " &checkCode = " + kVar.mo31855d() + " &checkMsg = " + kVar.mo31856e() + " &logId = " + kVar.mo31857f(), (Throwable) null);
            C19510e.m36435a(kVar, false).mo31165a();
            mo31803b(kVar);
            return;
        }
        mo31800a(new C19474a(((BatchGetConversationAuditUnreadResponseBody) kVar.f47482f.body.getExtension(2042)).unread_count));
    }
}

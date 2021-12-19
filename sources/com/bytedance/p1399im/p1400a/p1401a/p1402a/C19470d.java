package com.bytedance.p1399im.p1400a.p1401a.p1402a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.proto.GetConversationAuditListRequestBody;
import com.bytedance.p1399im.core.proto.GetConversationAuditListResponseBody;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.RequestBody;
import com.bytedance.p1399im.p1400a.p1401a.p1403b.C19476c;

/* renamed from: com.bytedance.im.a.a.a.d */
public final class C19470d extends AbstractC19927w<C19476c> {
    static {
        Covode.recordClassIndex(22314);
        GetConversationAuditListRequestBody.registerAdapter();
        GetConversationAuditListResponseBody.registerAdapter();
    }

    public C19470d() {
        super(IMCMD.GET_CONVERSATION_AUDIT_LIST.getValue());
    }

    public C19470d(AbstractC19479b<C19476c> bVar) {
        super(IMCMD.GET_CONVERSATION_AUDIT_LIST.getValue(), bVar);
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f == null || kVar.f47482f.body == null || kVar.f47482f.body.getExtension(2027) == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(C19978k kVar, Runnable runnable) {
        int i = 0;
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            C19512f.m36457b("imsdk", "GetConversationAuditListHandler Failed, code = " + kVar.f47485i + " &status = " + kVar.mo31853b() + " &checkCode = " + kVar.mo31855d() + " &checkMsg = " + kVar.mo31856e() + " &logId = " + kVar.mo31857f(), (Throwable) null);
            C19510e.m36435a(kVar, false).mo31165a();
            mo31803b(kVar);
            return;
        }
        GetConversationAuditListResponseBody getConversationAuditListResponseBody = (GetConversationAuditListResponseBody) kVar.f47482f.body.getExtension(2027);
        StringBuilder append = new StringBuilder("GetConversationAuditListHandler Success, next_cursor = ").append(getConversationAuditListResponseBody.apply_info_list).append(" &list_size = ");
        if (getConversationAuditListResponseBody.apply_info_list != null) {
            i = getConversationAuditListResponseBody.apply_info_list.size();
        }
        C19512f.m36450a("imsdk", append.append(i).toString(), (Throwable) null);
        mo31800a(new C19476c(getConversationAuditListResponseBody.next_cursor.longValue(), getConversationAuditListResponseBody.apply_info_list, getConversationAuditListResponseBody.has_more.booleanValue()));
    }

    /* renamed from: a */
    public final void mo31131a(long j, long j2, boolean z) {
        C19512f.m36450a("imsdk", "GetConversationAuditListHandler, request cursor = " + j + " &limit = 20 &no_clear_unread" + z, (Throwable) null);
        mo31798a(0, new RequestBody.Builder().addExtension(2027, GetConversationAuditListRequestBody.ADAPTER, new GetConversationAuditListRequestBody.Builder().cursor(Long.valueOf(j)).limit(20).conv_short_id(Long.valueOf(j2)).no_clear_unread(Boolean.valueOf(z)).build()).build(), null, new Object[0]);
    }
}

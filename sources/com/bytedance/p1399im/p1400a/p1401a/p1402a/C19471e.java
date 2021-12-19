package com.bytedance.p1399im.p1400a.p1401a.p1402a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.proto.GetConversationAuditSwitchRequestBody;
import com.bytedance.p1399im.core.proto.GetConversationAuditSwitchResponseBody;
import com.bytedance.p1399im.core.proto.IMCMD;

/* renamed from: com.bytedance.im.a.a.a.e */
public final class C19471e extends AbstractC19927w<Boolean> {
    static {
        Covode.recordClassIndex(22315);
        GetConversationAuditSwitchRequestBody.registerAdapter();
        GetConversationAuditSwitchResponseBody.registerAdapter();
    }

    public C19471e() {
        super(IMCMD.GET_CONVERSATION_AUDIT_SWITCH.getValue());
    }

    public C19471e(AbstractC19479b<Boolean> bVar) {
        super(IMCMD.GET_CONVERSATION_AUDIT_SWITCH.getValue(), bVar);
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f == null || kVar.f47482f.body == null || kVar.f47482f.body.getExtension(2022) == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(C19978k kVar, Runnable runnable) {
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            C19512f.m36457b("imsdk", "GetConversationAuditSwitchHandler Failed, code = " + kVar.f47485i + " &status = " + kVar.mo31853b() + " &checkCode = " + kVar.mo31855d() + " &checkMsg = " + kVar.mo31856e() + " &logId = " + kVar.mo31857f(), (Throwable) null);
            C19510e.m36435a(kVar, false).mo31165a();
            mo31803b(kVar);
            return;
        }
        GetConversationAuditSwitchResponseBody getConversationAuditSwitchResponseBody = (GetConversationAuditSwitchResponseBody) kVar.f47482f.body.getExtension(2022);
        C19512f.m36450a("imsdk", "GetConversationAuditSwitchHandler Success, switch_status = " + getConversationAuditSwitchResponseBody.switch_status, (Throwable) null);
        mo31800a(getConversationAuditSwitchResponseBody.switch_status);
    }
}

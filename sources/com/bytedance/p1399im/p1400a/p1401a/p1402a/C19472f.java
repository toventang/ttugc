package com.bytedance.p1399im.p1400a.p1401a.p1402a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.UpdateConversationAuditSwitchRequestBody;
import com.bytedance.p1399im.core.proto.UpdateConversationAuditSwitchResponseBody;

/* renamed from: com.bytedance.im.a.a.a.f */
public final class C19472f extends AbstractC19927w<Boolean> {
    static {
        Covode.recordClassIndex(22316);
        UpdateConversationAuditSwitchRequestBody.registerAdapter();
        UpdateConversationAuditSwitchResponseBody.registerAdapter();
    }

    public C19472f() {
        super(IMCMD.UPDATE_CONVERSATION_AUDIT_SWITCH.getValue());
    }

    public C19472f(AbstractC19479b<Boolean> bVar) {
        super(IMCMD.UPDATE_CONVERSATION_AUDIT_SWITCH.getValue(), bVar);
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f == null || kVar.f47482f.body == null || kVar.f47482f.body.getExtension(2023) == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(C19978k kVar, Runnable runnable) {
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            C19512f.m36457b("imsdk", "UpdateConversationAuditSwitchHandler Failed, code = " + kVar.f47485i + " &status = " + kVar.mo31853b() + " &checkCode = " + kVar.mo31855d() + " &checkMsg = " + kVar.mo31856e() + " &logId = " + kVar.mo31857f(), (Throwable) null);
            C19510e.m36435a(kVar, false).mo31165a();
            mo31803b(kVar);
            return;
        }
        UpdateConversationAuditSwitchResponseBody updateConversationAuditSwitchResponseBody = (UpdateConversationAuditSwitchResponseBody) kVar.f47482f.body.getExtension(2023);
        C19512f.m36450a("imsdk", "UpdateConversationAuditSwitchHandler Success, switch_status = " + updateConversationAuditSwitchResponseBody.switch_status, (Throwable) null);
        mo31800a(updateConversationAuditSwitchResponseBody.switch_status);
    }
}

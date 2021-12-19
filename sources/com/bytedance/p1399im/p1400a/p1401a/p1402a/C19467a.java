package com.bytedance.p1399im.p1400a.p1401a.p1402a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.proto.AckConversationApplyRequestBody;
import com.bytedance.p1399im.core.proto.AckConversationApplyResponseBody;
import com.bytedance.p1399im.core.proto.ApplyErrorCode;
import com.bytedance.p1399im.core.proto.ConversationApplyInfo;
import com.bytedance.p1399im.core.proto.IMCMD;

/* renamed from: com.bytedance.im.a.a.a.a */
public final class C19467a extends AbstractC19927w<ConversationApplyInfo> {
    static {
        Covode.recordClassIndex(22311);
        AckConversationApplyRequestBody.registerAdapter();
        AckConversationApplyResponseBody.registerAdapter();
    }

    public C19467a() {
        super(IMCMD.ACK_CONVERSATION_APPLY.getValue());
    }

    public C19467a(AbstractC19479b<ConversationApplyInfo> bVar) {
        super(IMCMD.ACK_CONVERSATION_APPLY.getValue(), bVar);
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f == null || kVar.f47482f.body == null || kVar.f47482f.body.getExtension(2025) == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(C19978k kVar, Runnable runnable) {
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            C19512f.m36457b("imsdk", "ACKConversationApplyHandler Failed, code = " + kVar.f47485i + " &status = " + kVar.mo31853b() + " &checkCode = " + kVar.mo31855d() + " &checkMsg = " + kVar.mo31856e() + " &logId = " + kVar.mo31857f(), (Throwable) null);
            C19510e.m36435a(kVar, false).mo31165a();
            mo31803b(kVar);
            return;
        }
        AckConversationApplyResponseBody ackConversationApplyResponseBody = (AckConversationApplyResponseBody) kVar.f47482f.body.getExtension(2025);
        C19512f.m36450a("imsdk", "ACKConversationApplyHandler Success, response_status = " + ackConversationApplyResponseBody.status, (Throwable) null);
        if (ackConversationApplyResponseBody.status.intValue() == ApplyErrorCode.APPLY_SUCCESS.getValue()) {
            mo31800a(ackConversationApplyResponseBody.apply_info);
            return;
        }
        if (ackConversationApplyResponseBody.apply_info != null) {
            kVar.f47495s = C19999h.f47538a.mo46674b(ackConversationApplyResponseBody.apply_info);
        }
        mo31803b(kVar);
    }
}

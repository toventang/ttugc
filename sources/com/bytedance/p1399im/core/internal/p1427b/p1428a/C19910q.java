package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.ParticipantMinIndex;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.b.a.q */
public final class C19910q extends AbstractC19927w<List<ParticipantMinIndex>> {
    static {
        Covode.recordClassIndex(22754);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31644a() {
        return true;
    }

    public C19910q() {
        super(IMCMD.GET_CONVERSATION_PARTICIPANTS_MIN_INDEX_V3.getValue());
    }

    public C19910q(AbstractC19479b<List<ParticipantMinIndex>> bVar) {
        super(IMCMD.GET_CONVERSATION_PARTICIPANTS_MIN_INDEX_V3.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar == null || kVar.f47482f == null || kVar.f47482f.body == null || kVar.f47482f.body.participants_min_index_body == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(C19978k kVar, Runnable runnable) {
        boolean z;
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            z = false;
        } else {
            z = true;
        }
        C19638h hVar = (C19638h) kVar.f47480d[0];
        String conversationId = hVar.getConversationId();
        if (z) {
            mo31800a(kVar.f47482f.body.participants_min_index_body.indexes);
        } else {
            mo31803b(kVar);
        }
        C19510e.m36435a(kVar, z).mo31164a("conversation_id", conversationId).mo31164a("conversation_type", Integer.valueOf(hVar.getConversationType())).mo31165a();
    }
}

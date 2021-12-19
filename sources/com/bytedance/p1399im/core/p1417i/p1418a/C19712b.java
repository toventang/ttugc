package com.bytedance.p1399im.core.p1417i.p1418a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.proto.IMCMD;

/* renamed from: com.bytedance.im.core.i.a.b */
public final class C19712b extends AbstractC19927w<Boolean> {
    static {
        Covode.recordClassIndex(22556);
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31644a() {
        return true;
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        return true;
    }

    public C19712b() {
        this((byte) 0);
    }

    private C19712b(byte b) {
        super(IMCMD.MARK_STRANGER_CONVERSATION_READ.getValue(), null);
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(C19978k kVar, Runnable runnable) {
        if (kVar.mo31869l()) {
            mo31800a((Object) true);
            C19510e.m36435a(kVar, true).mo31165a();
            return;
        }
        mo31803b(kVar);
        C19510e.m36435a(kVar, false).mo31165a();
    }
}

package com.bytedance.android.livesdk.actionhandler;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* renamed from: com.bytedance.android.livesdk.actionhandler.l */
final /* synthetic */ class C6620l implements AbstractC88983w {

    /* renamed from: a */
    private final RoomActionHandler f16516a;

    /* renamed from: b */
    private final long f16517b;

    static {
        Covode.recordClassIndex(7358);
    }

    C6620l(RoomActionHandler roomActionHandler, long j) {
        this.f16516a = roomActionHandler;
        this.f16517b = j;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        this.f16516a.lambda$handle$0$RoomActionHandler(this.f16517b, vVar);
    }
}

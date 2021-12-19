package com.bytedance.android.livesdk.rank.impl;

import com.bytedance.android.livesdk.rank.api.AbstractC10339d;
import com.bytedance.android.livesdk.rank.impl.api.model.RankPage;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.rank.impl.e */
final /* synthetic */ class C10388e implements AbstractC89172b {

    /* renamed from: a */
    private final AbstractC10339d.AbstractC10340a f25077a;

    static {
        Covode.recordClassIndex(11962);
    }

    C10388e(AbstractC10339d.AbstractC10340a aVar) {
        this.f25077a = aVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        return C10385d.lambda$getRankRoomIds$0$RankService(this.f25077a, (RankPage) obj);
    }
}

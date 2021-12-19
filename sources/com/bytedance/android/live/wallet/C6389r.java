package com.bytedance.android.live.wallet;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.wallet.r */
final /* synthetic */ class C6389r implements AbstractC88433f {

    /* renamed from: a */
    private final C6367i f15964a;

    static {
        Covode.recordClassIndex(7119);
    }

    C6389r(C6367i iVar) {
        this.f15964a = iVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        this.f15964a.f15899b.setExchangeInfo((BalanceStructExtra) ((C5832d) obj).data);
    }
}

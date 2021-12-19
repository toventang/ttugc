package com.bytedance.android.live.wallet;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.wallet.t */
public final /* synthetic */ class C6391t implements AbstractC88433f {

    /* renamed from: a */
    private final C6367i f15966a;

    static {
        Covode.recordClassIndex(7121);
    }

    C6391t(C6367i iVar) {
        this.f15966a = iVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        this.f15966a.f15898a.f15958d = (BalanceStructExtra) ((C5832d) obj).data;
    }
}

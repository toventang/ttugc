package com.bytedance.android.live.wallet;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.wallet.model.AutoExchangeData;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.wallet.j */
final /* synthetic */ class C6371j implements AbstractC88433f {

    /* renamed from: a */
    private final C6367i f15909a;

    /* renamed from: b */
    private final String f15910b;

    static {
        Covode.recordClassIndex(7093);
    }

    C6371j(C6367i iVar, String str) {
        this.f15909a = iVar;
        this.f15910b = str;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        String str = this.f15910b;
        C5832d dVar = (C5832d) obj;
        C6367i.m13737a(((AutoExchangeData) dVar.data).getAfter());
        C6501b.C6502a.m13948a("livesdk_auto_balance_exchange_setting").mo12647a("status", Boolean.valueOf(((AutoExchangeData) dVar.data).getAfter())).mo12651a("request_from", str).mo12655b();
    }
}

package com.bytedance.android.live.wallet;

import android.os.SystemClock;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.C6384g;
import com.bytedance.android.livesdk.wallet.p658b.C11312a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.wallet.n */
public final /* synthetic */ class C6385n implements AbstractC88433f {

    /* renamed from: a */
    private final C6367i f15959a;

    /* renamed from: b */
    private final long f15960b;

    static {
        Covode.recordClassIndex(7115);
    }

    C6385n(C6367i iVar, long j) {
        this.f15959a = iVar;
        this.f15960b = j;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C6367i iVar = this.f15959a;
        long j = this.f15960b;
        C6384g gVar = (C6384g) ((C5832d) obj).data;
        if (gVar != null) {
            BalanceStructExtra balanceStructExtra = iVar.f15898a.f15958d;
            iVar.f15898a = gVar;
            C6367i.m13737a(gVar.f15956b);
            if (iVar.f15898a.f15957c != null && iVar.f15898a.f15957c.getEnableExchange()) {
                iVar.f15898a.f15958d = balanceStructExtra;
                iVar.mo12419a(gVar.f15957c.getCurrency(), gVar.f15957c.getRegion(), gVar.f15957c.getBalance());
            }
        }
        iVar.f15900c.onNext(Long.valueOf(iVar.mo12373b()));
        C11312a.m20052a(0, SystemClock.uptimeMillis() - j, null);
    }
}

package com.p2082ss.android.ugc.aweme.live;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1469l.p1470a.AbstractC20690a;
import com.bytedance.p1469l.p1473b.p1476c.C20712a;

/* renamed from: com.ss.android.ugc.aweme.live.ag */
public final class C58497ag implements AbstractC58634g {
    static {
        Covode.recordClassIndex(68788);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public final void onInit() {
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58634g
    /* renamed from: c */
    public final Class mo95868c() {
        return LivePlayActivity.class;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58634g
    /* renamed from: a */
    public final String mo95866a() {
        return Live.getLiveDomain();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58634g
    /* renamed from: b */
    public final AbstractC20690a mo95867b() {
        return C20712a.m38958b();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58634g
    /* renamed from: a */
    public final Class mo95865a(int i) {
        if (i == 5) {
            return LiveBroadcastActivity.class;
        }
        if (i != 6) {
            return null;
        }
        return LiveBgBroadcastActivity.class;
    }
}

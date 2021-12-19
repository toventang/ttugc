package com.toutiao.proxyserver.p4494f;

import android.net.TrafficStats;
import com.bytedance.covode.number.Covode;

/* renamed from: com.toutiao.proxyserver.f.f */
public final class C87323f implements AbstractC87324g {
    static {
        Covode.recordClassIndex(103219);
    }

    @Override // com.toutiao.proxyserver.p4494f.AbstractC87324g
    /* renamed from: a */
    public final long mo141353a() {
        return TrafficStats.getTotalRxBytes();
    }
}

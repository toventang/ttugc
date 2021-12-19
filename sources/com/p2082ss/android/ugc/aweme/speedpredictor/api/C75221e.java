package com.p2082ss.android.ugc.aweme.speedpredictor.api;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.speedpredictor.api.e */
public final class C75221e implements Comparable<C75221e> {

    /* renamed from: a */
    public double f169131a;

    /* renamed from: b */
    public double f169132b;

    /* renamed from: c */
    public double f169133c;

    /* renamed from: d */
    public long f169134d;

    static {
        Covode.recordClassIndex(88107);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C75221e eVar) {
        double d;
        C75221e eVar2 = eVar;
        double d2 = this.f169133c;
        if (eVar2 == null) {
            d = 0.0d;
        } else {
            d = eVar2.f169133c;
        }
        return Double.compare(d2, d);
    }

    public C75221e(double d, double d2) {
        this.f169131a = d < 0.0d ? 0.0d : d;
        this.f169132b = d2 < 0.0d ? 0.0d : d2;
        this.f169134d = SystemClock.elapsedRealtime();
        this.f169133c = this.f169131a / (this.f169132b / 1000.0d);
    }
}

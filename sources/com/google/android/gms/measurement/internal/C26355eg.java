package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.measurement.internal.eg */
public final class C26355eg {

    /* renamed from: a */
    public String f61876a;

    /* renamed from: b */
    public Bundle f61877b;

    /* renamed from: c */
    private String f61878c;

    /* renamed from: d */
    private long f61879d;

    static {
        Covode.recordClassIndex(31777);
    }

    /* renamed from: a */
    public final zzao mo43178a() {
        return new zzao(this.f61876a, new zzan(new Bundle(this.f61877b)), this.f61878c, this.f61879d);
    }

    public final String toString() {
        String str = this.f61878c;
        String str2 = this.f61876a;
        String valueOf = String.valueOf(this.f61877b);
        return new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length()).append("origin=").append(str).append(",name=").append(str2).append(",params=").append(valueOf).toString();
    }

    /* renamed from: a */
    public static C26355eg m51789a(zzao zzao) {
        return new C26355eg(zzao.f62578a, zzao.f62580c, zzao.f62579b.mo43665a(), zzao.f62581d);
    }

    private C26355eg(String str, String str2, Bundle bundle, long j) {
        this.f61876a = str;
        this.f61878c = str2;
        this.f61877b = bundle == null ? new Bundle() : bundle;
        this.f61879d = j;
    }
}

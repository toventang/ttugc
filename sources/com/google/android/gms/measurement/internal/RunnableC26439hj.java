package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.hj */
public final class RunnableC26439hj implements Runnable {

    /* renamed from: a */
    final AbstractC26440hk f62176a;

    /* renamed from: b */
    final String f62177b;

    /* renamed from: c */
    private final URL f62178c;

    /* renamed from: d */
    private final byte[] f62179d = null;

    /* renamed from: e */
    private final Map<String, String> f62180e;

    /* renamed from: f */
    private final /* synthetic */ C26437hh f62181f;

    static {
        Covode.recordClassIndex(31861);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068 A[Catch:{ IOException -> 0x00e6, all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 242
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.RunnableC26439hj.run():void");
    }

    public RunnableC26439hj(C26437hh hhVar, String str, URL url, AbstractC26440hk hkVar) {
        this.f62181f = hhVar;
        C25565r.m49316a(str);
        C25565r.m49314a(url);
        C25565r.m49314a(hkVar);
        this.f62178c = url;
        this.f62176a = hkVar;
        this.f62177b = str;
        this.f62180e = null;
    }

    /* renamed from: a */
    private final void m52076a(int i, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        this.f62181f.mo43015p().mo43220a(new RunnableC26442hm(this, i, exc, bArr, map));
    }
}

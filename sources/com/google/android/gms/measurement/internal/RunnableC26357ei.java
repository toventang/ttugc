package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import java.net.URL;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ei */
public final class RunnableC26357ei implements Runnable {

    /* renamed from: a */
    private final URL f61880a;

    /* renamed from: b */
    private final byte[] f61881b;

    /* renamed from: c */
    private final AbstractC26356eh f61882c;

    /* renamed from: d */
    private final String f61883d;

    /* renamed from: e */
    private final Map<String, String> f61884e;

    /* renamed from: f */
    private final /* synthetic */ C26354ef f61885f;

    static {
        Covode.recordClassIndex(31779);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016e, code lost:
        if (r4 == null) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ac, code lost:
        if (r4 != null) goto L_0x01b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071 A[Catch:{ IOException -> 0x018f, all -> 0x014d }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0158 A[SYNTHETIC, Splitter:B:69:0x0158] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0196 A[SYNTHETIC, Splitter:B:82:0x0196] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 462
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.RunnableC26357ei.run():void");
    }

    public RunnableC26357ei(C26354ef efVar, String str, URL url, byte[] bArr, Map<String, String> map, AbstractC26356eh ehVar) {
        this.f61885f = efVar;
        C25565r.m49316a(str);
        C25565r.m49314a(url);
        C25565r.m49314a(ehVar);
        this.f61880a = url;
        this.f61881b = bArr;
        this.f61882c = ehVar;
        this.f61883d = str;
        this.f61884e = map;
    }
}

package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.measurement.internal.dq */
public final class C26338dq<V> {

    /* renamed from: f */
    private static final Object f61782f = new Object();

    /* renamed from: a */
    public final String f61783a;

    /* renamed from: b */
    private final AbstractC26337dp<V> f61784b;

    /* renamed from: c */
    private final V f61785c;

    /* renamed from: d */
    private final V f61786d;

    /* renamed from: e */
    private final Object f61787e;

    /* renamed from: g */
    private volatile V f61788g;

    /* renamed from: h */
    private volatile V f61789h;

    static {
        Covode.recordClassIndex(31760);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r4 = com.google.android.gms.measurement.internal.C26530p.f62488a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003c, code lost:
        if (r4.hasNext() == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003e, code lost:
        r3 = r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0048, code lost:
        if (com.google.android.gms.measurement.internal.C26523kl.m52495a() != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004a, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r0 = r3.f61784b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004d, code lost:
        if (r0 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004f, code lost:
        r2 = r0.mo43020a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0060, code lost:
        r1 = new java.lang.IllegalStateException("Refreshing flag cache must be done on a worker thread.");
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(5130);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x006a, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo43024a(V r7) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26338dq.mo43024a(java.lang.Object):java.lang.Object");
    }

    private C26338dq(String str, V v, V v2, AbstractC26337dp<V> dpVar) {
        this.f61787e = new Object();
        this.f61788g = null;
        this.f61789h = null;
        this.f61783a = str;
        this.f61785c = v;
        this.f61786d = v2;
        this.f61784b = dpVar;
    }

    /* synthetic */ C26338dq(String str, Object obj, Object obj2, AbstractC26337dp dpVar, byte b) {
        this(str, obj, obj2, dpVar);
    }
}

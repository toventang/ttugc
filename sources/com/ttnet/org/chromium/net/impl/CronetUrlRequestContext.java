package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Process;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.ttnet.org.chromium.base.C87457f;
import com.ttnet.org.chromium.base.C87459h;
import com.ttnet.org.chromium.base.PowerMonitor;
import com.ttnet.org.chromium.net.AbstractC87529ab;
import com.ttnet.org.chromium.net.AbstractC87655t;
import com.ttnet.org.chromium.net.AbstractC87658u;
import com.ttnet.org.chromium.net.AbstractC87670v;
import com.ttnet.org.chromium.net.AbstractC87671w;
import com.ttnet.org.chromium.net.AbstractC87674x;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks;
import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import java.io.File;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

public class CronetUrlRequestContext extends AbstractC87592c {

    /* renamed from: D */
    private static final HashSet<String> f198782D = new HashSet<>();

    /* renamed from: b */
    static final String f198783b = CronetUrlRequestContext.class.getSimpleName();

    /* renamed from: A */
    private TTAppInfoProvider f198784A;

    /* renamed from: B */
    private AbstractC87670v f198785B;

    /* renamed from: C */
    private volatile ConditionVariable f198786C;

    /* renamed from: E */
    private final String f198787E;

    /* renamed from: c */
    public final Object f198788c;

    /* renamed from: d */
    final AtomicInteger f198789d = new AtomicInteger(0);

    /* renamed from: e */
    public long f198790e;

    /* renamed from: f */
    public boolean f198791f;

    /* renamed from: g */
    AbstractC87658u f198792g;

    /* renamed from: h */
    private final ConditionVariable f198793h = new ConditionVariable(false);

    /* renamed from: i */
    private Thread f198794i;

    /* renamed from: j */
    private final boolean f198795j;

    /* renamed from: k */
    private final Object f198796k = new Object();

    /* renamed from: l */
    private final Object f198797l = new Object();

    /* renamed from: m */
    private int f198798m = 0;

    /* renamed from: n */
    private int f198799n;

    /* renamed from: o */
    private int f198800o;

    /* renamed from: p */
    private int f198801p;

    /* renamed from: q */
    private double[] f198802q;

    /* renamed from: r */
    private double[] f198803r;

    /* renamed from: s */
    private double[] f198804s;

    /* renamed from: t */
    private double[] f198805t;

    /* renamed from: u */
    private final C87459h<VersionSafeCallbacks.C87585b> f198806u;

    /* renamed from: v */
    private final C87459h<VersionSafeCallbacks.C87586c> f198807v;

    /* renamed from: w */
    private final Map<AbstractC87655t.AbstractC87656a, VersionSafeCallbacks.C87587d> f198808w;

    /* renamed from: x */
    private String[] f198809x;

    /* renamed from: y */
    private int[] f198810y;

    /* renamed from: z */
    private int[] f198811z;

    private native void nativeAddClientOpaqueData(long j, String[] strArr, byte[] bArr, byte[] bArr2);

    private static native void nativeAddPkp(long j, String str, byte[][] bArr, boolean z, long j2);

    private static native void nativeAddQuicHint(long j, String str, int i, int i2);

    private native void nativeClearClientOpaqueData(long j);

    private native void nativeConfigureNetworkQualityEstimatorForTesting(long j, boolean z, boolean z2, boolean z3);

    private native void nativeControlHttpDNSConfig(long j, boolean z, boolean z2, boolean z3);

    private static native long nativeCreateRequestContextAdapter(long j);

    private static native long nativeCreateRequestContextConfig(String str, String str2, boolean z, String str3, boolean z2, boolean z3, boolean z4, int i, long j, String str4, long j2, boolean z5, boolean z6, boolean z7, boolean z8, String str5, int i2);

    private native void nativeDestroy(long j);

    private native void nativeDnsLookup(long j, DnsQuery dnsQuery);

    private static native void nativeEnableBoeProxy(long j, boolean z);

    private native void nativeEnableTTBizHttpDns(long j, boolean z, String str, String str2, String str3, boolean z2, String str4);

    private static native byte[] nativeGetHistogramDeltas();

    private static native long[] nativeGetOpaqueFuncAddress();

    private static native void nativeInitALogFuncAddr(long j);

    private native void nativeNotifySwitchToMultiNetwork(long j, boolean z);

    private native void nativeNotifyTNCConfigUpdated(long j, String str, String str2, String str3, String str4, String str5, String str6);

    public static native void nativePreconnectUrl(long j, String str, int i);

    private native void nativeProvideRTTObservations(long j, boolean z);

    private native void nativeProvideThroughputObservations(long j, boolean z);

    private native void nativeRemoveClientOpaqueData(long j, String str);

    private native void nativeReportNetDiagnosisUserLog(long j, String str);

    private native void nativeSetAlogFuncAddr(long j, long j2);

    private native void nativeSetAppStartUpState(long j, int i);

    private static native void nativeSetBypassBOEJSON(long j, String str);

    private static native void nativeSetClientOpaqueData(long j, String[] strArr, byte[] bArr, byte[] bArr2);

    private static native void nativeSetGetDomainDefaultJSON(long j, String str);

    private native void nativeSetHostResolverRules(long j, String str);

    private static native int nativeSetMinLogLevel(int i);

    private static native void nativeSetOpaqueData(long j, byte[][] bArr);

    private native void nativeSetProxy(long j, String str);

    private static native void nativeSetProxyConfig(long j, String str);

    private static native void nativeSetStoreIdcRuleJSON(long j, String str);

    private native void nativeStartNetLogToDisk(long j, String str, boolean z, int i);

    private native boolean nativeStartNetLogToFile(long j, String str, boolean z);

    private native void nativeStopNetLog(long j);

    private native void nativeTTDnsResolve(long j, String str, int i, String str2);

    public static native void nativeTTUrlDispatch(long j, URLDispatch uRLDispatch, String str);

    private native void nativeTriggerGetDomain(long j, boolean z);

    private native void nativeTryStartNetDetect(long j, String[] strArr, int i, int i2);

    private native void nativeUpdateStoreRegionFromServer(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);

    public native void nativeInitRequestContextOnInitThread(long j);

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: a */
    public final void mo141751a(boolean z) {
        MethodCollector.m26663i(9393);
        synchronized (this.f198788c) {
            try {
                nativeTriggerGetDomain(this.f198790e, z);
            } finally {
                MethodCollector.m26664o(9393);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: a */
    public final void mo141754a(String[] strArr, byte[] bArr, byte[] bArr2) {
        MethodCollector.m26663i(9394);
        synchronized (this.f198788c) {
            try {
                nativeAddClientOpaqueData(this.f198790e, strArr, bArr, bArr2);
            } finally {
                MethodCollector.m26664o(9394);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: a */
    public final void mo141747a(String str) {
        MethodCollector.m26663i(2931);
        synchronized (this.f198788c) {
            try {
                nativeRemoveClientOpaqueData(this.f198790e, str);
            } finally {
                MethodCollector.m26664o(2931);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: a */
    public final void mo141746a(AbstractC87655t.AbstractC87656a aVar) {
        MethodCollector.m26663i(3197);
        synchronized (this.f198797l) {
            try {
                this.f198808w.put(aVar, new VersionSafeCallbacks.C87587d(aVar));
            } finally {
                MethodCollector.m26664o(3197);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87536c
    /* renamed from: a */
    public final URLConnection mo141715a(URL url) {
        if (Proxy.NO_PROXY.type() == Proxy.Type.DIRECT) {
            String protocol = url.getProtocol();
            if ("http".equals(protocol) || "https".equals(protocol)) {
                return new CronetHttpURLConnection(url, this);
            }
            throw new UnsupportedOperationException("Unexpected protocol:".concat(String.valueOf(protocol)));
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r2 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r2.hasNext() == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r0 = (com.ttnet.org.chromium.net.impl.VersionSafeCallbacks.C87587d) r2.next();
        m152193a(r0.getExecutor(), new com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.RunnableC875776(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(3322);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo141883a(final com.ttnet.org.chromium.net.AbstractC87655t r5) {
        /*
            r4 = this;
            r3 = 3322(0xcfa, float:4.655E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
            java.lang.Object r2 = r4.f198797l
            monitor-enter(r2)
            java.util.Map<com.ttnet.org.chromium.net.t$a, com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$d> r0 = r4.f198808w     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0015
            monitor-exit(r2)     // Catch:{ all -> 0x0042 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x0015:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Map<com.ttnet.org.chromium.net.t$a, com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$d> r0 = r4.f198808w
            java.util.Collection r0 = r0.values()
            r1.<init>(r0)
            monitor-exit(r2)
            java.util.Iterator r2 = r1.iterator()
        L_0x0025:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r2.next()
            com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$d r0 = (com.ttnet.org.chromium.net.impl.VersionSafeCallbacks.C87587d) r0
            com.ttnet.org.chromium.net.impl.CronetUrlRequestContext$6 r1 = new com.ttnet.org.chromium.net.impl.CronetUrlRequestContext$6
            r1.<init>(r0, r5)
            java.util.concurrent.Executor r0 = r0.getExecutor()
            m152193a(r0, r1)
            goto L_0x0025
        L_0x003e:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x0042:
            r0 = move-exception
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.mo141883a(com.ttnet.org.chromium.net.t):void");
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: a */
    public final void mo141745a(long j) {
        MethodCollector.m26663i(3465);
        synchronized (this.f198788c) {
            try {
                m152195k();
                C87457f.m151789c(f198783b, "Set alog func addr: ".concat(String.valueOf(j)), new Object[0]);
                nativeSetAlogFuncAddr(this.f198790e, j);
            } finally {
                MethodCollector.m26664o(3465);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: a */
    public final void mo141753a(String[] strArr, int i, int i2) {
        MethodCollector.m26663i(3541);
        synchronized (this.f198788c) {
            try {
                nativeTryStartNetDetect(this.f198790e, strArr, i, i2);
            } finally {
                MethodCollector.m26664o(3541);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: a */
    public final void mo141748a(String str, int i, String str2) {
        MethodCollector.m26663i(3542);
        synchronized (this.f198788c) {
            try {
                nativeTTDnsResolve(this.f198790e, str, i, str2);
            } finally {
                MethodCollector.m26664o(3542);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: a */
    public final void mo141752a(boolean z, String str, String str2, String str3, boolean z2, String str4) {
        MethodCollector.m26663i(3543);
        synchronized (this.f198788c) {
            try {
                nativeEnableTTBizHttpDns(this.f198790e, z, str, str2, str3, z2, str4);
            } finally {
                MethodCollector.m26664o(3543);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: a */
    public final void mo141749a(String str, String str2, String str3, String str4, String str5, String str6) {
        MethodCollector.m26663i(3546);
        synchronized (this.f198788c) {
            try {
                nativeNotifyTNCConfigUpdated(this.f198790e, str, str2, str3, str4, str5, str6);
            } finally {
                MethodCollector.m26664o(3546);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: a */
    public final void mo141750a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        MethodCollector.m26663i(3548);
        synchronized (this.f198788c) {
            try {
                nativeUpdateStoreRegionFromServer(this.f198790e, str, str2, str3, str4, str5, str6, str7, str8);
            } finally {
                MethodCollector.m26664o(3548);
            }
        }
    }

    private void onColdStartFinish() {
        AbstractC87658u uVar = this.f198792g;
        if (uVar != null) {
            uVar.mo142026a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo141886i() {
        this.f198789d.decrementAndGet();
    }

    public void stopNetLogCompleted() {
        this.f198786C.open();
    }

    /* renamed from: k */
    private void m152195k() {
        if (!m152196l()) {
            throw new IllegalStateException("Engine is shut down.");
        }
    }

    /* renamed from: l */
    private boolean m152196l() {
        if (this.f198790e != 0) {
            return true;
        }
        return false;
    }

    private TTAppInfoProvider.AppInfo onGetAppInfo() {
        TTAppInfoProvider tTAppInfoProvider = this.f198784A;
        if (tTAppInfoProvider != null) {
            return tTAppInfoProvider.mo141646a();
        }
        return null;
    }

    static {
        Covode.recordClassIndex(103543);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo141885h() {
        boolean z;
        MethodCollector.m26663i(3199);
        synchronized (this.f198797l) {
            try {
                if (!this.f198808w.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
                MethodCollector.m26664o(3199);
            }
        }
        return z;
    }

    /* renamed from: j */
    public final long mo141887j() {
        long j;
        MethodCollector.m26663i(3208);
        synchronized (this.f198788c) {
            try {
                m152195k();
                j = this.f198790e;
            } finally {
                MethodCollector.m26664o(3208);
            }
        }
        return j;
    }

    private void initNetworkThread() {
        this.f198794i = Thread.currentThread();
        Thread.currentThread().setName("ChromiumNet" + Process.getThreadPriority(0));
        this.f198792g.mo142037b();
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: b */
    public final void mo141757b() {
        MethodCollector.m26663i(9537);
        synchronized (this.f198788c) {
            try {
                nativeClearClientOpaqueData(this.f198790e);
            } finally {
                MethodCollector.m26664o(9537);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: c */
    public final int mo141761c() {
        int i;
        MethodCollector.m26663i(3076);
        if (this.f198795j) {
            synchronized (this.f198796k) {
                try {
                    i = this.f198799n;
                    if (i == -1) {
                        i = -1;
                    }
                } finally {
                    MethodCollector.m26664o(3076);
                }
            }
            return i;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Network quality estimator must be enabled");
        MethodCollector.m26664o(3076);
        throw illegalStateException;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: d */
    public final int mo141764d() {
        int i;
        MethodCollector.m26663i(3086);
        if (this.f198795j) {
            synchronized (this.f198796k) {
                try {
                    i = this.f198800o;
                    if (i == -1) {
                        i = -1;
                    }
                } finally {
                    MethodCollector.m26664o(3086);
                }
            }
            return i;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Network quality estimator must be enabled");
        MethodCollector.m26664o(3086);
        throw illegalStateException;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: e */
    public final int mo141766e() {
        int i;
        MethodCollector.m26663i(3088);
        if (this.f198795j) {
            synchronized (this.f198796k) {
                try {
                    i = this.f198801p;
                    if (i == -1) {
                        i = -1;
                    }
                } finally {
                    MethodCollector.m26664o(3088);
                }
            }
            return i;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Network quality estimator must be enabled");
        MethodCollector.m26664o(3088);
        throw illegalStateException;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: g */
    public final List<Long> mo141771g() {
        MethodCollector.m26663i(3555);
        ArrayList arrayList = new ArrayList();
        synchronized (this.f198788c) {
            try {
                for (long j : nativeGetOpaqueFuncAddress()) {
                    arrayList.add(Long.valueOf(j));
                }
            } finally {
                MethodCollector.m26664o(3555);
            }
        }
        return arrayList;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: a */
    public final int mo141744a() {
        int i;
        MethodCollector.m26663i(3070);
        if (this.f198795j) {
            synchronized (this.f198796k) {
                try {
                    i = this.f198798m;
                } finally {
                    MethodCollector.m26664o(3070);
                }
            }
            return i;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Network quality estimator must be enabled");
        MethodCollector.m26664o(3070);
        throw illegalStateException;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: f */
    public final Map<String, int[]> mo141769f() {
        MethodCollector.m26663i(3473);
        if (this.f198795j) {
            HashMap hashMap = new HashMap();
            synchronized (this.f198796k) {
                try {
                    if (this.f198809x == null) {
                        return hashMap;
                    }
                    int i = 0;
                    while (true) {
                        String[] strArr = this.f198809x;
                        if (i < strArr.length) {
                            hashMap.put(strArr[i], new int[]{this.f198810y[i], this.f198811z[i]});
                            i++;
                        } else {
                            MethodCollector.m26664o(3473);
                            return hashMap;
                        }
                    }
                } finally {
                    MethodCollector.m26664o(3473);
                }
            }
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Network quality estimator must be enabled");
            MethodCollector.m26664o(3473);
            throw illegalStateException;
        }
    }

    private void onClientIPChanged(String str) {
        AbstractC87658u uVar = this.f198792g;
        if (uVar != null) {
            uVar.mo142038b(str);
        }
    }

    private void onTTNetDetectInfoChanged(String str) {
        AbstractC87658u uVar = this.f198792g;
        if (uVar != null) {
            uVar.mo142032a(str);
        }
    }

    /* renamed from: a */
    public final boolean mo141884a(Thread thread) {
        if (thread == this.f198794i) {
            return true;
        }
        return false;
    }

    private void onEffectiveConnectionTypeChanged(int i) {
        MethodCollector.m26663i(3218);
        synchronized (this.f198796k) {
            try {
                this.f198798m = i;
                AbstractC87658u uVar = this.f198792g;
                if (uVar != null) {
                    uVar.mo142027a(i);
                }
            } finally {
                MethodCollector.m26664o(3218);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: b */
    public final double mo141755b(int i) {
        double d;
        MethodCollector.m26663i(3090);
        m152194f(i);
        synchronized (this.f198796k) {
            try {
                d = this.f198803r[i];
            } finally {
                MethodCollector.m26664o(3090);
            }
        }
        return d;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: c */
    public final double mo141760c(int i) {
        double d;
        MethodCollector.m26663i(3093);
        m152194f(i);
        synchronized (this.f198796k) {
            try {
                d = this.f198802q[i];
            } finally {
                MethodCollector.m26664o(3093);
            }
        }
        return d;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: d */
    public final double mo141763d(int i) {
        double d;
        MethodCollector.m26663i(3094);
        m152194f(i);
        synchronized (this.f198796k) {
            try {
                d = this.f198805t[i];
            } finally {
                MethodCollector.m26664o(3094);
            }
        }
        return d;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: e */
    public final void mo141768e(int i) {
        MethodCollector.m26663i(3559);
        synchronized (this.f198788c) {
            try {
                nativeSetAppStartUpState(this.f198790e, i);
            } finally {
                MethodCollector.m26664o(3559);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: f */
    public final void mo141770f(String str) {
        MethodCollector.m26663i(3069);
        synchronized (this.f198788c) {
            try {
                m152195k();
                nativeSetHostResolverRules(this.f198790e, str);
            } finally {
                MethodCollector.m26664o(3069);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: g */
    public final void mo141772g(String str) {
        MethodCollector.m26663i(3560);
        synchronized (this.f198788c) {
            try {
                nativeReportNetDiagnosisUserLog(this.f198790e, str);
            } finally {
                MethodCollector.m26664o(3560);
            }
        }
    }

    /* renamed from: f */
    private void m152194f(int i) {
        if (!this.f198795j) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        } else if (i != 0 && i != 1) {
            throw new IllegalStateException("Error protocol: ".concat(String.valueOf(i)));
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: a */
    public final double mo141743a(int i) {
        double d;
        MethodCollector.m26663i(3089);
        m152194f(i);
        synchronized (this.f198796k) {
            try {
                d = this.f198802q[i];
            } finally {
                MethodCollector.m26664o(3089);
            }
        }
        return d;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: b */
    public final void mo141758b(String str) {
        MethodCollector.m26663i(2942);
        synchronized (this.f198788c) {
            try {
                nativeSetProxy(this.f198790e, str);
            } finally {
                MethodCollector.m26664o(2942);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: c */
    public final Map<String, String> mo141762c(String str) {
        MethodCollector.m26663i(2953);
        URLDispatch uRLDispatch = new URLDispatch(str);
        synchronized (this.f198788c) {
            try {
                m152195k();
                nativeTTUrlDispatch(this.f198790e, uRLDispatch, str);
            } catch (Throwable th) {
                MethodCollector.m26664o(2953);
                throw th;
            }
        }
        uRLDispatch.f198892f.mo142090a(300);
        HashMap hashMap = new HashMap();
        hashMap.put("final_url", uRLDispatch.f198889c);
        hashMap.put("epoch", uRLDispatch.f198890d);
        hashMap.put("etag", uRLDispatch.f198891e);
        MethodCollector.m26664o(2953);
        return hashMap;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: d */
    public final void mo141765d(String str) {
        MethodCollector.m26663i(2955);
        synchronized (this.f198788c) {
            try {
                m152195k();
                nativePreconnectUrl(this.f198790e, str, 1);
            } finally {
                MethodCollector.m26664o(2955);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: e */
    public final List<InetAddress> mo141767e(String str) {
        MethodCollector.m26663i(2962);
        DnsQuery dnsQuery = new DnsQuery(str);
        synchronized (this.f198788c) {
            try {
                m152195k();
                nativeDnsLookup(this.f198790e, dnsQuery);
            } catch (Throwable th) {
                MethodCollector.m26664o(2962);
                throw th;
            }
        }
        dnsQuery.f198870d.mo142090a(0);
        if (dnsQuery.f198868b != 0 || dnsQuery.f198869c == null || dnsQuery.f198869c.length == 0) {
            UnknownHostException unknownHostException = new UnknownHostException(dnsQuery.f198867a);
            MethodCollector.m26664o(2962);
            throw unknownHostException;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : dnsQuery.f198869c) {
            byte[] address = InetAddress.getByName(str2).getAddress();
            if (address != null) {
                arrayList.add(InetAddress.getByAddress(dnsQuery.f198867a, address));
            }
        }
        if (!arrayList.isEmpty()) {
            MethodCollector.m26664o(2962);
            return arrayList;
        }
        UnknownHostException unknownHostException2 = new UnknownHostException(dnsQuery.f198867a);
        MethodCollector.m26664o(2962);
        throw unknownHostException2;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: b */
    public final void mo141759b(boolean z) {
        MethodCollector.m26663i(3551);
        synchronized (this.f198788c) {
            try {
                nativeNotifySwitchToMultiNetwork(this.f198790e, z);
            } finally {
                MethodCollector.m26664o(3551);
            }
        }
    }

    public CronetUrlRequestContext(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        MethodCollector.m26663i(8482);
        Object obj = new Object();
        this.f198788c = obj;
        int i = -1;
        this.f198799n = -1;
        this.f198800o = -1;
        this.f198801p = -1;
        this.f198802q = new double[]{-1.0d, -1.0d};
        this.f198803r = new double[]{-1.0d, -1.0d};
        this.f198804s = new double[]{-1.0d, -1.0d};
        this.f198805t = new double[]{-1.0d, -1.0d};
        this.f198806u = new C87459h<>();
        this.f198807v = new C87459h<>();
        this.f198808w = new HashMap();
        this.f198795j = cronetEngineBuilderImpl.f198675o;
        CronetLibraryLoader.m152151a(cronetEngineBuilderImpl.f198661a, cronetEngineBuilderImpl);
        String str = f198783b;
        if (Log.isLoggable(str, 2)) {
            i = -2;
        } else if (!Log.isLoggable(str, 3)) {
            i = 3;
        }
        nativeSetMinLogLevel(i);
        if (cronetEngineBuilderImpl.f198671k == 1) {
            String str2 = cronetEngineBuilderImpl.f198666f;
            this.f198787E = str2;
            HashSet<String> hashSet = f198782D;
            synchronized (hashSet) {
                try {
                    if (!hashSet.add(str2)) {
                        IllegalStateException illegalStateException = new IllegalStateException("Disk cache storage path already in use");
                        MethodCollector.m26664o(8482);
                        throw illegalStateException;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8482);
                    throw th;
                }
            }
        } else {
            this.f198787E = null;
        }
        this.f198784A = cronetEngineBuilderImpl.f198679s;
        this.f198785B = cronetEngineBuilderImpl.f198680t;
        this.f198792g = cronetEngineBuilderImpl.f198681u;
        this.f198791f = cronetEngineBuilderImpl.f198660E;
        synchronized (obj) {
            try {
                long nativeCreateRequestContextAdapter = nativeCreateRequestContextAdapter(m152192a(cronetEngineBuilderImpl));
                this.f198790e = nativeCreateRequestContextAdapter;
                if (nativeCreateRequestContextAdapter == 0) {
                    NullPointerException nullPointerException = new NullPointerException("Context Adapter creation failed.");
                    MethodCollector.m26664o(8482);
                    throw nullPointerException;
                }
            } catch (Throwable th2) {
                MethodCollector.m26664o(8482);
                throw th2;
            }
        }
        CronetLibraryLoader.m152152a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.RunnableC875721 */

            static {
                Covode.recordClassIndex(103544);
            }

            public final void run() {
                MethodCollector.m26663i(5445);
                CronetLibraryLoader.m152150a();
                PowerMonitor.f198304g = CronetUrlRequestContext.this.f198791f;
                PowerMonitor.m151748e();
                synchronized (CronetUrlRequestContext.this.f198788c) {
                    try {
                        CronetUrlRequestContext cronetUrlRequestContext = CronetUrlRequestContext.this;
                        cronetUrlRequestContext.nativeInitRequestContextOnInitThread(cronetUrlRequestContext.f198790e);
                    } finally {
                        MethodCollector.m26664o(5445);
                    }
                }
            }
        });
        MethodCollector.m26664o(8482);
    }

    /* renamed from: a */
    private static long m152192a(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        String str;
        int i;
        String str2 = "";
        MethodCollector.m26663i(9098);
        try {
            Context context = cronetEngineBuilderImpl.f198661a;
            if (C58016d.f132222c == null || !C58016d.f132224e) {
                C58016d.f132222c = context.getFilesDir();
            }
            File file = C58016d.f132222c;
            if (file != null) {
                str = file.getAbsolutePath();
            } else {
                str = str2;
            }
        } catch (Throwable unused) {
            str = str2;
        }
        String str3 = cronetEngineBuilderImpl.f198665e;
        String str4 = cronetEngineBuilderImpl.f198666f;
        boolean z = cronetEngineBuilderImpl.f198667g;
        if (cronetEngineBuilderImpl.f198667g) {
            Context context2 = cronetEngineBuilderImpl.f198661a;
            StringBuilder sb = new StringBuilder();
            sb.append(context2.getPackageName());
            C87644s.m152413a(sb);
            str2 = sb.toString();
        }
        boolean z2 = cronetEngineBuilderImpl.f198668h;
        boolean z3 = cronetEngineBuilderImpl.f198669i;
        boolean z4 = cronetEngineBuilderImpl.f198670j;
        int i2 = cronetEngineBuilderImpl.f198671k;
        long j = cronetEngineBuilderImpl.f198672l;
        String str5 = cronetEngineBuilderImpl.f198673m;
        long j2 = cronetEngineBuilderImpl.f198674n;
        boolean z5 = cronetEngineBuilderImpl.f198675o;
        boolean z6 = cronetEngineBuilderImpl.f198664d;
        boolean z7 = cronetEngineBuilderImpl.f198677q;
        boolean z8 = cronetEngineBuilderImpl.f198678r;
        if (cronetEngineBuilderImpl.f198676p == 20) {
            i = 0;
        } else {
            i = cronetEngineBuilderImpl.f198676p;
        }
        long nativeCreateRequestContextConfig = nativeCreateRequestContextConfig(str3, str4, z, str2, z2, z3, z4, i2, j, str5, j2, z5, z6, z7, z8, str, i);
        for (CronetEngineBuilderImpl.C87556b bVar : cronetEngineBuilderImpl.f198662b) {
            nativeAddQuicHint(nativeCreateRequestContextConfig, bVar.f198691a, bVar.f198692b, bVar.f198693c);
        }
        for (CronetEngineBuilderImpl.C87555a aVar : cronetEngineBuilderImpl.f198663c) {
            nativeAddPkp(nativeCreateRequestContextConfig, aVar.f198687a, aVar.f198688b, aVar.f198689c, aVar.f198690d.getTime());
        }
        String str6 = cronetEngineBuilderImpl.f198682v;
        if (str6 != null) {
            nativeSetGetDomainDefaultJSON(nativeCreateRequestContextConfig, str6);
        }
        ArrayList<byte[]> arrayList = cronetEngineBuilderImpl.f198683w;
        if (arrayList != null && !arrayList.isEmpty()) {
            nativeSetOpaqueData(nativeCreateRequestContextConfig, (byte[][]) arrayList.toArray(new byte[arrayList.size()][]));
        }
        Map<String[], Pair<byte[], byte[]>> map = cronetEngineBuilderImpl.f198684x;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String[], Pair<byte[], byte[]>> entry : map.entrySet()) {
                nativeSetClientOpaqueData(nativeCreateRequestContextConfig, entry.getKey(), (byte[]) entry.getValue().first, (byte[]) entry.getValue().second);
            }
        }
        String str7 = cronetEngineBuilderImpl.f198685y;
        if (str7 != null) {
            nativeSetBypassBOEJSON(nativeCreateRequestContextConfig, str7);
        }
        String str8 = cronetEngineBuilderImpl.f198686z;
        if (str8 != null) {
            nativeSetStoreIdcRuleJSON(nativeCreateRequestContextConfig, str8);
        }
        String str9 = cronetEngineBuilderImpl.f198656A;
        if (str9 != null) {
            nativeSetProxyConfig(nativeCreateRequestContextConfig, str9);
        }
        nativeEnableBoeProxy(nativeCreateRequestContextConfig, cronetEngineBuilderImpl.f198657B);
        nativeInitALogFuncAddr(cronetEngineBuilderImpl.f198658C);
        MethodCollector.m26664o(9098);
        return nativeCreateRequestContextConfig;
    }

    private void onMultiNetworkStateChanged(int i, int i2) {
        AbstractC87658u uVar = this.f198792g;
        if (uVar != null) {
            uVar.mo142029a(i, i2);
        }
    }

    private void onSendAppMonitorEvent(String str, String str2) {
        AbstractC87670v vVar = this.f198785B;
        if (vVar != null) {
            vVar.mo142093a(str, str2);
        }
    }

    private void onServerConfigUpdated(String str, String str2) {
        AbstractC87658u uVar = this.f198792g;
        if (uVar != null) {
            uVar.mo142033a(str, str2);
        }
    }

    private void onTNCUpdateFailed(String[] strArr, String str) {
        AbstractC87658u uVar = this.f198792g;
        if (uVar != null) {
            uVar.mo142036a(strArr, str);
        }
    }

    /* renamed from: a */
    private static void m152193a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            C87457f.m151789c(f198783b, "Exception posting task to executor", e);
        }
    }

    private void onStoreIdcChanged(String str, String str2, String str3) {
        AbstractC87658u uVar = this.f198792g;
        if (uVar != null) {
            uVar.mo142035a(str, str2, str3);
        }
    }

    private void onDnsLookupComplete(final DnsQuery dnsQuery, int i, String[] strArr) {
        dnsQuery.f198868b = i;
        dnsQuery.f198869c = strArr;
        try {
            dnsQuery.f198870d.execute(new Runnable() {
                /* class com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.RunnableC875732 */

                static {
                    Covode.recordClassIndex(103545);
                }

                public final void run() {
                    dnsQuery.f198870d.mo142091b();
                }
            });
        } catch (RejectedExecutionException e) {
            C87457f.m151789c("DnsQuery", "Exception DnsQuery resume ", e);
        }
    }

    private void onRttObservation(final int i, final long j, final int i2) {
        MethodCollector.m26663i(3241);
        synchronized (this.f198796k) {
            try {
                Iterator<VersionSafeCallbacks.C87585b> it = this.f198806u.iterator();
                while (it.hasNext()) {
                    final VersionSafeCallbacks.C87585b next = it.next();
                    m152193a(next.f198895a.mo141919a(), new Runnable() {
                        /* class com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.RunnableC875754 */

                        static {
                            Covode.recordClassIndex(103547);
                        }

                        public final void run() {
                        }
                    });
                }
            } finally {
                MethodCollector.m26664o(3241);
            }
        }
    }

    private void onThroughputObservation(final int i, final long j, final int i2) {
        MethodCollector.m26663i(3244);
        synchronized (this.f198796k) {
            try {
                Iterator<VersionSafeCallbacks.C87586c> it = this.f198807v.iterator();
                while (it.hasNext()) {
                    final VersionSafeCallbacks.C87586c next = it.next();
                    m152193a(next.f198896a.mo141922a(), new Runnable() {
                        /* class com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.RunnableC875765 */

                        static {
                            Covode.recordClassIndex(103548);
                        }

                        public final void run() {
                        }
                    });
                }
            } finally {
                MethodCollector.m26664o(3244);
            }
        }
    }

    private void onUrlDispatchComplete(final URLDispatch uRLDispatch, String str, String str2, String str3) {
        uRLDispatch.f198889c = str;
        uRLDispatch.f198891e = str2;
        uRLDispatch.f198890d = str3;
        try {
            uRLDispatch.f198892f.execute(new Runnable() {
                /* class com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.RunnableC875743 */

                static {
                    Covode.recordClassIndex(103546);
                }

                public final void run() {
                    uRLDispatch.f198892f.mo142091b();
                }
            });
        } catch (RejectedExecutionException e) {
            C87457f.m151789c(URLDispatch.f198887a, "Exception URLDispatch resume ", e);
        }
    }

    private void onPacketLossComputed(int i, double d, double d2, double d3, double d4) {
        MethodCollector.m26663i(3224);
        synchronized (this.f198796k) {
            if (i == 0 || i == 1) {
                this.f198802q[i] = d;
                this.f198803r[i] = d2;
                this.f198804s[i] = d3;
                this.f198805t[i] = d4;
                AbstractC87658u uVar = this.f198792g;
                if (uVar != null) {
                    uVar.mo142028a(i, d, d2, d3, d4);
                }
                MethodCollector.m26664o(3224);
                return;
            }
            try {
                C87457f.m151789c(f198783b, "Error protocol from native. Protocol: ".concat(String.valueOf(i)), new Object[0]);
            } finally {
                MethodCollector.m26664o(3224);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ttnet.org.chromium.net.impl.AbstractC87592c
    /* renamed from: a */
    public final AbstractC87671w mo141880a(AbstractC87671w.AbstractC87673b bVar, Executor executor, int i, List<String> list, int i2, int i3) {
        return new TTCronetNetExpRequest(this, bVar, executor, i, list, i2, i3);
    }

    private void onRTTOrThroughputEstimatesComputed(int i, int i2, int i3, String[] strArr, int[] iArr, int[] iArr2) {
        MethodCollector.m26663i(3219);
        synchronized (this.f198796k) {
            try {
                this.f198799n = i;
                this.f198800o = i2;
                this.f198801p = i3;
                this.f198809x = strArr;
                this.f198810y = iArr;
                this.f198811z = iArr2;
                AbstractC87658u uVar = this.f198792g;
                if (uVar != null) {
                    uVar.mo142030a(i, i2, i3);
                }
            } finally {
                MethodCollector.m26664o(3219);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC87592c
    /* renamed from: a */
    public final AbstractC87674x mo141882a(AbstractC87674x.AbstractC87676b bVar, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z) {
        return new CronetWebsocketConnection(this, bVar, executor, list, map, map2, z);
    }

    private void onTTDnsResolveResult(String str, String str2, int i, int i2, int i3, String[] strArr, String str3) {
        ArrayList arrayList = new ArrayList(strArr.length);
        Collections.addAll(arrayList, strArr);
        AbstractC87658u uVar = this.f198792g;
        if (uVar != null) {
            uVar.mo142034a(str, str2, i, i2, i3, arrayList, str3);
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC87592c
    /* renamed from: a */
    public final AbstractC87640p mo141879a(String str, AbstractC87529ab.AbstractC87531b bVar, Executor executor, int i, Collection<Object> collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, AbstractC87655t.AbstractC87656a aVar) {
        Throwable th;
        MethodCollector.m26663i(9242);
        synchronized (this.f198788c) {
            try {
                m152195k();
                try {
                    CronetUrlRequest cronetUrlRequest = new CronetUrlRequest(this, str, i, bVar, executor, collection, z, z2, z3, z4, i2, z5, i3, aVar);
                    MethodCollector.m26664o(9242);
                    return cronetUrlRequest;
                } catch (Throwable th2) {
                    th = th2;
                    MethodCollector.m26664o(9242);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                MethodCollector.m26664o(9242);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC87592c
    /* renamed from: a */
    public final AbstractC87674x mo141881a(AbstractC87674x.AbstractC87676b bVar, Executor executor, List<String> list, int i, String str, long j, int i2, long j2, String str2, int i3, String str3, Map<String, String> map, Map<String, String> map2, boolean z) {
        return new CronetWebsocketConnection(this, bVar, executor, list, i, str, j, i2, j2, str2, i3, str3, map, map2, z);
    }

    private void onContextInitCompleted(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.f198793h.open();
        AbstractC87658u uVar = this.f198792g;
        if (uVar != null) {
            uVar.mo142031a(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18);
        }
    }

    private void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4, String str5, String str6, int i, int i2, String str7) {
        AbstractC87670v vVar = this.f198785B;
        if (vVar != null) {
            vVar.mo142094a(z, str, str2, str3, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, z2, j11, j12, str4, str5, str6, i, i2, str7);
        }
    }
}

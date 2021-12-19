package org.chromium;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.cronet.C14646b;
import com.ttnet.org.chromium.base.C87463k;
import com.ttnet.org.chromium.net.AbstractC87658u;
import com.ttnet.org.chromium.net.impl.CronetLibraryLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: org.chromium.e */
public class C90231e extends AbstractC87658u {

    /* renamed from: b */
    private static volatile C90231e f204969b;

    /* renamed from: a */
    public boolean f204970a;

    static {
        Covode.recordClassIndex(106491);
    }

    private C90231e() {
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87658u
    /* renamed from: a */
    public final void mo142033a(String str, String str2) {
        if (this.f204970a) {
            C90228c a = C90228c.m156904a();
            if (C90229d.m156924a().loggerDebug()) {
                C90229d.m156924a().loggerD("CronetAppProviderManager", "onServerConfigUpdated json = ".concat(String.valueOf(str)));
            }
            try {
                if (a.f204965a != null) {
                    C87463k.m151800a(a.f204965a).mo141524a("onServerConfigEtagChanged", new Class[]{String.class}, str2);
                    C87463k.m151800a(a.f204965a).mo141524a("onServerConfigUpdated", new Class[]{String.class}, str);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87658u
    /* renamed from: a */
    public final void mo142032a(String str) {
        if (this.f204970a) {
            C90228c a = C90228c.m156904a();
            if (C90229d.m156924a().loggerDebug()) {
                C90229d.m156924a().loggerD("CronetAppProviderManager", "onTTNetDetectInfoChanged info str = ".concat(String.valueOf(str)));
            }
            try {
                if (a.f204965a != null) {
                    C87463k.m151800a(a.f204965a).mo141524a("onTTNetDetectInfoChanged", new Class[]{String.class}, str);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87658u
    /* renamed from: a */
    public final void mo142034a(String str, String str2, int i, int i2, int i3, List<String> list, String str3) {
        C90228c a = C90228c.m156904a();
        if (C90229d.m156924a().loggerDebug()) {
            C90229d.m156924a().loggerD("CronetAppProviderManager", "onTTDnsResolveResult info uuid = " + str + " host: " + str2);
        }
        try {
            if (a.f204965a != null) {
                C87463k.m151800a(a.f204965a).mo141524a("onTTDnsResolveResult", new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, List.class, String.class}, str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), list, str3);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87658u
    /* renamed from: a */
    public final void mo142035a(String str, String str2, String str3) {
        if (this.f204970a) {
            C90228c a = C90228c.m156904a();
            if (C90229d.m156924a().loggerDebug()) {
                C90229d.m156924a().loggerD("CronetAppProviderManager", "onStoreIdcChanged ");
            }
            try {
                if (a.f204965a != null) {
                    C87463k.m151800a(a.f204965a).mo141524a("onStoreIdcChanged", new Class[]{String.class, String.class, String.class}, str, str2, str3);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87658u
    /* renamed from: a */
    public final void mo142036a(String[] strArr, String str) {
        if (this.f204970a) {
            C90228c a = C90228c.m156904a();
            if (C90229d.m156924a().loggerDebug()) {
                C90229d.m156924a().loggerD("CronetAppProviderManager", "onTNCUpdateFailed ");
            }
            try {
                if (!(a.f204965a == null || strArr == null)) {
                    if (strArr.length > 0) {
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : strArr) {
                            arrayList.add(str2);
                        }
                        C87463k.m151800a(a.f204965a).mo141524a("onTNCUpdateFailed", new Class[]{ArrayList.class, String.class}, arrayList, str);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    public static C90231e m156926c() {
        MethodCollector.m26663i(6196);
        if (f204969b == null) {
            synchronized (C90231e.class) {
                try {
                    if (f204969b == null) {
                        f204969b = new C90231e();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6196);
                    throw th;
                }
            }
        }
        C90231e eVar = f204969b;
        MethodCollector.m26664o(6196);
        return eVar;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87658u
    /* renamed from: a */
    public final void mo142026a() {
        if (this.f204970a) {
            C90228c a = C90228c.m156904a();
            if (C90229d.m156924a().loggerDebug()) {
                C90229d.m156924a().loggerD("CronetAppProviderManager", "onColdStartFinish ");
            }
            try {
                if (a.f204965a != null) {
                    C87463k.m151800a(a.f204965a).mo141522a("onColdStartFinish");
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87658u
    /* renamed from: b */
    public final void mo142037b() {
        if (this.f204970a) {
            C90228c a = C90228c.m156904a();
            if (C90229d.m156924a().loggerDebug()) {
                C90229d.m156924a().loggerD("CronetAppProviderManager", "onCronetBootSucceed ");
            }
            try {
                if (a.f204965a != null) {
                    C87463k.m151800a(a.f204965a).mo141522a("onCronetBootSucceed");
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87658u
    /* renamed from: a */
    public final void mo142027a(int i) {
        C90228c a = C90228c.m156904a();
        if (C90229d.m156924a().loggerDebug()) {
            C90229d.m156924a().loggerD("CronetAppProviderManager", "onEffectiveConnectionTypeChanged type = ".concat(String.valueOf(i)));
        }
        try {
            if (a.f204965a != null) {
                C87463k.m151800a(a.f204965a).mo141524a("onEffectiveConnectionTypeChanged", new Class[]{Integer.TYPE}, Integer.valueOf(i));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87658u
    /* renamed from: b */
    public final void mo142038b(String str) {
        if (this.f204970a) {
            C90228c a = C90228c.m156904a();
            if (C90229d.m156924a().loggerDebug()) {
                C90229d.m156924a().loggerD("CronetAppProviderManager", "onClientIPChanged ");
            }
            try {
                if (a.f204965a != null) {
                    C87463k.m151800a(a.f204965a).mo141524a("onClientIPChanged", new Class[]{String.class}, str);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87658u
    /* renamed from: a */
    public final Map<String, String> mo142025a(String str, Map<String, String> map) {
        return C90228c.m156904a().mo145262a(str, map);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87658u
    /* renamed from: a */
    public final void mo142029a(int i, int i2) {
        C90228c a = C90228c.m156904a();
        if (C90229d.m156924a().loggerDebug()) {
            C90229d.m156924a().loggerD("CronetAppProviderManager", "onMultiNetworkStateChanged, prev state = " + i + ", curr state = " + i2);
        }
        try {
            if (a.f204965a != null) {
                C87463k.m151800a(a.f204965a).mo141524a("onMultiNetworkStateChanged", new Class[]{Integer.TYPE, Integer.TYPE}, Integer.valueOf(i), Integer.valueOf(i2));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87658u
    /* renamed from: a */
    public final void mo142030a(int i, int i2, int i3) {
        C90228c a = C90228c.m156904a();
        if (C90229d.m156924a().loggerDebug()) {
            C90229d.m156924a().loggerD("CronetAppProviderManager", "onRTTOrThroughputEstimatesComputed httpRtt = " + i + ", transportRttMs = " + i2 + ",downstreamThroughputKbps = " + i3);
        }
        try {
            if (a.f204965a != null) {
                C87463k.m151800a(a.f204965a).mo141524a("onRTTOrThroughputEstimatesComputed", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87658u
    /* renamed from: a */
    public final void mo142028a(int i, double d, double d2, double d3, double d4) {
        C90228c a = C90228c.m156904a();
        if (C90229d.m156924a().loggerDebug()) {
            C90229d.m156924a().loggerD("CronetAppProviderManager", "onPacketLossComputed protocol = " + i + ", upstreamLossRate = " + d + ", upstreamLossRateVariance = " + d2 + ", downstreamLossRate = " + d3 + ", downstreamLossRateVariance = " + d4);
        }
        try {
            if (a.f204965a != null) {
                C87463k.m151800a(a.f204965a).mo141524a("onPacketLossComputed", new Class[]{Integer.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Integer.valueOf(i), Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87658u
    /* renamed from: a */
    public final void mo142031a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        C14646b a = C14646b.m26772a();
        a.f35480d = Process.getThreadPriority(0);
        a.f35488l = CronetLibraryLoader.f198694a;
        a.f35489m = CronetLibraryLoader.f198695b;
        a.f35497u = CronetLibraryLoader.f198696c;
        a.f35490n = j;
        a.f35491o = j2;
        a.f35492p = j3;
        a.f35493q = j4;
        a.f35494r = j5;
        a.f35495s = j6;
        a.f35498v = j7;
        a.f35499w = j8;
        a.f35500x = j9;
        a.f35501y = j10;
        a.f35502z = j11;
        a.f35471A = j12;
        a.f35472B = j13;
        a.f35473C = j14;
        a.f35474D = j15;
        a.f35475E = j16;
        a.f35476F = j17;
        a.f35477G = j18;
        C90228c.m156904a().mo145263a(C14646b.m26772a().mo23614b().toString(), "ttnet_init");
    }
}

package org.chromium;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ttnet.org.chromium.base.C87463k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: org.chromium.c */
public class C90228c {

    /* renamed from: b */
    private static volatile C90228c f204964b;

    /* renamed from: a */
    public Object f204965a;

    static {
        Covode.recordClassIndex(106487);
    }

    private C90228c() {
    }

    /* renamed from: b */
    public final Map<String, String> mo145264b() {
        try {
            Object obj = this.f204965a;
            if (obj == null) {
                return Collections.emptyMap();
            }
            return (Map) C87463k.m151800a(obj).mo141522a("getGetDomainDependHostMap").f198369a;
        } catch (Throwable unused) {
            return Collections.emptyMap();
        }
    }

    /* renamed from: c */
    public final String mo145265c() {
        try {
            Object obj = this.f204965a;
            if (obj == null) {
                return null;
            }
            return (String) C87463k.m151800a(obj).mo141522a("getGetDomainDefaultJSON").f198369a;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final ArrayList<byte[]> mo145266d() {
        try {
            Object obj = this.f204965a;
            if (obj == null) {
                return null;
            }
            return (ArrayList) C87463k.m151800a(obj).mo141522a("getOpaqueData").f198369a;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final Map<String[], Pair<byte[], byte[]>> mo145267e() {
        try {
            Object obj = this.f204965a;
            if (obj == null) {
                return null;
            }
            return (Map) C87463k.m151800a(obj).mo141522a("getClientOpaqueData").f198369a;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    public final Map<String, String> mo145268f() {
        try {
            Object obj = this.f204965a;
            if (obj == null) {
                return null;
            }
            return (Map) C87463k.m151800a(obj).mo141522a("getTNCRequestHeader").f198369a;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    public final Map<String, String> mo145269g() {
        try {
            Object obj = this.f204965a;
            if (obj == null) {
                return null;
            }
            return (Map) C87463k.m151800a(obj).mo141522a("getTNCRequestQuery").f198369a;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: h */
    public final boolean mo145270h() {
        try {
            Object obj = this.f204965a;
            if (obj == null) {
                return false;
            }
            return ((Boolean) C87463k.m151800a(obj).mo141522a("isEnableQuic").f198369a).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: i */
    public final boolean mo145271i() {
        try {
            Object obj = this.f204965a;
            if (obj == null) {
                return false;
            }
            return ((Boolean) C87463k.m151800a(obj).mo141522a("isEnableHttp2").f198369a).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: j */
    public final boolean mo145272j() {
        try {
            Object obj = this.f204965a;
            if (obj == null) {
                return false;
            }
            return ((Boolean) C87463k.m151800a(obj).mo141522a("isEnableBrotli").f198369a).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: k */
    public final Map<String, Pair<Integer, Integer>> mo145273k() {
        try {
            Object obj = this.f204965a;
            if (obj == null) {
                return null;
            }
            return (Map) C87463k.m151800a(obj).mo141522a("getQuicHint").f198369a;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: l */
    public final boolean mo145274l() {
        try {
            Object obj = this.f204965a;
            if (obj == null) {
                return false;
            }
            return ((Boolean) C87463k.m151800a(obj).mo141522a("isBOEProxyEnabled").f198369a).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: m */
    public final String mo145275m() {
        try {
            Object obj = this.f204965a;
            if (obj == null) {
                return null;
            }
            return (String) C87463k.m151800a(obj).mo141522a("getBypassBOEJSON").f198369a;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: n */
    public final String mo145276n() {
        try {
            Object obj = this.f204965a;
            if (obj == null) {
                return null;
            }
            return (String) C87463k.m151800a(obj).mo141522a("getStoreIdcRuleJSON").f198369a;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: o */
    public final boolean mo145277o() {
        try {
            Object obj = this.f204965a;
            if (obj == null) {
                return false;
            }
            return ((Boolean) C87463k.m151800a(obj).mo141522a("needCustomLoadLibrary").f198369a).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: p */
    public final String mo145278p() {
        try {
            Object obj = this.f204965a;
            if (obj == null) {
                return null;
            }
            return (String) C87463k.m151800a(obj).mo141522a("getCronetSoPath").f198369a;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    public final int mo145279q() {
        try {
            Object obj = this.f204965a;
            if (obj == null) {
                return 0;
            }
            return ((Integer) C87463k.m151800a(obj).mo141522a("getProcessFlag").f198369a).intValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static C90228c m156904a() {
        MethodCollector.m26663i(6190);
        if (f204964b == null) {
            synchronized (C90228c.class) {
                try {
                    if (f204964b == null) {
                        f204964b = new C90228c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6190);
                    throw th;
                }
            }
        }
        C90228c cVar = f204964b;
        MethodCollector.m26664o(6190);
        return cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo145261a(String str) {
        try {
            Object obj = this.f204965a;
            if (obj == null) {
                return "";
            }
            return (String) C87463k.m151800a(obj).mo141522a(str).f198369a;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public final Map<String, String> mo145262a(String str, Map<String, String> map) {
        if (C90229d.m156924a().loggerDebug()) {
            C90229d.m156924a().loggerD("CronetAppProviderManager", "onCallToAddSecurityFactor info url = ".concat(String.valueOf(str)));
        }
        try {
            Object obj = this.f204965a;
            if (obj == null) {
                return null;
            }
            return (Map) C87463k.m151800a(obj).mo141524a("onCallToAddSecurityFactor", new Class[]{String.class, Map.class}, str, map).f198369a;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo145263a(String str, String str2) {
        if (C90229d.m156924a().loggerDebug()) {
            C90229d.m156924a().loggerD("CronetAppProviderManager", "Send monitor json = " + str + ", log type =" + str2);
        }
        try {
            Object obj = this.f204965a;
            if (obj != null) {
                C87463k.m151800a(obj).mo141524a("sendAppMonitorEvent", new Class[]{String.class, String.class}, str, str2);
            }
        } catch (Throwable unused) {
        }
    }
}

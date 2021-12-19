package com.facebook.internal;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.C24872m;
import com.facebook.EnumC25029u;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.internal.w */
public final class C24783w {

    /* renamed from: b */
    private static final HashMap<String, String> f58804b = new HashMap<>();

    /* renamed from: a */
    public int f58805a = 3;

    /* renamed from: c */
    private final EnumC25029u f58806c;

    /* renamed from: d */
    private final String f58807d;

    /* renamed from: e */
    private StringBuilder f58808e;

    static {
        Covode.recordClassIndex(28936);
    }

    /* renamed from: a */
    public final void mo40598a() {
        m47446d(this.f58808e.toString());
        this.f58808e = new StringBuilder();
    }

    /* renamed from: d */
    private void m47446d(String str) {
        m47440a(this.f58806c, this.f58807d, str);
    }

    /* renamed from: b */
    public final void mo40600b(String str) {
        if (C24872m.m47686a(this.f58806c)) {
            this.f58808e.append(str);
        }
    }

    /* renamed from: a */
    public static synchronized void m47442a(String str) {
        synchronized (C24783w.class) {
            MethodCollector.m26663i(7983);
            if (!C24872m.m47686a(EnumC25029u.INCLUDE_ACCESS_TOKENS)) {
                m47443a(str, "ACCESS_TOKEN_REMOVED");
            }
            MethodCollector.m26664o(7983);
        }
    }

    /* renamed from: c */
    private static synchronized String m47445c(String str) {
        synchronized (C24783w.class) {
            MethodCollector.m26663i(7985);
            for (Map.Entry<String, String> entry : f58804b.entrySet()) {
                str = str.replace(entry.getKey(), entry.getValue());
            }
            MethodCollector.m26664o(7985);
        }
        return str;
    }

    public C24783w(EnumC25029u uVar, String str) {
        C24699ae.m47302a(str, "tag");
        this.f58806c = uVar;
        this.f58807d = "FacebookSDK.".concat(String.valueOf(str));
        this.f58808e = new StringBuilder();
    }

    /* renamed from: a */
    private static synchronized void m47443a(String str, String str2) {
        synchronized (C24783w.class) {
            MethodCollector.m26663i(7982);
            f58804b.put(str, str2);
            MethodCollector.m26664o(7982);
        }
    }

    /* renamed from: a */
    private void m47444a(String str, Object... objArr) {
        if (C24872m.m47686a(this.f58806c)) {
            this.f58808e.append(C1764a.m5928a(str, objArr));
        }
    }

    /* renamed from: a */
    public final void mo40599a(String str, Object obj) {
        m47444a("  %s:\t%s\n", str, obj);
    }

    /* renamed from: a */
    public static void m47440a(EnumC25029u uVar, String str, String str2) {
        if (C24872m.m47686a(uVar)) {
            m47445c(str2);
            str.startsWith("FacebookSDK.");
            if (uVar == EnumC25029u.DEVELOPER_ERRORS) {
                new Exception().printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m47441a(EnumC25029u uVar, String str, String str2, Object... objArr) {
        if (C24872m.m47686a(uVar)) {
            m47440a(uVar, str, C1764a.m5928a(str2, objArr));
        }
    }
}

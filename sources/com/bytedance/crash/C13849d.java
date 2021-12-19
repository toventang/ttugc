package com.bytedance.crash;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.ensure.C13861a;
import com.bytedance.crash.ensure.EnsureInitInner$1;
import com.bytedance.crash.p932j.C13911h;
import com.bytedance.crash.runtime.C13994b;
import com.bytedance.crash.runtime.C14018m;
import com.bytedance.crash.util.C14059k;
import com.bytedance.news.common.service.manager.C21520c;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.services.apm.api.IEnsure;
import java.util.Map;

/* renamed from: com.bytedance.crash.d */
public final class C13849d {
    static {
        Covode.recordClassIndex(15906);
    }

    public C13849d() {
        if (!C13861a.f33748a) {
            C13861a.f33748a = true;
            try {
                EnsureInitInner$1 ensureInitInner$1 = new EnsureInitInner$1();
                C21520c.m40426a(IEnsure.class, ensureInitInner$1);
                C22708a.f53665a = ensureInitInner$1;
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m25016a(Throwable th) {
        if (!C13933m.f33942g.isEnsureEnable() || C14059k.m25585a(th)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m25015a(Throwable th, String str) {
        if (m25016a(th)) {
            C13911h.m25183a(th, str, true);
        }
    }

    /* renamed from: a */
    public static void m25014a(String str, Throwable th) {
        C13933m.f33942g.isDebugMode();
        if (C13933m.f33936a != null) {
            if (C14018m.f34167a == -1) {
                C14018m.f34167a = 5;
                C14018m.f34167a = C13994b.m25328a(5, "custom_event_settings", "npth_simple_setting", "crash_inner_limit");
            }
            if (C14018m.f34168b < C14018m.f34167a) {
                C14018m.f34168b++;
                C14018m.m25416a().reportCustomErr(str, "INNER", th);
            }
        }
    }

    /* renamed from: a */
    public static void m25013a(String str, String str2, Map<String, String> map) {
        if (C13933m.f33942g.isEnsureEnable()) {
            C13911h.m25182a((Object) null, (Throwable) null, Thread.currentThread().getStackTrace(), 5, str, true, map, Thread.currentThread(), str2, "core_exception_monitor");
        }
    }
}

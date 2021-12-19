package com.bytedance.crash.p932j;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.runtime.C13994b;
import com.bytedance.crash.runtime.C14005e;
import com.bytedance.crash.runtime.C14019n;
import com.bytedance.crash.util.C14056j;
import com.bytedance.crash.util.C14069r;
import java.io.File;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.bytedance.crash.j.m */
public final class C13924m {

    /* renamed from: a */
    static boolean f33922a;

    /* renamed from: b */
    public static Map<String, String> f33923b;

    /* renamed from: c */
    private static File f33924c;

    /* renamed from: d */
    private static boolean f33925d;

    /* renamed from: e */
    private static final Runnable f33926e = new Runnable() {
        /* class com.bytedance.crash.p932j.C13924m.RunnableC139251 */

        static {
            Covode.recordClassIndex(15985);
        }

        public final void run() {
            C14019n.m25421b().f34199d.removeCallbacks(this);
            if (C13924m.m25208a((String) null)) {
                C13888a.m25120a();
            }
        }
    };

    static {
        Covode.recordClassIndex(15984);
    }

    /* renamed from: b */
    public static File m25209b() {
        if (f33924c == null) {
            f33924c = new File(C14069r.m25642j(C13933m.f33936a), "npth/configCrash/configInvalid");
        }
        return f33924c;
    }

    /* renamed from: a */
    public static void m25206a() {
        if (!f33922a) {
            f33925d = true;
            File file = new File(C14069r.m25642j(C13933m.f33936a), "npth/configCrash/configFile");
            if (file.exists()) {
                try {
                    C13994b.m25333a(new JSONArray(C14056j.m25557a(file, "\n")), false);
                    f33922a = true;
                } catch (Throwable unused) {
                    C13994b.m25333a((JSONArray) null, false);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m25207a(long j) {
        C14019n.m25421b().mo22552a(f33926e, j);
    }

    /* renamed from: a */
    public static boolean m25208a(String str) {
        File b = m25209b();
        try {
            Map<String, String> map = f33923b;
            if (map == null) {
                map = C14056j.m25580c(b);
            }
            f33923b = map;
            return C14005e.m25385a(map, str);
        } catch (Throwable unused) {
            C13933m.f33942g.isDebugMode();
            return true;
        }
    }
}

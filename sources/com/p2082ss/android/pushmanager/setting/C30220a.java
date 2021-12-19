package com.p2082ss.android.pushmanager.setting;

import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.message.C30061a;
import com.p2082ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.pushmanager.setting.a */
public class C30220a {

    /* renamed from: b */
    private static C30220a f72079b;

    /* renamed from: a */
    public PushMultiProcessSharedProvider.C30219b f72080a = PushMultiProcessSharedProvider.m61123a(C30061a.f71748a);

    static {
        Covode.recordClassIndex(36727);
    }

    private C30220a() {
    }

    /* renamed from: c */
    private String m61145c() {
        return this.f72080a.mo53661a("ssids", "");
    }

    /* renamed from: b */
    public final String mo53665b() {
        HashMap hashMap = new HashMap();
        mo53664a(hashMap);
        return hashMap.get("device_id");
    }

    /* renamed from: a */
    public static synchronized C30220a m61144a() {
        C30220a aVar;
        synchronized (C30220a.class) {
            MethodCollector.m26663i(3132);
            if (f72079b == null) {
                synchronized (C30220a.class) {
                    try {
                        if (f72079b == null) {
                            f72079b = new C30220a();
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(3132);
                        throw th;
                    }
                }
            }
            aVar = f72079b;
            MethodCollector.m26664o(3132);
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo53664a(Map<String, String> map) {
        Logger.debug();
        try {
            String c = m61145c();
            if (!C13627m.m24498a(c)) {
                C13627m.m24497a(c, map);
            }
        } catch (Exception unused) {
        }
    }
}

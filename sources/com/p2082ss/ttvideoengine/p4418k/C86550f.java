package com.p2082ss.ttvideoengine.p4418k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.k.f */
public class C86550f {

    /* renamed from: a */
    static int f195001a = -1;

    /* renamed from: b */
    static String f195002b;

    /* renamed from: d */
    private static C86550f f195003d;

    /* renamed from: c */
    ConcurrentHashMap<String, C86551a> f195004c = new ConcurrentHashMap<>();

    /* renamed from: com.ss.ttvideoengine.k.f$a */
    static class C86551a {

        /* renamed from: a */
        public JSONObject f195005a;

        /* renamed from: b */
        public long f195006b;

        static {
            Covode.recordClassIndex(101779);
        }

        C86551a() {
        }
    }

    static {
        Covode.recordClassIndex(101778);
    }

    private C86550f() {
    }

    /* renamed from: a */
    public static C86550f m149805a() {
        MethodCollector.m26663i(2401);
        if (f195003d == null) {
            synchronized (C86550f.class) {
                try {
                    if (f195003d == null) {
                        f195003d = new C86550f();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2401);
                    throw th;
                }
            }
        }
        C86550f fVar = f195003d;
        MethodCollector.m26664o(2401);
        return fVar;
    }

    /* renamed from: a */
    public final void mo137814a(String str, C86551a aVar) {
        ConcurrentHashMap<String, C86551a> concurrentHashMap = this.f195004c;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, aVar);
        }
    }
}

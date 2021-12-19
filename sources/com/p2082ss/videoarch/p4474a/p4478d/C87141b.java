package com.p2082ss.videoarch.p4474a.p4478d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.videoarch.a.d.b */
public class C87141b {

    /* renamed from: a */
    static int f196937a = -1;

    /* renamed from: b */
    static String f196938b;

    /* renamed from: c */
    private static C87141b f196939c;

    /* renamed from: d */
    private ConcurrentHashMap<String, C87142a> f196940d = new ConcurrentHashMap<>();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.videoarch.a.d.b$a */
    public static class C87142a {

        /* renamed from: a */
        public String f196941a;

        /* renamed from: b */
        public long f196942b;

        /* renamed from: c */
        public boolean f196943c;

        static {
            Covode.recordClassIndex(102943);
        }

        C87142a() {
        }
    }

    /* renamed from: b */
    public final void mo140951b() {
        ConcurrentHashMap<String, C87142a> concurrentHashMap = this.f196940d;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
    }

    static {
        Covode.recordClassIndex(102942);
    }

    private C87141b() {
    }

    /* renamed from: a */
    public static C87141b m151020a() {
        MethodCollector.m26663i(2569);
        if (f196939c == null) {
            synchronized (C87141b.class) {
                try {
                    if (f196939c == null) {
                        f196939c = new C87141b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2569);
                    throw th;
                }
            }
        }
        C87141b bVar = f196939c;
        MethodCollector.m26664o(2569);
        return bVar;
    }

    /* renamed from: a */
    public final C87142a mo140949a(String str) {
        ConcurrentHashMap<String, C87142a> concurrentHashMap = this.f196940d;
        if (concurrentHashMap != null) {
            return concurrentHashMap.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo140952b(String str) {
        ConcurrentHashMap<String, C87142a> concurrentHashMap;
        C87142a aVar;
        if (str != null && (concurrentHashMap = this.f196940d) != null && (aVar = concurrentHashMap.get(str)) != null) {
            aVar.f196943c = true;
        }
    }

    /* renamed from: a */
    public final void mo140950a(String str, C87142a aVar) {
        ConcurrentHashMap<String, C87142a> concurrentHashMap = this.f196940d;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, aVar);
        }
    }
}

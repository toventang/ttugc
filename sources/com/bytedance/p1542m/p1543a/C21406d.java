package com.bytedance.p1542m.p1543a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.m.a.d */
public class C21406d {

    /* renamed from: c */
    private static volatile C21406d f50783c;

    /* renamed from: a */
    final Map<String, String> f50784a = new HashMap();

    /* renamed from: b */
    final Map<String, String> f50785b = new HashMap();

    static {
        Covode.recordClassIndex(25026);
    }

    private C21406d() {
    }

    /* renamed from: a */
    public static C21406d m40180a() {
        MethodCollector.m26663i(9498);
        if (f50783c == null) {
            synchronized (C21406d.class) {
                try {
                    if (f50783c == null) {
                        f50783c = new C21406d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9498);
                    throw th;
                }
            }
        }
        C21406d dVar = f50783c;
        MethodCollector.m26664o(9498);
        return dVar;
    }

    /* renamed from: a */
    public final String mo35010a(String str) {
        String str2 = this.f50784a.get(str);
        if (str2 == null) {
            return str;
        }
        return str2;
    }
}

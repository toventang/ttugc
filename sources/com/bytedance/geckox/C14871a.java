package com.bytedance.geckox;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.bytedance.geckox.a */
public class C14871a {

    /* renamed from: h */
    private static volatile C14871a f36321h;

    /* renamed from: a */
    public boolean f36322a;

    /* renamed from: b */
    public int f36323b = 7;

    /* renamed from: c */
    public int f36324c;

    /* renamed from: d */
    public Map<String, ArrayList<String>> f36325d;

    /* renamed from: e */
    public int f36326e = -1;

    /* renamed from: f */
    public int f36327f = -1;

    /* renamed from: g */
    public int f36328g;

    static {
        Covode.recordClassIndex(16982);
    }

    private C14871a() {
    }

    /* renamed from: a */
    public static C14871a m27298a() {
        MethodCollector.m26663i(5999);
        if (f36321h == null) {
            synchronized (C14871a.class) {
                try {
                    if (f36321h == null) {
                        f36321h = new C14871a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5999);
                    throw th;
                }
            }
        }
        C14871a aVar = f36321h;
        MethodCollector.m26664o(5999);
        return aVar;
    }
}

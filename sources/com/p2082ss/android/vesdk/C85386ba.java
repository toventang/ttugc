package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.vesdk.ba */
public class C85386ba {

    /* renamed from: a */
    public static float[] f191125a = {0.0f, 0.0f, 0.0f, 0.0f};

    /* renamed from: f */
    private static volatile C85386ba f191126f;

    /* renamed from: g */
    private static float[] f191127g = {-2.0f, -2.0f};

    /* renamed from: b */
    public double f191128b;

    /* renamed from: c */
    public float[] f191129c = f191125a;

    /* renamed from: d */
    public float[] f191130d = f191127g;

    /* renamed from: e */
    public boolean f191131e;

    private C85386ba() {
    }

    static {
        Covode.recordClassIndex(99498);
    }

    /* renamed from: a */
    public static C85386ba m146900a() {
        MethodCollector.m26663i(6519);
        if (f191126f == null) {
            synchronized (C85386ba.class) {
                try {
                    if (f191126f == null) {
                        f191126f = new C85386ba();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6519);
                    throw th;
                }
            }
        }
        C85386ba baVar = f191126f;
        MethodCollector.m26664o(6519);
        return baVar;
    }
}

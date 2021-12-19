package com.p2082ss.android.ugc.aweme.power;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.power.d */
public class C63304d {

    /* renamed from: c */
    private static C63304d f143684c;

    /* renamed from: e */
    private static CopyOnWriteArrayList<AbstractC63302b> f143685e = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public boolean f143686a;

    /* renamed from: b */
    public boolean f143687b = true;

    /* renamed from: d */
    private int f143688d = 6;

    static {
        Covode.recordClassIndex(74582);
    }

    /* renamed from: b */
    public final void mo101878b() {
        if (!this.f143686a) {
            m114805d();
        }
    }

    /* renamed from: c */
    public final void mo101879c() {
        if (this.f143686a) {
            m114806e();
        }
    }

    C63304d() {
        C63303c a = C63303c.m114800a();
        if (a != null && !f143685e.contains(a)) {
            f143685e.add(a);
        }
        C63300a.m114796a();
    }

    /* renamed from: a */
    public static C63304d m114803a() {
        MethodCollector.m26663i(12684);
        if (f143684c == null) {
            synchronized (C63304d.class) {
                try {
                    if (f143684c == null) {
                        f143684c = new C63304d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12684);
                    throw th;
                }
            }
        }
        C63304d dVar = f143684c;
        MethodCollector.m26664o(12684);
        return dVar;
    }

    /* renamed from: d */
    private void m114805d() {
        MethodCollector.m26663i(12802);
        synchronized (C63304d.class) {
            try {
                if (!this.f143686a) {
                    this.f143686a = true;
                    m114804a(2);
                    MethodCollector.m26664o(12802);
                }
            } finally {
                MethodCollector.m26664o(12802);
            }
        }
    }

    /* renamed from: e */
    private void m114806e() {
        MethodCollector.m26663i(12803);
        synchronized (C63304d.class) {
            try {
                if (this.f143686a) {
                    this.f143686a = false;
                    m114804a(0);
                    MethodCollector.m26664o(12803);
                }
            } finally {
                MethodCollector.m26664o(12803);
            }
        }
    }

    /* renamed from: a */
    private static void m114804a(int i) {
        Iterator<AbstractC63302b> it = f143685e.iterator();
        while (it.hasNext()) {
            it.next().mo101876a(i);
        }
    }
}

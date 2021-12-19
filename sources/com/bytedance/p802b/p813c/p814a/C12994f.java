package com.bytedance.p802b.p813c.p814a;

import com.bytedance.apm.p789q.C12576b;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p813c.p814a.C12981a;
import com.bytedance.p802b.p830h.C13092a;
import com.bytedance.p802b.p841k.p845d.AbstractRunnableC13123a;
import com.bytedance.p802b.p841k.p845d.C13124b;
import com.bytedance.p802b.p841k.p845d.EnumC13126c;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.b.c.a.f */
public final class C12994f {

    /* renamed from: a */
    public static List<C12992e> f31655a = new LinkedList();

    /* renamed from: b */
    public static volatile boolean f31656b = false;

    /* renamed from: c */
    private static Map<String, C12996a> f31657c = new HashMap();

    /* renamed from: com.bytedance.b.c.a.f$a */
    static class C12996a {

        /* renamed from: a */
        public long f31662a;

        /* renamed from: b */
        public long f31663b;

        /* renamed from: c */
        public long f31664c;

        static {
            Covode.recordClassIndex(14832);
        }

        private C12996a() {
        }

        /* synthetic */ C12996a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(14830);
    }

    /* renamed from: a */
    public static synchronized void m23321a() {
        synchronized (C12994f.class) {
            f31656b = true;
            if (!f31655a.isEmpty()) {
                for (C12992e eVar : f31655a) {
                    C13092a.m23544a(eVar);
                }
                f31655a.clear();
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m23322a(String str) {
        synchronized (C12994f.class) {
            C12996a aVar = new C12996a((byte) 0);
            aVar.f31662a = System.currentTimeMillis();
            aVar.f31663b = C12576b.m22636c();
            aVar.f31664c = C12576b.m22633b();
            f31657c.put(str, aVar);
        }
    }

    /* renamed from: b */
    public static synchronized void m23323b(String str) {
        synchronized (C12994f.class) {
            C12996a aVar = f31657c.get(str);
            if (aVar != null) {
                if (aVar.f31663b >= 0 || aVar.f31664c >= 0) {
                    long c = C12576b.m22636c();
                    long b = C12576b.m22633b();
                    double d = -1.0d;
                    if (b - aVar.f31664c > 0) {
                        double d2 = (double) c;
                        double d3 = (double) aVar.f31663b;
                        Double.isNaN(d2);
                        Double.isNaN(d3);
                        double d4 = d2 - d3;
                        double d5 = (double) (b - aVar.f31664c);
                        Double.isNaN(d5);
                        d = d4 / d5;
                    }
                    double d6 = (double) c;
                    double d7 = (double) aVar.f31663b;
                    Double.isNaN(d6);
                    Double.isNaN(d7);
                    double currentTimeMillis = (double) (System.currentTimeMillis() - aVar.f31662a);
                    Double.isNaN(currentTimeMillis);
                    double d8 = ((d6 - d7) * 1000.0d) / currentTimeMillis;
                    double g = (double) C12576b.m22640g();
                    Double.isNaN(g);
                    f31657c.remove(str);
                    C13124b.m23597a(EnumC13126c.LIGHT_WEIGHT).mo20943a(new AbstractRunnableC13123a(false, str, d, d8 / g) {
                        /* class com.bytedance.p802b.p813c.p814a.C12994f.C129951 */

                        /* renamed from: a */
                        final /* synthetic */ boolean f31658a = false;

                        /* renamed from: b */
                        final /* synthetic */ String f31659b;

                        /* renamed from: c */
                        final /* synthetic */ double f31660c;

                        /* renamed from: d */
                        final /* synthetic */ double f31661d;

                        static {
                            Covode.recordClassIndex(14831);
                        }

                        public final void run() {
                            C12981a.EnumC12982a aVar;
                            if (!this.f31658a) {
                                aVar = C12981a.EnumC12982a.FRONT;
                            } else {
                                aVar = C12981a.EnumC12982a.BACK;
                            }
                            C12992e eVar = new C12992e(aVar, this.f31659b, this.f31660c, 0.0d, this.f31661d, 0.0d, null);
                            eVar.f31644a = false;
                            if (C12994f.f31656b) {
                                C13092a.m23544a(eVar);
                            } else {
                                C12994f.f31655a.add(eVar);
                            }
                        }

                        {
                            this.f31659b = r3;
                            this.f31660c = r4;
                            this.f31661d = r6;
                        }
                    });
                }
            }
        }
    }
}

package com.p2082ss.ttvideoengine.p4421n.p4423b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.p4417j.AbstractC86516d;
import com.p2082ss.ttvideoengine.p4417j.AbstractC86517e;
import com.p2082ss.ttvideoengine.p4421n.AbstractC86589c;
import com.p2082ss.ttvideoengine.p4421n.C86578b;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.ttvideoengine.n.b.i */
public final class C86587i implements AbstractC86589c {

    /* renamed from: a */
    protected final AbstractC86583e f195093a;

    /* renamed from: b */
    protected List<? extends AbstractC86584f> f195094b;

    /* renamed from: c */
    protected List<? extends AbstractC86582d> f195095c;

    /* renamed from: d */
    protected AbstractC86581c f195096d;

    /* renamed from: e */
    private C86585g[] f195097e;

    static {
        Covode.recordClassIndex(101815);
    }

    /* renamed from: com.ss.ttvideoengine.n.b.i$a */
    public static class C86588a {

        /* renamed from: a */
        public double f195098a;

        static {
            Covode.recordClassIndex(101816);
        }

        /* renamed from: a */
        public final Map<Integer, Object> mo137856a() {
            HashMap hashMap = new HashMap();
            hashMap.put(1, Double.valueOf(this.f195098a));
            return hashMap;
        }
    }

    public C86587i(AbstractC86586h hVar) {
        if (hVar != null) {
            this.f195093a = hVar.mo137852a();
            this.f195094b = hVar.mo137855d();
            this.f195095c = hVar.mo137854c();
            this.f195096d = hVar.mo137853b();
        } else {
            this.f195093a = null;
        }
        m149973b(this.f195094b);
    }

    /* renamed from: b */
    private void m149973b(List<? extends AbstractC86584f> list) {
        if (!(list == null || list.isEmpty())) {
            this.f195097e = new C86585g[list.size()];
            for (int i = 0; i < list.size(); i++) {
                AbstractC86584f fVar = (AbstractC86584f) list.get(i);
                double c = (double) fVar.mo137847c();
                double b = (double) fVar.mo137846b();
                Double.isNaN(b);
                double a = (double) fVar.mo137845a();
                Double.isNaN(a);
                this.f195097e[i] = new C86585g(c, b * 8000.0d, 8000.0d * a);
            }
        }
    }

    /* renamed from: a */
    private <T extends AbstractC86516d> List<T> m149971a(List<T> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (this.f195093a != null && !list.isEmpty()) {
            Pair<Double, Double> d = this.f195093a.mo137844d();
            Set<String> b = this.f195093a.mo137842b();
            if (d == null || this.f195093a.mo137843c() <= 0.0d) {
                z = false;
            } else {
                z = true;
            }
            for (T t : list) {
                if (z) {
                    double a = (double) t.mo137724a(3);
                    if (a >= ((Double) d.first).doubleValue() && a <= ((Double) d.second).doubleValue()) {
                        arrayList.add(t);
                    }
                } else if (b != null && b.contains(t.mo137726b(7))) {
                    arrayList.add(t);
                }
            }
            if (arrayList.isEmpty()) {
                if (z) {
                    T t2 = null;
                    for (T t3 : list) {
                        if (t2 != null) {
                            double a2 = (double) t3.mo137724a(3);
                            double c = this.f195093a.mo137843c();
                            Double.isNaN(a2);
                            double abs = Math.abs(a2 - c);
                            double a3 = (double) t2.mo137724a(3);
                            double c2 = this.f195093a.mo137843c();
                            Double.isNaN(a3);
                            if (abs >= Math.abs(a3 - c2)) {
                            }
                        }
                        t2 = t3;
                    }
                    arrayList.add(t2);
                } else {
                    arrayList.add(list.get(0));
                }
            }
        }
        return arrayList;
    }

    @Override // com.p2082ss.ttvideoengine.p4421n.AbstractC86589c
    /* renamed from: a */
    public final C86578b mo137832a(AbstractC86517e eVar, Map<Integer, Object> map) {
        if (eVar == null) {
            return new C86578b(new C86633c("kTTVideoSelector", -7999, "null video model"));
        }
        return m149970a(eVar.mo137745b(), map);
    }

    /* renamed from: a */
    private static <T extends AbstractC86516d> T m149969a(double d, List<T> list) {
        T t = null;
        if (list != null) {
            for (T t2 : list) {
                if (t != null) {
                    if (((double) t.mo137724a(3)) > d) {
                        if (t2.mo137724a(3) >= t.mo137724a(3)) {
                        }
                    } else if (d >= ((double) t2.mo137724a(3))) {
                        if (t2.mo137724a(3) < t.mo137724a(3)) {
                        }
                    }
                }
                t = t2;
            }
        }
        return t;
    }

    /* renamed from: b */
    private static <T extends AbstractC86516d> T m149972b(double d, List<T> list) {
        T t = null;
        if (list != null) {
            for (T t2 : list) {
                if (t != null) {
                    double a = (double) t2.mo137724a(3);
                    Double.isNaN(a);
                    double abs = Math.abs(a - d);
                    double a2 = (double) t.mo137724a(3);
                    Double.isNaN(a2);
                    if (abs >= Math.abs(a2 - d)) {
                    }
                }
                t = t2;
            }
        }
        return t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c4, code lost:
        if (r0 == null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a2, code lost:
        if (r0 == null) goto L_0x01bb;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.p2082ss.ttvideoengine.p4421n.C86578b m149970a(java.util.List<? extends com.p2082ss.ttvideoengine.p4417j.AbstractC86516d> r18, java.util.Map<java.lang.Integer, java.lang.Object> r19) {
        /*
        // Method dump skipped, instructions count: 461
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.p4421n.p4423b.C86587i.m149970a(java.util.List, java.util.Map):com.ss.ttvideoengine.n.b");
    }
}

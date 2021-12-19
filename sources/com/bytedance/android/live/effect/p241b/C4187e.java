package com.bytedance.android.live.effect.p241b;

import com.bytedance.android.live.effect.model.p246a.C4310a;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.b.e */
public final class C4187e {

    /* renamed from: a */
    public static final C4187e f11651a = new C4187e();

    /* renamed from: a */
    public static final int m10265a(int i, int i2, float f) {
        if (f == 0.0f) {
            return 0;
        }
        return (int) ((f * 10000.0f) / ((float) (i - i2)));
    }

    private C4187e() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        r0 = "";
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] m10270a(java.util.Map<java.lang.String, java.util.List<com.bytedance.android.livesdkapi.depend.model.C11672a>> r11, java.lang.String[] r12) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.p241b.C4187e.m10270a(java.util.Map, java.lang.String[]):java.lang.String[]");
    }

    static {
        Covode.recordClassIndex(4757);
    }

    /* renamed from: c */
    public static List<C4310a> m10272c(List<C4310a> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (arrayList.size() > 1) {
            C89070n.m154530a((List) arrayList, (Comparator) new C4191d());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C4310a) obj).f11854h) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* renamed from: b */
    public static List<C4310a> m10271b(List<C4310a> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (arrayList.size() > 1) {
            C89070n.m154530a((List) arrayList, (Comparator) new C4188a());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C4310a aVar = (C4310a) obj;
            if (aVar.f11854h) {
                long j = aVar.f11851e;
                C6805b<Long> bVar = AbstractC6804a.f17022cR;
                C89219l.m154716b(bVar, "");
                Long a = bVar.mo13066a();
                C89219l.m154716b(a, "");
                if (j >= a.longValue()) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    public static List<C4310a> m10268a(List<C4310a> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (arrayList.size() > 1) {
            C89070n.m154530a((List) arrayList, (Comparator) new C4189b());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C4310a aVar = (C4310a) obj;
            if (aVar.f11854h) {
                long j = aVar.f11851e;
                C6805b<Long> bVar = AbstractC6804a.f17022cR;
                C89219l.m154716b(bVar, "");
                Long a = bVar.mo13066a();
                C89219l.m154716b(a, "");
                if (j < a.longValue()) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    public static final float m10264a(C11672a aVar, int i) {
        C89219l.m154721d(aVar, "");
        return m10263a(aVar.mo18439a(), i);
    }

    /* renamed from: com.bytedance.android.live.effect.b.e$a */
    public static final class C4188a<T> implements Comparator {
        static {
            Covode.recordClassIndex(4758);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Long.valueOf(t.f11851e), Long.valueOf(t2.f11851e));
        }
    }

    /* renamed from: com.bytedance.android.live.effect.b.e$b */
    public static final class C4189b<T> implements Comparator {
        static {
            Covode.recordClassIndex(4759);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Long.valueOf(t.f11851e), Long.valueOf(t2.f11851e));
        }
    }

    /* renamed from: com.bytedance.android.live.effect.b.e$c */
    public static final class C4190c<T> implements Comparator {
        static {
            Covode.recordClassIndex(4760);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Long.valueOf(t.f11851e), Long.valueOf(t2.f11851e));
        }
    }

    /* renamed from: com.bytedance.android.live.effect.b.e$d */
    public static final class C4191d<T> implements Comparator {
        static {
            Covode.recordClassIndex(4761);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Long.valueOf(t.f11851e), Long.valueOf(t2.f11851e));
        }
    }

    /* renamed from: a */
    public static final float m10263a(C11672a.C11674b bVar, int i) {
        int i2;
        double d;
        double d2;
        double d3;
        if (i == 0) {
            return 0.0f;
        }
        int i3 = 100;
        boolean z = false;
        if (bVar != null) {
            i3 = bVar.f27922d;
            i2 = bVar.f27923e;
            if (i2 < 0) {
                z = true;
            }
        } else {
            i2 = 0;
        }
        if (z) {
            if (i > 0) {
                double d4 = (double) i3;
                Double.isNaN(d4);
                d2 = (d4 * 1.0d) / 5000.0d;
                d3 = (double) i;
                Double.isNaN(d3);
            } else {
                double d5 = (double) i2;
                Double.isNaN(d5);
                d2 = (d5 * 1.0d) / -5000.0d;
                d3 = (double) i;
                Double.isNaN(d3);
            }
            d = d2 * d3 * 2.0d;
        } else {
            double d6 = (double) (i3 - i2);
            Double.isNaN(d6);
            double d7 = (double) i;
            Double.isNaN(d7);
            d = ((d6 * 1.0d) / 10000.0d) * d7;
        }
        return (float) d;
    }

    /* renamed from: a */
    public static final int m10266a(C11672a.C11674b bVar, float f) {
        int i;
        float f2;
        float f3;
        if (f == 0.0f) {
            return 0;
        }
        int i2 = 100;
        if (bVar != null) {
            i2 = bVar.f27922d;
            i = bVar.f27923e;
            if (i < 0) {
                if (f > 0.0f) {
                    f3 = (float) (5000 / i2);
                } else {
                    f3 = (float) (-5000 / i);
                }
                f2 = (f * f3) / 2.0f;
            }
            f2 = (f * 10000.0f) / ((float) (i2 - i));
        } else {
            i = 0;
            f2 = (f * 10000.0f) / ((float) (i2 - i));
        }
        return (int) f2;
    }

    /* renamed from: a */
    public static final int m10267a(C11672a aVar, float f) {
        C89219l.m154721d(aVar, "");
        return m10266a(aVar.mo18439a(), f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ef A[EDGE_INSN: B:48:0x00ef->B:35:0x00ef ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] m10269a(java.util.List<com.bytedance.android.live.effect.model.p246a.C4310a> r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 270
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.p241b.C4187e.m10269a(java.util.List, boolean):java.lang.String[]");
    }

    /* renamed from: a */
    public static final float m10262a(int i, int i2, int i3) {
        if (i3 == 0) {
            return 0.0f;
        }
        double d = (double) (i - i2);
        Double.isNaN(d);
        double d2 = (double) i3;
        Double.isNaN(d2);
        return (float) (((d * 1.0d) / 10000.0d) * d2);
    }
}

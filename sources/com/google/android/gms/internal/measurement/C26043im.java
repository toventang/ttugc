package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.im */
final class C26043im {

    /* renamed from: a */
    static final Class<?> f61345a = m50844a();

    /* renamed from: b */
    static final AbstractC26059jb<?, ?> f61346b = m50843a(false);

    /* renamed from: c */
    static final AbstractC26059jb<?, ?> f61347c = m50843a(true);

    /* renamed from: d */
    static final AbstractC26059jb<?, ?> f61348d = new C26061jd();

    /* renamed from: a */
    public static void m50849a(int i, List<Double> list, AbstractC26081jt jtVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jtVar.mo42561g(i, list, z);
        }
    }

    /* renamed from: a */
    public static void m50847a(int i, List<String> list, AbstractC26081jt jtVar) {
        if (list != null && !list.isEmpty()) {
            jtVar.mo42539a(i, list);
        }
    }

    /* renamed from: a */
    public static void m50848a(int i, List<?> list, AbstractC26081jt jtVar, AbstractC26041ik ikVar) {
        if (list != null && !list.isEmpty()) {
            jtVar.mo42540a(i, list, ikVar);
        }
    }

    /* renamed from: a */
    static boolean m50852a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: a */
    static <T, FT extends AbstractC25972ga<FT>> void m50850a(AbstractC25968fx<FT> fxVar, T t, T t2) {
        C25969fy<FT> a = fxVar.mo42579a((Object) t2);
        if (!a.f61159a.isEmpty()) {
            fxVar.mo42583b((Object) t).mo42589a(a);
        }
    }

    /* renamed from: a */
    static <T, UT, UB> void m50851a(AbstractC26059jb<UT, UB> jbVar, T t, T t2) {
        jbVar.mo42764a(t, jbVar.mo42771c(jbVar.mo42766b(t), jbVar.mo42766b(t2)));
    }

    /* renamed from: a */
    private static Class<?> m50844a() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Class<?> m50856b() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(31458);
    }

    /* renamed from: h */
    static int m50876h(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: i */
    static int m50879i(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: c */
    static int m50861c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C26007hd) {
            C26007hd hdVar = (C26007hd) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC25958fq.m50378d(AbstractC25958fq.m50381e(hdVar.mo42639b(i2)));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC25958fq.m50378d(AbstractC25958fq.m50381e(list.get(i2).longValue()));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: d */
    static int m50864d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C25987gk) {
            C25987gk gkVar = (C25987gk) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC25958fq.m50393l(gkVar.mo42632c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC25958fq.m50393l(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    static int m50867e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C25987gk) {
            C25987gk gkVar = (C25987gk) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC25958fq.m50393l(gkVar.mo42632c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC25958fq.m50393l(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    static int m50870f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C25987gk) {
            C25987gk gkVar = (C25987gk) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC25958fq.m50394m(gkVar.mo42632c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC25958fq.m50394m(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g */
    static int m50873g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C25987gk) {
            C25987gk gkVar = (C25987gk) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC25958fq.m50394m(AbstractC25958fq.m50395n(gkVar.mo42632c(i2)));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC25958fq.m50394m(AbstractC25958fq.m50395n(list.get(i2).intValue()));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    static int m50855b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C26007hd) {
            C26007hd hdVar = (C26007hd) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC25958fq.m50378d(hdVar.mo42639b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC25958fq.m50378d(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    static int m50842a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C26007hd) {
            C26007hd hdVar = (C26007hd) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC25958fq.m50378d(hdVar.mo42639b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC25958fq.m50378d(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    private static AbstractC26059jb<?, ?> m50843a(boolean z) {
        try {
            Class<?> b = m50856b();
            if (b == null) {
                return null;
            }
            return (AbstractC26059jb) b.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: h */
    static int m50875h(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * AbstractC25958fq.m50379e(i);
    }

    /* renamed from: i */
    static int m50878i(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * AbstractC25958fq.m50385g(i);
    }

    /* renamed from: j */
    static int m50881j(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * AbstractC25958fq.m50392k(i);
    }

    /* renamed from: b */
    static int m50853b(int i, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m50855b(list) + (size * AbstractC25958fq.m50394m(i << 3));
    }

    /* renamed from: c */
    static int m50860c(int i, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m50861c(list) + (size * AbstractC25958fq.m50394m(i << 3));
    }

    /* renamed from: d */
    static int m50863d(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m50864d(list) + (size * AbstractC25958fq.m50394m(i << 3));
    }

    /* renamed from: e */
    static int m50866e(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m50867e(list) + (size * AbstractC25958fq.m50394m(i << 3));
    }

    /* renamed from: f */
    static int m50869f(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m50870f(list) + (size * AbstractC25958fq.m50394m(i << 3));
    }

    /* renamed from: g */
    static int m50872g(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m50873g(list) + (size * AbstractC25958fq.m50394m(i << 3));
    }

    /* renamed from: a */
    static int m50840a(int i, List<Long> list) {
        if (list.size() == 0) {
            return 0;
        }
        return m50842a(list) + (list.size() * AbstractC25958fq.m50394m(i << 3));
    }

    /* renamed from: l */
    static int m50885l(int i, List<AbstractC25943fb> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = size * AbstractC25958fq.m50394m(i << 3);
        for (int i2 = 0; i2 < list.size(); i2++) {
            m += AbstractC25958fq.m50370b(list.get(i2));
        }
        return m;
    }

    /* renamed from: k */
    static int m50883k(int i, List<?> list) {
        int b;
        int b2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int m = AbstractC25958fq.m50394m(i << 3) * size;
        if (list instanceof AbstractC26005hb) {
            AbstractC26005hb hbVar = (AbstractC26005hb) list;
            while (i2 < size) {
                Object b3 = hbVar.mo42652b(i2);
                if (b3 instanceof AbstractC25943fb) {
                    b2 = AbstractC25958fq.m50370b((AbstractC25943fb) b3);
                } else {
                    b2 = AbstractC25958fq.m50372b((String) b3);
                }
                m += b2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AbstractC25943fb) {
                    b = AbstractC25958fq.m50370b((AbstractC25943fb) obj);
                } else {
                    b = AbstractC25958fq.m50372b((String) obj);
                }
                m += b;
                i2++;
            }
        }
        return m;
    }

    /* renamed from: a */
    static int m50839a(int i, Object obj, AbstractC26041ik ikVar) {
        if (obj instanceof C26002gz) {
            return AbstractC25958fq.m50364a(i, (C26002gz) obj);
        }
        return AbstractC25958fq.m50368b(i, (AbstractC26020hq) obj, ikVar);
    }

    /* renamed from: b */
    static int m50854b(int i, List<AbstractC26020hq> list, AbstractC26041ik ikVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += AbstractC25958fq.m50375c(i, list.get(i3), ikVar);
        }
        return i2;
    }

    /* renamed from: a */
    static int m50841a(int i, List<?> list, AbstractC26041ik ikVar) {
        int a;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = AbstractC25958fq.m50394m(i << 3) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C26002gz) {
                a = AbstractC25958fq.m50365a((C26002gz) obj);
            } else {
                a = AbstractC25958fq.m50366a((AbstractC26020hq) obj, ikVar);
            }
            m += a;
        }
        return m;
    }

    /* renamed from: b */
    public static void m50857b(int i, List<AbstractC25943fb> list, AbstractC26081jt jtVar) {
        if (list != null && !list.isEmpty()) {
            jtVar.mo42547b(i, list);
        }
    }

    /* renamed from: c */
    public static void m50862c(int i, List<Long> list, AbstractC26081jt jtVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jtVar.mo42552c(i, list, z);
        }
    }

    /* renamed from: d */
    public static void m50865d(int i, List<Long> list, AbstractC26081jt jtVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jtVar.mo42555d(i, list, z);
        }
    }

    /* renamed from: e */
    public static void m50868e(int i, List<Long> list, AbstractC26081jt jtVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jtVar.mo42568n(i, list, z);
        }
    }

    /* renamed from: f */
    public static void m50871f(int i, List<Long> list, AbstractC26081jt jtVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jtVar.mo42558e(i, list, z);
        }
    }

    /* renamed from: g */
    public static void m50874g(int i, List<Long> list, AbstractC26081jt jtVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jtVar.mo42566l(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m50884k(int i, List<Integer> list, AbstractC26081jt jtVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jtVar.mo42549b(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m50886l(int i, List<Integer> list, AbstractC26081jt jtVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jtVar.mo42565k(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m50887m(int i, List<Integer> list, AbstractC26081jt jtVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jtVar.mo42562h(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m50888n(int i, List<Boolean> list, AbstractC26081jt jtVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jtVar.mo42563i(i, list, z);
        }
    }

    /* renamed from: h */
    public static void m50877h(int i, List<Integer> list, AbstractC26081jt jtVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jtVar.mo42541a(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m50880i(int i, List<Integer> list, AbstractC26081jt jtVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jtVar.mo42564j(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m50882j(int i, List<Integer> list, AbstractC26081jt jtVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jtVar.mo42567m(i, list, z);
        }
    }

    /* renamed from: b */
    public static void m50858b(int i, List<?> list, AbstractC26081jt jtVar, AbstractC26041ik ikVar) {
        if (list != null && !list.isEmpty()) {
            jtVar.mo42548b(i, list, ikVar);
        }
    }

    /* renamed from: a */
    static <UT, UB> UB m50845a(int i, int i2, UB ub, AbstractC26059jb<UT, UB> jbVar) {
        if (ub == null) {
            ub = jbVar.mo42757a();
        }
        jbVar.mo42760a(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: b */
    public static void m50859b(int i, List<Float> list, AbstractC26081jt jtVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jtVar.mo42560f(i, list, z);
        }
    }

    /* renamed from: a */
    static <UT, UB> UB m50846a(int i, List<Integer> list, AbstractC25990gn gnVar, UB ub, AbstractC26059jb<UT, UB> jbVar) {
        if (gnVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (gnVar.mo42041a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) m50845a(i, intValue, ub, jbVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!gnVar.mo42041a(intValue2)) {
                    ub = (UB) m50845a(i, intValue2, ub, jbVar);
                    it.remove();
                }
            }
        }
        return ub;
    }
}

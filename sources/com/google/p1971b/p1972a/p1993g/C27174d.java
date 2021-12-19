package com.google.p1971b.p1972a.p1993g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1971b.p1972a.p1988f.p1989a.p1990a.p1991a.p1992a.C27159b;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.WeakHashMap;

/* renamed from: com.google.b.a.g.d */
public final class C27174d {

    /* renamed from: d */
    private static final Map<Class<?>, C27174d> f64325d = new WeakHashMap();

    /* renamed from: e */
    private static final Map<Class<?>, C27174d> f64326e = new WeakHashMap();

    /* renamed from: a */
    public final Class<?> f64327a;

    /* renamed from: b */
    public final boolean f64328b;

    /* renamed from: c */
    public final List<String> f64329c;

    /* renamed from: f */
    private final IdentityHashMap<String, C27184i> f64330f = new IdentityHashMap<>();

    static {
        Covode.recordClassIndex(32754);
    }

    /* renamed from: a */
    public final C27184i mo45245a(String str) {
        if (str != null) {
            if (this.f64328b) {
                str = str.toLowerCase();
            }
            str = str.intern();
        }
        return this.f64330f.get(str);
    }

    /* renamed from: a */
    public static C27174d m54007a(Class<?> cls, boolean z) {
        Map<Class<?>, C27174d> map;
        C27174d dVar;
        MethodCollector.m26663i(11954);
        if (cls == null) {
            MethodCollector.m26664o(11954);
            return null;
        }
        if (z) {
            map = f64326e;
        } else {
            map = f64325d;
        }
        synchronized (map) {
            try {
                dVar = map.get(cls);
                if (dVar == null) {
                    dVar = new C27174d(cls, z);
                    map.put(cls, dVar);
                }
            } finally {
                MethodCollector.m26664o(11954);
            }
        }
        return dVar;
    }

    private C27174d(Class<?> cls, boolean z) {
        boolean z2;
        List<String> unmodifiableList;
        boolean z3;
        String str;
        Field field;
        this.f64327a = cls;
        this.f64328b = z;
        if (!z || !cls.isEnum()) {
            z2 = true;
        } else {
            z2 = false;
        }
        String valueOf = String.valueOf(String.valueOf(cls));
        C27159b.m53984a(z2, new StringBuilder(valueOf.length() + 31).append("cannot ignore case on an enum: ").append(valueOf).toString());
        TreeSet treeSet = new TreeSet(new Comparator<String>() {
            /* class com.google.p1971b.p1972a.p1993g.C27174d.C271751 */

            static {
                Covode.recordClassIndex(32755);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(String str, String str2) {
                String str3 = str;
                String str4 = str2;
                if (str3 == str4) {
                    return 0;
                }
                if (str3 == null) {
                    return -1;
                }
                if (str4 == null) {
                    return 1;
                }
                return str3.compareTo(str4);
            }
        });
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field field2 : declaredFields) {
            C27184i a = C27184i.m54023a(field2);
            if (a != null) {
                String str2 = a.f64367c;
                str2 = z ? str2.toLowerCase().intern() : str2;
                C27184i iVar = this.f64330f.get(str2);
                if (iVar == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Object[] objArr = new Object[4];
                if (z) {
                    str = "case-insensitive ";
                } else {
                    str = "";
                }
                objArr[0] = str;
                objArr[1] = str2;
                objArr[2] = field2;
                if (iVar == null) {
                    field = null;
                } else {
                    field = iVar.f64366b;
                }
                objArr[3] = field;
                C27159b.m53985a(z3, "two fields have the same %sname <%s>: %s and %s", objArr);
                this.f64330f.put(str2, a);
                treeSet.add(str2);
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            C27174d a2 = m54007a(superclass, z);
            treeSet.addAll(a2.f64329c);
            for (Map.Entry<String, C27184i> entry : a2.f64330f.entrySet()) {
                String key = entry.getKey();
                if (!this.f64330f.containsKey(key)) {
                    this.f64330f.put(key, entry.getValue());
                }
            }
        }
        if (treeSet.isEmpty()) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(treeSet));
        }
        this.f64329c = unmodifiableList;
    }
}

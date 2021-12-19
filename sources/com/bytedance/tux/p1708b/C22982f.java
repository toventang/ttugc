package com.bytedance.tux.p1708b;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.b.f */
public final class C22982f {

    /* renamed from: a */
    public static boolean f54340a;

    /* renamed from: b */
    public static final C22982f f54341b = new C22982f();

    /* renamed from: c */
    private static final LinkedHashMap<Integer, C22972a> f54342c = new LinkedHashMap<>(8);

    private C22982f() {
    }

    static {
        Covode.recordClassIndex(26899);
    }

    /* renamed from: a */
    public final C22982f mo37295a(int i, AbstractC89172b<? super C22987j, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        f54342c.put(Integer.valueOf(i), new C22972a(bVar));
        return this;
    }

    /* renamed from: a */
    public static C22978b m43324a(int i, int i2) {
        Map<Integer, C22978b> a;
        if (f54340a) {
            C22972a aVar = f54342c.get(Integer.valueOf(i));
            if (aVar != null) {
                return aVar.mo37286a(i2);
            }
            return null;
        }
        C22972a aVar2 = f54342c.get(Integer.valueOf(i));
        if (aVar2 == null || (a = aVar2.mo37287a()) == null) {
            return null;
        }
        return a.get(Integer.valueOf(i2));
    }
}

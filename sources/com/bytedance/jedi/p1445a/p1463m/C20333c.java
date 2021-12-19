package com.bytedance.jedi.p1445a.p1463m;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1462l.AbstractC20318a;
import com.bytedance.jedi.p1445a.p1462l.AbstractC20319b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.a.m.c */
public final class C20333c {

    /* renamed from: a */
    public static final C20333c f48184a = new C20333c();

    /* renamed from: b */
    private static boolean f48185b;

    /* renamed from: c */
    private static final List<Object> f48186c = new ArrayList();

    /* renamed from: d */
    private static final AbstractC20332b f48187d = new C20334a();

    /* renamed from: com.bytedance.jedi.a.m.c$a */
    public static final class C20334a implements AbstractC20332b {
        static {
            Covode.recordClassIndex(23842);
        }

        C20334a() {
        }
    }

    private C20333c() {
    }

    static {
        Covode.recordClassIndex(23841);
    }

    /* renamed from: a */
    public static void m38517a(AbstractC20318a<?> aVar, AbstractC20319b<?> bVar) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(bVar, "");
        if (f48185b && bVar.mo33657b() != null) {
            Iterator<T> it = f48186c.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}

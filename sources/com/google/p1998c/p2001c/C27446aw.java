package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import java.io.Serializable;

/* renamed from: com.google.c.c.aw */
public final class C27446aw extends AbstractC27450az<Comparable> implements Serializable {

    /* renamed from: a */
    public static final C27446aw f64746a = new C27446aw();
    private static final long serialVersionUID = 0;

    public final String toString() {
        return "Ordering.natural()";
    }

    private C27446aw() {
    }

    private Object readResolve() {
        return f64746a;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27450az
    /* renamed from: a */
    public final <S extends Comparable> AbstractC27450az<S> mo45799a() {
        return C27466bg.f64798a;
    }

    static {
        Covode.recordClassIndex(33026);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.google.p1998c.p2001c.AbstractC27450az, java.util.Comparator
    public final /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
        Comparable comparable3 = comparable;
        C27245k.m54229a(comparable3);
        C27245k.m54229a(comparable2);
        return comparable3.compareTo(comparable2);
    }
}

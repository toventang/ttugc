package com.bytedance.retrofit2.p1613d.p1614a;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC22019c;
import com.bytedance.retrofit2.C22092q;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.C22101w;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.bytedance.retrofit2.d.a.h */
public final class C22042h extends AbstractC22019c.AbstractC22020a {

    /* renamed from: a */
    private final AbstractC88398aa f52069a = null;

    /* renamed from: b */
    private final boolean f52070b;

    static {
        Covode.recordClassIndex(25732);
    }

    /* renamed from: a */
    public static C22042h m41421a() {
        return new C22042h(false);
    }

    public C22042h(boolean z) {
        this.f52070b = z;
    }

    @Override // com.bytedance.retrofit2.AbstractC22019c.AbstractC22020a
    /* renamed from: a */
    public final AbstractC22019c<?> mo11589a(Type type, Annotation[] annotationArr, C22092q qVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        Class<?> a = C22101w.m41534a(type);
        if (a == AbstractC88410b.class) {
            return new C22041g(Void.class, this.f52069a, this.f52070b, false, true, false, false, false, true);
        }
        if (a == AbstractC88924h.class) {
            z = true;
        } else {
            z = false;
        }
        if (a == AbstractC88403ab.class) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (a == AbstractC88973n.class) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (a != AbstractC88979t.class && !z && !z2 && !z3) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (z) {
                str = "Flowable";
            } else if (z2) {
                str = "Single";
            } else if (z3) {
                str = "Maybe";
            } else {
                str = "Observable";
            }
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type a2 = C22101w.m41536a(0, (ParameterizedType) type);
        Class<?> a3 = C22101w.m41534a(a2);
        if (a3 == C22099u.class) {
            if (a2 instanceof ParameterizedType) {
                a2 = C22101w.m41536a(0, (ParameterizedType) a2);
                z4 = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (a3 != C22038e.class) {
            z4 = false;
            z5 = true;
            return new C22041g(a2, this.f52069a, this.f52070b, z4, z5, z, z2, z3, false);
        } else if (a2 instanceof ParameterizedType) {
            a2 = C22101w.m41536a(0, (ParameterizedType) a2);
            z4 = true;
        } else {
            throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
        }
        z5 = false;
        return new C22041g(a2, this.f52069a, this.f52070b, z4, z5, z, z2, z3, false);
    }
}

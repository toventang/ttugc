package com.google.p1998c.p2005g;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.google.c.g.e */
public abstract class AbstractC27568e<T> extends AbstractC27567d<T> {

    /* renamed from: a */
    final TypeVariable<?> f64935a;

    static {
        Covode.recordClassIndex(33148);
    }

    public final int hashCode() {
        return this.f64935a.hashCode();
    }

    public String toString() {
        return this.f64935a.toString();
    }

    protected AbstractC27568e() {
        Type a = mo46136a();
        C27245k.m54240a(a instanceof TypeVariable, "%s should be a type variable.", a);
        this.f64935a = (TypeVariable) a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC27568e) {
            return this.f64935a.equals(((AbstractC27568e) obj).f64935a);
        }
        return false;
    }
}

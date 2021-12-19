package com.google.p1998c.p2005g;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.c.g.h */
public abstract class AbstractC27596h {

    /* renamed from: a */
    private final Set<Type> f64973a = new HashSet();

    static {
        Covode.recordClassIndex(33176);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo46143a(Class<?> cls) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo46144a(GenericArrayType genericArrayType) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo46145a(ParameterizedType parameterizedType) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo46146a(TypeVariable<?> typeVariable) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo46147a(WildcardType wildcardType) {
    }

    AbstractC27596h() {
    }

    /* renamed from: a */
    public final void mo46193a(Type... typeArr) {
        for (Type type : typeArr) {
            if (type != null && this.f64973a.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        mo46146a((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        mo46147a((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        mo46145a((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        mo46143a((Class) type);
                    } else if (type instanceof GenericArrayType) {
                        mo46144a((GenericArrayType) type);
                    } else {
                        throw new AssertionError("Unknown type: ".concat(String.valueOf(type)));
                    }
                } catch (Throwable th) {
                    this.f64973a.remove(type);
                    throw th;
                }
            }
        }
    }
}

package com.google.p1998c.p2005g;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;

/* access modifiers changed from: package-private */
/* renamed from: com.google.c.g.a */
public class C27562a extends AccessibleObject implements Member {

    /* renamed from: a */
    private final AccessibleObject f64931a;

    /* renamed from: b */
    private final Member f64932b;

    static {
        Covode.recordClassIndex(33142);
    }

    public final Annotation[] getAnnotations() {
        return this.f64931a.getAnnotations();
    }

    public final Annotation[] getDeclaredAnnotations() {
        return this.f64931a.getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.Member
    public Class<?> getDeclaringClass() {
        return this.f64932b.getDeclaringClass();
    }

    public final int getModifiers() {
        return this.f64932b.getModifiers();
    }

    public final String getName() {
        return this.f64932b.getName();
    }

    public int hashCode() {
        return this.f64932b.hashCode();
    }

    public final boolean isAccessible() {
        return this.f64931a.isAccessible();
    }

    public final boolean isSynthetic() {
        return this.f64932b.isSynthetic();
    }

    public String toString() {
        return this.f64932b.toString();
    }

    /* renamed from: a */
    public AbstractC27577g<?> mo46119a() {
        return AbstractC27577g.m55138of((Class) getDeclaringClass());
    }

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f64931a.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.f64931a.isAnnotationPresent(cls);
    }

    @Override // java.lang.reflect.AccessibleObject
    public final void setAccessible(boolean z) {
        this.f64931a.setAccessible(z);
    }

    <M extends AccessibleObject & Member> C27562a(M m) {
        C27245k.m54229a(m);
        this.f64931a = m;
        this.f64932b = m;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C27562a) {
            C27562a aVar = (C27562a) obj;
            if (!mo46119a().equals(aVar.mo46119a()) || !this.f64932b.equals(aVar.f64932b)) {
                return false;
            }
            return true;
        }
        return false;
    }
}

package com.google.p1998c.p1999a;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.google.c.a.n */
public final class C27251n<T> extends AbstractC27242j<T> {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final T f64412a;

    static {
        Covode.recordClassIndex(32831);
    }

    @Override // com.google.p1998c.p1999a.AbstractC27242j
    public final boolean isPresent() {
        return true;
    }

    @Override // com.google.p1998c.p1999a.AbstractC27242j
    public final T get() {
        return this.f64412a;
    }

    @Override // com.google.p1998c.p1999a.AbstractC27242j
    public final T orNull() {
        return this.f64412a;
    }

    @Override // com.google.p1998c.p1999a.AbstractC27242j
    public final Set<T> asSet() {
        return Collections.singleton(this.f64412a);
    }

    @Override // com.google.p1998c.p1999a.AbstractC27242j
    public final int hashCode() {
        return this.f64412a.hashCode() + 1502476572;
    }

    @Override // com.google.p1998c.p1999a.AbstractC27242j
    public final String toString() {
        return "Optional.of(" + ((Object) this.f64412a) + ")";
    }

    @Override // com.google.p1998c.p1999a.AbstractC27242j
    /* renamed from: or */
    public final AbstractC27242j<T> mo45304or(AbstractC27242j<? extends T> jVar) {
        C27245k.m54229a(jVar);
        return this;
    }

    C27251n(T t) {
        this.f64412a = t;
    }

    @Override // com.google.p1998c.p1999a.AbstractC27242j
    /* renamed from: or */
    public final T mo45305or(AbstractC27255q<? extends T> qVar) {
        C27245k.m54229a(qVar);
        return this.f64412a;
    }

    @Override // com.google.p1998c.p1999a.AbstractC27242j
    /* renamed from: or */
    public final T mo45306or(T t) {
        C27245k.m54230a(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.f64412a;
    }

    @Override // com.google.p1998c.p1999a.AbstractC27242j
    public final boolean equals(Object obj) {
        if (obj instanceof C27251n) {
            return this.f64412a.equals(((C27251n) obj).f64412a);
        }
        return false;
    }

    @Override // com.google.p1998c.p1999a.AbstractC27242j
    public final <V> AbstractC27242j<V> transform(AbstractC27235f<? super T, V> fVar) {
        return new C27251n(C27245k.m54230a(fVar.mo45319a(this.f64412a), "the Function passed to Optional.transform() must not return null."));
    }
}

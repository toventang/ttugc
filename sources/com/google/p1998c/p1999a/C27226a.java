package com.google.p1998c.p1999a;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.google.c.a.a */
public final class C27226a<T> extends AbstractC27242j<T> {

    /* renamed from: a */
    static final C27226a<Object> f64385a = new C27226a<>();
    private static final long serialVersionUID = 0;

    @Override // com.google.p1998c.p1999a.AbstractC27242j
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.google.p1998c.p1999a.AbstractC27242j
    public final int hashCode() {
        return 2040732332;
    }

    @Override // com.google.p1998c.p1999a.AbstractC27242j
    public final boolean isPresent() {
        return false;
    }

    @Override // com.google.p1998c.p1999a.AbstractC27242j
    public final T orNull() {
        return null;
    }

    @Override // com.google.p1998c.p1999a.AbstractC27242j
    public final String toString() {
        return "Optional.absent()";
    }

    private C27226a() {
    }

    private Object readResolve() {
        return f64385a;
    }

    @Override // com.google.p1998c.p1999a.AbstractC27242j
    public final Set<T> asSet() {
        return Collections.emptySet();
    }

    @Override // com.google.p1998c.p1999a.AbstractC27242j
    public final T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    static {
        Covode.recordClassIndex(32806);
    }

    @Override // com.google.p1998c.p1999a.AbstractC27242j
    /* renamed from: or */
    public final AbstractC27242j<T> mo45304or(AbstractC27242j<? extends T> jVar) {
        return (AbstractC27242j) C27245k.m54229a(jVar);
    }

    @Override // com.google.p1998c.p1999a.AbstractC27242j
    public final <V> AbstractC27242j<V> transform(AbstractC27235f<? super T, V> fVar) {
        C27245k.m54229a(fVar);
        return AbstractC27242j.absent();
    }

    @Override // com.google.p1998c.p1999a.AbstractC27242j
    /* renamed from: or */
    public final T mo45305or(AbstractC27255q<? extends T> qVar) {
        return (T) C27245k.m54230a(qVar.mo5560b(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override // com.google.p1998c.p1999a.AbstractC27242j
    /* renamed from: or */
    public final T mo45306or(T t) {
        return (T) C27245k.m54230a(t, "use Optional.orNull() instead of Optional.or(null)");
    }
}

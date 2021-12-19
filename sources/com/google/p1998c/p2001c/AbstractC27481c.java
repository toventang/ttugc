package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.c.c.c */
public abstract class AbstractC27481c<K, V> extends AbstractC27482d<K, V> implements AbstractC27403ao<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    static {
        Covode.recordClassIndex(33061);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract List<V> mo45767b();

    @Override // com.google.p1998c.p2001c.AbstractC27422ar, com.google.p1998c.p2001c.AbstractC27502g
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27482d
    /* renamed from: c */
    public final /* synthetic */ Collection mo45854c() {
        return Collections.emptyList();
    }

    protected AbstractC27481c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27502g
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27482d
    /* renamed from: a */
    public final <E> Collection<E> mo45853a(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27482d, com.google.p1998c.p2001c.AbstractC27403ao, com.google.p1998c.p2001c.AbstractC27422ar
    public List<V> get(K k) {
        return (List) super.get((Object) k);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27482d, com.google.p1998c.p2001c.AbstractC27422ar
    public List<V> removeAll(Object obj) {
        return (List) super.removeAll(obj);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27482d
    /* renamed from: a */
    public final Collection<V> mo45852a(K k, Collection<V> collection) {
        return mo45855a(k, (List) collection, null);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27482d, com.google.p1998c.p2001c.AbstractC27422ar, com.google.p1998c.p2001c.AbstractC27502g
    public boolean put(K k, V v) {
        return super.put(k, v);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27482d, com.google.p1998c.p2001c.AbstractC27502g
    public List<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return (List) super.replaceValues((Object) k, (Iterable) iterable);
    }
}

package p4519d.p4520a.p4521a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p4600h.p4611f.p4613b.C89213f;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89200e;

/* renamed from: d.a.a.a */
public final class C87988a<V> implements AbstractC89200e, List<V> {

    /* renamed from: a */
    private final /* synthetic */ List f199867a;

    static {
        Covode.recordClassIndex(104014);
    }

    public /* synthetic */ C87988a() {
        this(false);
    }

    @Override // java.util.List
    public final void add(int i, V v) {
        this.f199867a.add(i, v);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(V v) {
        return this.f199867a.add(v);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends V> collection) {
        C89219l.m154719c(collection, "");
        return this.f199867a.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        C89219l.m154719c(collection, "");
        return this.f199867a.addAll(collection);
    }

    public final void clear() {
        this.f199867a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f199867a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        C89219l.m154719c(collection, "");
        return this.f199867a.containsAll(collection);
    }

    @Override // java.util.List
    public final V get(int i) {
        return (V) this.f199867a.get(i);
    }

    public final int indexOf(Object obj) {
        return this.f199867a.indexOf(obj);
    }

    public final boolean isEmpty() {
        return this.f199867a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return this.f199867a.iterator();
    }

    public final int lastIndexOf(Object obj) {
        return this.f199867a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<V> listIterator() {
        return this.f199867a.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<V> listIterator(int i) {
        return this.f199867a.listIterator(i);
    }

    @Override // java.util.List
    public final boolean remove(Object obj) {
        return this.f199867a.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        C89219l.m154719c(collection, "");
        return this.f199867a.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        C89219l.m154719c(collection, "");
        return this.f199867a.retainAll(collection);
    }

    @Override // java.util.List
    public final V set(int i, V v) {
        return (V) this.f199867a.set(i, v);
    }

    @Override // java.util.List
    public final List<V> subList(int i, int i2) {
        return this.f199867a.subList(i, i2);
    }

    public final Object[] toArray() {
        return C89213f.m154698a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C89213f.m154699a(this, tArr);
    }

    public final /* bridge */ int size() {
        return this.f199867a.size();
    }

    @Override // java.util.List
    public final /* bridge */ V remove(int i) {
        return (V) this.f199867a.remove(i);
    }

    public C87988a(boolean z) {
        List arrayList;
        if (z) {
            arrayList = Collections.synchronizedList(new ArrayList());
            C89219l.m154709a((Object) arrayList, "");
        } else {
            arrayList = new ArrayList();
        }
        this.f199867a = arrayList;
    }
}

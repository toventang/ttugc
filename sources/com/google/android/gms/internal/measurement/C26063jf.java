package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.measurement.jf */
final class C26063jf implements ListIterator<String> {

    /* renamed from: a */
    private ListIterator<String> f61377a;

    /* renamed from: b */
    private final /* synthetic */ int f61378b;

    /* renamed from: c */
    private final /* synthetic */ C26060jc f61379c;

    static {
        Covode.recordClassIndex(31478);
    }

    public final boolean hasNext() {
        return this.f61377a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f61377a.hasPrevious();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator, java.util.ListIterator
    public final /* synthetic */ String next() {
        return this.f61377a.next();
    }

    public final int nextIndex() {
        return this.f61377a.nextIndex();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f61377a.previous();
    }

    public final int previousIndex() {
        return this.f61377a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }

    C26063jf(C26060jc jcVar, int i) {
        this.f61379c = jcVar;
        this.f61378b = i;
        this.f61377a = jcVar.f61374a.listIterator(i);
    }
}

package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.jc */
public final class C26060jc extends AbstractList<String> implements AbstractC26005hb, RandomAccess {

    /* renamed from: a */
    final AbstractC26005hb f61374a;

    static {
        Covode.recordClassIndex(31475);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26005hb
    /* renamed from: e */
    public final AbstractC26005hb mo42654e() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26005hb
    /* renamed from: d */
    public final List<?> mo42653d() {
        return this.f61374a.mo42653d();
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C26062je(this);
    }

    public final int size() {
        return this.f61374a.size();
    }

    public C26060jc(AbstractC26005hb hbVar) {
        this.f61374a = hbVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26005hb
    /* renamed from: a */
    public final void mo42651a(AbstractC25943fb fbVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26005hb
    /* renamed from: b */
    public final Object mo42652b(int i) {
        return this.f61374a.mo42652b(i);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ String get(int i) {
        return this.f61374a.get(i);
    }

    @Override // java.util.List, java.util.AbstractList
    public final ListIterator<String> listIterator(int i) {
        return new C26063jf(this, i);
    }
}

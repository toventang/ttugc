package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.gy */
public final class C26001gy extends AbstractC25934ev<String> implements AbstractC26005hb, RandomAccess {

    /* renamed from: a */
    private static final C26001gy f61271a;

    /* renamed from: b */
    private static final AbstractC26005hb f61272b;

    /* renamed from: c */
    private final List<Object> f61273c;

    public C26001gy() {
        this(10);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25934ev, com.google.android.gms.internal.measurement.AbstractC25995gs
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo42366a() {
        return super.mo42366a();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26005hb
    /* renamed from: d */
    public final List<?> mo42653d() {
        return Collections.unmodifiableList(this.f61273c);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25934ev
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final int size() {
        return this.f61273c.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25934ev
    public final void clear() {
        mo42372c();
        this.f61273c.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26005hb
    /* renamed from: e */
    public final AbstractC26005hb mo42654e() {
        if (mo42366a()) {
            return new C26060jc(this);
        }
        return this;
    }

    static {
        Covode.recordClassIndex(31416);
        C26001gy gyVar = new C26001gy();
        f61271a = gyVar;
        gyVar.mo42371b();
        f61272b = gyVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.Collection, java.util.AbstractList
    public final /* bridge */ /* synthetic */ boolean add(String str) {
        return super.add(str);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26005hb
    /* renamed from: b */
    public final Object mo42652b(int i) {
        return this.f61273c.get(i);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25934ev
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public C26001gy(int i) {
        this(new ArrayList(i));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26005hb
    /* renamed from: a */
    public final void mo42651a(AbstractC25943fb fbVar) {
        mo42372c();
        this.f61273c.add(fbVar);
        this.modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.Collection
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    private C26001gy(ArrayList<Object> arrayList) {
        this.f61273c = arrayList;
    }

    /* renamed from: a */
    private static String m50618a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC25943fb) {
            return ((AbstractC25943fb) obj).zzb();
        }
        return C25989gm.m50602a((byte[]) obj);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.AbstractList
    public final /* synthetic */ String remove(int i) {
        mo42372c();
        Object remove = this.f61273c.remove(i);
        this.modCount++;
        return m50618a(remove);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25995gs
    /* renamed from: a */
    public final /* synthetic */ AbstractC25995gs mo42382a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f61273c);
            return new C26001gy(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        Object obj = this.f61273c.get(i);
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof AbstractC25943fb) {
            AbstractC25943fb fbVar = (AbstractC25943fb) obj;
            String zzb = fbVar.zzb();
            if (fbVar.zzc()) {
                this.f61273c.set(i, zzb);
            }
            return zzb;
        }
        byte[] bArr = (byte[]) obj;
        String a = C25989gm.m50602a(bArr);
        if (C26071jj.f61405a.mo42807c(bArr, 0, bArr.length)) {
            this.f61273c.set(i, a);
        }
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.AbstractList
    public final /* synthetic */ void add(int i, String str) {
        mo42372c();
        this.f61273c.add(i, str);
        this.modCount++;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.AbstractList
    public final /* synthetic */ String set(int i, String str) {
        mo42372c();
        return m50618a(this.f61273c.set(i, str));
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.AbstractList
    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo42372c();
        if (collection instanceof AbstractC26005hb) {
            collection = ((AbstractC26005hb) collection).mo42653d();
        }
        boolean addAll = this.f61273c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }
}

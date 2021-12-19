package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.il */
public class C26042il<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    List<C26051iu> f61338a;

    /* renamed from: b */
    Map<K, V> f61339b;

    /* renamed from: c */
    public boolean f61340c;

    /* renamed from: d */
    Map<K, V> f61341d;

    /* renamed from: e */
    private final int f61342e;

    /* renamed from: f */
    private volatile C26052iv f61343f;

    /* renamed from: g */
    private volatile C26047iq f61344g;

    static {
        Covode.recordClassIndex(31457);
    }

    /* renamed from: b */
    public final int mo42711b() {
        return this.f61338a.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Set<Map.Entry<K, V>> mo42717d() {
        if (this.f61344g == null) {
            this.f61344g = new C26047iq(this, (byte) 0);
        }
        return this.f61344g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo42718e() {
        if (this.f61340c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f61343f == null) {
            this.f61343f = new C26052iv(this, (byte) 0);
        }
        return this.f61343f;
    }

    public int size() {
        return this.f61338a.size() + this.f61339b.size();
    }

    /* renamed from: c */
    public final Iterable<Map.Entry<K, V>> mo42713c() {
        return this.f61339b.isEmpty() ? (Iterable<Map.Entry<K, V>>) C26046ip.f61353b : this.f61339b.entrySet();
    }

    public void clear() {
        mo42718e();
        if (!this.f61338a.isEmpty()) {
            this.f61338a.clear();
        }
        if (!this.f61339b.isEmpty()) {
            this.f61339b.clear();
        }
    }

    /* renamed from: f */
    private final SortedMap<K, V> m50830f() {
        mo42718e();
        if (this.f61339b.isEmpty() && !(this.f61339b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f61339b = treeMap;
            this.f61341d = treeMap.descendingMap();
        }
        return (SortedMap) this.f61339b;
    }

    /* renamed from: a */
    public void mo42710a() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (!this.f61340c) {
            if (this.f61339b.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f61339b);
            }
            this.f61339b = unmodifiableMap;
            if (this.f61341d.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f61341d);
            }
            this.f61341d = unmodifiableMap2;
            this.f61340c = true;
        }
    }

    public int hashCode() {
        int b = mo42711b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += this.f61338a.get(i2).hashCode();
        }
        if (this.f61339b.size() > 0) {
            return i + this.f61339b.hashCode();
        }
        return i;
    }

    /* renamed from: a */
    static <FieldDescriptorType extends AbstractC25972ga<FieldDescriptorType>> C26042il<FieldDescriptorType, Object> m50829a(int i) {
        return new C26045io(i);
    }

    /* renamed from: b */
    public final Map.Entry<K, V> mo42712b(int i) {
        return this.f61338a.get(i);
    }

    private C26042il(int i) {
        this.f61342e = i;
        this.f61338a = Collections.emptyList();
        this.f61339b = Collections.emptyMap();
        this.f61341d = Collections.emptyMap();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.measurement.il<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m50828a(comparable) >= 0 || this.f61339b.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.android.gms.internal.measurement.il<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m50828a(comparable);
        return a >= 0 ? (V) this.f61338a.get(a).getValue() : this.f61339b.get(comparable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final V mo42714c(int i) {
        mo42718e();
        V v = (V) this.f61338a.remove(i).getValue();
        if (!this.f61339b.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m50830f().entrySet().iterator();
            this.f61338a.add(new C26051iu(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.measurement.il<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        mo42718e();
        Comparable comparable = (Comparable) obj;
        int a = m50828a(comparable);
        if (a >= 0) {
            return (V) mo42714c(a);
        }
        if (this.f61339b.isEmpty()) {
            return null;
        }
        return this.f61339b.remove(comparable);
    }

    /* renamed from: a */
    private final int m50828a(K k) {
        int size = this.f61338a.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f61338a.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f61338a.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26042il)) {
            return super.equals(obj);
        }
        C26042il ilVar = (C26042il) obj;
        int size = size();
        if (size != ilVar.size()) {
            return false;
        }
        int b = mo42711b();
        if (b != ilVar.mo42711b()) {
            return entrySet().equals(ilVar.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo42712b(i).equals(ilVar.mo42712b(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f61339b.equals(ilVar.f61339b);
        }
        return true;
    }

    /* synthetic */ C26042il(int i, byte b) {
        this(i);
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        mo42718e();
        int a = m50828a(k);
        if (a >= 0) {
            return (V) this.f61338a.get(a).setValue(v);
        }
        mo42718e();
        if (this.f61338a.isEmpty() && !(this.f61338a instanceof ArrayList)) {
            this.f61338a = new ArrayList(this.f61342e);
        }
        int i = -(a + 1);
        if (i >= this.f61342e) {
            return m50830f().put(k, v);
        }
        int size = this.f61338a.size();
        int i2 = this.f61342e;
        if (size == i2) {
            C26051iu remove = this.f61338a.remove(i2 - 1);
            m50830f().put((K) remove.getKey(), (V) remove.getValue());
        }
        this.f61338a.add(i, new C26051iu(this, k, v));
        return null;
    }
}

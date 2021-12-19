package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2001c.AbstractC27349ab;
import com.google.p1998c.p2001c.AbstractC27366af;
import com.google.p1998c.p2001c.AbstractC27540z;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.c.c.aa */
public class C27347aa<K, V> extends AbstractC27366af<K, V> implements AbstractC27403ao<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private transient C27347aa<V, K> f64621a;

    static {
        Covode.recordClassIndex(32927);
    }

    /* renamed from: of */
    public static <K, V> C27347aa<K, V> m54625of() {
        return C27528q.f64898a;
    }

    public static <K, V> C27348a<K, V> builder() {
        return new C27348a<>();
    }

    /* renamed from: com.google.c.c.aa$a */
    public static final class C27348a<K, V> extends AbstractC27366af.C27369a<K, V> {
        static {
            Covode.recordClassIndex(32928);
        }

        /* renamed from: a */
        public final C27347aa<K, V> mo45537a() {
            return (C27347aa) super.mo45541b();
        }

        @Override // com.google.p1998c.p2001c.AbstractC27366af.C27369a
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ AbstractC27366af mo45541b() {
            return super.mo45541b();
        }

        /* renamed from: a */
        public final C27348a<K, V> mo45535a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.mo45539b(iterable);
            return this;
        }

        @Override // com.google.p1998c.p2001c.AbstractC27366af.C27369a
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ AbstractC27366af.C27369a mo45539b(Iterable iterable) {
            super.mo45539b(iterable);
            return this;
        }

        @Override // com.google.p1998c.p2001c.AbstractC27366af.C27369a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC27366af.C27369a mo45538a(Map.Entry entry) {
            super.mo45538a(entry);
            return this;
        }

        /* renamed from: a */
        public final C27348a<K, V> mo45540b(K k, V v) {
            super.mo45540b(k, v);
            return this;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.c.c.aa<K, V> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.c.c.aa$a */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.p1998c.p2001c.AbstractC27366af
    public C27347aa<V, K> inverse() {
        C27347aa<V, K> aaVar = this.f64621a;
        if (aaVar != null) {
            return aaVar;
        }
        C27348a builder = builder();
        AbstractC27479br it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.mo45540b(entry.getValue(), entry.getKey());
        }
        C27347aa<V, K> a = builder.mo45537a();
        a.f64621a = this;
        this.f64621a = a;
        return a;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        C27468bi.m54925a(this, objectOutputStream);
    }

    public static <K, V> C27347aa<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new C27348a().mo45535a(iterable).mo45537a();
    }

    @Override // com.google.p1998c.p2001c.AbstractC27366af, com.google.p1998c.p2001c.AbstractC27366af, com.google.p1998c.p2001c.AbstractC27403ao, com.google.p1998c.p2001c.AbstractC27422ar
    public AbstractC27540z<V> get(K k) {
        AbstractC27540z<V> zVar = (AbstractC27540z) this.f64650b.get(k);
        if (zVar == null) {
            return AbstractC27540z.m55062of();
        }
        return zVar;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27366af, com.google.p1998c.p2001c.AbstractC27366af, com.google.p1998c.p2001c.AbstractC27422ar
    public AbstractC27540z<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> C27347aa<K, V> copyOf(AbstractC27422ar<? extends K, ? extends V> arVar) {
        if (arVar.isEmpty()) {
            return m54625of();
        }
        if (arVar instanceof C27347aa) {
            C27347aa<K, V> aaVar = (C27347aa) arVar;
            if (!((AbstractC27366af) aaVar).f64650b.mo45549d()) {
                return aaVar;
            }
        }
        return m54624a(arVar.asMap().entrySet(), null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.google.c.c.ab$a */
    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            AbstractC27349ab.C27351a builder = AbstractC27349ab.builder();
            int i = 0;
            for (int i2 = 0; i2 < readInt; i2++) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    AbstractC27540z.C27541a builder2 = AbstractC27540z.builder();
                    int i3 = 0;
                    do {
                        builder2.mo46104c(objectInputStream.readObject());
                        i3++;
                    } while (i3 < readInt2);
                    builder.mo45567a(readObject, builder2.mo46102a());
                    i += readInt2;
                } else {
                    throw new InvalidObjectException("Invalid value count ".concat(String.valueOf(readInt2)));
                }
            }
            try {
                AbstractC27366af.C27371c.f64663a.mo45837a(this, builder.mo45568a());
                AbstractC27366af.C27371c.f64664b.mo45836a(this, i);
            } catch (IllegalArgumentException e) {
                throw new InvalidObjectException(e.getMessage()).initCause(e);
            }
        } else {
            throw new InvalidObjectException("Invalid key count ".concat(String.valueOf(readInt)));
        }
    }

    C27347aa(AbstractC27349ab<K, AbstractC27540z<V>> abVar, int i) {
        super(abVar, i);
    }

    /* renamed from: of */
    public static <K, V> C27347aa<K, V> m54626of(K k, V v) {
        C27348a builder = builder();
        builder.mo45540b(k, v);
        return builder.mo45537a();
    }

    @Override // com.google.p1998c.p2001c.AbstractC27366af, com.google.p1998c.p2001c.AbstractC27366af, com.google.p1998c.p2001c.AbstractC27502g
    public AbstractC27540z<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.google.c.c.ab$a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static <K, V> C27347aa<K, V> m54624a(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        AbstractC27540z sortedCopyOf;
        if (collection.isEmpty()) {
            return m54625of();
        }
        AbstractC27349ab.C27351a aVar = new AbstractC27349ab.C27351a(collection.size());
        int i = 0;
        Iterator<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            if (comparator == null) {
                sortedCopyOf = AbstractC27540z.copyOf(collection2);
            } else {
                sortedCopyOf = AbstractC27540z.sortedCopyOf(comparator, collection2);
            }
            if (!sortedCopyOf.isEmpty()) {
                aVar.mo45567a(key, sortedCopyOf);
                i += sortedCopyOf.size();
            }
        }
        return new C27347aa<>(aVar.mo45568a(), i);
    }

    /* renamed from: of */
    public static <K, V> C27347aa<K, V> m54627of(K k, V v, K k2, V v2) {
        C27348a builder = builder();
        builder.mo45540b(k, v);
        builder.mo45540b(k2, v2);
        return builder.mo45537a();
    }

    /* renamed from: of */
    public static <K, V> C27347aa<K, V> m54628of(K k, V v, K k2, V v2, K k3, V v3) {
        C27348a builder = builder();
        builder.mo45540b(k, v);
        builder.mo45540b(k2, v2);
        builder.mo45540b(k3, v3);
        return builder.mo45537a();
    }

    /* renamed from: of */
    public static <K, V> C27347aa<K, V> m54629of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C27348a builder = builder();
        builder.mo45540b(k, v);
        builder.mo45540b(k2, v2);
        builder.mo45540b(k3, v3);
        builder.mo45540b(k4, v4);
        return builder.mo45537a();
    }

    /* renamed from: of */
    public static <K, V> C27347aa<K, V> m54630of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C27348a builder = builder();
        builder.mo45540b(k, v);
        builder.mo45540b(k2, v2);
        builder.mo45540b(k3, v3);
        builder.mo45540b(k4, v4);
        builder.mo45540b(k5, v5);
        return builder.mo45537a();
    }
}

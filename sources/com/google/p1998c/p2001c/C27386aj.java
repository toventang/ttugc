package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27238h;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2001c.AbstractC27349ab;
import com.google.p1998c.p2001c.AbstractC27366af;
import com.google.p1998c.p2001c.AbstractC27381ai;
import com.google.p1998c.p2001c.AbstractC27390ak;
import com.google.p1998c.p2001c.C27412aq;
import com.google.p1998c.p2001c.C27468bi;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.c.c.aj */
public class C27386aj<K, V> extends AbstractC27366af<K, V> implements AbstractC27470bj<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final transient AbstractC27381ai<V> f64684a;

    /* renamed from: d */
    private transient C27386aj<V, K> f64685d;

    /* renamed from: e */
    private transient AbstractC27381ai<Map.Entry<K, V>> f64686e;

    static {
        Covode.recordClassIndex(32966);
    }

    /* renamed from: of */
    public static <K, V> C27386aj<K, V> m54744of() {
        return C27529r.f64899a;
    }

    /* renamed from: com.google.c.c.aj$a */
    public static final class C27387a<K, V> extends AbstractC27366af.C27369a<K, V> {
        static {
            Covode.recordClassIndex(32967);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27366af.C27369a
        /* renamed from: c */
        public final Collection<V> mo45626c() {
            return new C27524n();
        }

        /* renamed from: a */
        public final C27386aj<K, V> mo45541b() {
            Collection entrySet = this.f64659a.entrySet();
            if (this.f64660b != null) {
                entrySet = AbstractC27540z.sortedCopyOf(AbstractC27450az.m54883a(this.f64660b).mo45813a(C27412aq.EnumC27415a.KEY), entrySet);
            }
            return C27386aj.m54743a(entrySet, this.f64661c);
        }

        @Override // com.google.p1998c.p2001c.AbstractC27366af.C27369a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC27366af.C27369a mo45538a(Map.Entry entry) {
            super.mo45538a(entry);
            return this;
        }

        @Override // com.google.p1998c.p2001c.AbstractC27366af.C27369a
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ AbstractC27366af.C27369a mo45539b(Iterable iterable) {
            super.mo45539b(iterable);
            return this;
        }

        /* renamed from: a */
        public final C27387a<K, V> mo45667a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.mo45539b(iterable);
            return this;
        }

        /* renamed from: a */
        public final C27387a<K, V> mo45540b(K k, V v) {
            super.mo45540b(k, v);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.aj$b */
    public static final class C27388b<K, V> extends AbstractC27381ai<Map.Entry<K, V>> {

        /* renamed from: a */
        private final transient C27386aj<K, V> f64687a;

        static {
            Covode.recordClassIndex(32968);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27536x
        /* renamed from: a */
        public final boolean mo45578a() {
            return false;
        }

        @Override // com.google.p1998c.p2001c.AbstractC27381ai, com.google.p1998c.p2001c.AbstractC27381ai, java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.p1998c.p2001c.AbstractC27536x, com.google.p1998c.p2001c.AbstractC27536x, java.lang.Iterable
        public final AbstractC27479br<Map.Entry<K, V>> iterator() {
            return this.f64687a.mo45610i();
        }

        public final int size() {
            return this.f64687a.size();
        }

        C27388b(C27386aj<K, V> ajVar) {
            this.f64687a = ajVar;
        }

        @Override // com.google.p1998c.p2001c.AbstractC27536x
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f64687a.containsEntry(entry.getKey(), entry.getValue());
        }
    }

    public static <K, V> C27387a<K, V> builder() {
        return new C27387a<>();
    }

    @Override // com.google.p1998c.p2001c.AbstractC27366af, com.google.p1998c.p2001c.AbstractC27366af, com.google.p1998c.p2001c.AbstractC27422ar, com.google.p1998c.p2001c.AbstractC27502g
    public AbstractC27381ai<Map.Entry<K, V>> entries() {
        AbstractC27381ai<Map.Entry<K, V>> aiVar = this.f64686e;
        if (aiVar != null) {
            return aiVar;
        }
        C27388b bVar = new C27388b(this);
        this.f64686e = bVar;
        return bVar;
    }

    /* renamed from: com.google.c.c.aj$c */
    static final class C27389c {

        /* renamed from: a */
        static final C27468bi.C27469a<C27386aj> f64688a = C27468bi.m54924a(C27386aj.class, "emptySet");

        static {
            Covode.recordClassIndex(32969);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.c.c.aj<K, V> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.c.c.aj$a */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.p1998c.p2001c.AbstractC27366af
    public C27386aj<V, K> inverse() {
        C27386aj<V, K> ajVar = this.f64685d;
        if (ajVar != null) {
            return ajVar;
        }
        C27387a builder = builder();
        AbstractC27479br it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.mo45540b(entry.getValue(), entry.getKey());
        }
        C27386aj<V, K> a = builder.mo45541b();
        a.f64685d = this;
        this.f64685d = a;
        return a;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27366af, com.google.p1998c.p2001c.AbstractC27366af, com.google.p1998c.p2001c.AbstractC27422ar
    public AbstractC27381ai<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private static <V> AbstractC27381ai<V> m54741a(Comparator<? super V> comparator) {
        if (comparator == null) {
            return AbstractC27381ai.m54718of();
        }
        return AbstractC27390ak.m54760a(comparator);
    }

    public static <K, V> C27386aj<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new C27387a().mo45667a(iterable).mo45541b();
    }

    @Override // com.google.p1998c.p2001c.AbstractC27366af, com.google.p1998c.p2001c.AbstractC27366af, com.google.p1998c.p2001c.AbstractC27422ar
    public AbstractC27381ai<V> get(K k) {
        return (AbstractC27381ai) C27238h.m54216a(this.f64650b.get(k), this.f64684a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        Comparator comparator;
        objectOutputStream.defaultWriteObject();
        AbstractC27381ai<V> aiVar = this.f64684a;
        if (aiVar instanceof AbstractC27390ak) {
            comparator = ((AbstractC27390ak) aiVar).comparator();
        } else {
            comparator = null;
        }
        objectOutputStream.writeObject(comparator);
        C27468bi.m54925a(this, objectOutputStream);
    }

    public static <K, V> C27386aj<K, V> copyOf(AbstractC27422ar<? extends K, ? extends V> arVar) {
        C27245k.m54229a(arVar);
        if (arVar.isEmpty()) {
            return m54744of();
        }
        if (arVar instanceof C27386aj) {
            C27386aj<K, V> ajVar = (C27386aj) arVar;
            if (!((AbstractC27366af) ajVar).f64650b.mo45549d()) {
                return ajVar;
            }
        }
        return m54743a(arVar.asMap().entrySet(), (Comparator) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: com.google.c.c.ab$a */
    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        AbstractC27381ai.C27382a aVar;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            AbstractC27349ab.C27351a builder = AbstractC27349ab.builder();
            int i = 0;
            for (int i2 = 0; i2 < readInt; i2++) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    if (comparator == null) {
                        aVar = new AbstractC27381ai.C27382a();
                    } else {
                        aVar = new AbstractC27390ak.C27391a(comparator);
                    }
                    int i3 = 0;
                    do {
                        aVar.mo45653b(objectInputStream.readObject());
                        i3++;
                    } while (i3 < readInt2);
                    AbstractC27381ai a = aVar.mo45658a();
                    if (a.size() == readInt2) {
                        builder.mo45567a(readObject, a);
                        i += readInt2;
                    } else {
                        throw new InvalidObjectException("Duplicate key-value pairs exist for key ".concat(String.valueOf(readObject)));
                    }
                } else {
                    throw new InvalidObjectException("Invalid value count ".concat(String.valueOf(readInt2)));
                }
            }
            try {
                AbstractC27366af.C27371c.f64663a.mo45837a(this, builder.mo45568a());
                AbstractC27366af.C27371c.f64664b.mo45836a(this, i);
                C27389c.f64688a.mo45837a(this, m54741a(comparator));
            } catch (IllegalArgumentException e) {
                throw new InvalidObjectException(e.getMessage()).initCause(e);
            }
        } else {
            throw new InvalidObjectException("Invalid key count ".concat(String.valueOf(readInt)));
        }
    }

    @Override // com.google.p1998c.p2001c.AbstractC27366af, com.google.p1998c.p2001c.AbstractC27366af, com.google.p1998c.p2001c.AbstractC27502g
    public AbstractC27381ai<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <K, V> C27386aj<K, V> m54745of(K k, V v) {
        C27387a builder = builder();
        builder.mo45540b(k, v);
        return builder.mo45541b();
    }

    /* renamed from: a */
    private static <V> AbstractC27381ai<V> m54742a(Comparator<? super V> comparator, Collection<? extends V> collection) {
        if (comparator == null) {
            return AbstractC27381ai.copyOf((Collection) collection);
        }
        return AbstractC27390ak.copyOf((Comparator) comparator, (Collection) collection);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.google.c.c.ab$a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static <K, V> C27386aj<K, V> m54743a(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return m54744of();
        }
        AbstractC27349ab.C27351a aVar = new AbstractC27349ab.C27351a(collection.size());
        int i = 0;
        Iterator<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            AbstractC27381ai a = m54742a(comparator, (Collection) entry.getValue());
            if (!a.isEmpty()) {
                aVar.mo45567a(key, a);
                i += a.size();
            }
        }
        return new C27386aj<>(aVar.mo45568a(), i, comparator);
    }

    C27386aj(AbstractC27349ab<K, AbstractC27381ai<V>> abVar, int i, Comparator<? super V> comparator) {
        super(abVar, i);
        this.f64684a = m54741a(comparator);
    }

    /* renamed from: of */
    public static <K, V> C27386aj<K, V> m54746of(K k, V v, K k2, V v2) {
        C27387a builder = builder();
        builder.mo45540b(k, v);
        builder.mo45540b(k2, v2);
        return builder.mo45541b();
    }

    /* renamed from: of */
    public static <K, V> C27386aj<K, V> m54747of(K k, V v, K k2, V v2, K k3, V v3) {
        C27387a builder = builder();
        builder.mo45540b(k, v);
        builder.mo45540b(k2, v2);
        builder.mo45540b(k3, v3);
        return builder.mo45541b();
    }

    /* renamed from: of */
    public static <K, V> C27386aj<K, V> m54748of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C27387a builder = builder();
        builder.mo45540b(k, v);
        builder.mo45540b(k2, v2);
        builder.mo45540b(k3, v3);
        builder.mo45540b(k4, v4);
        return builder.mo45541b();
    }

    /* renamed from: of */
    public static <K, V> C27386aj<K, V> m54749of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C27387a builder = builder();
        builder.mo45540b(k, v);
        builder.mo45540b(k2, v2);
        builder.mo45540b(k3, v3);
        builder.mo45540b(k4, v4);
        builder.mo45540b(k5, v5);
        return builder.mo45541b();
    }
}

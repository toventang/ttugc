package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2001c.AbstractC27438au;
import com.google.p1998c.p2001c.AbstractC27482d;
import com.google.p1998c.p2001c.C27440av;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: com.google.c.c.at */
public final class C27432at {
    static {
        Covode.recordClassIndex(33012);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.at$b */
    public static abstract class AbstractC27434b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        static {
            Covode.recordClassIndex(33014);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract AbstractC27422ar<K, V> mo45768a();

        AbstractC27434b() {
        }

        public void clear() {
            mo45768a().clear();
        }

        public int size() {
            return mo45768a().size();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo45768a().containsEntry(entry.getKey(), entry.getValue());
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo45768a().remove(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: com.google.c.c.at$c */
    static class C27435c<K, V> extends AbstractC27506h<K> {

        /* renamed from: a */
        final AbstractC27422ar<K, V> f64734a;

        static {
            Covode.recordClassIndex(33015);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27506h
        /* renamed from: a */
        public final Iterator<K> mo45773a() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.p1998c.p2001c.AbstractC27506h
        public final void clear() {
            this.f64734a.clear();
        }

        @Override // com.google.p1998c.p2001c.AbstractC27438au, com.google.p1998c.p2001c.AbstractC27506h
        public final Set<K> elementSet() {
            return this.f64734a.keySet();
        }

        @Override // com.google.p1998c.p2001c.AbstractC27438au
        public final int size() {
            return this.f64734a.size();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27506h
        /* renamed from: c */
        public final int mo45775c() {
            return this.f64734a.asMap().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return C27412aq.m54817a(this.f64734a.entries().iterator());
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27506h
        /* renamed from: b */
        public final Iterator<AbstractC27438au.AbstractC27439a<K>> mo45774b() {
            return new AbstractC27476bo<Map.Entry<K, Collection<V>>, AbstractC27438au.AbstractC27439a<K>>(this.f64734a.asMap().entrySet().iterator()) {
                /* class com.google.p1998c.p2001c.C27432at.C27435c.C274361 */

                static {
                    Covode.recordClassIndex(33016);
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.p1998c.p2001c.AbstractC27476bo
                /* renamed from: a */
                public final /* synthetic */ Object mo45700a(Object obj) {
                    final Map.Entry entry = (Map.Entry) obj;
                    return new C27440av.AbstractC27441a<K>() {
                        /* class com.google.p1998c.p2001c.C27432at.C27435c.C274361.C274371 */

                        static {
                            Covode.recordClassIndex(33017);
                        }

                        @Override // com.google.p1998c.p2001c.AbstractC27438au.AbstractC27439a
                        /* renamed from: a */
                        public final K mo45778a() {
                            return (K) entry.getKey();
                        }

                        @Override // com.google.p1998c.p2001c.AbstractC27438au.AbstractC27439a
                        /* renamed from: b */
                        public final int mo45779b() {
                            return ((Collection) entry.getValue()).size();
                        }
                    };
                }
            };
        }

        C27435c(AbstractC27422ar<K, V> arVar) {
            this.f64734a = arVar;
        }

        @Override // com.google.p1998c.p2001c.AbstractC27438au, com.google.p1998c.p2001c.AbstractC27506h
        public final boolean contains(Object obj) {
            return this.f64734a.containsKey(obj);
        }

        @Override // com.google.p1998c.p2001c.AbstractC27438au
        public final int count(Object obj) {
            Collection collection = (Collection) C27412aq.m54816a((Map) this.f64734a.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // com.google.p1998c.p2001c.AbstractC27438au, com.google.p1998c.p2001c.AbstractC27506h
        public final int remove(Object obj, int i) {
            C27511k.m54993a(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            Collection collection = (Collection) C27412aq.m54816a((Map) this.f64734a.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i >= size) {
                collection.clear();
            } else {
                Iterator it = collection.iterator();
                for (int i2 = 0; i2 < i; i2++) {
                    it.next();
                    it.remove();
                }
            }
            return size;
        }
    }

    /* renamed from: com.google.c.c.at$a */
    static class C27433a<K, V> extends AbstractC27481c<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        transient AbstractC27255q<? extends List<V>> f64733a;

        static {
            Covode.recordClassIndex(33013);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.p1998c.p2001c.AbstractC27481c
        /* renamed from: a */
        public final List<V> mo45767b() {
            return (List) this.f64733a.mo5560b();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27482d, com.google.p1998c.p2001c.AbstractC27502g
        /* renamed from: d */
        public final Set<K> mo45602d() {
            if (this.map instanceof NavigableMap) {
                return new AbstractC27482d.C27492e((NavigableMap) this.map);
            }
            if (this.map instanceof SortedMap) {
                return new AbstractC27482d.C27495h((SortedMap) this.map);
            }
            return new AbstractC27482d.C27489c(this.map);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27482d, com.google.p1998c.p2001c.AbstractC27502g
        /* renamed from: j */
        public final Map<K, Collection<V>> mo45612j() {
            if (this.map instanceof NavigableMap) {
                return new AbstractC27482d.C27491d((NavigableMap) this.map);
            }
            if (this.map instanceof SortedMap) {
                return new AbstractC27482d.C27494g((SortedMap) this.map);
            }
            return new AbstractC27482d.C27485a(this.map);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f64733a);
            objectOutputStream.writeObject(this.map);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            this.f64733a = (AbstractC27255q) objectInputStream.readObject();
            Map<K, Collection<V>> map = (Map) objectInputStream.readObject();
            this.map = map;
            this.totalSize = 0;
            for (Collection<V> collection : map.values()) {
                C27245k.m54235a(!collection.isEmpty());
                this.totalSize += collection.size();
            }
        }

        C27433a(Map<K, Collection<V>> map, AbstractC27255q<? extends List<V>> qVar) {
            super(map);
            this.f64733a = (AbstractC27255q) C27245k.m54229a(qVar);
        }
    }

    /* renamed from: a */
    public static <K, V> AbstractC27403ao<K, V> m54839a(Map<K, Collection<V>> map, AbstractC27255q<? extends List<V>> qVar) {
        return new C27433a(map, qVar);
    }
}

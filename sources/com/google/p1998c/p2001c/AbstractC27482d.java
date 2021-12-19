package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2001c.AbstractC27502g;
import com.google.p1998c.p2001c.C27397an;
import com.google.p1998c.p2001c.C27412aq;
import com.google.p1998c.p2001c.C27432at;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.c.c.d */
public abstract class AbstractC27482d<K, V> extends AbstractC27502g<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map<K, Collection<V>> map;
    public transient int totalSize;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.d$a */
    public class C27485a extends C27412aq.AbstractC27421e<K, Collection<V>> {

        /* renamed from: a */
        final transient Map<K, Collection<V>> f64806a;

        static {
            Covode.recordClassIndex(33065);
        }

        /* renamed from: com.google.c.c.d$a$a */
        class C27486a extends C27412aq.AbstractC27418b<K, Collection<V>> {
            static {
                Covode.recordClassIndex(33066);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2001c.C27412aq.AbstractC27418b
            /* renamed from: a */
            public final Map<K, Collection<V>> mo45736a() {
                return C27485a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C27487b();
            }

            C27486a() {
            }

            @Override // com.google.p1998c.p2001c.C27412aq.AbstractC27418b
            public final boolean contains(Object obj) {
                return C27512l.m54998a(C27485a.this.f64806a.entrySet(), obj);
            }

            @Override // com.google.p1998c.p2001c.C27412aq.AbstractC27418b
            public final boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                AbstractC27482d.this.removeValuesForKey(((Map.Entry) obj).getKey());
                return true;
            }
        }

        /* renamed from: com.google.c.c.d$a$b */
        class C27487b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a */
            final Iterator<Map.Entry<K, Collection<V>>> f64809a;

            /* renamed from: b */
            Collection<V> f64810b;

            static {
                Covode.recordClassIndex(33067);
            }

            public final boolean hasNext() {
                return this.f64809a.hasNext();
            }

            @Override // java.util.Iterator
            public final /* synthetic */ Object next() {
                Map.Entry<K, Collection<V>> next = this.f64809a.next();
                this.f64810b = next.getValue();
                return C27485a.this.mo45858a(next);
            }

            public final void remove() {
                boolean z;
                if (this.f64810b != null) {
                    z = true;
                } else {
                    z = false;
                }
                C27245k.m54244b(z, "no calls to next() since the last call to remove()");
                this.f64809a.remove();
                AbstractC27482d.this.totalSize -= this.f64810b.size();
                this.f64810b.clear();
                this.f64810b = null;
            }

            C27487b() {
                this.f64809a = C27485a.this.f64806a.entrySet().iterator();
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.google.p1998c.p2001c.C27412aq.AbstractC27421e
        /* renamed from: a */
        public final Set<Map.Entry<K, Collection<V>>> mo45758a() {
            return new C27486a();
        }

        public int hashCode() {
            return this.f64806a.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.p1998c.p2001c.C27412aq.AbstractC27421e
        public Set<K> keySet() {
            return AbstractC27482d.this.keySet();
        }

        public int size() {
            return this.f64806a.size();
        }

        public String toString() {
            return this.f64806a.toString();
        }

        public void clear() {
            if (this.f64806a == AbstractC27482d.this.map) {
                AbstractC27482d.this.clear();
            } else {
                C27397an.m54803c(new C27487b());
            }
        }

        public boolean containsKey(Object obj) {
            return C27412aq.m54820b(this.f64806a, obj);
        }

        public boolean equals(Object obj) {
            if (this == obj || this.f64806a.equals(obj)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final Map.Entry<K, Collection<V>> mo45858a(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return C27412aq.m54818a((Object) key, (Object) AbstractC27482d.this.mo45852a(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object get(Object obj) {
            Collection<V> collection = (Collection) C27412aq.m54816a((Map) this.f64806a, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC27482d.this.mo45852a(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object remove(Object obj) {
            Collection<V> remove = this.f64806a.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> b = AbstractC27482d.this.mo45767b();
            b.addAll(remove);
            AbstractC27482d.this.totalSize -= remove.size();
            remove.clear();
            return b;
        }

        C27485a(Map<K, Collection<V>> map) {
            this.f64806a = map;
        }
    }

    static {
        Covode.recordClassIndex(33062);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Collection<V> mo45767b();

    @Override // com.google.p1998c.p2001c.AbstractC27422ar
    public int size() {
        return this.totalSize;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.d$j */
    public class C27498j extends AbstractC27482d<K, V>.C27496i implements List<V> {
        static {
            Covode.recordClassIndex(33078);
        }

        /* renamed from: com.google.c.c.d$j$a */
        class C27499a extends AbstractC27482d<K, V>.C27496i.C27497a implements ListIterator<V> {
            static {
                Covode.recordClassIndex(33079);
            }

            /* renamed from: b */
            private ListIterator<V> m54978b() {
                mo45941a();
                return (ListIterator) this.f64832a;
            }

            public final boolean hasPrevious() {
                return m54978b().hasPrevious();
            }

            public final int nextIndex() {
                return m54978b().nextIndex();
            }

            @Override // java.util.ListIterator
            public final V previous() {
                return m54978b().previous();
            }

            public final int previousIndex() {
                return m54978b().previousIndex();
            }

            C27499a() {
                super();
            }

            @Override // java.util.ListIterator
            public final void set(V v) {
                m54978b().set(v);
            }

            @Override // java.util.ListIterator
            public final void add(V v) {
                boolean isEmpty = C27498j.this.isEmpty();
                m54978b().add(v);
                AbstractC27482d.this.totalSize++;
                if (isEmpty) {
                    C27498j.this.mo45929c();
                }
            }

            public C27499a(int i) {
                super(((List) C27498j.this.f64828c).listIterator(i));
            }
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            mo45925a();
            return new C27499a();
        }

        @Override // java.util.List
        public V get(int i) {
            mo45925a();
            return (V) ((List) this.f64828c).get(i);
        }

        public int indexOf(Object obj) {
            mo45925a();
            return ((List) this.f64828c).indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            mo45925a();
            return ((List) this.f64828c).lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i) {
            mo45925a();
            return new C27499a(i);
        }

        @Override // java.util.List
        public V remove(int i) {
            mo45925a();
            V v = (V) ((List) this.f64828c).remove(i);
            AbstractC27482d dVar = AbstractC27482d.this;
            dVar.totalSize--;
            mo45928b();
            return v;
        }

        @Override // java.util.List
        public V set(int i, V v) {
            mo45925a();
            return (V) ((List) this.f64828c).set(i, v);
        }

        @Override // java.util.List
        public void add(int i, V v) {
            mo45925a();
            boolean isEmpty = this.f64828c.isEmpty();
            ((List) this.f64828c).add(i, v);
            AbstractC27482d.this.totalSize++;
            if (isEmpty) {
                mo45929c();
            }
        }

        @Override // java.util.List
        public List<V> subList(int i, int i2) {
            AbstractC27482d<K, V>.C27496i iVar;
            mo45925a();
            AbstractC27482d dVar = AbstractC27482d.this;
            K k = this.f64827b;
            List<V> subList = ((List) this.f64828c).subList(i, i2);
            if (this.f64829d == null) {
                iVar = this;
            } else {
                iVar = this.f64829d;
            }
            return dVar.mo45855a(k, subList, iVar);
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = ((List) this.f64828c).addAll(i, collection);
            if (addAll) {
                int size2 = this.f64828c.size();
                AbstractC27482d.this.totalSize += size2 - size;
                if (size == 0) {
                    mo45929c();
                }
            }
            return addAll;
        }

        C27498j(K k, List<V> list, AbstractC27482d<K, V>.C27496i iVar) {
            super(k, list, iVar);
        }
    }

    /* renamed from: com.google.c.c.d$c */
    class C27489c extends C27412aq.C27419c<K, Collection<V>> {
        static {
            Covode.recordClassIndex(33069);
        }

        @Override // com.google.p1998c.p2001c.C27412aq.C27419c
        public void clear() {
            C27397an.m54803c(iterator());
        }

        public int hashCode() {
            return this.f64720d.keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.p1998c.p2001c.C27412aq.C27419c, java.lang.Iterable
        public Iterator<K> iterator() {
            final Iterator<Map.Entry<K, V>> it = this.f64720d.entrySet().iterator();
            return new Iterator<K>() {
                /* class com.google.p1998c.p2001c.AbstractC27482d.C27489c.C274901 */

                /* renamed from: a */
                Map.Entry<K, Collection<V>> f64818a;

                static {
                    Covode.recordClassIndex(33070);
                }

                public final boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public final K next() {
                    Map.Entry<K, Collection<V>> entry = (Map.Entry) it.next();
                    this.f64818a = entry;
                    return entry.getKey();
                }

                public final void remove() {
                    boolean z;
                    if (this.f64818a != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C27245k.m54244b(z, "no calls to next() since the last call to remove()");
                    Collection<V> value = this.f64818a.getValue();
                    it.remove();
                    AbstractC27482d.this.totalSize -= value.size();
                    value.clear();
                    this.f64818a = null;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f64720d.keySet().containsAll(collection);
        }

        public boolean equals(Object obj) {
            if (this == obj || this.f64720d.keySet().equals(obj)) {
                return true;
            }
            return false;
        }

        @Override // com.google.p1998c.p2001c.C27412aq.C27419c
        public boolean remove(Object obj) {
            V remove = this.f64720d.remove(obj);
            if (remove != null) {
                int size = remove.size();
                remove.clear();
                AbstractC27482d.this.totalSize -= size;
                if (size > 0) {
                    return true;
                }
            }
            return false;
        }

        C27489c(Map<K, Collection<V>> map) {
            super(map);
        }
    }

    /* renamed from: com.google.c.c.d$d */
    class C27491d extends AbstractC27482d<K, V>.C27494g implements NavigableMap<K, Collection<V>> {
        static {
            Covode.recordClassIndex(33071);
        }

        @Override // com.google.p1998c.p2001c.AbstractC27482d.C27494g
        /* renamed from: c */
        public final /* bridge */ /* synthetic */ SortedSet mo45881c() {
            return super.keySet();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27482d.C27494g
        /* renamed from: d */
        public final /* bridge */ /* synthetic */ SortedMap mo45884d() {
            return super.mo45884d();
        }

        @Override // com.google.p1998c.p2001c.AbstractC27482d.C27485a, java.util.AbstractMap, java.util.Map, com.google.p1998c.p2001c.AbstractC27482d.C27494g, com.google.p1998c.p2001c.C27412aq.AbstractC27421e, java.util.SortedMap
        public final /* synthetic */ Set keySet() {
            return super.keySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public NavigableSet<K> mo45759e() {
            return new C27492e((NavigableMap) super.mo45884d());
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.c.c.d$d */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            return m54962a(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new C27491d(((NavigableMap) super.mo45884d()).descendingMap());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, V> firstEntry = ((NavigableMap) super.mo45884d()).firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return mo45858a(firstEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, V> lastEntry = ((NavigableMap) super.mo45884d()).lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return mo45858a(lastEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            return m54962a(descendingMap().entrySet().iterator());
        }

        @Override // com.google.p1998c.p2001c.AbstractC27482d.C27494g, java.util.NavigableMap, java.util.SortedMap
        public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // com.google.p1998c.p2001c.AbstractC27482d.C27494g, java.util.NavigableMap, java.util.SortedMap
        public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final K ceilingKey(K k) {
            return (K) ((NavigableMap) super.mo45884d()).ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public final K floorKey(K k) {
            return (K) ((NavigableMap) super.mo45884d()).floorKey(k);
        }

        @Override // java.util.NavigableMap
        public final K higherKey(K k) {
            return (K) ((NavigableMap) super.mo45884d()).higherKey(k);
        }

        @Override // java.util.NavigableMap
        public final K lowerKey(K k) {
            return (K) ((NavigableMap) super.mo45884d()).lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry<K, V> ceilingEntry = ((NavigableMap) super.mo45884d()).ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return mo45858a(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry<K, V> floorEntry = ((NavigableMap) super.mo45884d()).floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return mo45858a(floorEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry<K, V> higherEntry = ((NavigableMap) super.mo45884d()).higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return mo45858a(higherEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry<K, V> lowerEntry = ((NavigableMap) super.mo45884d()).lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return mo45858a(lowerEntry);
        }

        /* renamed from: a */
        private Map.Entry<K, Collection<V>> m54962a(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> b = AbstractC27482d.this.mo45767b();
            b.addAll(next.getValue());
            it.remove();
            return C27412aq.m54818a((Object) next.getKey(), (Object) AbstractC27482d.this.mo45853a(b));
        }

        C27491d(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.google.p1998c.p2001c.AbstractC27482d.C27494g, java.util.NavigableMap, java.util.SortedMap
        public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new C27491d(((NavigableMap) super.mo45884d()).headMap(k, z));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new C27491d(((NavigableMap) super.mo45884d()).tailMap(k, z));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new C27491d(((NavigableMap) super.mo45884d()).subMap(k, z, k2, z2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.d$e */
    public class C27492e extends AbstractC27482d<K, V>.C27495h implements NavigableSet<K> {
        static {
            Covode.recordClassIndex(33072);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27482d.C27495h
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ SortedMap mo45904a() {
            return super.mo45904a();
        }

        @Override // java.util.NavigableSet
        public final Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public final K pollFirst() {
            return (K) C27397an.m54802b(iterator());
        }

        @Override // java.util.NavigableSet
        public final K pollLast() {
            return (K) C27397an.m54802b(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return new C27492e(((NavigableMap) super.mo45904a()).descendingMap());
        }

        @Override // java.util.SortedSet, com.google.p1998c.p2001c.AbstractC27482d.C27495h, java.util.NavigableSet
        public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.SortedSet, com.google.p1998c.p2001c.AbstractC27482d.C27495h, java.util.NavigableSet
        public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public final K ceiling(K k) {
            return (K) ((NavigableMap) super.mo45904a()).ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public final K floor(K k) {
            return (K) ((NavigableMap) super.mo45904a()).floorKey(k);
        }

        @Override // java.util.NavigableSet
        public final K higher(K k) {
            return (K) ((NavigableMap) super.mo45904a()).higherKey(k);
        }

        @Override // java.util.NavigableSet
        public final K lower(K k) {
            return (K) ((NavigableMap) super.mo45904a()).lowerKey(k);
        }

        C27492e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.SortedSet, com.google.p1998c.p2001c.AbstractC27482d.C27495h, java.util.NavigableSet
        public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(K k, boolean z) {
            return new C27492e(((NavigableMap) super.mo45904a()).headMap(k, z));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(K k, boolean z) {
            return new C27492e(((NavigableMap) super.mo45904a()).tailMap(k, z));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new C27492e(((NavigableMap) super.mo45904a()).subMap(k, z, k2, z2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.d$g */
    public class C27494g extends AbstractC27482d<K, V>.C27485a implements SortedMap<K, Collection<V>> {

        /* renamed from: d */
        SortedSet<K> f64824d;

        static {
            Covode.recordClassIndex(33074);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public SortedMap<K, Collection<V>> mo45884d() {
            return (SortedMap) this.f64806a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public SortedSet<K> mo45759e() {
            return new C27495h(mo45884d());
        }

        /* renamed from: c */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f64824d;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> b = mo45759e();
            this.f64824d = b;
            return b;
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return mo45884d().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return mo45884d().firstKey();
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return mo45884d().lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, Collection<V>> headMap(K k) {
            return new C27494g(mo45884d().headMap(k));
        }

        @Override // java.util.SortedMap
        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new C27494g(mo45884d().tailMap(k));
        }

        C27494g(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new C27494g(mo45884d().subMap(k, k2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.d$h */
    public class C27495h extends AbstractC27482d<K, V>.C27489c implements SortedSet<K> {
        static {
            Covode.recordClassIndex(33075);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public SortedMap<K, Collection<V>> mo45904a() {
            return (SortedMap) this.f64720d;
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return mo45904a().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return mo45904a().firstKey();
        }

        @Override // java.util.SortedSet
        public K last() {
            return mo45904a().lastKey();
        }

        @Override // java.util.SortedSet
        public SortedSet<K> headSet(K k) {
            return new C27495h(mo45904a().headMap(k));
        }

        @Override // java.util.SortedSet
        public SortedSet<K> tailSet(K k) {
            return new C27495h(mo45904a().tailMap(k));
        }

        C27495h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public SortedSet<K> subSet(K k, K k2) {
            return new C27495h(mo45904a().subMap(k, k2));
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27502g
    /* renamed from: d */
    public Set<K> mo45602d() {
        return new C27489c(this.map);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27502g
    /* renamed from: e */
    public final Collection<V> mo45603e() {
        return new AbstractC27502g.C27505c();
    }

    @Override // com.google.p1998c.p2001c.AbstractC27422ar, com.google.p1998c.p2001c.AbstractC27502g
    public Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27502g
    /* renamed from: f */
    public final Iterator<V> mo45606f() {
        return new AbstractC27482d<K, V>.AbstractC27488b() {
            /* class com.google.p1998c.p2001c.AbstractC27482d.C274831 */

            static {
                Covode.recordClassIndex(33063);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2001c.AbstractC27482d.AbstractC27488b
            /* renamed from: a */
            public final V mo45857a(K k, V v) {
                return v;
            }
        };
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27502g
    /* renamed from: g */
    public final AbstractC27438au<K> mo45607g() {
        return new C27432at.C27435c(this);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27502g
    /* renamed from: i */
    public final Iterator<Map.Entry<K, V>> mo45610i() {
        return new AbstractC27482d<K, V>.AbstractC27488b() {
            /* class com.google.p1998c.p2001c.AbstractC27482d.C274842 */

            static {
                Covode.recordClassIndex(33064);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2001c.AbstractC27482d.AbstractC27488b
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo45857a(Object obj, Object obj2) {
                return C27412aq.m54818a(obj, obj2);
            }
        };
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27502g
    /* renamed from: j */
    public Map<K, Collection<V>> mo45612j() {
        return new C27485a(this.map);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27502g
    public Collection<V> values() {
        return super.values();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.d$i */
    public class C27496i extends AbstractCollection<V> {

        /* renamed from: b */
        public final K f64827b;

        /* renamed from: c */
        public Collection<V> f64828c;

        /* renamed from: d */
        public final AbstractC27482d<K, V>.C27496i f64829d;

        /* renamed from: e */
        final Collection<V> f64830e;

        static {
            Covode.recordClassIndex(33076);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.google.c.c.d$i$a */
        public class C27497a implements Iterator<V> {

            /* renamed from: a */
            final Iterator<V> f64832a;

            /* renamed from: b */
            final Collection<V> f64833b;

            static {
                Covode.recordClassIndex(33077);
            }

            public boolean hasNext() {
                mo45941a();
                return this.f64832a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                mo45941a();
                return this.f64832a.next();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public final void mo45941a() {
                C27496i.this.mo45925a();
                if (C27496i.this.f64828c != this.f64833b) {
                    throw new ConcurrentModificationException();
                }
            }

            public void remove() {
                this.f64832a.remove();
                AbstractC27482d dVar = AbstractC27482d.this;
                dVar.totalSize--;
                C27496i.this.mo45928b();
            }

            C27497a() {
                this.f64833b = C27496i.this.f64828c;
                this.f64832a = AbstractC27482d.iteratorOrListIterator(C27496i.this.f64828c);
            }

            C27497a(Iterator<V> it) {
                this.f64833b = C27496i.this.f64828c;
                this.f64832a = it;
            }
        }

        public int hashCode() {
            mo45925a();
            return this.f64828c.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            mo45925a();
            return new C27497a();
        }

        public int size() {
            mo45925a();
            return this.f64828c.size();
        }

        public String toString() {
            mo45925a();
            return this.f64828c.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo45928b() {
            AbstractC27482d<K, V>.C27496i iVar = this;
            while (true) {
                AbstractC27482d<K, V>.C27496i iVar2 = iVar.f64829d;
                if (iVar2 == null) {
                    break;
                }
                iVar = iVar2;
            }
            if (iVar.f64828c.isEmpty()) {
                AbstractC27482d.this.map.remove(iVar.f64827b);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo45929c() {
            AbstractC27482d<K, V>.C27496i iVar = this;
            while (true) {
                AbstractC27482d<K, V>.C27496i iVar2 = iVar.f64829d;
                if (iVar2 != null) {
                    iVar = iVar2;
                } else {
                    AbstractC27482d.this.map.put(iVar.f64827b, iVar.f64828c);
                    return;
                }
            }
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f64828c.clear();
                AbstractC27482d.this.totalSize -= size;
                mo45928b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo45925a() {
            Collection<V> collection;
            AbstractC27482d<K, V>.C27496i iVar = this.f64829d;
            if (iVar != null) {
                iVar.mo45925a();
                if (this.f64829d.f64828c != this.f64830e) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f64828c.isEmpty() && (collection = AbstractC27482d.this.map.get(this.f64827b)) != null) {
                this.f64828c = collection;
            }
        }

        public boolean contains(Object obj) {
            mo45925a();
            return this.f64828c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            mo45925a();
            return this.f64828c.containsAll(collection);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            mo45925a();
            return this.f64828c.equals(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v) {
            mo45925a();
            boolean isEmpty = this.f64828c.isEmpty();
            boolean add = this.f64828c.add(v);
            if (add) {
                AbstractC27482d.this.totalSize++;
                if (isEmpty) {
                    mo45929c();
                }
            }
            return add;
        }

        public boolean remove(Object obj) {
            mo45925a();
            boolean remove = this.f64828c.remove(obj);
            if (remove) {
                AbstractC27482d dVar = AbstractC27482d.this;
                dVar.totalSize--;
                mo45928b();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f64828c.addAll(collection);
            if (addAll) {
                int size2 = this.f64828c.size();
                AbstractC27482d.this.totalSize += size2 - size;
                if (size == 0) {
                    mo45929c();
                }
            }
            return addAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f64828c.removeAll(collection);
            if (removeAll) {
                int size2 = this.f64828c.size();
                AbstractC27482d.this.totalSize += size2 - size;
                mo45928b();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            C27245k.m54229a(collection);
            int size = size();
            boolean retainAll = this.f64828c.retainAll(collection);
            if (retainAll) {
                int size2 = this.f64828c.size();
                AbstractC27482d.this.totalSize += size2 - size;
                mo45928b();
            }
            return retainAll;
        }

        C27496i(K k, Collection<V> collection, AbstractC27482d<K, V>.C27496i iVar) {
            Collection<V> collection2;
            this.f64827b = k;
            this.f64828c = collection;
            this.f64829d = iVar;
            if (iVar == null) {
                collection2 = null;
            } else {
                collection2 = iVar.f64828c;
            }
            this.f64830e = collection2;
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Collection<V>, java.util.Collection<E> */
    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.Collection<E>, java.util.Collection<V> */
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Collection<V> mo45854c() {
        return (Collection<E>) mo45853a(mo45767b());
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27502g
    /* renamed from: h */
    public final Collection<Map.Entry<K, V>> mo45608h() {
        if (this instanceof AbstractC27470bj) {
            return new AbstractC27502g.C27504b();
        }
        return new AbstractC27502g.C27503a();
    }

    /* renamed from: com.google.c.c.d$b */
    abstract class AbstractC27488b<T> implements Iterator<T> {

        /* renamed from: b */
        final Iterator<Map.Entry<K, Collection<V>>> f64812b;

        /* renamed from: c */
        K f64813c = null;

        /* renamed from: d */
        Collection<V> f64814d = null;

        /* renamed from: e */
        Iterator<V> f64815e = C27397an.EnumC27402b.INSTANCE;

        static {
            Covode.recordClassIndex(33068);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract T mo45857a(K k, V v);

        public boolean hasNext() {
            if (this.f64812b.hasNext() || this.f64815e.hasNext()) {
                return true;
            }
            return false;
        }

        public void remove() {
            this.f64815e.remove();
            if (this.f64814d.isEmpty()) {
                this.f64812b.remove();
            }
            AbstractC27482d dVar = AbstractC27482d.this;
            dVar.totalSize--;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f64815e.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f64812b.next();
                this.f64813c = next.getKey();
                Collection<V> value = next.getValue();
                this.f64814d = value;
                this.f64815e = value.iterator();
            }
            return mo45857a(this.f64813c, this.f64815e.next());
        }

        AbstractC27488b() {
            this.f64812b = AbstractC27482d.this.map.entrySet().iterator();
        }
    }

    @Override // com.google.p1998c.p2001c.AbstractC27422ar
    public void clear() {
        for (Collection<V> collection : this.map.values()) {
            collection.clear();
        }
        this.map.clear();
        this.totalSize = 0;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27422ar
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    protected AbstractC27482d(Map<K, Collection<V>> map2) {
        C27245k.m54235a(map2.isEmpty());
        this.map = map2;
    }

    public static <E> Iterator<E> iteratorOrListIterator(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <E> Collection<E> mo45853a(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27422ar
    public Collection<V> get(K k) {
        Collection<V> collection = this.map.get(k);
        if (collection == null) {
            collection = mo45767b();
        }
        return mo45852a(k, collection);
    }

    public void removeValuesForKey(Object obj) {
        Collection collection = (Collection) C27412aq.m54821c(this.map, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.totalSize -= size;
        }
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: java.util.Collection<E>, java.util.Collection<V> */
    @Override // com.google.p1998c.p2001c.AbstractC27422ar
    public Collection<V> removeAll(Object obj) {
        Collection<V> remove = this.map.remove(obj);
        if (remove == null) {
            return mo45854c();
        }
        Collection b = mo45767b();
        b.addAll(remove);
        this.totalSize -= remove.size();
        remove.clear();
        return (Collection<E>) mo45853a(b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Collection<V> mo45852a(K k, Collection<V> collection) {
        return new C27496i(k, collection, null);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27422ar, com.google.p1998c.p2001c.AbstractC27502g
    public boolean put(K k, V v) {
        Collection<V> collection = this.map.get(k);
        if (collection == null) {
            Collection<V> b = mo45767b();
            if (b.add(v)) {
                this.totalSize++;
                this.map.put(k, b);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.totalSize++;
            return true;
        }
    }

    /* JADX DEBUG: Type inference failed for r0v4. Raw type applied. Possible types: java.util.Collection<E>, java.util.Collection<V> */
    @Override // com.google.p1998c.p2001c.AbstractC27502g
    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k);
        }
        Collection<V> collection = this.map.get(k);
        if (collection == null) {
            collection = mo45767b();
            this.map.put(k, collection);
        }
        Collection b = mo45767b();
        b.addAll(collection);
        this.totalSize -= collection.size();
        collection.clear();
        while (it.hasNext()) {
            if (collection.add((V) it.next())) {
                this.totalSize++;
            }
        }
        return (Collection<E>) mo45853a(b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List<V> mo45855a(K k, List<V> list, AbstractC27482d<K, V>.C27496i iVar) {
        if (list instanceof RandomAccess) {
            return new C27493f(k, list, iVar);
        }
        return new C27498j(k, list, iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.d$f */
    public class C27493f extends AbstractC27482d<K, V>.C27498j implements RandomAccess {
        static {
            Covode.recordClassIndex(33073);
        }

        C27493f(K k, List<V> list, AbstractC27482d<K, V>.C27496i iVar) {
            super(k, list, iVar);
        }
    }
}

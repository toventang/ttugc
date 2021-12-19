package com.airbnb.epoxy;

import com.bytedance.covode.number.Covode;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: com.airbnb.epoxy.ac */
public class C1908ac extends ArrayList<AbstractC1956s<?>> {

    /* renamed from: b */
    boolean f5755b;

    /* renamed from: c */
    public AbstractC1911c f5756c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.epoxy.ac$c */
    public interface AbstractC1911c {
        static {
            Covode.recordClassIndex(2102);
        }

        /* renamed from: a */
        void mo5678a();

        /* renamed from: b */
        void mo5679b();
    }

    static {
        Covode.recordClassIndex(2099);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.epoxy.ac$b */
    public class C1910b extends C1909a implements ListIterator<AbstractC1956s<?>> {
        static {
            Covode.recordClassIndex(2101);
        }

        public final int nextIndex() {
            return this.f5757a;
        }

        public final boolean hasPrevious() {
            if (this.f5757a != 0) {
                return true;
            }
            return false;
        }

        public final int previousIndex() {
            return this.f5757a - 1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.ListIterator
        public final /* synthetic */ AbstractC1956s<?> previous() {
            mo5668a();
            int i = this.f5757a - 1;
            if (i >= 0) {
                this.f5757a = i;
                this.f5758b = i;
                return C1908ac.this.get(i);
            }
            throw new NoSuchElementException();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.util.ListIterator
        public final /* synthetic */ void set(AbstractC1956s<?> sVar) {
            AbstractC1956s<?> sVar2 = sVar;
            if (this.f5758b >= 0) {
                mo5668a();
                try {
                    C1908ac.this.set(this.f5758b, sVar2);
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            } else {
                throw new IllegalStateException();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.util.ListIterator
        public final /* synthetic */ void add(AbstractC1956s<?> sVar) {
            AbstractC1956s<?> sVar2 = sVar;
            mo5668a();
            try {
                int i = this.f5757a;
                C1908ac.this.add(i, sVar2);
                this.f5757a = i + 1;
                this.f5758b = -1;
                this.f5759c = C1908ac.this.modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        C1910b(int i) {
            super(C1908ac.this, (byte) 0);
            this.f5757a = i;
        }
    }

    C1908ac() {
    }

    /* renamed from: com.airbnb.epoxy.ac$d */
    static class C1912d extends AbstractList<AbstractC1956s<?>> {

        /* renamed from: a */
        private final C1908ac f5762a;

        /* renamed from: b */
        private int f5763b;

        /* renamed from: c */
        private int f5764c;

        static {
            Covode.recordClassIndex(2103);
        }

        @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
        public final Iterator<AbstractC1956s<?>> iterator() {
            return listIterator(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.airbnb.epoxy.ac$d$a */
        public static final class C1913a implements ListIterator<AbstractC1956s<?>> {

            /* renamed from: a */
            private final C1912d f5765a;

            /* renamed from: b */
            private final ListIterator<AbstractC1956s<?>> f5766b;

            /* renamed from: c */
            private int f5767c;

            /* renamed from: d */
            private int f5768d;

            static {
                Covode.recordClassIndex(2104);
            }

            public final boolean hasNext() {
                if (this.f5766b.nextIndex() < this.f5768d) {
                    return true;
                }
                return false;
            }

            public final boolean hasPrevious() {
                if (this.f5766b.previousIndex() >= this.f5767c) {
                    return true;
                }
                return false;
            }

            public final int nextIndex() {
                return this.f5766b.nextIndex() - this.f5767c;
            }

            public final int previousIndex() {
                int previousIndex = this.f5766b.previousIndex();
                int i = this.f5767c;
                if (previousIndex >= i) {
                    return previousIndex - i;
                }
                return -1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.Iterator, java.util.ListIterator
            public final /* synthetic */ AbstractC1956s<?> next() {
                if (this.f5766b.nextIndex() < this.f5768d) {
                    return this.f5766b.next();
                }
                throw new NoSuchElementException();
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.ListIterator
            public final /* synthetic */ AbstractC1956s<?> previous() {
                if (this.f5766b.previousIndex() >= this.f5767c) {
                    return this.f5766b.previous();
                }
                throw new NoSuchElementException();
            }

            public final void remove() {
                this.f5766b.remove();
                this.f5765a.mo5680a(false);
                this.f5768d--;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // java.util.ListIterator
            public final /* bridge */ /* synthetic */ void set(AbstractC1956s<?> sVar) {
                this.f5766b.set(sVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // java.util.ListIterator
            public final /* synthetic */ void add(AbstractC1956s<?> sVar) {
                this.f5766b.add(sVar);
                this.f5765a.mo5680a(true);
                this.f5768d++;
            }

            C1913a(ListIterator<AbstractC1956s<?>> listIterator, C1912d dVar, int i, int i2) {
                this.f5766b = listIterator;
                this.f5765a = dVar;
                this.f5767c = i;
                this.f5768d = i + i2;
            }
        }

        public final int size() {
            if (this.modCount == this.f5762a.modCount) {
                return this.f5764c;
            }
            throw new ConcurrentModificationException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo5680a(boolean z) {
            if (z) {
                this.f5764c++;
            } else {
                this.f5764c--;
            }
            this.modCount = this.f5762a.modCount;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.List, java.util.AbstractList
        public final /* synthetic */ AbstractC1956s<?> get(int i) {
            if (this.modCount != this.f5762a.modCount) {
                throw new ConcurrentModificationException();
            } else if (i >= 0 && i < this.f5764c) {
                return this.f5762a.get(i + this.f5763b);
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        @Override // java.util.List, java.util.AbstractList
        public final ListIterator<AbstractC1956s<?>> listIterator(int i) {
            if (this.modCount != this.f5762a.modCount) {
                throw new ConcurrentModificationException();
            } else if (i >= 0 && i <= this.f5764c) {
                return new C1913a(this.f5762a.listIterator(i + this.f5763b), this, this.f5763b, this.f5764c);
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.List, java.util.AbstractList
        public final /* synthetic */ AbstractC1956s<?> remove(int i) {
            if (this.modCount != this.f5762a.modCount) {
                throw new ConcurrentModificationException();
            } else if (i < 0 || i >= this.f5764c) {
                throw new IndexOutOfBoundsException();
            } else {
                AbstractC1956s<?> a = this.f5762a.remove(i + this.f5763b);
                this.f5764c--;
                this.modCount = this.f5762a.modCount;
                return a;
            }
        }

        @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends AbstractC1956s<?>> collection) {
            if (this.modCount == this.f5762a.modCount) {
                boolean addAll = this.f5762a.addAll(this.f5763b + this.f5764c, collection);
                if (addAll) {
                    this.f5764c += collection.size();
                    this.modCount = this.f5762a.modCount;
                }
                return addAll;
            }
            throw new ConcurrentModificationException();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
        @Override // java.util.List, java.util.AbstractList
        public final /* synthetic */ void add(int i, AbstractC1956s<?> sVar) {
            AbstractC1956s<?> sVar2 = sVar;
            if (this.modCount != this.f5762a.modCount) {
                throw new ConcurrentModificationException();
            } else if (i < 0 || i > this.f5764c) {
                throw new IndexOutOfBoundsException();
            } else {
                this.f5762a.add(i + this.f5763b, sVar2);
                this.f5764c++;
                this.modCount = this.f5762a.modCount;
            }
        }

        @Override // java.util.List, java.util.AbstractList
        public final boolean addAll(int i, Collection<? extends AbstractC1956s<?>> collection) {
            if (this.modCount != this.f5762a.modCount) {
                throw new ConcurrentModificationException();
            } else if (i < 0 || i > this.f5764c) {
                throw new IndexOutOfBoundsException();
            } else {
                boolean addAll = this.f5762a.addAll(i + this.f5763b, collection);
                if (addAll) {
                    this.f5764c += collection.size();
                    this.modCount = this.f5762a.modCount;
                }
                return addAll;
            }
        }

        /* access modifiers changed from: protected */
        public final void removeRange(int i, int i2) {
            if (i == i2) {
                return;
            }
            if (this.modCount == this.f5762a.modCount) {
                C1908ac acVar = this.f5762a;
                int i3 = this.f5763b;
                acVar.removeRange(i + i3, i3 + i2);
                this.f5764c -= i2 - i;
                this.modCount = this.f5762a.modCount;
                return;
            }
            throw new ConcurrentModificationException();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
        @Override // java.util.List, java.util.AbstractList
        public final /* synthetic */ AbstractC1956s<?> set(int i, AbstractC1956s<?> sVar) {
            AbstractC1956s<?> sVar2 = sVar;
            if (this.modCount != this.f5762a.modCount) {
                throw new ConcurrentModificationException();
            } else if (i >= 0 && i < this.f5764c) {
                return this.f5762a.set(i + this.f5763b, sVar2);
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        C1912d(C1908ac acVar, int i, int i2) {
            this.f5762a = acVar;
            this.modCount = acVar.modCount;
            this.f5763b = i;
            this.f5764c = i2 - i;
        }
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable, java.util.ArrayList
    public Iterator<AbstractC1956s<?>> iterator() {
        return new C1909a(this, (byte) 0);
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public ListIterator<AbstractC1956s<?>> listIterator() {
        return new C1910b(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.epoxy.ac$a */
    public class C1909a implements Iterator<AbstractC1956s<?>> {

        /* renamed from: a */
        int f5757a;

        /* renamed from: b */
        int f5758b;

        /* renamed from: c */
        int f5759c;

        static {
            Covode.recordClassIndex(2100);
        }

        public boolean hasNext() {
            if (this.f5757a != C1908ac.this.size()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo5668a() {
            if (C1908ac.this.modCount != this.f5759c) {
                throw new ConcurrentModificationException();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public /* synthetic */ AbstractC1956s<?> next() {
            mo5668a();
            int i = this.f5757a;
            this.f5757a = i + 1;
            this.f5758b = i;
            return C1908ac.this.get(i);
        }

        public void remove() {
            if (this.f5758b >= 0) {
                mo5668a();
                try {
                    C1908ac.this.remove(this.f5758b);
                    this.f5757a = this.f5758b;
                    this.f5758b = -1;
                    this.f5759c = C1908ac.this.modCount;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            } else {
                throw new IllegalStateException();
            }
        }

        private C1909a() {
            this.f5758b = -1;
            this.f5759c = C1908ac.this.modCount;
        }

        /* synthetic */ C1909a(C1908ac acVar, byte b) {
            this();
        }
    }

    /* renamed from: a */
    private void m6087a() {
        AbstractC1911c cVar;
        if (!this.f5755b && (cVar = this.f5756c) != null) {
            cVar.mo5678a();
        }
    }

    /* renamed from: b */
    private void m6089b() {
        AbstractC1911c cVar;
        if (!this.f5755b && (cVar = this.f5756c) != null) {
            cVar.mo5679b();
        }
    }

    public void clear() {
        if (!isEmpty()) {
            size();
            m6089b();
            super.clear();
        }
    }

    C1908ac(int i) {
        super(i);
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public ListIterator<AbstractC1956s<?>> listIterator(int i) {
        return new C1910b(i);
    }

    /* renamed from: a */
    public final AbstractC1956s<?> remove(int i) {
        m6089b();
        return (AbstractC1956s) super.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.ArrayList
    public boolean addAll(Collection<? extends AbstractC1956s<?>> collection) {
        size();
        collection.size();
        m6087a();
        return super.addAll(collection);
    }

    @Override // java.util.List, java.util.ArrayList
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        m6089b();
        super.remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.ArrayList
    public boolean removeAll(Collection<?> collection) {
        Iterator<AbstractC1956s<?>> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.ArrayList
    public boolean retainAll(Collection<?> collection) {
        Iterator<AbstractC1956s<?>> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean add(AbstractC1956s<?> sVar) {
        size();
        m6087a();
        return super.add(sVar);
    }

    /* renamed from: b */
    public final void add(int i, AbstractC1956s<?> sVar) {
        m6087a();
        super.add(i, sVar);
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public boolean addAll(int i, Collection<? extends AbstractC1956s<?>> collection) {
        collection.size();
        m6087a();
        return super.addAll(i, collection);
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        if (i != i2) {
            m6089b();
            super.removeRange(i, i2);
        }
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public List<AbstractC1956s<?>> subList(int i, int i2) {
        if (i < 0 || i2 > size()) {
            throw new IndexOutOfBoundsException();
        } else if (i <= i2) {
            return new C1912d(this, i, i2);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public final AbstractC1956s<?> set(int i, AbstractC1956s<?> sVar) {
        AbstractC1956s<?> sVar2 = (AbstractC1956s) super.set(i, sVar);
        if (sVar2.f5838a != sVar.f5838a) {
            m6089b();
            m6087a();
        }
        return sVar2;
    }
}

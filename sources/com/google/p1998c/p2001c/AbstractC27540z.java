package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27241i;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2001c.AbstractC27536x;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.c.c.z */
public abstract class AbstractC27540z<E> extends AbstractC27536x<E> implements List<E>, RandomAccess {

    /* renamed from: a */
    private static final AbstractC27480bs<Object> f64908a = new C27542b(C27455bb.f64766a, 0);

    @Override // com.google.p1998c.p2001c.AbstractC27536x
    public final AbstractC27540z<E> asList() {
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.z$c */
    public static class C27543c<E> extends AbstractC27540z<E> {

        /* renamed from: a */
        private final transient AbstractC27540z<E> f64910a;

        static {
            Covode.recordClassIndex(33123);
        }

        @Override // com.google.p1998c.p2001c.AbstractC27540z
        public final AbstractC27540z<E> reverse() {
            return this.f64910a;
        }

        @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, com.google.p1998c.p2001c.AbstractC27540z, com.google.p1998c.p2001c.AbstractC27540z, com.google.p1998c.p2001c.AbstractC27536x, com.google.p1998c.p2001c.AbstractC27536x, java.lang.Iterable
        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return AbstractC27540z.super.iterator();
        }

        @Override // java.util.List, com.google.p1998c.p2001c.AbstractC27540z, com.google.p1998c.p2001c.AbstractC27540z
        public final /* bridge */ /* synthetic */ ListIterator listIterator() {
            return AbstractC27540z.super.listIterator();
        }

        public final int size() {
            return this.f64910a.size();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27536x
        /* renamed from: a */
        public final boolean mo45578a() {
            return this.f64910a.mo45578a();
        }

        C27543c(AbstractC27540z<E> zVar) {
            this.f64910a = zVar;
        }

        /* renamed from: a */
        private int m55085a(int i) {
            return (size() - 1) - i;
        }

        @Override // com.google.p1998c.p2001c.AbstractC27540z, com.google.p1998c.p2001c.AbstractC27536x
        public final boolean contains(Object obj) {
            return this.f64910a.contains(obj);
        }

        @Override // com.google.p1998c.p2001c.AbstractC27540z
        public final int indexOf(Object obj) {
            int lastIndexOf = this.f64910a.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return m55085a(lastIndexOf);
            }
            return -1;
        }

        @Override // com.google.p1998c.p2001c.AbstractC27540z
        public final int lastIndexOf(Object obj) {
            int indexOf = this.f64910a.indexOf(obj);
            if (indexOf >= 0) {
                return m55085a(indexOf);
            }
            return -1;
        }

        @Override // java.util.List, com.google.p1998c.p2001c.AbstractC27540z, com.google.p1998c.p2001c.AbstractC27540z
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return AbstractC27540z.super.listIterator(i);
        }

        @Override // java.util.List
        public final E get(int i) {
            C27245k.m54228a(i, size());
            return this.f64910a.get(m55085a(i));
        }

        @Override // java.util.List, com.google.p1998c.p2001c.AbstractC27540z, com.google.p1998c.p2001c.AbstractC27540z
        public final AbstractC27540z<E> subList(int i, int i2) {
            C27245k.m54234a(i, i2, size());
            return this.f64910a.subList(size() - i2, size() - i).reverse();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.z$e */
    public class C27545e extends AbstractC27540z<E> {

        /* renamed from: a */
        final transient int f64912a;

        /* renamed from: b */
        final transient int f64913b;

        static {
            Covode.recordClassIndex(33125);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27536x
        /* renamed from: a */
        public final boolean mo45578a() {
            return true;
        }

        public final int size() {
            return this.f64913b;
        }

        @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, com.google.p1998c.p2001c.AbstractC27540z, com.google.p1998c.p2001c.AbstractC27540z, com.google.p1998c.p2001c.AbstractC27536x, com.google.p1998c.p2001c.AbstractC27536x, java.lang.Iterable
        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return AbstractC27540z.super.iterator();
        }

        @Override // java.util.List, com.google.p1998c.p2001c.AbstractC27540z, com.google.p1998c.p2001c.AbstractC27540z
        public final /* bridge */ /* synthetic */ ListIterator listIterator() {
            return AbstractC27540z.super.listIterator();
        }

        @Override // java.util.List
        public final E get(int i) {
            C27245k.m54228a(i, this.f64913b);
            return (E) AbstractC27540z.this.get(i + this.f64912a);
        }

        @Override // java.util.List, com.google.p1998c.p2001c.AbstractC27540z, com.google.p1998c.p2001c.AbstractC27540z
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return AbstractC27540z.super.listIterator(i);
        }

        @Override // java.util.List, com.google.p1998c.p2001c.AbstractC27540z, com.google.p1998c.p2001c.AbstractC27540z
        public final AbstractC27540z<E> subList(int i, int i2) {
            C27245k.m54234a(i, i2, this.f64913b);
            AbstractC27540z zVar = AbstractC27540z.this;
            int i3 = this.f64912a;
            return zVar.subList(i + i3, i2 + i3);
        }

        C27545e(int i, int i2) {
            this.f64912a = i;
            this.f64913b = i2;
        }
    }

    AbstractC27540z() {
    }

    /* renamed from: of */
    public static <E> AbstractC27540z<E> m55062of() {
        return (AbstractC27540z<E>) C27455bb.f64766a;
    }

    /* renamed from: of */
    public static <E> AbstractC27540z<E> m55074of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E... eArr) {
        C27245k.m54236a(eArr.length <= 2147483635, "the total number of elements must fit in an int");
        int length = eArr.length + 12;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        objArr[6] = e7;
        objArr[7] = e8;
        objArr[8] = e9;
        objArr[9] = e10;
        objArr[10] = e11;
        objArr[11] = e12;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        Object[] a = C27447ax.m54860a(objArr, length);
        return m55061b(a, a.length);
    }

    /* renamed from: of */
    public static <E> AbstractC27540z<E> m55071of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        Object[] a = C27447ax.m54860a(new Object[]{e, e2, e3, e4, e5, e6, e7, e8, e9}, 9);
        return m55061b(a, a.length);
    }

    /* renamed from: of */
    public static <E> AbstractC27540z<E> m55072of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        Object[] a = C27447ax.m54860a(new Object[]{e, e2, e3, e4, e5, e6, e7, e8, e9, e10}, 10);
        return m55061b(a, a.length);
    }

    /* renamed from: of */
    public static <E> AbstractC27540z<E> m55073of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
        Object[] a = C27447ax.m54860a(new Object[]{e, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11}, 11);
        return m55061b(a, a.length);
    }

    /* renamed from: com.google.c.c.z$a */
    public static final class C27541a<E> extends AbstractC27536x.AbstractC27537a<E> {
        static {
            Covode.recordClassIndex(33121);
        }

        public C27541a() {
            this(4);
        }

        /* renamed from: a */
        public final AbstractC27540z<E> mo46102a() {
            this.f64905c = true;
            return AbstractC27540z.m55061b(this.f64903a, this.f64904b);
        }

        C27541a(int i) {
            super(i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.p1998c.p2001c.AbstractC27536x.AbstractC27537a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC27536x.AbstractC27537a mo45659a(Object obj) {
            super.mo45653b(obj);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.p1998c.p2001c.AbstractC27536x.AbstractC27537a, com.google.p1998c.p2001c.AbstractC27536x.AbstractC27538b
        /* renamed from: b */
        public final /* synthetic */ AbstractC27536x.AbstractC27538b mo45653b(Object obj) {
            super.mo45653b(obj);
            return this;
        }

        /* renamed from: c */
        public final C27541a<E> mo46104c(E e) {
            super.mo45653b((Object) e);
            return this;
        }

        @Override // com.google.p1998c.p2001c.AbstractC27536x.AbstractC27537a, com.google.p1998c.p2001c.AbstractC27536x.AbstractC27538b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC27536x.AbstractC27538b mo45647a(Iterable iterable) {
            super.mo45647a(iterable);
            return this;
        }

        /* renamed from: b */
        public final C27541a<E> mo46103b(Iterator<? extends E> it) {
            super.mo45648a((Iterator) it);
            return this;
        }

        @Override // com.google.p1998c.p2001c.AbstractC27536x.AbstractC27538b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC27536x.AbstractC27538b mo45648a(Iterator it) {
            super.mo45648a(it);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.p1998c.p2001c.AbstractC27536x.AbstractC27537a, com.google.p1998c.p2001c.AbstractC27536x.AbstractC27538b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC27536x.AbstractC27538b mo45649a(Object[] objArr) {
            super.mo45649a(objArr);
            return this;
        }
    }

    /* renamed from: com.google.c.c.z$d */
    static class C27544d implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Object[] f64911a;

        static {
            Covode.recordClassIndex(33124);
        }

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return AbstractC27540z.copyOf(this.f64911a);
        }

        C27544d(Object[] objArr) {
            this.f64911a = objArr;
        }
    }

    public static <E> C27541a<E> builder() {
        return new C27541a<>();
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, com.google.p1998c.p2001c.AbstractC27536x, com.google.p1998c.p2001c.AbstractC27536x, java.lang.Iterable
    public AbstractC27479br<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public AbstractC27480bs<E> listIterator() {
        return listIterator(0);
    }

    public AbstractC27540z<E> reverse() {
        if (size() <= 1) {
            return this;
        }
        return new C27543c(this);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27536x
    public Object writeReplace() {
        return new C27544d(toArray());
    }

    static {
        Covode.recordClassIndex(33120);
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.z$b */
    public static class C27542b<E> extends AbstractC27346a<E> {

        /* renamed from: a */
        private final AbstractC27540z<E> f64909a;

        static {
            Covode.recordClassIndex(33122);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.p1998c.p2001c.AbstractC27346a
        /* renamed from: a */
        public final E mo45524a(int i) {
            return this.f64909a.get(i);
        }

        C27542b(AbstractC27540z<E> zVar, int i) {
            super(zVar.size(), i);
            this.f64909a = zVar;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    public static <E> C27541a<E> builderWithExpectedSize(int i) {
        C27511k.m54993a(i, "expectedSize");
        return new C27541a<>(i);
    }

    /* renamed from: of */
    public static <E> AbstractC27540z<E> m55063of(E e) {
        Object[] a = C27447ax.m54860a(new Object[]{e}, 1);
        return m55061b(a, a.length);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27536x
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public static <E> AbstractC27540z<E> copyOf(Iterable<? extends E> iterable) {
        C27245k.m54229a(iterable);
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E extends Comparable<? super E>> AbstractC27540z<E> sortedCopyOf(Iterable<? extends E> iterable) {
        Comparable[] comparableArr = (Comparable[]) C27394am.m54796b(iterable).toArray(new Comparable[0]);
        C27447ax.m54860a((Object[]) comparableArr, comparableArr.length);
        Arrays.sort(comparableArr);
        return m55061b(comparableArr, comparableArr.length);
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public AbstractC27480bs<E> listIterator(int i) {
        C27245k.m54242b(i, size());
        return isEmpty() ? (AbstractC27480bs<E>) f64908a : new C27542b(this, i);
    }

    public static <E> AbstractC27540z<E> copyOf(Collection<? extends E> collection) {
        if (collection instanceof AbstractC27536x) {
            AbstractC27540z<E> asList = ((AbstractC27536x) collection).asList();
            if (!asList.mo45578a()) {
                return asList;
            }
            Object[] array = asList.toArray();
            return m55061b(array, array.length);
        }
        Object[] array2 = collection.toArray();
        Object[] a = C27447ax.m54860a(array2, array2.length);
        return m55061b(a, a.length);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.google.c.c.z$a */
    /* JADX WARN: Multi-variable type inference failed */
    public static <E> AbstractC27540z<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m55062of();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m55063of(next);
        }
        return new C27541a().mo46104c(next).mo46103b((Iterator) it).mo46102a();
    }

    public boolean equals(Object obj) {
        if (obj == C27245k.m54229a(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (C27241i.m54222a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!C27241i.m54222a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static <E> AbstractC27540z<E> copyOf(E[] eArr) {
        if (eArr.length == 0) {
            return m55062of();
        }
        Object[] objArr = (Object[]) eArr.clone();
        Object[] a = C27447ax.m54860a(objArr, objArr.length);
        return m55061b(a, a.length);
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    static <E> AbstractC27540z<E> m55061b(Object[] objArr, int i) {
        if (i == 0) {
            return m55062of();
        }
        return new C27455bb(objArr, i);
    }

    /* renamed from: of */
    public static <E> AbstractC27540z<E> m55064of(E e, E e2) {
        Object[] a = C27447ax.m54860a(new Object[]{e, e2}, 2);
        return m55061b(a, a.length);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27536x
    /* renamed from: a */
    public int mo45633a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    public AbstractC27540z<E> subList(int i, int i2) {
        C27245k.m54234a(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return m55062of();
        }
        return new C27545e(i, i3);
    }

    public static <E> AbstractC27540z<E> sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        C27245k.m54229a(comparator);
        Object[] a = C27394am.m54795a(iterable);
        C27447ax.m54860a(a, a.length);
        Arrays.sort(a, comparator);
        return m55061b(a, a.length);
    }

    /* renamed from: of */
    public static <E> AbstractC27540z<E> m55065of(E e, E e2, E e3) {
        Object[] a = C27447ax.m54860a(new Object[]{e, e2, e3}, 3);
        return m55061b(a, a.length);
    }

    /* renamed from: of */
    public static <E> AbstractC27540z<E> m55066of(E e, E e2, E e3, E e4) {
        Object[] a = C27447ax.m54860a(new Object[]{e, e2, e3, e4}, 4);
        return m55061b(a, a.length);
    }

    /* renamed from: of */
    public static <E> AbstractC27540z<E> m55067of(E e, E e2, E e3, E e4, E e5) {
        Object[] a = C27447ax.m54860a(new Object[]{e, e2, e3, e4, e5}, 5);
        return m55061b(a, a.length);
    }

    /* renamed from: of */
    public static <E> AbstractC27540z<E> m55068of(E e, E e2, E e3, E e4, E e5, E e6) {
        Object[] a = C27447ax.m54860a(new Object[]{e, e2, e3, e4, e5, e6}, 6);
        return m55061b(a, a.length);
    }

    /* renamed from: of */
    public static <E> AbstractC27540z<E> m55069of(E e, E e2, E e3, E e4, E e5, E e6, E e7) {
        Object[] a = C27447ax.m54860a(new Object[]{e, e2, e3, e4, e5, e6, e7}, 7);
        return m55061b(a, a.length);
    }

    /* renamed from: of */
    public static <E> AbstractC27540z<E> m55070of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        Object[] a = C27447ax.m54860a(new Object[]{e, e2, e3, e4, e5, e6, e7, e8}, 8);
        return m55061b(a, a.length);
    }
}

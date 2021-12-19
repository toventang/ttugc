package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89269g;
import p4600h.p4619j.C89271h;
import p4600h.p4621l.AbstractC89306h;

/* renamed from: h.a.x */
public class C89081x extends C89080w {
    static {
        Covode.recordClassIndex(105165);
    }

    /* renamed from: a */
    public static final <T> boolean m154556a(Iterable<? extends T> iterable, T t) {
        C89219l.m154721d(iterable, "");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        return C89070n.m154557b(iterable, t) >= 0;
    }

    /* renamed from: a */
    public static final <T> List<T> m154555a(List<? extends T> list, C89269g gVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(gVar, "");
        if (gVar.mo143680a()) {
            return C89086z.INSTANCE;
        }
        return C89070n.m154590j(list.subList(Integer.valueOf(gVar.f202927a).intValue(), Integer.valueOf(gVar.f202928b).intValue() + 1));
    }

    /* renamed from: a */
    public static final <T> List<T> m154554a(Collection<? extends T> collection, T t) {
        C89219l.m154721d(collection, "");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: h.a.x$a */
    public static final class C89082a implements AbstractC89306h<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f202796a;

        static {
            Covode.recordClassIndex(105166);
        }

        @Override // p4600h.p4621l.AbstractC89306h
        /* renamed from: a */
        public final Iterator<T> mo2926a() {
            return this.f202796a.iterator();
        }

        public C89082a(Iterable iterable) {
            this.f202796a = iterable;
        }
    }

    /* renamed from: h.a.x$c */
    static final class C89084c extends AbstractC89220m implements AbstractC89171a<Iterator<? extends T>> {

        /* renamed from: a */
        final /* synthetic */ Iterable f202798a;

        static {
            Covode.recordClassIndex(105168);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C89084c(Iterable iterable) {
            super(0);
            this.f202798a = iterable;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Object invoke() {
            return this.f202798a.iterator();
        }
    }

    /* renamed from: g */
    public static final <T> List<T> m154585g(Collection<? extends T> collection) {
        C89219l.m154721d(collection, "");
        return new ArrayList(collection);
    }

    /* renamed from: m */
    public static final <T> Iterable<C89037ac<T>> m154593m(Iterable<? extends T> iterable) {
        C89219l.m154721d(iterable, "");
        return new C89038ad(new C89084c(iterable));
    }

    /* renamed from: n */
    public static final <T> List<T> m154594n(Iterable<? extends T> iterable) {
        C89219l.m154721d(iterable, "");
        return C89070n.m154590j(C89070n.m154595o(iterable));
    }

    /* renamed from: r */
    public static final <T> AbstractC89306h<T> m154598r(Iterable<? extends T> iterable) {
        C89219l.m154721d(iterable, "");
        return new C89082a(iterable);
    }

    /* renamed from: f */
    public static final <T> T m154579f(List<? extends T> list) {
        C89219l.m154721d(list, "");
        if (!list.isEmpty()) {
            return (T) list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: g */
    public static final <T> T m154583g(List<? extends T> list) {
        C89219l.m154721d(list, "");
        if (list.isEmpty()) {
            return null;
        }
        return (T) list.get(0);
    }

    /* renamed from: h */
    public static final <T> T m154586h(List<? extends T> list) {
        C89219l.m154721d(list, "");
        if (!list.isEmpty()) {
            return (T) list.get(C89070n.m154517a((List) list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: i */
    public static final <T> T m154588i(List<? extends T> list) {
        C89219l.m154721d(list, "");
        if (list.isEmpty()) {
            return null;
        }
        return (T) list.get(list.size() - 1);
    }

    /* renamed from: k */
    public static final <T> List<T> m154591k(Iterable<? extends T> iterable) {
        C89219l.m154721d(iterable, "");
        if (iterable instanceof Collection) {
            return C89070n.m154585g((Collection) iterable);
        }
        return (List) C89070n.m154562b((Iterable) iterable, (Collection) new ArrayList());
    }

    /* renamed from: o */
    public static final <T> Set<T> m154595o(Iterable<? extends T> iterable) {
        C89219l.m154721d(iterable, "");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        return (Set) C89070n.m154562b((Iterable) iterable, (Collection) new LinkedHashSet());
    }

    /* renamed from: s */
    public static final int m154599s(Iterable<Integer> iterable) {
        C89219l.m154721d(iterable, "");
        int i = 0;
        for (Integer num : iterable) {
            i += num.intValue();
        }
        return i;
    }

    /* renamed from: t */
    public static final long m154600t(Iterable<Long> iterable) {
        C89219l.m154721d(iterable, "");
        long j = 0;
        for (Long l : iterable) {
            j += l.longValue();
        }
        return j;
    }

    /* renamed from: h.a.x$b */
    static final class C89083b extends AbstractC89220m implements AbstractC89172b<Integer, T> {

        /* renamed from: a */
        final /* synthetic */ int f202797a;

        static {
            Covode.recordClassIndex(105167);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C89083b(int i) {
            super(1);
            this.f202797a = i;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(Integer num) {
            num.intValue();
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f202797a + '.');
        }
    }

    /* renamed from: c */
    public static final <T> T m154565c(Iterable<? extends T> iterable) {
        C89219l.m154721d(iterable, "");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return (T) it.next();
    }

    /* renamed from: d */
    public static final <T> T m154570d(Iterable<? extends T> iterable) {
        T t;
        C89219l.m154721d(iterable, "");
        if (iterable instanceof List) {
            return (T) C89070n.m154586h((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            do {
                t = (T) it.next();
            } while (it.hasNext());
            return t;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: e */
    public static final <T> T m154576e(Iterable<? extends T> iterable) {
        T t;
        C89219l.m154721d(iterable, "");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        do {
            t = (T) it.next();
        } while (it.hasNext());
        return t;
    }

    /* renamed from: f */
    public static final <T> List<T> m154580f(Iterable<? extends T> iterable) {
        C89219l.m154721d(iterable, "");
        return (List) C89070n.m154552a((Iterable) iterable, (Collection) new ArrayList());
    }

    /* renamed from: g */
    public static final <T> List<T> m154584g(Iterable<? extends T> iterable) {
        C89219l.m154721d(iterable, "");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return C89070n.m154590j(iterable);
        }
        List<T> k = C89070n.m154591k(iterable);
        C89070n.m154545e((List) k);
        return k;
    }

    /* renamed from: h */
    public static final <T extends Comparable<? super T>> List<T> m154587h(Iterable<? extends T> iterable) {
        C89219l.m154721d(iterable, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return C89070n.m154590j(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Comparable[] comparableArr = (Comparable[]) array;
            Objects.requireNonNull(comparableArr, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            C89064i.m154472b(comparableArr);
            return C89064i.m154463a(comparableArr);
        }
        List<T> k = C89070n.m154591k(iterable);
        C89070n.m154531c((List) k);
        return k;
    }

    /* renamed from: i */
    public static final <T> HashSet<T> m154589i(Iterable<? extends T> iterable) {
        C89219l.m154721d(iterable, "");
        return (HashSet) C89070n.m154562b((Iterable) iterable, (Collection) new HashSet(C89041ag.m154411a(C89070n.m154526a(iterable, 12))));
    }

    /* renamed from: j */
    public static final <T> List<T> m154590j(Iterable<? extends T> iterable) {
        Object next;
        C89219l.m154721d(iterable, "");
        if (!(iterable instanceof Collection)) {
            return C89070n.m154521b(C89070n.m154591k(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C89086z.INSTANCE;
        }
        if (size != 1) {
            return C89070n.m154585g(collection);
        }
        if (iterable instanceof List) {
            next = ((List) iterable).get(0);
        } else {
            next = iterable.iterator().next();
        }
        return C89070n.m154516a(next);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends java.lang.Comparable<? super T>> T m154596p(java.lang.Iterable<? extends T> r3) {
        /*
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x0011
            r0 = 0
            return r0
        L_0x0011:
            java.lang.Object r2 = r3.next()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
        L_0x0017:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r0 = r2.compareTo(r1)
            if (r0 >= 0) goto L_0x0017
            r2 = r1
            goto L_0x0017
        L_0x002b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p4600h.p4601a.C89081x.m154596p(java.lang.Iterable):java.lang.Comparable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends java.lang.Comparable<? super T>> T m154597q(java.lang.Iterable<? extends T> r3) {
        /*
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x0011
            r0 = 0
            return r0
        L_0x0011:
            java.lang.Object r2 = r3.next()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
        L_0x0017:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r0 = r2.compareTo(r1)
            if (r0 <= 0) goto L_0x0017
            r2 = r1
            goto L_0x0017
        L_0x002b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p4600h.p4601a.C89081x.m154597q(java.lang.Iterable):java.lang.Comparable");
    }

    /* renamed from: b */
    public static final <T> T m154559b(Iterable<? extends T> iterable) {
        C89219l.m154721d(iterable, "");
        if (iterable instanceof List) {
            return (T) C89070n.m154579f((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return (T) it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: l */
    public static final <T> Set<T> m154592l(Iterable<? extends T> iterable) {
        Object next;
        C89219l.m154721d(iterable, "");
        if (!(iterable instanceof Collection)) {
            return C89047am.m154437a((Set) C89070n.m154562b((Iterable) iterable, (Collection) new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C89036ab.INSTANCE;
        }
        if (size != 1) {
            return (Set) C89070n.m154562b((Iterable) iterable, (Collection) new LinkedHashSet(C89041ag.m154411a(collection.size())));
        }
        if (iterable instanceof List) {
            next = ((List) iterable).get(0);
        } else {
            next = iterable.iterator().next();
        }
        return C89047am.m154436a(next);
    }

    /* renamed from: e */
    public static final int[] m154578e(Collection<Integer> collection) {
        C89219l.m154721d(collection, "");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Integer num : collection) {
            iArr[i] = num.intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: f */
    public static final long[] m154582f(Collection<Long> collection) {
        C89219l.m154721d(collection, "");
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (Long l : collection) {
            jArr[i] = l.longValue();
            i++;
        }
        return jArr;
    }

    /* renamed from: c */
    public static final byte[] m154569c(Collection<Byte> collection) {
        C89219l.m154721d(collection, "");
        byte[] bArr = new byte[collection.size()];
        int i = 0;
        for (Byte b : collection) {
            bArr[i] = b.byteValue();
            i++;
        }
        return bArr;
    }

    /* renamed from: d */
    public static final double[] m154575d(Collection<Double> collection) {
        C89219l.m154721d(collection, "");
        double[] dArr = new double[collection.size()];
        int i = 0;
        for (Double d : collection) {
            dArr[i] = d.doubleValue();
            i++;
        }
        return dArr;
    }

    /* renamed from: b */
    public static final boolean[] m154564b(Collection<Boolean> collection) {
        C89219l.m154721d(collection, "");
        boolean[] zArr = new boolean[collection.size()];
        int i = 0;
        for (Boolean bool : collection) {
            zArr[i] = bool.booleanValue();
            i++;
        }
        return zArr;
    }

    /* renamed from: a */
    public static final <T> int m154546a(List<? extends T> list, T t) {
        C89219l.m154721d(list, "");
        return list.indexOf(t);
    }

    /* renamed from: b */
    public static final <T> int m154558b(List<? extends T> list, T t) {
        C89219l.m154721d(list, "");
        return list.lastIndexOf(t);
    }

    /* renamed from: c */
    public static final <T> Set<T> m154568c(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C89219l.m154721d(iterable, "");
        C89219l.m154721d(iterable2, "");
        Set<T> o = C89070n.m154595o(iterable);
        C89070n.m154538b((Collection) o, (Iterable) iterable2);
        return o;
    }

    /* renamed from: d */
    public static final <T> Set<T> m154574d(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C89219l.m154721d(iterable, "");
        C89219l.m154721d(iterable2, "");
        Set<T> o = C89070n.m154595o(iterable);
        C89070n.m154535a((Collection) o, (Iterable) iterable2);
        return o;
    }

    /* renamed from: b */
    public static final <T> T m154560b(Iterable<? extends T> iterable, int i) {
        C89219l.m154721d(iterable, "");
        return iterable instanceof List ? (T) ((List) iterable).get(i) : (T) C89070n.m154549a(iterable, i, new C89083b(i));
    }

    /* renamed from: b */
    public static final <T> int m154557b(Iterable<? extends T> iterable, T t) {
        C89219l.m154721d(iterable, "");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (Object obj : iterable) {
            if (i < 0) {
                C89070n.m154520a();
            }
            if (C89219l.m154714a((Object) t, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: c */
    public static final <T> List<T> m154567c(List<? extends T> list, int i) {
        C89219l.m154721d(list, "");
        if (i >= 0) {
            return C89070n.m154571d((Iterable) list, C89271h.m154769b(list.size() - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: d */
    public static final <T> List<T> m154571d(Iterable<? extends T> iterable, int i) {
        C89219l.m154721d(iterable, "");
        int i2 = 0;
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return C89086z.INSTANCE;
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return C89070n.m154590j(iterable);
                }
                if (i == 1) {
                    return C89070n.m154516a(C89070n.m154559b(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return C89070n.m154521b((List) arrayList);
        }
    }

    /* renamed from: e */
    public static final <T> List<T> m154577e(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C89219l.m154721d(iterable, "");
        C89219l.m154721d(iterable2, "");
        Collection a = C89070n.m154527a((Iterable) iterable2, (Iterable) iterable);
        if (a.isEmpty()) {
            return C89070n.m154590j(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!a.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public static final <T, R> List<C89378p<T, R>> m154581f(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        C89219l.m154721d(iterable, "");
        C89219l.m154721d(iterable2, "");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C89070n.m154526a(iterable, 10), C89070n.m154526a(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C89387v.m154943a(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final <T> T m154561b(List<? extends T> list, int i) {
        C89219l.m154721d(list, "");
        if (i < 0 || i > C89070n.m154517a((List) list)) {
            return null;
        }
        return (T) list.get(i);
    }

    /* renamed from: c */
    public static final <T> List<T> m154566c(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        C89219l.m154721d(iterable, "");
        int i2 = 0;
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return C89070n.m154590j(iterable);
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i;
                if (size <= 0) {
                    return C89086z.INSTANCE;
                }
                if (size == 1) {
                    return C89070n.m154516a(C89070n.m154570d(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i < size2) {
                            arrayList.add(((List) iterable).get(i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            for (Object obj : iterable) {
                if (i2 >= i) {
                    arrayList.add(obj);
                } else {
                    i2++;
                }
            }
            return C89070n.m154521b((List) arrayList);
        }
    }

    /* renamed from: d */
    public static final <T> List<T> m154572d(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        C89219l.m154721d(collection, "");
        C89219l.m154721d(iterable, "");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C89070n.m154535a((Collection) arrayList2, (Iterable) iterable);
        return arrayList2;
    }

    /* renamed from: b */
    public static final <T, C extends Collection<? super T>> C m154562b(Iterable<? extends T> iterable, C c) {
        C89219l.m154721d(iterable, "");
        C89219l.m154721d(c, "");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c.add(it.next());
        }
        return c;
    }

    /* renamed from: d */
    public static final <T> List<T> m154573d(List<? extends T> list, int i) {
        C89219l.m154721d(list, "");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return C89086z.INSTANCE;
        } else {
            int size = list.size();
            if (i >= size) {
                return C89070n.m154590j(list);
            }
            if (i == 1) {
                return C89070n.m154516a(C89070n.m154586h((List) list));
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i2 = size - i; i2 < size; i2++) {
                    arrayList.add(list.get(i2));
                }
            } else {
                ListIterator<? extends T> listIterator = list.listIterator(size - i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public static final <C extends Collection<? super T>, T> C m154552a(Iterable<? extends T> iterable, C c) {
        C89219l.m154721d(iterable, "");
        C89219l.m154721d(c, "");
        for (Object obj : iterable) {
            if (obj != null) {
                c.add(obj);
            }
        }
        return c;
    }

    /* renamed from: b */
    public static final <T> Set<T> m154563b(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C89219l.m154721d(iterable, "");
        C89219l.m154721d(iterable2, "");
        Set<T> o = C89070n.m154595o(iterable);
        C89070n.m154540c((Collection) o, (Iterable) iterable2);
        return o;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.util.Collection */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T> List<T> m154553a(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        C89219l.m154721d(iterable, "");
        C89219l.m154721d(comparator, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return C89070n.m154590j(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            C89064i.m154467a(array, (Comparator) comparator);
            return C89064i.m154463a(array);
        }
        List<T> k = C89070n.m154591k(iterable);
        C89070n.m154530a((List) k, (Comparator) comparator);
        return k;
    }

    /* renamed from: a */
    public static final <T> T m154549a(Iterable<? extends T> iterable, int i, AbstractC89172b<? super Integer, ? extends T> bVar) {
        C89219l.m154721d(iterable, "");
        C89219l.m154721d(bVar, "");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i < 0 || i > C89070n.m154517a(list)) ? (T) bVar.invoke(Integer.valueOf(i)) : (T) list.get(i);
        } else if (i < 0) {
            return (T) bVar.invoke(Integer.valueOf(i));
        } else {
            int i2 = 0;
            for (T t : iterable) {
                int i3 = i2 + 1;
                if (i == i2) {
                    return t;
                }
                i2 = i3;
            }
            return (T) bVar.invoke(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public static final <T> String m154550a(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, AbstractC89172b<? super T, ? extends CharSequence> bVar) {
        C89219l.m154721d(iterable, "");
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(charSequence2, "");
        C89219l.m154721d(charSequence3, "");
        C89219l.m154721d(charSequence4, "");
        String sb = ((StringBuilder) C89070n.m154548a(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, bVar)).toString();
        C89219l.m154716b(sb, "");
        return sb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r8 >= 0) goto L_0x0038;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, A extends java.lang.Appendable> A m154548a(java.lang.Iterable<? extends T> r3, A r4, java.lang.CharSequence r5, java.lang.CharSequence r6, java.lang.CharSequence r7, int r8, java.lang.CharSequence r9, p4600h.p4611f.p4612a.AbstractC89172b<? super T, ? extends java.lang.CharSequence> r10) {
        /*
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r4, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r6, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r7, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r9, r0)
            r4.append(r6)
            java.util.Iterator r3 = r3.iterator()
            r2 = 0
        L_0x001c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r1 = r3.next()
            int r2 = r2 + 1
            r0 = 1
            if (r2 <= r0) goto L_0x002e
            r4.append(r5)
        L_0x002e:
            if (r8 < 0) goto L_0x0032
            if (r2 > r8) goto L_0x0038
        L_0x0032:
            p4600h.p4622m.C89361p.m154851a(r4, r1, r10)
            goto L_0x001c
        L_0x0036:
            if (r8 < 0) goto L_0x003d
        L_0x0038:
            if (r2 <= r8) goto L_0x003d
            r4.append(r9)
        L_0x003d:
            r4.append(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p4600h.p4601a.C89081x.m154548a(java.lang.Iterable, java.lang.Appendable, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, h.f.a.b):java.lang.Appendable");
    }

    /* renamed from: a */
    public static /* synthetic */ String m154551a(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, AbstractC89172b bVar, int i2) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            bVar = null;
        }
        return C89070n.m154550a(iterable, charSequence, charSequence2, charSequence3, i, charSequence4, bVar);
    }
}

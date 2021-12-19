package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.RandomAccess;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.AbstractC89306h;

/* renamed from: h.a.u */
public class C89078u extends C89077t {
    static {
        Covode.recordClassIndex(105162);
    }

    /* renamed from: d */
    public static final <T> T m154541d(List<T> list) {
        C89219l.m154721d(list, "");
        if (!list.isEmpty()) {
            return list.remove(C89070n.m154517a((List) list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: a */
    public static final <T> boolean m154532a(Iterable<? extends T> iterable, AbstractC89172b<? super T, Boolean> bVar) {
        C89219l.m154721d(iterable, "");
        C89219l.m154721d(bVar, "");
        return m154533a(iterable, bVar, true);
    }

    /* renamed from: a */
    public static final <T> boolean m154534a(Collection<? super T> collection, AbstractC89306h<? extends T> hVar) {
        C89219l.m154721d(collection, "");
        C89219l.m154721d(hVar, "");
        Iterator<? extends T> a = hVar.mo2926a();
        boolean z = false;
        while (a.hasNext()) {
            if (collection.add((Object) a.next())) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public static final <T> boolean m154538b(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C89219l.m154721d(collection, "");
        C89219l.m154721d(iterable, "");
        return C89206ad.m154680b(collection).removeAll(C89070n.m154527a((Iterable) iterable, (Iterable) collection));
    }

    /* renamed from: c */
    public static final <T> boolean m154540c(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C89219l.m154721d(collection, "");
        C89219l.m154721d(iterable, "");
        return C89206ad.m154680b(collection).retainAll(C89070n.m154527a((Iterable) iterable, (Iterable) collection));
    }

    /* renamed from: a */
    public static final <T> boolean m154535a(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C89219l.m154721d(collection, "");
        C89219l.m154721d(iterable, "");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add((Object) it.next())) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    private static final <T> boolean m154539b(List<T> list, AbstractC89172b<? super T, Boolean> bVar) {
        int i;
        if (!(list instanceof RandomAccess)) {
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T>");
            return m154533a(C89206ad.m154675a(list), bVar, true);
        }
        int a = C89070n.m154517a((List) list);
        if (a >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                T t = list.get(i2);
                if (!bVar.invoke(t).booleanValue()) {
                    if (i != i2) {
                        list.set(i, t);
                    }
                    i++;
                }
                if (i2 == a) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int a2 = C89070n.m154517a((List) list);
        if (a2 >= i) {
            while (true) {
                list.remove(a2);
                if (a2 == i) {
                    break;
                }
                a2--;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static final <T> boolean m154536a(Collection<? super T> collection, T[] tArr) {
        C89219l.m154721d(collection, "");
        C89219l.m154721d(tArr, "");
        return collection.addAll(C89064i.m154463a((Object[]) tArr));
    }

    /* renamed from: a */
    public static final <T> boolean m154537a(List<T> list, AbstractC89172b<? super T, Boolean> bVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(bVar, "");
        return m154539b(list, bVar);
    }

    /* renamed from: a */
    public static final <T> boolean m154533a(Iterable<? extends T> iterable, AbstractC89172b<? super T, Boolean> bVar, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (bVar.invoke((Object) it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }
}

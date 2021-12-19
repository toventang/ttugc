package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.a.q */
public class C89073q extends C89072p {
    static {
        Covode.recordClassIndex(105157);
    }

    /* renamed from: a */
    public static final <T> List<T> m154528a(Iterable<? extends Iterable<? extends T>> iterable) {
        C89219l.m154721d(iterable, "");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            C89070n.m154535a((Collection) arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final <T> int m154526a(Iterable<? extends T> iterable, int i) {
        C89219l.m154721d(iterable, "");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }

    /* renamed from: a */
    public static final <T> Collection<T> m154527a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C89219l.m154721d(iterable, "");
        C89219l.m154721d(iterable2, "");
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (iterable instanceof Collection) {
            if ((iterable2 instanceof Collection) && ((Collection) iterable2).size() < 2) {
                return (Collection) iterable;
            }
            Collection<T> collection = (Collection) iterable;
            if (collection.size() <= 2 || !(collection instanceof ArrayList)) {
                return collection;
            }
        }
        return C89070n.m154589i(iterable);
    }
}

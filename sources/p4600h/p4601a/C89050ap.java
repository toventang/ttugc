package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.a.ap */
public class C89050ap extends C89049ao {
    static {
        Covode.recordClassIndex(105134);
    }

    /* renamed from: a */
    public static final <T> Set<T> m154441a(Set<? extends T> set, Iterable<? extends T> iterable) {
        C89219l.m154721d(set, "");
        C89219l.m154721d(iterable, "");
        Collection<?> a = C89070n.m154527a((Iterable) iterable, (Iterable) set);
        if (a.isEmpty()) {
            return C89070n.m154592l(set);
        }
        if (a instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t : set) {
                if (!a.contains(t)) {
                    linkedHashSet.add(t);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(a);
        return linkedHashSet2;
    }
}

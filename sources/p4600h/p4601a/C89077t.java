package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.a.t */
public class C89077t extends C89076s {
    static {
        Covode.recordClassIndex(105161);
    }

    /* renamed from: c */
    public static final <T extends Comparable<? super T>> void m154531c(List<T> list) {
        C89219l.m154721d(list, "");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* renamed from: a */
    public static final <T> void m154530a(List<T> list, Comparator<? super T> comparator) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(comparator, "");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}

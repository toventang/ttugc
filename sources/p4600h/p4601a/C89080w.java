package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.a.w */
public class C89080w extends C89079v {
    static {
        Covode.recordClassIndex(105164);
    }

    /* renamed from: e */
    public static final <T> void m154545e(List<T> list) {
        C89219l.m154721d(list, "");
        Collections.reverse(list);
    }

    /* renamed from: a */
    public static final <R> List<R> m154544a(Iterable<?> iterable, Class<R> cls) {
        C89219l.m154721d(iterable, "");
        C89219l.m154721d(cls, "");
        return (List) C89070n.m154543a(iterable, new ArrayList(), cls);
    }

    /* renamed from: a */
    public static final <C extends Collection<? super R>, R> C m154543a(Iterable<?> iterable, C c, Class<R> cls) {
        C89219l.m154721d(iterable, "");
        C89219l.m154721d(c, "");
        C89219l.m154721d(cls, "");
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                c.add(obj);
            }
        }
        return c;
    }
}

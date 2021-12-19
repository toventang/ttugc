package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.a.ao */
public class C89049ao extends C89048an {
    static {
        Covode.recordClassIndex(105133);
    }

    /* renamed from: a */
    public static final <T> Set<T> m154438a(T... tArr) {
        C89219l.m154721d(tArr, "");
        if (tArr.length > 0) {
            return C89064i.m154510k(tArr);
        }
        return C89036ab.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Set<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T> Set<T> m154437a(Set<? extends T> set) {
        C89219l.m154721d(set, "");
        int size = set.size();
        if (size == 0) {
            return C89036ab.INSTANCE;
        }
        if (size != 1) {
            return set;
        }
        return C89047am.m154436a(set.iterator().next());
    }

    /* renamed from: b */
    public static final <T> Set<T> m154439b(T... tArr) {
        C89219l.m154721d(tArr, "");
        return (Set) C89064i.m154496b((Object[]) tArr, (Collection) new LinkedHashSet(C89041ag.m154411a(tArr.length)));
    }

    /* renamed from: c */
    public static final <T> HashSet<T> m154440c(T... tArr) {
        C89219l.m154721d(tArr, "");
        return (HashSet) C89064i.m154496b((Object[]) tArr, (Collection) new HashSet(C89041ag.m154411a(tArr.length)));
    }
}

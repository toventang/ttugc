package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89269g;

/* renamed from: h.a.p */
public class C89072p extends C89071o {
    static {
        Covode.recordClassIndex(105156);
    }

    /* renamed from: a */
    public static final void m154520a() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* renamed from: b */
    public static final void m154523b() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: a */
    public static final <T> int m154517a(List<? extends T> list) {
        C89219l.m154721d(list, "");
        return list.size() - 1;
    }

    /* renamed from: b */
    public static final <T> List<T> m154522b(T... tArr) {
        C89219l.m154721d(tArr, "");
        if (tArr.length > 0) {
            return C89064i.m154463a((Object[]) tArr);
        }
        return C89086z.INSTANCE;
    }

    /* renamed from: a */
    public static final C89269g m154518a(Collection<?> collection) {
        C89219l.m154721d(collection, "");
        return new C89269g(0, collection.size() - 1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final <T> List<T> m154521b(List<? extends T> list) {
        C89219l.m154721d(list, "");
        int size = list.size();
        if (size == 0) {
            return C89086z.INSTANCE;
        }
        if (size != 1) {
            return list;
        }
        return C89070n.m154516a(list.get(0));
    }

    /* renamed from: c */
    public static final <T> List<T> m154524c(T... tArr) {
        C89219l.m154721d(tArr, "");
        if (tArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C89061g(tArr, true));
    }

    /* renamed from: d */
    public static final <T> ArrayList<T> m154525d(T... tArr) {
        C89219l.m154721d(tArr, "");
        if (tArr.length == 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(new C89061g(tArr, true));
    }

    /* renamed from: a */
    public static final <T> Collection<T> m154519a(T[] tArr) {
        C89219l.m154721d(tArr, "");
        return new C89061g(tArr, false);
    }
}

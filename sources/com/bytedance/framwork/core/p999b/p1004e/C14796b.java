package com.bytedance.framwork.core.p999b.p1004e;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.framwork.core.b.e.b */
public final class C14796b {

    /* renamed from: com.bytedance.framwork.core.b.e.b$a */
    public interface AbstractC14797a<A, B> {
        static {
            Covode.recordClassIndex(16897);
        }

        /* renamed from: a */
        boolean mo23826a(A a, B b);
    }

    static {
        Covode.recordClassIndex(16896);
    }

    /* renamed from: a */
    public static boolean m27161a(List<?> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static <L, O> boolean m27160a(Collection<L> collection, O o, AbstractC14797a<? super L, O> aVar) {
        Iterator<L> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (aVar.mo23826a(it.next(), o)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}

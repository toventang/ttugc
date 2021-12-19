package com.bytedance.jedi.p1445a.p1454g.p1457c;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1454g.p1455a.C20198c;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.bytedance.jedi.a.g.c.b */
public final class C20265b {
    static {
        Covode.recordClassIndex(23773);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <T> boolean m38464a(Collection<T> collection, Iterator<? extends T> it) {
        C20198c.m38190a(collection);
        C20198c.m38190a(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }
}

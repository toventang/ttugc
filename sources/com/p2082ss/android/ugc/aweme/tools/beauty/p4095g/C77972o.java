package com.p2082ss.android.ugc.aweme.tools.beauty.p4095g;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.o */
public final class C77972o<T> extends CopyOnWriteArrayList<T> {
    static {
        Covode.recordClassIndex(91061);
    }

    public final int getSize() {
        return super.size();
    }

    public final int size() {
        return getSize();
    }

    @Override // java.util.List, java.util.Collection, java.util.concurrent.CopyOnWriteArrayList
    public final boolean add(T t) {
        remove(t);
        return super.add(t);
    }

    @Override // java.util.List, java.util.concurrent.CopyOnWriteArrayList
    public final T remove(int i) {
        return (T) removeAt(i);
    }

    public final Object removeAt(int i) {
        return super.remove(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection, java.util.concurrent.CopyOnWriteArrayList
    public final boolean addAll(Collection<? extends T> collection) {
        C89219l.m154721d(collection, "");
        removeAll(collection);
        return super.addAll(collection);
    }
}

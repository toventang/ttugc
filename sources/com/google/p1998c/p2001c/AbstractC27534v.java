package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import java.util.Set;

/* renamed from: com.google.c.c.v */
public abstract class AbstractC27534v<E> extends AbstractC27532t<E> implements Set<E> {
    static {
        Covode.recordClassIndex(33114);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Set<E> mo45371c();

    public int hashCode() {
        return mo45371c().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this || mo45371c().equals(obj)) {
            return true;
        }
        return false;
    }
}

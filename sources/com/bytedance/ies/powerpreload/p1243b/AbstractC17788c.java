package com.bytedance.ies.powerpreload.p1243b;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.ies.powerpreload.b.c */
public interface AbstractC17788c<T, R> extends AbstractC17789d {
    static {
        Covode.recordClassIndex(20352);
    }

    C17794i getPreloadStrategy(Bundle bundle);

    boolean handleException(Exception exc);

    R preload(Bundle bundle, AbstractC89172b<? super Class<T>, ? extends T> bVar);
}

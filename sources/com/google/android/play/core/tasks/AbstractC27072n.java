package com.google.android.play.core.tasks;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.play.core.tasks.n */
public abstract class AbstractC27072n extends RuntimeException {
    static {
        Covode.recordClassIndex(32552);
    }

    public AbstractC27072n(String str) {
        super(str);
    }

    public AbstractC27072n(Throwable th) {
        super(th);
    }

    public abstract int getErrorCode();
}

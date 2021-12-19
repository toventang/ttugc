package com.ttnet.org.chromium.net;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ttnet.org.chromium.net.k */
public abstract class AbstractC87646k extends AbstractC87540d {
    static {
        Covode.recordClassIndex(103628);
    }

    public abstract int getCronetInternalErrorCode();

    public abstract int getErrorCode();

    public abstract boolean immediatelyRetryable();

    public AbstractC87646k(String str, Throwable th) {
        super(str, th);
    }
}

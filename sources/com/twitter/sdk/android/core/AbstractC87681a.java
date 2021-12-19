package com.twitter.sdk.android.core;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.twitter.sdk.android.core.a */
public abstract class AbstractC87681a {
    @AbstractC27891c(mo46611a = "created_at")

    /* renamed from: a */
    protected final long f199175a;

    static {
        Covode.recordClassIndex(103668);
    }

    public AbstractC87681a() {
        this(System.currentTimeMillis());
    }

    private AbstractC87681a(long j) {
        this.f199175a = j;
    }
}

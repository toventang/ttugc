package com.p4501vk.api.sdk.p4503b;

import com.bytedance.covode.number.Covode;
import com.p4501vk.api.sdk.C87860d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.b.f */
public abstract class AbstractC87844f<T> extends AbstractC87840b<T> {

    /* renamed from: c */
    public final int f199550c;

    static {
        Covode.recordClassIndex(103854);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC87844f(C87860d dVar, int i) {
        super(dVar);
        C89219l.m154719c(dVar, "");
        this.f199550c = i;
        if (i < 0) {
            throw new IllegalArgumentException("retryLimit must be >= 0");
        }
    }
}

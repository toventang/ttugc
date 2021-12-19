package com.p2082ss.android.ugc.aweme.utils;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.ij */
public final class C80576ij<T> extends C1213t<T> {

    /* renamed from: a */
    private boolean f180192a = true;

    /* renamed from: b */
    private T f180193b;

    static {
        Covode.recordClassIndex(93849);
    }

    /* renamed from: a */
    private final void m139670a(T t) {
        this.f180193b = t;
        super.setValue(t);
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.C1213t
    public final void setValue(T t) {
        if (this.f180192a) {
            m139670a(t);
            this.f180192a = false;
        } else if (!C89219l.m154714a((Object) this.f180193b, (Object) t)) {
            m139670a(t);
        }
    }
}

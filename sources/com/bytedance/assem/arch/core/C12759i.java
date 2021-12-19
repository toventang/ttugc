package com.bytedance.assem.arch.core;

import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.covode.number.Covode;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.core.i */
public final class C12759i<T extends AbstractC12779c> {

    /* renamed from: a */
    public T f31026a;

    /* renamed from: b */
    public String f31027b;

    static {
        Covode.recordClassIndex(14583);
    }

    /* renamed from: a */
    public final C89378p<String, T> mo20616a() {
        String str = this.f31027b;
        T t = this.f31026a;
        if (t == null) {
            C89219l.m154710a("data");
        }
        return C89387v.m154943a(str, t);
    }

    /* renamed from: a */
    public final void mo20617a(T t) {
        C89219l.m154719c(t, "");
        this.f31026a = t;
    }
}

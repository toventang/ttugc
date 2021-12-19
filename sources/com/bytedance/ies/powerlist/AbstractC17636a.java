package com.bytedance.ies.powerlist;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerlist.a */
public abstract class AbstractC17636a<T> {

    /* renamed from: a */
    final C1213t<C17640b<T>> f42188a = new C1213t<>();

    static {
        Covode.recordClassIndex(20189);
    }

    /* renamed from: a */
    public final void mo28104a(List<? extends T> list, boolean z) {
        C89219l.m154719c(list, "");
        this.f42188a.postValue(new C17640b<>(list, z));
    }
}

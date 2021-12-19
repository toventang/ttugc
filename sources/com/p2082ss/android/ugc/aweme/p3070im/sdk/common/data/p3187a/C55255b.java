package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3187a;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.a.b */
public final class C55255b<T> extends C1213t<T> {
    static {
        Covode.recordClassIndex(65002);
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.C1213t
    public final void postValue(T t) {
        if (!C89219l.m154714a((Object) getValue(), (Object) t)) {
            super.postValue(t);
        }
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.C1213t
    public final void setValue(T t) {
        if (!C89219l.m154714a((Object) getValue(), (Object) t)) {
            super.setValue(t);
        }
    }
}

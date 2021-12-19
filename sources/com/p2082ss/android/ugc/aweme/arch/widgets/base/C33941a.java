package com.p2082ss.android.ugc.aweme.arch.widgets.base;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.a */
public final class C33941a<T> extends C33943c<T> {
    static {
        Covode.recordClassIndex(40866);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c, androidx.lifecycle.LiveData, androidx.lifecycle.C1213t
    public final void postValue(T t) {
        if (!C89219l.m154714a((Object) getValue(), (Object) t)) {
            super.postValue(t);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c, androidx.lifecycle.LiveData, androidx.lifecycle.C1213t
    public final void setValue(T t) {
        if (!C89219l.m154714a((Object) getValue(), (Object) t)) {
            super.setValue(t);
        }
    }
}

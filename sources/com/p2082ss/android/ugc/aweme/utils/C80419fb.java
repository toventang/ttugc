package com.p2082ss.android.ugc.aweme.utils;

import android.os.Looper;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.fb */
public final class C80419fb {
    static {
        Covode.recordClassIndex(93687);
    }

    /* renamed from: a */
    public static final <T> void m139411a(C1213t<T> tVar, T t) {
        C89219l.m154721d(tVar, "");
        if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
            tVar.setValue(t);
        } else {
            tVar.postValue(t);
        }
    }
}

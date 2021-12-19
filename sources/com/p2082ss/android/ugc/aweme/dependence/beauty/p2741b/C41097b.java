package com.p2082ss.android.ugc.aweme.dependence.beauty.p2741b;

import android.os.Looper;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.dependence.beauty.b.b */
public final class C41097b {
    static {
        Covode.recordClassIndex(48967);
    }

    /* renamed from: a */
    public static final <T> void m82776a(C1213t<T> tVar, T t) {
        C89219l.m154721d(tVar, "");
        if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
            tVar.setValue(t);
        } else {
            tVar.postValue(t);
        }
    }
}

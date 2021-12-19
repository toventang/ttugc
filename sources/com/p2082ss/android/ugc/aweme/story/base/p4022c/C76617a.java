package com.p2082ss.android.ugc.aweme.story.base.p4022c;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.base.c.a */
public final class C76617a {
    static {
        Covode.recordClassIndex(89603);
    }

    /* renamed from: b */
    public static final <T> void m134205b(LiveData<T> liveData, T t) {
        C89219l.m154721d(liveData, "");
        if ((liveData instanceof C1213t) && liveData != null) {
            liveData.postValue(t);
        }
    }

    /* renamed from: a */
    public static final <T> void m134204a(LiveData<T> liveData, T t) {
        C89219l.m154721d(liveData, "");
        if (!(liveData instanceof C1213t)) {
            liveData = null;
        }
        C1213t tVar = (C1213t) liveData;
        if (tVar != null) {
            tVar.setValue(t);
        }
    }
}

package com.p2082ss.android.ugc.aweme.notice.api.p3508a;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61556h;
import com.p2082ss.android.ugc.aweme.notice.api.p3514e.AbstractC61583e;

/* renamed from: com.ss.android.ugc.aweme.notice.api.a.b */
public final class C61535b implements AbstractC61583e {

    /* renamed from: a */
    private static final SparseArray<Class> f139677a;

    static {
        Covode.recordClassIndex(72203);
        SparseArray<Class> sparseArray = new SparseArray<>();
        f139677a = sparseArray;
        sparseArray.put(1, C61556h.class);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3514e.AbstractC61583e
    /* renamed from: a */
    public final Class mo99188a(int i) {
        return f139677a.get(i);
    }
}

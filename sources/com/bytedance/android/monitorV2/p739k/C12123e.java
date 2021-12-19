package com.bytedance.android.monitorV2.p739k;

import android.view.View;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.k.e */
public final class C12123e {

    /* renamed from: a */
    public final String f29153a;

    /* renamed from: b */
    private final WeakReference<View> f29154b;

    static {
        Covode.recordClassIndex(13852);
    }

    /* renamed from: a */
    public final View mo19496a() {
        return this.f29154b.get();
    }

    public C12123e(View view, String str) {
        C89219l.m154719c(view, "");
        C89219l.m154719c(str, "");
        this.f29153a = str;
        this.f29154b = new WeakReference<>(view);
    }
}

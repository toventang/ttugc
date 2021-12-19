package com.p2082ss.android.ugc.aweme.prop.p3607c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* renamed from: com.ss.android.ugc.aweme.prop.c.d */
final /* synthetic */ class C65313d implements AbstractC89183m {

    /* renamed from: a */
    static final AbstractC89183m f147425a = new C65313d();

    static {
        Covode.recordClassIndex(76792);
    }

    private C65313d() {
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89183m
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(TextUtils.equals(((Aweme) obj).getAid(), ((Aweme) obj2).getAid()));
    }
}

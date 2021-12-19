package com.p2082ss.android.ugc.aweme.question.p3663e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* renamed from: com.ss.android.ugc.aweme.question.e.c */
final /* synthetic */ class C66524c implements AbstractC89183m {

    /* renamed from: a */
    static final AbstractC89183m f149583a = new C66524c();

    static {
        Covode.recordClassIndex(78067);
    }

    private C66524c() {
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89183m
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(TextUtils.equals(((Aweme) obj).getAid(), ((Aweme) obj2).getAid()));
    }
}

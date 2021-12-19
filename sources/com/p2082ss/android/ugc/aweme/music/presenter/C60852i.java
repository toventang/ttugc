package com.p2082ss.android.ugc.aweme.music.presenter;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.i */
final /* synthetic */ class C60852i implements AbstractC89183m {

    /* renamed from: a */
    static final AbstractC89183m f138280a = new C60852i();

    static {
        Covode.recordClassIndex(71440);
    }

    private C60852i() {
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89183m
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(TextUtils.equals(((Aweme) obj).getAid(), ((Aweme) obj2).getAid()));
    }
}

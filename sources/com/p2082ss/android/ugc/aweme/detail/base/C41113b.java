package com.p2082ss.android.ugc.aweme.detail.base;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.utils.C80635y;

/* renamed from: com.ss.android.ugc.aweme.detail.base.b */
public final class C41113b {
    static {
        Covode.recordClassIndex(48993);
    }

    /* renamed from: a */
    public static void m82815a(View view, Aweme aweme) {
        if (C80635y.m139811f(aweme)) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }
}

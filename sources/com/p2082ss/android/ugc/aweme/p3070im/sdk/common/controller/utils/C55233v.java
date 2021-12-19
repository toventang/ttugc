package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.v */
public final class C55233v {

    /* renamed from: a */
    public static final C55233v f126321a = new C55233v();

    private C55233v() {
    }

    static {
        Covode.recordClassIndex(64980);
    }

    /* renamed from: a */
    public static final void m101004a(View view) {
        C89219l.m154721d(view, "");
        m101005a(view, R.drawable.aq1, R.color.l);
    }

    /* renamed from: a */
    public static final void m101005a(View view, int i, int i2) {
        C89219l.m154721d(view, "");
        if (Build.VERSION.SDK_INT < 21) {
            C55173ae.m100882a(view);
            view.setBackground(view.getResources().getDrawable(i2));
            return;
        }
        view.setBackground(view.getResources().getDrawable(i));
    }
}

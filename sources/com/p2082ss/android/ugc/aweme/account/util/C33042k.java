package com.p2082ss.android.ugc.aweme.account.util;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.account.util.k */
public final class C33042k {

    /* renamed from: a */
    public static final C33042k f78589a = new C33042k();

    private C33042k() {
    }

    static {
        Covode.recordClassIndex(39849);
    }

    /* renamed from: a */
    public static final void m67676a(View view, int i, int i2) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i2;
            layoutParams.width = i;
            view.setLayoutParams(layoutParams);
        }
    }
}

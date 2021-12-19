package com.p2082ss.android.ugc.aweme.discover.helper;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41499ag;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.n */
public final class C42041n {

    /* renamed from: a */
    public static final C42041n f98012a = new C42041n();

    private C42041n() {
    }

    static {
        Covode.recordClassIndex(49971);
    }

    /* renamed from: a */
    public static Drawable m84141a(int i, Context context, int i2) {
        if (context == null) {
            return null;
        }
        if (i == 1) {
            return C0643b.m2369a(context, 2131233631);
        }
        return C0643b.m2369a(context, i2);
    }

    /* renamed from: a */
    public static Drawable m84142a(Aweme aweme, Context context, int i) {
        if (context == null) {
            return null;
        }
        if (aweme == null || aweme.getUserDigg() != 1) {
            return C0643b.m2369a(context, i);
        }
        if (C41499ag.m83448c()) {
            return C0643b.m2369a(context, 2131233633);
        }
        return C0643b.m2369a(context, 2131233632);
    }
}

package com.bytedance.tux.p1722h;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.h.e */
public final class C23158e {
    static {
        Covode.recordClassIndex(27087);
    }

    /* renamed from: a */
    public static final int m43647a(Context context) {
        C89219l.m154719c(context, "");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }
}

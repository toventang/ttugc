package com.bytedance.ies.dmt.p1194ui.common;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.common.c */
public final class C17177c {
    static {
        Covode.recordClassIndex(19635);
    }

    /* renamed from: a */
    public static int m31709a(Context context) {
        if (C17175b.m31708b(context)) {
            return Color.parseColor("#161823");
        }
        return C0643b.m2378c(context, R.color.bx);
    }

    /* renamed from: b */
    public static int m31710b(Context context) {
        if (C17175b.m31708b(context)) {
            return Color.parseColor("#80161823");
        }
        return C0643b.m2378c(context, R.color.c5);
    }

    /* renamed from: c */
    public static Drawable m31711c(Context context) {
        int i;
        Resources resources = context.getResources();
        if (C17175b.m31708b(context)) {
            i = R.drawable.cc4;
        } else {
            i = R.drawable.cc3;
        }
        return resources.getDrawable(i);
    }
}

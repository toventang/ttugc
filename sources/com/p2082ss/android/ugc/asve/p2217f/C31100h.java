package com.p2082ss.android.ugc.asve.p2217f;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.f.h */
public final class C31100h {

    /* renamed from: a */
    public static final C31100h f74519a = new C31100h();

    private C31100h() {
    }

    static {
        Covode.recordClassIndex(37739);
    }

    /* renamed from: b */
    public static final int m64304b(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        C89219l.m154716b(resources, "");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.heightPixels;
        }
        return 0;
    }

    /* renamed from: a */
    public static final int m64303a(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        C89219l.m154716b(resources, "");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.widthPixels;
        }
        return 0;
    }

    /* renamed from: a */
    public static final float m64302a(Context context, float f) {
        C89219l.m154721d(context, "");
        Resources resources = context.getResources();
        C89219l.m154716b(resources, "");
        return (f * resources.getDisplayMetrics().density) + 0.5f;
    }
}

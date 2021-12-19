package com.p2082ss.android.ugc.tools.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.utils.r */
public final class C84912r {

    /* renamed from: a */
    public static final C84912r f189749a = new C84912r();

    private C84912r() {
    }

    static {
        Covode.recordClassIndex(98906);
    }

    /* renamed from: a */
    public static final boolean m145932a(View view) {
        C89219l.m154721d(view, "");
        if (C0792v.m2768e(view) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final float m145929a(float f) {
        Resources system = Resources.getSystem();
        C89219l.m154716b(system, "");
        return (f * system.getDisplayMetrics().density) + 0.5f;
    }

    /* renamed from: b */
    public static final int m145933b(Context context) {
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

    /* renamed from: c */
    public static final boolean m145935c(Context context) {
        C89219l.m154721d(context, "");
        int i = Build.VERSION.SDK_INT;
        Resources resources = context.getResources();
        C89219l.m154716b(resources, "");
        Configuration configuration = resources.getConfiguration();
        C89219l.m154716b(configuration, "");
        if (configuration.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final int m145931a(Context context) {
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
    public static final float m145930a(Context context, float f) {
        C89219l.m154721d(context, "");
        Resources resources = context.getResources();
        C89219l.m154716b(resources, "");
        return (f * resources.getDisplayMetrics().density) + 0.5f;
    }

    /* renamed from: b */
    public static final int m145934b(Context context, float f) {
        C89219l.m154721d(context, "");
        Resources resources = context.getResources();
        C89219l.m154716b(resources, "");
        return (int) ((f / resources.getDisplayMetrics().density) + 0.5f);
    }
}

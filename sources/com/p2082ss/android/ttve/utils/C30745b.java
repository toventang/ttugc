package com.p2082ss.android.ttve.utils;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ttve.utils.b */
public final class C30745b {

    /* renamed from: a */
    public static final boolean f73601a;

    /* renamed from: b */
    public static C30746a f73602b = new C30746a();

    /* renamed from: c */
    private static int f73603c = -1;

    /* renamed from: com.ss.android.ttve.utils.b$a */
    public static class C30746a {
        static {
            Covode.recordClassIndex(37355);
        }
    }

    static {
        boolean z;
        Covode.recordClassIndex(37354);
        if (Build.VERSION.SDK_INT > 19) {
            z = true;
        } else {
            z = false;
        }
        f73601a = z;
    }

    /* renamed from: a */
    public static final int m63131a(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }

    /* renamed from: b */
    public static final int m63133b(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.heightPixels;
    }

    /* renamed from: a */
    public static float m63130a(Context context, float f) {
        return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public static float m63132b(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }
}

package com.bytedance.android.live.core.p218f;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.core.p218f.p220b.C3911a;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.android.live.core.f.d */
public final class C3931d {
    static {
        Covode.recordClassIndex(4460);
    }

    /* renamed from: a */
    public static boolean m9571a(Context context) {
        if (m9572b(context) || new C3911a(context).f10801a || m9573c(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m9573c(Context context) {
        String string;
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            if (identifier <= 0 || (string = resources.getString(identifier)) == null || TextUtils.isEmpty(string)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private static boolean m9572b(Context context) {
        ActivityC0945e a = C11279p.m20001a(context);
        if (a == null || Build.VERSION.SDK_INT < 28) {
            return false;
        }
        View decorView = a.getWindow().getDecorView();
        try {
            Object invoke = decorView.getClass().getMethod("getRootWindowInsets", new Class[0]).invoke(decorView, new Object[0]);
            Object invoke2 = invoke.getClass().getDeclaredMethod("getDisplayCutout", new Class[0]).invoke(invoke, new Object[0]);
            List list = (List) invoke2.getClass().getMethod("getBoundingRects", new Class[0]).invoke(invoke2, new Object[0]);
            if (list == null || list.size() <= 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

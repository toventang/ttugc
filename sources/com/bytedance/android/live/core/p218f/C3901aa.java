package com.bytedance.android.live.core.p218f;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.f.aa */
public final class C3901aa {
    static {
        Covode.recordClassIndex(4430);
    }

    /* renamed from: a */
    public static int m9530a(Context context) {
        Resources resources;
        int identifier;
        if (m9531b(context) && (identifier = (resources = context.getResources()).getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: b */
    private static boolean m9531b(Context context) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class).invoke(cls, "qemu.hw.mainkeys");
            if ("1".equals(str)) {
                return false;
            }
            if ("0".equals(str)) {
                return true;
            }
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
            if (identifier > 0) {
                return resources.getBoolean(identifier);
            }
            return false;
        } catch (Exception unused) {
        }
    }
}

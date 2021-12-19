package com.p2082ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.uikit.p1281c.C18247a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.ss.android.ugc.aweme.utils.hh */
public final class C80534hh {
    static {
        Covode.recordClassIndex(93807);
    }

    /* renamed from: a */
    public static boolean m139608a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m139609b() {
        int identifier = C17867d.m33078a().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return C17867d.m33078a().getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: c */
    public static int m139611c() {
        int i;
        try {
            int identifier = C17867d.m33078a().getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = C17867d.m33078a().getResources().getDimensionPixelSize(identifier);
            } else {
                i = 44;
            }
            return C13628n.m24522c(C17867d.m33078a(), (float) i);
        } catch (Exception e) {
            e.printStackTrace();
            return 44;
        }
    }

    /* renamed from: b */
    private static Context m139610b(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    public static void m139605a(Activity activity) {
        activity.getWindow().setFlags(1024, 1024);
        try {
            Class<?> loadClass = m139610b(activity).getClassLoader().loadClass("android.os.SystemProperties");
            if (((Integer) loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, "ro.miui.notch", 0)).intValue() == 1 && Build.VERSION.SDK_INT < 28) {
                try {
                    Window.class.getMethod("addExtraFlags", Integer.TYPE).invoke(activity.getWindow(), 768);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m139606a(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(i);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        C18247a.m33947a(activity, i);
    }

    /* renamed from: a */
    public static void m139607a(Activity activity, boolean z) {
        int i;
        if (Build.VERSION.SDK_INT >= 23 && activity != null) {
            int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility | 8192;
            } else {
                i = systemUiVisibility & -8193;
            }
            if (i != systemUiVisibility) {
                activity.getWindow().getDecorView().setSystemUiVisibility(i);
            }
        }
    }
}

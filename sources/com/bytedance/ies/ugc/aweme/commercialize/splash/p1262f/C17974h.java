package com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.p2321b.C33716a;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.f.h */
public final class C17974h {

    /* renamed from: a */
    public static final C17974h f42800a = new C17974h();

    private C17974h() {
    }

    static {
        Covode.recordClassIndex(20592);
    }

    /* renamed from: b */
    public static boolean m33454b(Activity activity) {
        Bundle bundle;
        try {
            activity.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil").getMethod("hasNotchInScreen", new Class[0]);
            try {
                ApplicationInfo a = m33451a(activity.getPackageManager(), activity.getPackageName());
                C89219l.m154716b(a, "");
                if (a == null || (bundle = a.metaData) == null || m33452a(bundle, "android.notch_support") == null) {
                    return false;
                }
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        } catch (Exception unused2) {
            return m33456d(activity);
        }
    }

    /* renamed from: c */
    public static boolean m33455c(Activity activity) {
        Bundle bundle;
        if (C33716a.m69032a("ro.miui.notch", activity) != 1) {
            return m33456d(activity);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        try {
            ApplicationInfo a = m33451a(activity.getPackageManager(), activity.getPackageName());
            C89219l.m154716b(a, "");
            if (a == null || (bundle = a.metaData) == null || m33452a(bundle, "notch.config") == null) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m33456d(Activity activity) {
        if (Build.VERSION.SDK_INT < 28) {
            return true;
        }
        Window window = activity.getWindow();
        C89219l.m154716b(window, "");
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes.layoutInDisplayCutoutMode == 1) {
            return true;
        }
        if (attributes.layoutInDisplayCutoutMode != 0 || m33457e(activity)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m33457e(Activity activity) {
        TypedValue typedValue = new TypedValue();
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(R.style.ma, new int[]{16843277});
        C89219l.m154716b(obtainStyledAttributes, "");
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.getValue(0, typedValue);
            obtainStyledAttributes.recycle();
        }
        if (typedValue.type != 18 || typedValue.data == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m33453a(Activity activity) {
        Bundle bundle;
        if (!activity.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism")) {
            return m33456d(activity);
        }
        try {
            ApplicationInfo a = m33451a(activity.getPackageManager(), activity.getPackageName());
            C89219l.m154716b(a, "");
            if (a == null || (bundle = a.metaData) == null || m33452a(bundle, "android.max_aspect") == null) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static Object m33452a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static ApplicationInfo m33451a(PackageManager packageManager, String str) {
        if (!TextUtils.equals(str, C17867d.m33078a().getPackageName())) {
            return packageManager.getApplicationInfo(str, 128);
        }
        if (C58014b.f132218a == null) {
            C58014b.f132218a = packageManager.getApplicationInfo(str, 128);
        }
        return C58014b.f132218a;
    }
}

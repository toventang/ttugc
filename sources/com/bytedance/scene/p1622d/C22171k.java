package com.bytedance.scene.p1622d;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Objects;

/* renamed from: com.bytedance.scene.d.k */
public final class C22171k {
    static {
        Covode.recordClassIndex(25975);
    }

    /* renamed from: a */
    public static Drawable m41655a(Context context) {
        if (!(context instanceof Activity)) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842836, typedValue, true);
            if (typedValue.type < 28 || typedValue.type > 31) {
                return context.getResources().getDrawable(typedValue.resourceId);
            }
            return new ColorDrawable(typedValue.data);
        }
        throw new IllegalArgumentException("Use Scene Context instead");
    }

    /* renamed from: a */
    public static void m41660a(View view) {
        MethodCollector.m26663i(10148);
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        MethodCollector.m26664o(10148);
    }

    /* renamed from: a */
    public static boolean m41661a(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (activity.isDestroyed()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static <T> T m41656a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: a */
    public static String m41657a(Context context, int i) {
        try {
            return context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    /* renamed from: a */
    public static String m41658a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(str2);
    }

    /* renamed from: a */
    public static void m41659a(FragmentManager fragmentManager, FragmentTransaction fragmentTransaction, boolean z) {
        if (Build.VERSION.SDK_INT < 24) {
            fragmentTransaction.commitAllowingStateLoss();
            if (z) {
                fragmentManager.executePendingTransactions();
            }
        } else if (z) {
            fragmentTransaction.commitNowAllowingStateLoss();
        } else {
            fragmentTransaction.commitAllowingStateLoss();
        }
    }
}

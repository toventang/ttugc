package com.bytedance.android.livesdk.utils;

import android.os.Build;
import android.view.Window;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.core.p218f.C3931d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.utils.ab */
public final class C11208ab {
    static {
        Covode.recordClassIndex(12836);
    }

    /* renamed from: a */
    public static void m19865a(Fragment fragment) {
        ActivityC0945e activity = fragment.getActivity();
        if (activity != null && C3931d.m9571a(activity)) {
            Window window = activity.getWindow();
            if (Build.VERSION.SDK_INT >= 21 && window != null) {
                if (window.getAttributes() == null || (window.getAttributes().flags & Integer.MIN_VALUE) != Integer.MIN_VALUE) {
                    window.addFlags(Integer.MIN_VALUE);
                }
                window.setStatusBarColor(-16777216);
                window.getDecorView().setSystemUiVisibility(0);
            }
        }
    }
}

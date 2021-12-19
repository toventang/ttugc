package com.bytedance.android.live.uikit.p410b;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.live.uikit.b.a */
public final class C6228a {
    static {
        Covode.recordClassIndex(6934);
    }

    /* renamed from: a */
    private static int m13518a(Context context) {
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* renamed from: b */
    private static View m13520b(Activity activity, int i) {
        MethodCollector.m26663i(11829);
        View view = new View(activity);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, m13518a(activity)));
        view.setBackgroundColor(i);
        MethodCollector.m26664o(11829);
        return view;
    }

    /* renamed from: a */
    public static void m13519a(Activity activity, int i) {
        MethodCollector.m26663i(11828);
        int i2 = Build.VERSION.SDK_INT;
        activity.getWindow().addFlags(67108864);
        ((ViewGroup) activity.getWindow().getDecorView()).addView(m13520b(activity, i));
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(viewGroup.getChildCount() - 1);
        viewGroup2.setFitsSystemWindows(true);
        viewGroup2.setClipToPadding(true);
        MethodCollector.m26664o(11828);
    }
}

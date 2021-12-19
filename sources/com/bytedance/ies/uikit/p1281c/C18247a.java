package com.bytedance.ies.uikit.p1281c;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.ies.uikit.c.a */
public final class C18247a {
    static {
        Covode.recordClassIndex(20906);
    }

    /* renamed from: a */
    public static int m33946a(Context context) {
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* renamed from: b */
    private static View m33948b(Activity activity, int i) {
        MethodCollector.m26663i(13991);
        View view = new View(activity);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, m33946a(activity)));
        view.setBackgroundColor(i);
        MethodCollector.m26664o(13991);
        return view;
    }

    /* renamed from: a */
    public static void m33947a(Activity activity, int i) {
        MethodCollector.m26663i(13990);
        int i2 = Build.VERSION.SDK_INT;
        activity.getWindow().addFlags(67108864);
        ((ViewGroup) activity.getWindow().getDecorView()).addView(m33948b(activity, i));
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(viewGroup.getChildCount() - 1);
        viewGroup2.setFitsSystemWindows(true);
        viewGroup2.setClipToPadding(true);
        MethodCollector.m26664o(13990);
    }
}

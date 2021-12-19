package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3343g;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3333a.C57384a;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.g.b */
public final class C57447b {

    /* renamed from: a */
    protected static int f130982a;

    /* renamed from: b */
    protected static int f130983b;

    /* renamed from: e */
    private static int f130984e;

    /* renamed from: f */
    private static int f130985f;

    /* renamed from: g */
    private static int f130986g;

    /* renamed from: c */
    public int f130987c = -1;

    /* renamed from: d */
    public int f130988d = -1;

    static {
        Covode.recordClassIndex(67376);
    }

    /* renamed from: a */
    public static void m104115a(Context context) {
        try {
            f130984e = C13628n.m24525e(context);
            f130985f = C34723i.m70929c();
            m104118b(context);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private static void m104118b(Context context) {
        int i = Build.VERSION.SDK_INT;
        Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        f130986g = displayMetrics.heightPixels;
        f130983b = displayMetrics.heightPixels + f130984e;
        f130982a = displayMetrics.widthPixels;
    }

    /* renamed from: a */
    private static void m104116a(View view, int i, int i2) {
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.width == i2 && marginLayoutParams.height == i) {
                int i3 = Build.VERSION.SDK_INT;
                return;
            }
            marginLayoutParams.width = i2;
            marginLayoutParams.height = i;
            view.setLayoutParams(marginLayoutParams);
            view.setRotation(0.0f);
        }
    }

    /* renamed from: a */
    public final void mo94719a(Context context, View view, int i, int i2) {
        m104119b(context, view, i, i2);
    }

    /* renamed from: b */
    private void m104119b(Context context, View view, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (f130983b == 0 || f130982a == 0) {
            m104118b(context);
        }
        int i4 = C57384a.C57385a.f130808a.f130801e;
        int i5 = f130982a;
        double d = (double) i5;
        int i6 = f130983b;
        double d2 = (double) i6;
        Double.isNaN(d);
        Double.isNaN(d2);
        if (d / d2 <= 0.5d) {
            m104121c(view, i, i2, i4, i5);
            return;
        }
        double d3 = (double) i5;
        double d4 = (double) i6;
        Double.isNaN(d3);
        Double.isNaN(d4);
        if (d3 / d4 >= 0.6666666666666666d) {
            m104117a(view, i, i2, i5, i6);
        } else {
            m104120b(view, i, i2, i4, i5);
        }
    }

    /* renamed from: a */
    private static void m104117a(View view, int i, int i2, int i3, int i4) {
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        if (d / d2 > 1.0d) {
            if (i <= 0 || i2 <= 0) {
                i4 = i3;
            } else {
                i4 = (i2 * i3) / i;
            }
        } else if (i <= 0 || i2 <= 0) {
            i3 = i4;
        } else {
            i3 = (i * i4) / i2;
        }
        m104116a(view, i4, i3);
    }

    /* renamed from: c */
    private void m104121c(View view, int i, int i2, int i3, int i4) {
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) i4;
        double d5 = (double) i3;
        Double.isNaN(d4);
        Double.isNaN(d5);
        double d6 = d4 / d5;
        if (d3 > 0.625d || d6 > 0.625d || d3 < 0.4699999988079071d) {
            if (i <= 0 || i2 <= 0) {
                i3 = i4;
            } else {
                i3 = (i2 * i4) / i;
            }
        } else if (i <= 0 || i2 <= 0) {
            i4 = i3;
        } else {
            i4 = (i * i3) / i2;
        }
        this.f130987c = i3;
        this.f130988d = i4;
        if (view != null) {
            m104116a(view, i3, i4);
        }
    }

    /* renamed from: b */
    private void m104120b(View view, int i, int i2, int i3, int i4) {
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) i4;
        double d5 = (double) i3;
        Double.isNaN(d4);
        Double.isNaN(d5);
        double d6 = d4 / d5;
        if (d3 > 0.5625d || d6 > 0.5625d || d3 < 0.4699999988079071d) {
            if (i <= 0 || i2 <= 0) {
                i3 = i4;
            } else {
                i3 = (i2 * i4) / i;
            }
        } else if (i <= 0 || i2 <= 0) {
            i4 = i3;
        } else {
            i4 = (i * i3) / i2;
        }
        this.f130988d = i4;
        this.f130987c = i3;
        if (view != null) {
            m104116a(view, i3, i4);
        }
    }
}

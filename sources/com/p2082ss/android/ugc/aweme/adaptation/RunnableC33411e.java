package com.p2082ss.android.ugc.aweme.adaptation;

import android.app.Activity;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.utils.p4203d.C80329c;

/* renamed from: com.ss.android.ugc.aweme.adaptation.e */
public final /* synthetic */ class RunnableC33411e implements Runnable {

    /* renamed from: a */
    private final Activity f79415a;

    /* renamed from: b */
    private final int f79416b;

    /* renamed from: c */
    private final ViewGroup f79417c;

    /* renamed from: d */
    private final View f79418d;

    /* renamed from: e */
    private final View f79419e;

    /* renamed from: f */
    private final C33403c.AbstractC33409e f79420f;

    static {
        Covode.recordClassIndex(40268);
    }

    public RunnableC33411e(Activity activity, int i, ViewGroup viewGroup, View view, View view2, C33403c.AbstractC33409e eVar) {
        this.f79415a = activity;
        this.f79416b = i;
        this.f79417c = viewGroup;
        this.f79418d = view;
        this.f79419e = view2;
        this.f79420f = eVar;
    }

    public final void run() {
        int a;
        Activity activity = this.f79415a;
        int i = this.f79416b;
        ViewGroup viewGroup = this.f79417c;
        View view = this.f79418d;
        View view2 = this.f79419e;
        C33403c.AbstractC33409e eVar = this.f79420f;
        if (activity != null) {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (C33403c.m68508b()) {
                try {
                    defaultDisplay.getRealMetrics(displayMetrics);
                } catch (Exception e) {
                    C51423a.m95790a((Throwable) e);
                }
            } else {
                defaultDisplay.getMetrics(displayMetrics);
            }
            boolean z = true;
            boolean z2 = C29843f.m60136c() && C33403c.m68507a(activity);
            boolean z3 = C29843f.m60136c() && Build.VERSION.SDK_INT >= 28 && !C33403c.m68507a(activity);
            if (z2) {
                a = 0;
            } else {
                a = C33403c.m68503a(activity);
            }
            if (!C80329c.m139265c() || Build.VERSION.SDK_INT < 28 || (C33403c.m68508b() && Settings.Global.getInt(activity.getContentResolver(), "navigationbar_trigger_mode", 0) == 0 && Settings.Global.getInt(activity.getContentResolver(), "nav_fixed_mode", 0) == 0)) {
                z = false;
            }
            boolean b = C33403c.m68509b(activity);
            int c = C33403c.m68510c(activity);
            int b2 = C34723i.m70927b();
            if ((b && c > 0) || z3 || z) {
                a -= b2;
            }
            C29339a.m58754b(new RunnableC33413g(activity, viewGroup, view, view2, displayMetrics, b, a, b2, C34728n.m70946a((double) i), c, eVar));
        }
    }
}

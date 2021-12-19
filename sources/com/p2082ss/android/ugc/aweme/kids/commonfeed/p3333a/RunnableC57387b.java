package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3333a;

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
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3333a.C57384a;
import com.p2082ss.android.ugc.aweme.utils.p4203d.C80329c;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.a.b */
public final /* synthetic */ class RunnableC57387b implements Runnable {

    /* renamed from: a */
    private final Activity f130809a;

    /* renamed from: b */
    private final int f130810b = 58;

    /* renamed from: c */
    private final ViewGroup f130811c;

    /* renamed from: d */
    private final View f130812d;

    /* renamed from: e */
    private final View f130813e;

    /* renamed from: f */
    private final C57384a.AbstractC57386b f130814f;

    static {
        Covode.recordClassIndex(67307);
    }

    public RunnableC57387b(Activity activity, ViewGroup viewGroup, View view, View view2, C57384a.AbstractC57386b bVar) {
        this.f130809a = activity;
        this.f130811c = viewGroup;
        this.f130812d = view;
        this.f130813e = view2;
        this.f130814f = bVar;
    }

    public final void run() {
        int a;
        boolean z;
        Activity activity = this.f130809a;
        int i = this.f130810b;
        ViewGroup viewGroup = this.f130811c;
        View view = this.f130812d;
        View view2 = this.f130813e;
        C57384a.AbstractC57386b bVar = this.f130814f;
        if (activity != null) {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (C57384a.m104008a()) {
                try {
                    defaultDisplay.getRealMetrics(displayMetrics);
                } catch (Exception unused) {
                }
            } else {
                defaultDisplay.getMetrics(displayMetrics);
            }
            boolean z2 = true;
            boolean z3 = C29843f.m60136c() && C57384a.m104009a(activity);
            boolean z4 = C29843f.m60136c() && Build.VERSION.SDK_INT >= 28 && !C57384a.m104009a(activity);
            if (z3) {
                a = 0;
            } else {
                a = C57384a.m104006a(activity);
            }
            if (!C80329c.m139265c() || Build.VERSION.SDK_INT < 28 || (C57384a.m104008a() && Settings.Global.getInt(activity.getContentResolver(), "navigationbar_trigger_mode", 0) == 0 && Settings.Global.getInt(activity.getContentResolver(), "nav_fixed_mode", 0) == 0)) {
                z = false;
            } else {
                z = true;
            }
            if (!C29843f.m60128a() || Settings.Secure.getInt(activity.getContentResolver(), "display_notch_status", 0) != 0) {
                z2 = false;
            }
            int b = C57384a.m104010b(activity);
            int b2 = C34723i.m70927b();
            if ((z2 && b > 0) || z4 || z) {
                a -= b2;
            }
            C29339a.m58754b(new RunnableC57388c(activity, viewGroup, view, view2, displayMetrics, z2, a, b2, C34728n.m70946a((double) i), b, bVar));
        }
    }
}

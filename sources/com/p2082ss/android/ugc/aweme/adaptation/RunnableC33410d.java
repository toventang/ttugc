package com.p2082ss.android.ugc.aweme.adaptation;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;

/* renamed from: com.ss.android.ugc.aweme.adaptation.d */
public final /* synthetic */ class RunnableC33410d implements Runnable {

    /* renamed from: a */
    private final Activity f79410a;

    /* renamed from: b */
    private final ViewGroup f79411b;

    /* renamed from: c */
    private final View f79412c;

    /* renamed from: d */
    private final int f79413d = 47;

    /* renamed from: e */
    private final C33403c.AbstractC33409e f79414e;

    static {
        Covode.recordClassIndex(40267);
    }

    public RunnableC33410d(Activity activity, ViewGroup viewGroup, View view, C33403c.AbstractC33409e eVar) {
        this.f79410a = activity;
        this.f79411b = viewGroup;
        this.f79412c = view;
        this.f79414e = eVar;
    }

    public final void run() {
        boolean z;
        int a;
        Activity activity = this.f79410a;
        ViewGroup viewGroup = this.f79411b;
        View view = this.f79412c;
        int i = this.f79413d;
        C33403c.AbstractC33409e eVar = this.f79414e;
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
            int i2 = displayMetrics.heightPixels;
            int i3 = displayMetrics.widthPixels;
            if (!C29843f.m60136c() || !C33403c.m68507a((Context) activity)) {
                z = false;
                a = C33403c.m68503a(activity);
            } else {
                z = true;
                a = 0;
            }
            C29339a.m58754b(new Runnable(activity, viewGroup, view, C33403c.m68509b(activity), i2, i3, a, C33403c.m68510c(activity), i, z, eVar) {
                /* class com.p2082ss.android.ugc.aweme.adaptation.C33403c.RunnableC334041 */

                /* renamed from: a */
                final /* synthetic */ Activity f79392a;

                /* renamed from: b */
                final /* synthetic */ ViewGroup f79393b;

                /* renamed from: c */
                final /* synthetic */ View f79394c;

                /* renamed from: d */
                final /* synthetic */ boolean f79395d;

                /* renamed from: e */
                final /* synthetic */ int f79396e;

                /* renamed from: f */
                final /* synthetic */ int f79397f;

                /* renamed from: g */
                final /* synthetic */ int f79398g;

                /* renamed from: h */
                final /* synthetic */ int f79399h;

                /* renamed from: i */
                final /* synthetic */ int f79400i;

                /* renamed from: j */
                final /* synthetic */ boolean f79401j;

                /* renamed from: k */
                final /* synthetic */ AbstractC33409e f79402k;

                static {
                    Covode.recordClassIndex(40261);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bc, code lost:
                    if (r0 != 0) goto L_0x00be;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c0, code lost:
                    if (r10.f79401j != false) goto L_0x00c2;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c6, code lost:
                    if (r4 > 0.5d) goto L_0x00d9;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c8, code lost:
                    r2 = (int) com.bytedance.common.utility.C13628n.m24520b(com.bytedance.ies.ugc.appcontext.C17867d.m33078a(), (float) r10.f79400i);
                    com.p2082ss.android.ugc.aweme.adaptation.C33403c.C33406b.f79409a.f79384i = 0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d9, code lost:
                    com.p2082ss.android.ugc.aweme.adaptation.C33403c.C33406b.f79409a.f79384i = 0;
                    r2 = 0;
                    r6 = false;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 236
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.adaptation.C33403c.RunnableC334041.run():void");
                }

                {
                    this.f79392a = r1;
                    this.f79393b = r2;
                    this.f79394c = r3;
                    this.f79395d = r4;
                    this.f79396e = r5;
                    this.f79397f = r6;
                    this.f79398g = r7;
                    this.f79399h = r8;
                    this.f79400i = r9;
                    this.f79401j = r10;
                    this.f79402k = r11;
                }
            });
        }
    }
}

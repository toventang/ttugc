package com.p084a.p088b;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.nita.api.C21523a;
import com.bytedance.nita.p1555c.HandlerC21534a;
import com.bytedance.nita.p1557e.C21554a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.a.b.c */
public final class C1870c {

    /* renamed from: a */
    public static Context f5678a;

    /* renamed from: b */
    public static C1873d f5679b;

    static {
        Covode.recordClassIndex(2040);
    }

    /* renamed from: a */
    public static void m6047a(int i) {
        C21523a a = C1868b.m6035a(i);
        if (a != null) {
            HandlerC21534a.m40472a(a.f51104a, i);
        }
    }

    /* renamed from: a */
    public static void m6048a(Context context) {
        m6049a(context, (int) R.layout.a3c);
        C1873d dVar = f5679b;
        if (dVar != null && dVar.f5682c && f5679b.f5683d) {
            C21554a.f51150b.mo35228a().execute(new Runnable() {
                /* class com.p084a.p088b.C1870c.RunnableC18711 */

                static {
                    Covode.recordClassIndex(2041);
                }

                public final void run() {
                    if (C1862a.f5672b) {
                        try {
                            Class.forName("androidx.core.h.v");
                            Class.forName("androidx.appcompat.widget.j");
                            Class.forName("androidx.appcompat.widget.AppCompatImageView");
                            Class.forName("androidx.appcompat.widget.AppCompatTextView");
                            Class.forName("androidx.appcompat.widget.ContentFrameLayout");
                            Class.forName("androidx.appcompat.widget.FitWindowsFrameLayout");
                            Class.forName("androidx.appcompat.widget.ai");
                            Class.forName("androidx.appcompat.widget.ViewStubCompat");
                            Class.forName("androidx.appcompat.widget.s");
                            Class.forName("androidx.appcompat.widget.t");
                        } catch (Exception e) {
                            e.getCause();
                        }
                        try {
                            Class.forName("android.widget.LinearLayout");
                            Class.forName("com.ss.android.ugc.aweme.tux.a.j.a");
                            Class.forName("com.bytedance.android.livesdk.ui.a.a");
                            Class.forName("android.widget.FrameLayout");
                            Class.forName("com.a.a.a.a.a");
                            Class.forName("com.ss.android.ugc.aweme.tux.a.j.b");
                            Class.forName("com.ss.android.ugc.aweme.tux.a.j.d");
                            Class.forName("com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout");
                            Class.forName("com.ss.android.ugc.aweme.tux.a.j.f");
                            Class.forName("com.ss.android.ugc.aweme.ecommerce.review.view.b");
                            Class.forName("com.bytedance.ies.uikit.tabhost.FragmentTabHost");
                            Class.forName("androidx.constraintlayout.widget.ConstraintLayout");
                            Class.forName("com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer");
                            Class.forName("com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer");
                            Class.forName("com.bytedance.ies.dmt.ui.gesture.GestureFrameLayout");
                            Class.forName("android.widget.RelativeLayout");
                            Class.forName("com.bytedance.lighten.loader.SmartImageView");
                            Class.forName("com.bytedance.tux.badge.TuxAlertBadgeLayout");
                            Class.forName("com.bytedance.android.livesdk.widget.GestureDetectLayout");
                            Class.forName("com.ss.android.ugc.aweme.tux.a.j.e");
                            Class.forName("com.ss.android.ugc.aweme.tux.business.a.a");
                            Class.forName("com.bytedance.android.livesdk.widget.SafeFrameLayout");
                            Class.forName("android.view.a");
                            Class.forName("com.a.b.b.a");
                            Class.forName("com.a.b.a.a");
                            Class.forName("com.a.b.a.a$c");
                            Class.forName("com.a.b.a.a$b");
                            Class.forName("com.a.b.a.a$d");
                            Class.forName("com.a.b.a.a$a");
                            Class.forName("h.f.b.l");
                            Class.forName("h.m.y");
                            Class.forName("h.m.z");
                        } catch (Exception e2) {
                            e2.getCause();
                            e2.getMessage();
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m6051a(String str) {
        C21523a a = C1868b.m6036a(str);
        if (a != null) {
            HandlerC21534a.m40472a(a.f51104a, a.f51105b[0]);
        }
    }

    /* renamed from: a */
    public static View m6045a(Activity activity, int i) {
        MethodCollector.m26663i(3817);
        View a = m6046a(activity, i, new FrameLayout(activity), false);
        MethodCollector.m26664o(3817);
        return a;
    }

    /* renamed from: b */
    public static boolean m6052b(Context context, String str) {
        C21523a a = C1868b.m6036a(str);
        if (a == null) {
            return false;
        }
        String str2 = a.f51104a;
        int i = a.f51105b[0];
        C89219l.m154719c(str2, "");
        return HandlerC21534a.m40474a(str2, i, context);
    }

    /* renamed from: a */
    public static void m6049a(Context context, int i) {
        C21523a a;
        C1873d dVar = f5679b;
        if (dVar != null && dVar.f5684e && (a = C1868b.m6035a(i)) != null) {
            a.mo35191a(context);
        }
    }

    /* renamed from: a */
    public static void m6050a(Context context, String str) {
        C1873d dVar = f5679b;
        if (dVar != null && dVar.f5684e && C1868b.m6036a(str) != null) {
            C1868b.m6036a(str).mo35191a(context);
        }
    }

    /* renamed from: a */
    public static View m6046a(Activity activity, int i, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(3828);
        C21523a a = C1868b.m6035a(i);
        if (f5679b == null || a == null) {
            View a2 = C1764a.m5927a(LayoutInflater.from(activity), i, viewGroup, z);
            MethodCollector.m26664o(3828);
            return a2;
        }
        View a3 = C1868b.m6035a(i).mo35190a(i, activity);
        if (viewGroup == null || !z) {
            MethodCollector.m26664o(3828);
            return a3;
        }
        viewGroup.addView(a3, a3.getLayoutParams());
        MethodCollector.m26664o(3828);
        return viewGroup;
    }
}

package com.p2082ss.android.ugc.aweme.main;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.main.ax */
public final class C59038ax {

    /* renamed from: a */
    public static boolean f134410a = m108507a().getBoolean("hasSwipedUp", false);

    /* renamed from: b */
    public static final C59038ax f134411b = new C59038ax();

    private C59038ax() {
    }

    /* renamed from: b */
    public static /* synthetic */ void m108508b() {
        f134410a = true;
        C58254p.f132679a.post(new RunnableC59039a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.main.ax$a */
    public static final class RunnableC59039a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f134412a = true;

        static {
            Covode.recordClassIndex(69384);
        }

        RunnableC59039a() {
        }

        public final void run() {
            C59038ax.m108507a().edit().putBoolean("hasSwipedUp", this.f134412a).apply();
        }
    }

    static {
        Covode.recordClassIndex(69383);
    }

    /* renamed from: a */
    public static SharedPreferences m108507a() {
        SharedPreferences a = C34822d.m71158a(C17867d.m33078a(), "MainTabPreferences", 0);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: c */
    public static final void m108509c() {
        m108507a().edit().putBoolean("shouldShowScrollToFeedFollowGuideMT", false).apply();
    }
}

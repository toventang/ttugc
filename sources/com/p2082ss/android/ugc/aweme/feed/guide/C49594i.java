package com.p2082ss.android.ugc.aweme.feed.guide;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.experiment.C46796cm;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.i */
public final class C49594i {

    /* renamed from: a */
    public static final C49594i f114096a = new C49594i();

    private C49594i() {
    }

    static {
        Covode.recordClassIndex(58440);
    }

    /* renamed from: b */
    public static final boolean m93009b() {
        return m93008a().getBoolean("hasShowedSwipeUpGuideAfterVideoPlay", false);
    }

    /* renamed from: d */
    public static final boolean m93011d() {
        return m93008a().getBoolean("shouldShowSwipeUpGuide1", true);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.i$a */
    static final class RunnableC49595a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f114097a = false;

        static {
            Covode.recordClassIndex(58441);
        }

        RunnableC49595a() {
        }

        public final void run() {
            C49594i.m93008a().edit().putBoolean("shouldShowSwipeUpGuide1", this.f114097a).apply();
        }
    }

    /* renamed from: a */
    public static SharedPreferences m93008a() {
        SharedPreferences a = C34822d.m71158a(C17867d.m33078a(), "MainTabPreferences", 0);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: e */
    public static final void m93012e() {
        if (C46796cm.f109017b) {
            C58254p.f132679a.post(new RunnableC49595a());
        } else {
            m93008a().edit().putBoolean("shouldShowSwipeUpGuide1", false).apply();
        }
    }
}

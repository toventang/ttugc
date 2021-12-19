package com.p2082ss.android.ugc.aweme.account.login.twostep;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.i */
public final class C32209i implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static long f76860a;

    /* renamed from: b */
    public static Intent f76861b;

    /* renamed from: c */
    public static String f76862c;

    /* renamed from: d */
    public static final C32209i f76863d = new C32209i();

    /* renamed from: e */
    private static final AbstractC89244h f76864e = C89250i.m154773a((AbstractC89171a) C32210a.f76865a);

    /* renamed from: a */
    public static Keva m66573a() {
        return (Keva) f76864e.getValue();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C89219l.m154721d(activity, "");
    }

    public final void onActivityDestroyed(Activity activity) {
        C89219l.m154721d(activity, "");
    }

    public final void onActivityPaused(Activity activity) {
        C89219l.m154721d(activity, "");
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(bundle, "");
    }

    public final void onActivityStarted(Activity activity) {
        C89219l.m154721d(activity, "");
    }

    public final void onActivityStopped(Activity activity) {
        C89219l.m154721d(activity, "");
    }

    private C32209i() {
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.i$a */
    static final class C32210a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C32210a f76865a = new C32210a();

        static {
            Covode.recordClassIndex(38975);
        }

        C32210a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("aweme_open_push_challenge_page_list");
        }
    }

    static {
        Covode.recordClassIndex(38974);
    }

    /* renamed from: a */
    public static void m66575a(String str) {
        C89219l.m154721d(str, "");
        new Exception();
        m66573a().storeLong(str, System.currentTimeMillis());
    }

    public final void onActivityResumed(Activity activity) {
        C89219l.m154721d(activity, "");
        if (System.currentTimeMillis() - f76860a < 120000 && f76861b != null && !TextUtils.isEmpty(f76862c) && !m66573a().contains(f76862c)) {
            String str = f76862c;
            if (str == null) {
                C89219l.m154715b();
            }
            m66575a(str);
            m66574a(C17867d.m33078a(), f76861b);
            f76861b = null;
            f76862c = "";
        }
    }

    /* renamed from: a */
    public static void m66574a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }
}

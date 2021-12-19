package com.p2082ss.android.ugc.aweme.splash;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.p4200a.C80186c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

/* renamed from: com.ss.android.ugc.aweme.splash.c */
final /* synthetic */ class RunnableC75233c implements Runnable {

    /* renamed from: a */
    private final TransitActivity f169142a;

    static {
        Covode.recordClassIndex(88122);
    }

    RunnableC75233c(TransitActivity transitActivity) {
        this.f169142a = transitActivity;
    }

    public final void run() {
        Intent a;
        TransitActivity transitActivity = this.f169142a;
        Intent intent = transitActivity.getIntent();
        if (intent != null) {
            intent.setExtrasClassLoader(TransitActivity.class.getClassLoader());
            a = (Intent) intent.getParcelableExtra("main");
            if (a != null) {
                a.setExtrasClassLoader(TransitActivity.class.getClassLoader());
                C84349a.m145093a(a, transitActivity);
                transitActivity.startActivity(a);
                transitActivity.overridePendingTransition(0, 0);
            }
        }
        a = C80186c.m139003a(transitActivity);
        C84349a.m145093a(a, transitActivity);
        transitActivity.startActivity(a);
        transitActivity.overridePendingTransition(0, 0);
    }
}

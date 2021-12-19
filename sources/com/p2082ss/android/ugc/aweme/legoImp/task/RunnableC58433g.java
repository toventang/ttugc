package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.appsflyer.AppsFlyerConversionListener;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitAppsFlyer;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.g */
final /* synthetic */ class RunnableC58433g implements Runnable {

    /* renamed from: a */
    private final InitAppsFlyer.C583412 f133043a;

    /* renamed from: b */
    private final Context f133044b;

    /* renamed from: c */
    private final AppsFlyerConversionListener f133045c;

    static {
        Covode.recordClassIndex(68689);
    }

    RunnableC58433g(InitAppsFlyer.C583412 r1, Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        this.f133043a = r1;
        this.f133044b = context;
        this.f133045c = appsFlyerConversionListener;
    }

    public final void run() {
        InitAppsFlyer.m105787a(this.f133044b, this.f133045c);
    }
}

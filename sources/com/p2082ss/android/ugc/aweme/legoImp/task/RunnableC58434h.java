package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.appsflyer.AppsFlyerConversionListener;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitAppsFlyer;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.h */
final /* synthetic */ class RunnableC58434h implements Runnable {

    /* renamed from: a */
    private final InitAppsFlyer.C583412 f133046a;

    /* renamed from: b */
    private final Context f133047b;

    /* renamed from: c */
    private final AppsFlyerConversionListener f133048c;

    static {
        Covode.recordClassIndex(68690);
    }

    RunnableC58434h(InitAppsFlyer.C583412 r1, Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        this.f133046a = r1;
        this.f133047b = context;
        this.f133048c = appsFlyerConversionListener;
    }

    public final void run() {
        InitAppsFlyer.m105787a(this.f133047b, this.f133048c);
    }
}

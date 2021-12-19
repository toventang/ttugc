package com.p2082ss.android.ugc.aweme.legoImp.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.legoImp.service.a */
final /* synthetic */ class RunnableC58298a implements Runnable {

    /* renamed from: a */
    private final AOTOptimizeService f132785a;

    /* renamed from: b */
    private final Context f132786b;

    static {
        Covode.recordClassIndex(68380);
    }

    RunnableC58298a(AOTOptimizeService aOTOptimizeService, Context context) {
        this.f132785a = aOTOptimizeService;
        this.f132786b = context;
    }

    public final void run() {
        AOTOptimizeService.m105316c(this.f132786b);
    }
}

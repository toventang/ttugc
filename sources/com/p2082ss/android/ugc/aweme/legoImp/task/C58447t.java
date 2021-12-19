package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.t */
final /* synthetic */ class C58447t implements ICrashCallback {

    /* renamed from: a */
    private final Context f133067a;

    static {
        Covode.recordClassIndex(68708);
    }

    C58447t(Context context) {
        this.f133067a = context;
    }

    @Override // com.bytedance.crash.ICrashCallback
    public final void onCrash(CrashType crashType, String str, Thread thread) {
        Context context = this.f133067a;
        if (str != null) {
            SplashAdServiceImpl.m33397i().mo28709a(context, str);
        }
    }
}

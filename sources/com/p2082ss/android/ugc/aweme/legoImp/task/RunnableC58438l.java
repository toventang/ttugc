package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.l */
final /* synthetic */ class RunnableC58438l implements Runnable {

    /* renamed from: a */
    private final JsBridge2InitTask.C583601 f133053a;

    /* renamed from: b */
    private final Context f133054b;

    /* renamed from: c */
    private final long f133055c;

    static {
        Covode.recordClassIndex(68694);
    }

    RunnableC58438l(JsBridge2InitTask.C583601 r1, Context context, long j) {
        this.f133053a = r1;
        this.f133054b = context;
        this.f133055c = j;
    }

    public final void run() {
        JsBridge2InitTask.C583601 r6 = this.f133053a;
        Context context = this.f133054b;
        long j = this.f133055c;
        if (SettingsManager.m29616a().mo25400a("use_bridge_engine_v2", true)) {
            JsBridge2InitTask.this.mo95745a(context, j);
        }
    }
}

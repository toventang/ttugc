package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.s */
final /* synthetic */ class RunnableC58446s implements Runnable {

    /* renamed from: a */
    private final Context f133065a;

    /* renamed from: b */
    private final StringBuilder f133066b;

    static {
        Covode.recordClassIndex(68707);
    }

    RunnableC58446s(Context context, StringBuilder sb) {
        this.f133065a = context;
        this.f133066b = sb;
    }

    public final void run() {
        new C79459a(this.f133065a).mo123052a(this.f133066b.toString()).mo123053a();
    }
}

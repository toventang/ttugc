package com.p2082ss.android.ugc.aweme.app.p2323d;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.Npth;
import com.bytedance.crash.p923a.AbstractC13817c;
import com.bytedance.crash.p923a.C13816b;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.aweme.app.application.AbstractRunnableC33656a;

/* renamed from: com.ss.android.ugc.aweme.app.d.a */
public final class C33724a implements AbstractRunnableC33656a {
    static {
        Covode.recordClassIndex(40619);
    }

    public final void run() {
        if (ALog.isInitSuccess()) {
            Npth.enableALogCollector(ALog.sConfig.f70857f, new AbstractC13817c() {
                /* class com.p2082ss.android.ugc.aweme.app.p2323d.C33724a.C337251 */

                static {
                    Covode.recordClassIndex(40620);
                }

                @Override // com.bytedance.crash.p923a.AbstractC13817c
                /* renamed from: a */
                public final void mo22260a() {
                    ALog.flush();
                    ALog.forceLogSharding();
                }
            }, new C13816b());
        }
    }
}

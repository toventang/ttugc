package com.p2082ss.android.ugc.aweme.app.host;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.application.AbstractC33903h;
import com.p2082ss.android.ugc.aweme.logger.C58945a;

/* renamed from: com.ss.android.ugc.aweme.app.host.a */
public final class C33759a implements AbstractC33903h {
    static {
        Covode.recordClassIndex(40656);
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33903h
    /* renamed from: a */
    public final void mo59999a(Application application) {
        C58945a.C58947b.f134185a.mo96425a("method_setup_graph_duration", false);
        if (application instanceof AwemeHostApplication) {
            Keep.emptyMethod();
        }
        C58945a.C58947b.f134185a.mo96429b("method_setup_graph_duration", false);
    }
}

package com.p2082ss.android.ugc.aweme.tools.draft;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ar */
final /* synthetic */ class CallableC78142ar implements Callable {

    /* renamed from: a */
    private final C43223c f175482a;

    static {
        Covode.recordClassIndex(91257);
    }

    CallableC78142ar(C43223c cVar) {
        this.f175482a = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C78397c.m136927a().delete(this.f175482a);
        return null;
    }
}

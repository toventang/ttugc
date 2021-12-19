package com.p2082ss.android.ugc.aweme.tools.draft;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.f */
final /* synthetic */ class CallableC78248f implements Callable {

    /* renamed from: a */
    private final C43223c f175747a;

    static {
        Covode.recordClassIndex(91363);
    }

    CallableC78248f(C43223c cVar) {
        this.f175747a = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C78397c.m136927a().notifyDraftDelete(this.f175747a);
        return null;
    }
}

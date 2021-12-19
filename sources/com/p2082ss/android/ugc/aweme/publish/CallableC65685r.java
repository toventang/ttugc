package com.p2082ss.android.ugc.aweme.publish;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.publish.r */
public final /* synthetic */ class CallableC65685r implements Callable {

    /* renamed from: a */
    private final String f148006a;

    static {
        Covode.recordClassIndex(77176);
    }

    public CallableC65685r(String str) {
        this.f148006a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C78397c.m136927a().queryDraftWithUserId(this.f148006a);
    }
}

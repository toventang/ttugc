package com.p2082ss.android.ugc.aweme.publish;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.publish.p */
public final /* synthetic */ class CallableC65683p implements Callable {

    /* renamed from: a */
    private final String f148004a;

    static {
        Covode.recordClassIndex(77174);
    }

    CallableC65683p(String str) {
        this.f148004a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C78397c.m136927a().queryDraftWithUserId(this.f148004a);
    }
}

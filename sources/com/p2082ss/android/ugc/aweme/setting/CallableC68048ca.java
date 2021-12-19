package com.p2082ss.android.ugc.aweme.setting;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.setting.ca */
public final /* synthetic */ class CallableC68048ca implements Callable {

    /* renamed from: a */
    private final AbstractC68041bz f152428a;

    /* renamed from: b */
    private final Context f152429b;

    static {
        Covode.recordClassIndex(80244);
    }

    CallableC68048ca(AbstractC68041bz bzVar, Context context) {
        this.f152428a = bzVar;
        this.f152429b = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f152428a.mo108660b(this.f152429b);
    }
}

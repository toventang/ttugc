package com.p2082ss.android.ugc.aweme.account.agegate.api;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.account.agegate.api.a */
public final /* synthetic */ class CallableC31410a implements Callable {

    /* renamed from: a */
    private final String f75217a;

    static {
        Covode.recordClassIndex(38127);
    }

    CallableC31410a(String str) {
        this.f75217a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Api.lambda$emailForExportVideo$0$Api(this.f75217a);
    }
}

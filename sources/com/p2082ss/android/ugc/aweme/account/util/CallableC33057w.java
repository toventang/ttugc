package com.p2082ss.android.ugc.aweme.account.util;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.account.util.w */
public final /* synthetic */ class CallableC33057w implements Callable {

    /* renamed from: a */
    private final Bundle f78608a;

    static {
        Covode.recordClassIndex(39864);
    }

    CallableC33057w(Bundle bundle) {
        this.f78608a = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C33052u.m67708d(this.f78608a);
    }
}

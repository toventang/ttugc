package com.p2082ss.android.ugc.aweme.photo;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.photo.r */
final /* synthetic */ class CallableC62883r implements Callable {

    /* renamed from: a */
    private final String f142611a;

    static {
        Covode.recordClassIndex(73715);
    }

    CallableC62883r(String str) {
        this.f142611a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new Pair(this.f142611a, null);
    }
}

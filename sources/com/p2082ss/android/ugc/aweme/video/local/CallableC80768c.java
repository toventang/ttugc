package com.p2082ss.android.ugc.aweme.video.local;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.video.local.c */
public final /* synthetic */ class CallableC80768c implements Callable {

    /* renamed from: a */
    private final String f180591a;

    /* renamed from: b */
    private final String f180592b;

    static {
        Covode.recordClassIndex(94059);
    }

    CallableC80768c(String str, String str2) {
        this.f180591a = str;
        this.f180592b = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return LocalVideoPlayerManager.m140058a(this.f180591a, this.f180592b);
    }
}

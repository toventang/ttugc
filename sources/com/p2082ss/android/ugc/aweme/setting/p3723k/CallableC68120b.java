package com.p2082ss.android.ugc.aweme.setting.p3723k;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.setting.api.BlackApiManager;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.k.b */
final /* synthetic */ class CallableC68120b implements Callable {

    /* renamed from: a */
    private final C68119a f152528a;

    /* renamed from: b */
    private final int f152529b;

    /* renamed from: c */
    private final int f152530c;

    /* renamed from: d */
    private final int f152531d;

    static {
        Covode.recordClassIndex(80316);
    }

    CallableC68120b(C68119a aVar, int i, int i2, int i3) {
        this.f152528a = aVar;
        this.f152529b = i;
        this.f152530c = i2;
        this.f152531d = i3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return BlackApiManager.m120302a(this.f152529b);
    }
}

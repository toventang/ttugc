package com.p2082ss.android.ugc.aweme.livewallpaper.p3419f;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.f.g */
public final /* synthetic */ class CallableC58904g implements Callable {

    /* renamed from: a */
    private final Context f134085a;

    /* renamed from: b */
    private final boolean f134086b;

    static {
        Covode.recordClassIndex(69220);
    }

    public CallableC58904g(Context context, boolean z) {
        this.f134085a = context;
        this.f134086b = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C58901f.m108218a(this.f134085a, this.f134086b);
    }
}

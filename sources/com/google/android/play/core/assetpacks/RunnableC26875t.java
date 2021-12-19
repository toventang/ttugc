package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.t */
public final /* synthetic */ class RunnableC26875t implements Runnable {

    /* renamed from: a */
    private final C26878w f63760a;

    /* renamed from: b */
    private final AssetPackState f63761b;

    static {
        Covode.recordClassIndex(32350);
    }

    RunnableC26875t(C26878w wVar, AssetPackState assetPackState) {
        this.f63760a = wVar;
        this.f63761b = assetPackState;
    }

    public final void run() {
        this.f63760a.mo44661a((Object) this.f63761b);
    }
}

package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.u */
public final /* synthetic */ class RunnableC26876u implements Runnable {

    /* renamed from: a */
    private final C26878w f63762a;

    /* renamed from: b */
    private final Bundle f63763b;

    /* renamed from: c */
    private final AssetPackState f63764c;

    static {
        Covode.recordClassIndex(32351);
    }

    RunnableC26876u(C26878w wVar, Bundle bundle, AssetPackState assetPackState) {
        this.f63762a = wVar;
        this.f63763b = bundle;
        this.f63764c = assetPackState;
    }

    public final void run() {
        C26878w wVar = this.f63762a;
        Bundle bundle = this.f63763b;
        AssetPackState assetPackState = this.f63764c;
        C26806bm bmVar = wVar.f63767a;
        if (((Boolean) bmVar.mo44494a(new C26796bc(bmVar, bundle))).booleanValue()) {
            wVar.mo44561a(assetPackState);
            wVar.f63769c.mo44603a().mo44503a();
        }
    }
}

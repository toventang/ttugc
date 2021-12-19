package com.google.android.play.core.assetpacks;

import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.play.core.assetpacks.bt */
final /* synthetic */ class RunnableC26813bt implements Runnable {

    /* renamed from: a */
    private final C26814bu f63587a;

    /* renamed from: b */
    private final Intent f63588b;

    static {
        Covode.recordClassIndex(32288);
    }

    RunnableC26813bt(C26814bu buVar, Intent intent) {
        this.f63587a = buVar;
        this.f63588b = intent;
    }

    public final void run() {
        C26814bu buVar = this.f63587a;
        buVar.f63591b.mo44410a(buVar.f63592c, this.f63588b);
    }
}

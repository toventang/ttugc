package com.bytedance.android.livesdk.browser.p463d;

import android.view.View;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.container.p508e.C8242a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.browser.d.g */
public final /* synthetic */ class RunnableC6985g implements Runnable {

    /* renamed from: a */
    private final C6972a f17513a;

    /* renamed from: b */
    private final int f17514b;

    static {
        Covode.recordClassIndex(7724);
    }

    RunnableC6985g(C6972a aVar, int i) {
        this.f17513a = aVar;
        this.f17514b = i;
    }

    public final void run() {
        C6972a aVar = this.f17513a;
        int i = this.f17514b;
        View f = aVar.f17490p.mo13302f();
        if (f != null) {
            C8242a.m16384a(f, C3966y.m9653a((float) i));
        }
        if (aVar.f17480f != null) {
            C8242a.m16384a(aVar.f17480f, C3966y.m9653a((float) i));
        }
    }
}

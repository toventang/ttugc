package com.bytedance.android.livesdk.newvideogift.p595a;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.newvideogift.a.c */
public final /* synthetic */ class RunnableC9953c implements Runnable {

    /* renamed from: a */
    private final C9950b f24117a;

    static {
        Covode.recordClassIndex(11505);
    }

    RunnableC9953c(C9950b bVar) {
        this.f24117a = bVar;
    }

    public final void run() {
        boolean z;
        C9950b bVar = this.f24117a;
        boolean z2 = true;
        if (bVar.f24108f != null) {
            z = true;
        } else {
            z = false;
        }
        if (bVar.f24107e == null || !bVar.f24107e.mo16668a()) {
            z2 = false;
        }
        C3854a.m9453a(3, "GiftCtlManager", "timer start :message = " + z + ", media-playing = " + z2 + ", playEnd = " + bVar.f24110h);
        if (z || z2 || !bVar.f24110h) {
            bVar.mo16661b();
        } else {
            bVar.mo16660a();
        }
    }
}

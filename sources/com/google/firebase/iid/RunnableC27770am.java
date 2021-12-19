package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.p1940d.C25632i;
import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.am */
public final /* synthetic */ class RunnableC27770am implements Runnable {

    /* renamed from: a */
    private final C25632i f65248a;

    static {
        Covode.recordClassIndex(33358);
    }

    RunnableC27770am(C25632i iVar) {
        this.f65248a = iVar;
    }

    public final void run() {
        this.f65248a.mo41895b((Exception) new IOException("TIMEOUT"));
    }
}

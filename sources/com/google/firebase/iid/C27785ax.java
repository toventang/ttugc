package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.p1940d.AbstractC25626c;
import com.google.android.gms.p1940d.AbstractC25631h;
import java.util.concurrent.ScheduledFuture;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.ax */
public final /* synthetic */ class C27785ax implements AbstractC25626c {

    /* renamed from: a */
    private final ScheduledFuture f65283a;

    static {
        Covode.recordClassIndex(33373);
    }

    C27785ax(ScheduledFuture scheduledFuture) {
        this.f65283a = scheduledFuture;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25626c
    /* renamed from: a */
    public final void mo36732a(AbstractC25631h hVar) {
        this.f65283a.cancel(false);
    }
}

package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.p1940d.AbstractC25626c;
import com.google.android.gms.p1940d.AbstractC25631h;
import java.util.concurrent.CountDownLatch;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.l */
public final /* synthetic */ class C27796l implements AbstractC25626c {

    /* renamed from: a */
    private final CountDownLatch f65301a;

    static {
        Covode.recordClassIndex(33384);
    }

    C27796l(CountDownLatch countDownLatch) {
        this.f65301a = countDownLatch;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25626c
    /* renamed from: a */
    public final void mo36732a(AbstractC25631h hVar) {
        this.f65301a.countDown();
    }
}

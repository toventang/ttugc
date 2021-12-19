package com.p2082ss.android.ugc.aweme.tools.extract.video;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CountDownLatch;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.tools.extract.video.l */
public final /* synthetic */ class C78577l implements AbstractC89171a {

    /* renamed from: a */
    private final CountDownLatch f176584a;

    static {
        Covode.recordClassIndex(91711);
    }

    C78577l(CountDownLatch countDownLatch) {
        this.f176584a = countDownLatch;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Object invoke() {
        this.f176584a.countDown();
        return C89391z.f203057a;
    }
}

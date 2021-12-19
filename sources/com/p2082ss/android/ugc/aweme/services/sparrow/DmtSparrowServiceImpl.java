package com.p2082ss.android.ugc.aweme.services.sparrow;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2689cq.AbstractC40314a;
import com.p2082ss.android.ugc.aweme.p2689cq.AbstractC40315b;
import com.p2082ss.android.ugc.aweme.p2689cq.AbstractC40316c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.services.sparrow.DmtSparrowServiceImpl */
public final class DmtSparrowServiceImpl implements AbstractC40314a {
    private final AbstractC89244h frameVerificationService$delegate = C89250i.m154773a((AbstractC89171a) DmtSparrowServiceImpl$frameVerificationService$2.INSTANCE);
    private final AbstractC89244h publishXService$delegate = C89250i.m154773a((AbstractC89171a) DmtSparrowServiceImpl$publishXService$2.INSTANCE);

    static {
        Covode.recordClassIndex(79961);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2689cq.AbstractC40314a
    public final AbstractC40315b getFrameVerificationService() {
        return (AbstractC40315b) this.frameVerificationService$delegate.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2689cq.AbstractC40314a
    public final AbstractC40316c getPublishXService() {
        return (AbstractC40316c) this.publishXService$delegate.getValue();
    }
}

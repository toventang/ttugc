package com.p2082ss.android.ugc.trill.p4370a.p4371a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.accountsdk.C33586k;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34573d;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* renamed from: com.ss.android.ugc.trill.a.a.b */
public final class C85069b extends C33586k {
    static {
        Covode.recordClassIndex(99090);
    }

    public C85069b(AbstractC34543f fVar) {
        super(fVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.accountsdk.C33586k, com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
    public final void onResult(int i, int i2, Object obj) {
        super.onResult(i, i2, obj);
        if (i == 12 && i2 == 1) {
            AbstractC81915c.m141874a(new C34573d());
        }
    }
}

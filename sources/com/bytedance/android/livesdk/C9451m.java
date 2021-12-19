package com.bytedance.android.livesdk;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.gift.p549e.AbstractC8806a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.m */
public final /* synthetic */ class C9451m implements AbstractC88433f {

    /* renamed from: a */
    private final AbstractC8806a f22980a;

    /* renamed from: b */
    private final long f22981b;

    /* renamed from: c */
    private final User f22982c;

    /* renamed from: d */
    private final long f22983d;

    /* renamed from: e */
    private final long f22984e;

    static {
        Covode.recordClassIndex(10959);
    }

    C9451m(AbstractC8806a aVar, long j, User user, long j2, long j3) {
        this.f22980a = aVar;
        this.f22981b = j;
        this.f22982c = user;
        this.f22983d = j2;
        this.f22984e = j3;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C9145k.lambda$sendGiftLocal$1$GiftService(this.f22980a, this.f22981b, this.f22982c, this.f22983d, this.f22984e, (C5832d) obj);
    }
}

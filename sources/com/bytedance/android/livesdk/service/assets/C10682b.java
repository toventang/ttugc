package com.bytedance.android.livesdk.service.assets;

import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.service.assets.b */
public final /* synthetic */ class C10682b implements AbstractC88434g {

    /* renamed from: a */
    private final GiftManager f25729a;

    static {
        Covode.recordClassIndex(12279);
    }

    C10682b(GiftManager giftManager) {
        this.f25729a = giftManager;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final Object apply(Object obj) {
        return this.f25729a.lambda$syncGiftList$1$GiftManager((C5830b) obj);
    }
}

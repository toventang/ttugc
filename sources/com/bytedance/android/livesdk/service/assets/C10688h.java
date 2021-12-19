package com.bytedance.android.livesdk.service.assets;

import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.service.assets.h */
public final /* synthetic */ class C10688h implements AbstractC88983w {

    /* renamed from: a */
    private final GiftManager f25742a;

    /* renamed from: b */
    private final C5830b f25743b;

    static {
        Covode.recordClassIndex(12285);
    }

    C10688h(GiftManager giftManager, C5830b bVar) {
        this.f25742a = giftManager;
        this.f25743b = bVar;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        this.f25742a.lambda$null$0$GiftManager(this.f25743b, vVar);
    }
}

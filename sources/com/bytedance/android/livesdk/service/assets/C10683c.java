package com.bytedance.android.livesdk.service.assets;

import androidx.core.p036g.C0692e;
import com.bytedance.android.livesdk.gift.p549e.AbstractC8807b;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.service.assets.c */
public final /* synthetic */ class C10683c implements AbstractC88433f {

    /* renamed from: a */
    private final GiftManager f25730a;

    /* renamed from: b */
    private final int f25731b;

    /* renamed from: c */
    private final boolean f25732c;

    /* renamed from: d */
    private final long f25733d;

    /* renamed from: e */
    private final AbstractC8807b f25734e;

    /* renamed from: f */
    private final long f25735f;

    /* renamed from: g */
    private final boolean f25736g;

    static {
        Covode.recordClassIndex(12280);
    }

    C10683c(GiftManager giftManager, int i, boolean z, long j, AbstractC8807b bVar, long j2, boolean z2) {
        this.f25730a = giftManager;
        this.f25731b = i;
        this.f25732c = z;
        this.f25733d = j;
        this.f25734e = bVar;
        this.f25735f = j2;
        this.f25736g = z2;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        this.f25730a.lambda$syncGiftList$2$GiftManager(this.f25731b, this.f25732c, this.f25733d, this.f25734e, this.f25735f, this.f25736g, (C0692e) obj);
    }
}

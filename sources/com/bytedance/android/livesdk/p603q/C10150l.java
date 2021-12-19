package com.bytedance.android.livesdk.p603q;

import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.livesdk.chatroom.p488c.C7388g;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.q.l */
public final /* synthetic */ class C10150l implements AbstractC88433f {

    /* renamed from: a */
    private final C10148k f24615a;

    /* renamed from: b */
    private final long f24616b;

    static {
        Covode.recordClassIndex(11713);
    }

    C10150l(C10148k kVar, long j) {
        this.f24615a = kVar;
        this.f24616b = j;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C7388g gVar;
        C10148k kVar = this.f24615a;
        long j = this.f24616b;
        if ((obj instanceof C7388g) && (gVar = (C7388g) obj) != null && j == gVar.f18311b) {
            kVar.f24610a = GiftManager.inst().findGiftById(gVar.f18310a);
            if (kVar.f24610a == null || gVar.f18310a <= 0) {
                EnumC5847l.FAST_GIFT.hide(kVar.f24611b);
                return;
            }
            EnumC5847l.FAST_GIFT.show(kVar.f24611b);
            kVar.mo16989a();
            if (kVar.f24613d != null) {
                kVar.f24613d.mo16978a(kVar.f24610a);
            }
        }
    }
}

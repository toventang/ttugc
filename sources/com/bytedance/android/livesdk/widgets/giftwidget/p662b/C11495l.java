package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.l */
final /* synthetic */ class C11495l implements AbstractC89172b {

    /* renamed from: a */
    private final C11483b f27568a;

    static {
        Covode.recordClassIndex(13154);
    }

    C11495l(C11483b bVar) {
        this.f27568a = bVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C11483b bVar = this.f27568a;
        GiftManager.inst().syncGiftList(bVar.f27554i, ((Room) bVar.f27546a.mo28318b(C9093de.class)).getId(), 5, C11115u.m19743a().mo17915b().mo13161c() == ((Room) bVar.f27546a.mo28318b(C9093de.class)).getOwnerUserId());
        return C89391z.f203057a;
    }
}

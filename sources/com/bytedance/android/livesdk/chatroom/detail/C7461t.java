package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.detail.t */
public final /* synthetic */ class C7461t implements AbstractC11643g.AbstractC11646c {

    /* renamed from: a */
    private final RoomPlayer f18546a;

    static {
        Covode.recordClassIndex(8231);
    }

    C7461t(RoomPlayer roomPlayer) {
        this.f18546a = roomPlayer;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.AbstractC11646c
    /* renamed from: a */
    public final void mo12871a(AbstractC11643g.EnumC11645b bVar, Object obj) {
        this.f18546a.lambda$doStartPlayByMultiPullStreamData$1$RoomPlayer(bVar, obj);
    }
}

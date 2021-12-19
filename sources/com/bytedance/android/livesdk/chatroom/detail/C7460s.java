package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.detail.s */
public final /* synthetic */ class C7460s implements AbstractC11643g.AbstractC11646c {

    /* renamed from: a */
    private final RoomPlayer f18545a;

    static {
        Covode.recordClassIndex(8230);
    }

    C7460s(RoomPlayer roomPlayer) {
        this.f18545a = roomPlayer;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.AbstractC11646c
    /* renamed from: a */
    public final void mo12871a(AbstractC11643g.EnumC11645b bVar, Object obj) {
        this.f18545a.lambda$doStartPlayByStreamUrl$0$RoomPlayer(bVar, obj);
    }
}

package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.detail.c */
public final /* synthetic */ class C7432c implements AbstractC88433f {

    /* renamed from: a */
    private final AbstractC7430b f18434a;

    static {
        Covode.recordClassIndex(8202);
    }

    C7432c(AbstractC7430b bVar) {
        this.f18434a = bVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        AbstractC7430b bVar = this.f18434a;
        C5832d dVar = (C5832d) obj;
        if (!bVar.f18431c) {
            return;
        }
        if (dVar == null) {
            bVar.mo13650a(0, "invalid room data _ response is null");
            return;
        }
        Room room = (Room) dVar.data;
        bVar.f18432d = room;
        bVar.f18431c = false;
        bVar.f18430b.mo13654a(room);
    }
}

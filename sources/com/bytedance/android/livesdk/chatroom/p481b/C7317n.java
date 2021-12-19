package com.bytedance.android.livesdk.chatroom.p481b;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.service.AbstractC11844b;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.b.n */
public final /* synthetic */ class C7317n implements AbstractC88433f {

    /* renamed from: a */
    private final AbstractC11844b f18176a;

    static {
        Covode.recordClassIndex(8080);
    }

    C7317n(AbstractC11844b bVar) {
        this.f18176a = bVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        AbstractC11844b bVar = this.f18176a;
        C5832d dVar = (C5832d) obj;
        if (dVar.data != null) {
            bVar.mo11777a((Room) dVar.data);
        } else {
            bVar.mo11776a();
        }
    }
}

package com.bytedance.android.livesdk.chatroom.p490e;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.livesdk.chatroom.model.C7682d;
import com.bytedance.android.livesdk.chatroom.p481b.C7302b;
import com.bytedance.android.livesdk.chatroom.p488c.C7373af;
import com.bytedance.android.livesdk.chatroom.p490e.C7477c;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.i */
public final /* synthetic */ class C7485i implements AbstractC88433f {

    /* renamed from: a */
    private final C7477c f18594a;

    /* renamed from: b */
    private final C7373af f18595b;

    /* renamed from: c */
    private final long f18596c;

    static {
        Covode.recordClassIndex(8255);
    }

    public C7485i(C7477c cVar, C7373af afVar, long j) {
        this.f18594a = cVar;
        this.f18595b = afVar;
        this.f18596c = j;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C7477c cVar = this.f18594a;
        C7373af afVar = this.f18595b;
        long j = this.f18596c;
        C5832d dVar = (C5832d) obj;
        if (cVar.f38654y != null && dVar.data != null) {
            ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).updateMessage(cVar.f18577b.getId(), j, C7302b.m15208a(cVar.f18577b.getId(), afVar.f18275a, ((C7682d) dVar.data).f19025a, C11115u.m19743a().mo17915b().mo13147a(), ((C7682d) dVar.data).f19026b));
            ((C7477c.AbstractC7479a) cVar.f38654y).mo13720a((C7682d) dVar.data);
        }
    }
}

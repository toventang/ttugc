package com.bytedance.android.livesdk.chatroom.p490e;

import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.livesdk.chatroom.p490e.C7477c;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.j */
public final /* synthetic */ class C7486j implements AbstractC88433f {

    /* renamed from: a */
    private final C7477c f18597a;

    /* renamed from: b */
    private final long f18598b;

    static {
        Covode.recordClassIndex(8256);
    }

    public C7486j(C7477c cVar, long j) {
        this.f18597a = cVar;
        this.f18598b = j;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C7477c cVar = this.f18597a;
        long j = this.f18598b;
        Throwable th = (Throwable) obj;
        if (cVar.f38654y != null) {
            ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).removeModelByToken(cVar.f18577b.getId(), j);
            if (th instanceof Exception) {
                ((C7477c.AbstractC7479a) cVar.f38654y).mo13725b((Exception) th);
            }
        }
    }
}

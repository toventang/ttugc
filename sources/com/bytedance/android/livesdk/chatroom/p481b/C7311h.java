package com.bytedance.android.livesdk.chatroom.p481b;

import android.os.Message;
import com.bytedance.android.live.broadcast.api.p185c.C3047a;
import com.bytedance.android.live.p379n.AbstractC5781n;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.b.h */
public final /* synthetic */ class C7311h implements AbstractC88433f {

    /* renamed from: a */
    private final AbstractC5781n.C5782a f18170a;

    static {
        Covode.recordClassIndex(8074);
    }

    C7311h(AbstractC5781n.C5782a aVar) {
        this.f18170a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        AbstractC5781n.C5782a aVar = this.f18170a;
        C3047a.m8356a("room_create", String.valueOf(System.currentTimeMillis()));
        if (aVar.f14614a != null) {
            Message obtainMessage = aVar.f14614a.obtainMessage(aVar.f14621h);
            obtainMessage.obj = obj;
            aVar.f14614a.sendMessage(obtainMessage);
        }
    }
}

package com.bytedance.android.livesdk.chatroom.p481b;

import android.os.Message;
import com.bytedance.android.live.p379n.AbstractC5781n;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.b.v */
public final /* synthetic */ class C7325v implements AbstractC88433f {

    /* renamed from: a */
    private final AbstractC5781n.C5782a f18184a;

    static {
        Covode.recordClassIndex(8088);
    }

    public C7325v(AbstractC5781n.C5782a aVar) {
        this.f18184a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        AbstractC5781n.C5782a aVar = this.f18184a;
        if (aVar.f14614a != null) {
            Message obtainMessage = aVar.f14614a.obtainMessage(aVar.f14621h);
            obtainMessage.obj = obj;
            aVar.f14614a.sendMessage(obtainMessage);
        }
    }
}

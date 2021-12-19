package com.bytedance.android.livesdk.chatroom.p481b;

import android.os.Message;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p379n.AbstractC5781n;
import com.bytedance.android.livesdkapi.depend.model.live.ContinueRoomResponse;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.b.u */
public final /* synthetic */ class C7324u implements AbstractC88433f {

    /* renamed from: a */
    private final AbstractC5781n.C5782a f18183a;

    static {
        Covode.recordClassIndex(8087);
    }

    public C7324u(AbstractC5781n.C5782a aVar) {
        this.f18183a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        AbstractC5781n.C5782a aVar = this.f18183a;
        C5832d dVar = (C5832d) obj;
        if ((dVar == null || !(dVar.statusCode != 0 || dVar.data == null || ((ContinueRoomResponse) dVar.data).room == null)) && aVar.f14614a != null) {
            Message obtainMessage = aVar.f14614a.obtainMessage(aVar.f14621h);
            obtainMessage.obj = ((ContinueRoomResponse) dVar.data).room;
            aVar.f14614a.sendMessage(obtainMessage);
        }
    }
}

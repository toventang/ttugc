package com.bytedance.android.livesdk.chatroom.p481b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.b.s */
public final /* synthetic */ class C7322s implements AbstractC88433f {

    /* renamed from: a */
    private final Handler f18181a;

    static {
        Covode.recordClassIndex(8085);
    }

    public C7322s(Handler handler) {
        this.f18181a = handler;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        Handler handler = this.f18181a;
        C5832d dVar = (C5832d) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(39);
            obtainMessage.obj = dVar.data;
            handler.sendMessage(obtainMessage);
        }
    }
}

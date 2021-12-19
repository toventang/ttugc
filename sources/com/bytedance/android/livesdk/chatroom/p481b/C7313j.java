package com.bytedance.android.livesdk.chatroom.p481b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.b.j */
public final /* synthetic */ class C7313j implements AbstractC88433f {

    /* renamed from: a */
    private final Handler f18172a;

    static {
        Covode.recordClassIndex(8076);
    }

    public C7313j(Handler handler) {
        this.f18172a = handler;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        Handler handler = this.f18172a;
        C5832d dVar = (C5832d) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(26);
            obtainMessage.obj = dVar.data;
            handler.sendMessage(obtainMessage);
        }
    }
}

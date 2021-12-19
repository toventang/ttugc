package com.bytedance.android.livesdk.chatroom.p481b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.b.k */
public final /* synthetic */ class C7314k implements AbstractC88433f {

    /* renamed from: a */
    private final Handler f18173a;

    static {
        Covode.recordClassIndex(8077);
    }

    public C7314k(Handler handler) {
        this.f18173a = handler;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        Handler handler = this.f18173a;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(26);
            obtainMessage.obj = obj;
            handler.sendMessage(obtainMessage);
        }
    }
}

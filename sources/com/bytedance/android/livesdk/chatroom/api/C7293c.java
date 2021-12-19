package com.bytedance.android.livesdk.chatroom.api;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.api.c */
public final /* synthetic */ class C7293c implements AbstractC88433f {

    /* renamed from: a */
    private final Handler f18128a;

    static {
        Covode.recordClassIndex(8056);
    }

    public C7293c(Handler handler) {
        this.f18128a = handler;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        Handler handler = this.f18128a;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(22);
            obtainMessage.obj = obj;
            handler.sendMessage(obtainMessage);
        }
    }
}

package com.bytedance.android.livesdk.chatroom.p481b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.b.t */
public final /* synthetic */ class C7323t implements AbstractC88433f {

    /* renamed from: a */
    private final Handler f18182a;

    static {
        Covode.recordClassIndex(8086);
    }

    public C7323t(Handler handler) {
        this.f18182a = handler;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        Handler handler = this.f18182a;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(39);
            obtainMessage.obj = obj;
            handler.sendMessage(obtainMessage);
        }
    }
}

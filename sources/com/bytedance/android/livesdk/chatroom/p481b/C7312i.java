package com.bytedance.android.livesdk.chatroom.p481b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.b.i */
public final /* synthetic */ class C7312i implements AbstractC88433f {

    /* renamed from: a */
    private final Handler f18171a;

    static {
        Covode.recordClassIndex(8075);
    }

    C7312i(Handler handler) {
        this.f18171a = handler;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        Handler handler = this.f18171a;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(25);
            obtainMessage.obj = obj;
            handler.sendMessage(obtainMessage);
        }
    }
}

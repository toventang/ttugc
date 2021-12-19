package com.bytedance.android.livesdk.chatroom.p481b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.b.aa */
public final /* synthetic */ class C7301aa implements AbstractC88433f {

    /* renamed from: a */
    private final Handler f18145a;

    /* renamed from: b */
    private final int f18146b = 7;

    static {
        Covode.recordClassIndex(8064);
    }

    C7301aa(Handler handler) {
        this.f18145a = handler;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        Handler handler = this.f18145a;
        int i = this.f18146b;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(i);
            obtainMessage.obj = obj;
            handler.sendMessage(obtainMessage);
        }
    }
}

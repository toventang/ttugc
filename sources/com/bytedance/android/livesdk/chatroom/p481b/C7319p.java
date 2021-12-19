package com.bytedance.android.livesdk.chatroom.p481b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.b.p */
public final /* synthetic */ class C7319p implements AbstractC88433f {

    /* renamed from: a */
    private final Handler f18178a;

    static {
        Covode.recordClassIndex(8082);
    }

    C7319p(Handler handler) {
        this.f18178a = handler;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        Handler handler = this.f18178a;
        C5832d dVar = (C5832d) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(38);
            obtainMessage.obj = dVar.data;
            handler.sendMessage(obtainMessage);
        }
    }
}

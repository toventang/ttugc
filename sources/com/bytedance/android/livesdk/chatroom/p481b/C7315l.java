package com.bytedance.android.livesdk.chatroom.p481b;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.b.l */
public final /* synthetic */ class C7315l implements AbstractC88433f {

    /* renamed from: a */
    private final Handler f18174a;

    static {
        Covode.recordClassIndex(8078);
    }

    C7315l(Handler handler) {
        this.f18174a = handler;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        Handler handler = this.f18174a;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(32));
        }
    }
}

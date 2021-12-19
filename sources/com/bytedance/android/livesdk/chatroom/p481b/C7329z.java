package com.bytedance.android.livesdk.chatroom.p481b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.b.z */
public final /* synthetic */ class C7329z implements AbstractC88433f {

    /* renamed from: a */
    private final Handler f18192a;

    /* renamed from: b */
    private final int f18193b = 7;

    static {
        Covode.recordClassIndex(8092);
    }

    C7329z(Handler handler) {
        this.f18192a = handler;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        Handler handler = this.f18192a;
        int i = this.f18193b;
        C5832d dVar = (C5832d) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(i);
            obtainMessage.obj = dVar.data;
            handler.sendMessage(obtainMessage);
        }
    }
}

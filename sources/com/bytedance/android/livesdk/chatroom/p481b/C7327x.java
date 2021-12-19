package com.bytedance.android.livesdk.chatroom.p481b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.android.livesdk.chatroom.model.C7685e;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.p691g.C11775n;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.b.x */
public final /* synthetic */ class C7327x implements AbstractC88433f {

    /* renamed from: a */
    private final C7307f f18186a;

    /* renamed from: b */
    private final Handler f18187b;

    /* renamed from: c */
    private final long f18188c;

    static {
        Covode.recordClassIndex(8090);
    }

    C7327x(C7307f fVar, Handler handler, long j) {
        this.f18186a = fVar;
        this.f18187b = handler;
        this.f18188c = j;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C7307f fVar = this.f18186a;
        Handler handler = this.f18187b;
        long j = this.f18188c;
        C5830b bVar = (C5830b) obj;
        if (handler != null) {
            C7685e eVar = new C7685e();
            eVar.f19034a = bVar.data;
            if (eVar.f19034a == null || eVar.f19034a.getId() == 0) {
                eVar.f19034a = C11775n.m20754a(j);
            }
            eVar.f19035b = (EnterRoomExtra) bVar.extra;
            if (eVar.f19034a != null) {
                eVar.f19034a.nowTime = ((EnterRoomExtra) bVar.extra).now / 1000;
            }
            fVar.f18162b = C11115u.m19743a().mo17915b().mo13165e();
            Message obtainMessage = handler.obtainMessage(4);
            obtainMessage.obj = eVar;
            handler.sendMessage(obtainMessage);
        }
    }
}

package com.bytedance.android.livesdk.chatroom.p481b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.android.live.p172a.p173a.p174a.C2911c;
import com.bytedance.android.livesdk.chatroom.model.C7685e;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p691g.C11775n;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.b.y */
public final /* synthetic */ class C7328y implements AbstractC88433f {

    /* renamed from: a */
    private final C7307f f18189a;

    /* renamed from: b */
    private final Handler f18190b;

    /* renamed from: c */
    private final long f18191c;

    static {
        Covode.recordClassIndex(8091);
    }

    C7328y(C7307f fVar, Handler handler, long j) {
        this.f18189a = fVar;
        this.f18190b = handler;
        this.f18191c = j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: com.bytedance.android.livesdk.chatroom.model.e */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C7307f fVar = this.f18189a;
        Handler handler = this.f18190b;
        long j = this.f18191c;
        Throwable th = (Throwable) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(4);
            Room a = C11775n.m20754a(j);
            boolean z = th instanceof C2911c;
            Throwable th2 = th;
            th2 = th;
            if (z && a != null) {
                C2911c cVar = (C2911c) th;
                if (cVar.getResponse() == null || cVar.getResponse().extra == null || cVar.getResponse().statusCode != 0) {
                    obtainMessage.obj = th;
                    handler.sendMessage(obtainMessage);
                }
                C7685e eVar = new C7685e();
                C5830b response = cVar.getResponse();
                eVar.f19034a = a;
                eVar.f19035b = (EnterRoomExtra) response.extra;
                if (eVar.f19034a != null) {
                    eVar.f19034a.nowTime = ((EnterRoomExtra) response.extra).now / 1000;
                }
                fVar.f18162b = C11115u.m19743a().mo17915b().mo13165e();
                th2 = eVar;
            }
            obtainMessage.obj = th2;
            handler.sendMessage(obtainMessage);
        }
    }
}

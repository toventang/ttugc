package com.bytedance.android.livesdk.chatroom.p490e;

import com.bytedance.android.livesdk.chatroom.p488c.C7371ad;
import com.bytedance.android.livesdk.chatroom.p488c.C7372ae;
import com.bytedance.android.livesdk.chatroom.p490e.C7477c;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.e.h */
public final /* synthetic */ class C7484h implements AbstractC88433f {

    /* renamed from: a */
    private final C7477c f18592a;

    /* renamed from: b */
    private final C7371ad f18593b;

    static {
        Covode.recordClassIndex(8254);
    }

    C7484h(C7477c cVar, C7371ad adVar) {
        this.f18592a = cVar;
        this.f18593b = adVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C7477c cVar = this.f18592a;
        Throwable th = (Throwable) obj;
        C6779a.m14563a().mo13053a(new C7372ae(this.f18593b, false));
        cVar.f18576a = true;
        if (cVar.f38654y != null && (th instanceof Exception)) {
            ((C7477c.AbstractC7479a) cVar.f38654y).mo13723a((Exception) th);
        }
    }
}

package com.bytedance.android.livesdk.p656w;

import com.bytedance.android.livesdk.model.message.C9605ai;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IInterceptor;

/* renamed from: com.bytedance.android.livesdk.w.e */
public final class C11305e implements IInterceptor {

    /* renamed from: a */
    private long f27036a;

    static {
        Covode.recordClassIndex(12942);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IInterceptor
    public final boolean onMessage(IMessage iMessage) {
        if (!(iMessage instanceof C9605ai)) {
            return false;
        }
        C9605ai aiVar = (C9605ai) iMessage;
        if (this.f27036a <= 0) {
            this.f27036a = C11115u.m19743a().mo17915b().mo13161c();
        }
        if (aiVar.f23316h == null) {
            return true;
        }
        if (aiVar.f23316h != null) {
            long j = this.f27036a;
            if (j <= 0 || j != aiVar.f23316h.getId() || aiVar.f16442c) {
                return false;
            }
            return true;
        }
        return false;
    }
}

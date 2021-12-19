package com.bytedance.android.livesdk.p656w;

import com.bytedance.android.livesdk.model.message.C9889s;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IInterceptor;

/* renamed from: com.bytedance.android.livesdk.w.c */
public final class C11303c implements IInterceptor {

    /* renamed from: a */
    private long f27035a;

    static {
        Covode.recordClassIndex(12940);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IInterceptor
    public final boolean onMessage(IMessage iMessage) {
        if (!(iMessage instanceof C9889s)) {
            return false;
        }
        C9889s sVar = (C9889s) iMessage;
        if (this.f27035a <= 0) {
            this.f27035a = C11115u.m19743a().mo17915b().mo13161c();
        }
        if (sVar.f23914f == null) {
            return true;
        }
        if (sVar.f23914f != null) {
            long j = this.f27035a;
            if (j <= 0 || j != sVar.f23914f.getId()) {
                return false;
            }
            return true;
        }
        return false;
    }
}

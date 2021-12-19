package com.bytedance.android.livesdk.p656w;

import com.bytedance.android.livesdk.model.message.C9878i;
import com.bytedance.android.livesdk.p425aa.C6559l;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IInterceptor;

/* renamed from: com.bytedance.android.livesdk.w.a */
public final class C11301a implements IInterceptor {

    /* renamed from: a */
    private long f27033a;

    static {
        Covode.recordClassIndex(12938);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IInterceptor
    public final boolean onMessage(IMessage iMessage) {
        if (!(iMessage instanceof C9878i)) {
            return false;
        }
        C9878i iVar = (C9878i) iMessage;
        if (this.f27033a <= 0) {
            this.f27033a = C11115u.m19743a().mo17915b().mo13161c();
        }
        if (iVar.f23854g == null) {
            new C6559l().mo12692a("content", iVar.f23853f).mo12692a("is_visiable_to_senter", String.valueOf(iVar.f23855h)).mo12692a("support_display_text", String.valueOf(iVar.mo12726a())).mo12692a("client_user_id", String.valueOf(this.f27033a)).mo12693a("chat_message_exception_log", 0);
            return true;
        }
        if (!iVar.f23855h && iVar.f23854g != null) {
            long j = this.f27033a;
            if (j <= 0 || j != iVar.f23854g.getId()) {
                return false;
            }
            return true;
        }
        return false;
    }
}

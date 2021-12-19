package com.bytedance.android.livesdk.p655v;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.android.livesdk.p430ab.AbstractC6570b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.v.a */
public final class C11299a implements AbstractC6570b {

    /* renamed from: a */
    public final long f27029a;

    /* renamed from: b */
    private IMessageManager f27030b;

    /* renamed from: c */
    private long f27031c;

    static {
        Covode.recordClassIndex(12931);
    }

    @Override // com.bytedance.android.livesdk.p430ab.AbstractC6570b
    /* renamed from: a */
    public final void mo12725a(IMessageManager iMessageManager) {
        this.f27030b = iMessageManager;
    }

    public C11299a(long j) {
        this.f27029a = j;
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IInterceptor
    public final boolean onMessage(IMessage iMessage) {
        if (!(iMessage instanceof C9895y)) {
            return false;
        }
        if (this.f27031c <= 0) {
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            this.f27031c = b.mo13161c();
        }
        C9895y yVar = (C9895y) iMessage;
        if (this.f27031c > 0 && !yVar.f23944s && yVar.f23932g != null) {
            long j = this.f27031c;
            User user = yVar.f23932g;
            C89219l.m154716b(user, "");
            if (j == user.getId() && yVar.f23938m != 1) {
                return true;
            }
        }
        if (yVar.f23932g == null) {
            return true;
        }
        return false;
    }
}

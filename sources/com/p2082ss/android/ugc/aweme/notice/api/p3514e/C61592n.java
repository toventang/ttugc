package com.p2082ss.android.ugc.aweme.notice.api.p3514e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.api.bean.PushChallengeInfoMsg;
import com.p2082ss.android.ugc.aweme.utils.C80361dw;
import com.p2082ss.android.websocket.internal.AbstractC85632a;
import com.p2082ss.android.websocket.p4394a.p4397c.AbstractC85631b;

/* renamed from: com.ss.android.ugc.aweme.notice.api.e.n */
public final class C61592n implements AbstractC85631b {
    static {
        Covode.recordClassIndex(72270);
    }

    @Override // com.p2082ss.android.websocket.p4394a.p4397c.AbstractC85631b
    /* renamed from: a */
    public final /* synthetic */ Object mo92083a(AbstractC85632a aVar) {
        return m111540b(aVar);
    }

    /* renamed from: b */
    private static PushChallengeInfoMsg m111540b(AbstractC85632a aVar) {
        try {
            return (PushChallengeInfoMsg) C80361dw.m139333a(new String(aVar.getPayload()), PushChallengeInfoMsg.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}

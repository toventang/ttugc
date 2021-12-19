package com.p2082ss.android.ugc.aweme.notice.api.p3514e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.coupon.model.CouponMessage;
import com.p2082ss.android.ugc.aweme.utils.C80361dw;
import com.p2082ss.android.websocket.internal.AbstractC85632a;
import com.p2082ss.android.websocket.p4394a.p4397c.AbstractC85631b;

/* renamed from: com.ss.android.ugc.aweme.notice.api.e.c */
public final class C61581c implements AbstractC85631b {
    static {
        Covode.recordClassIndex(72259);
    }

    @Override // com.p2082ss.android.websocket.p4394a.p4397c.AbstractC85631b
    /* renamed from: a */
    public final Object mo92083a(AbstractC85632a aVar) {
        try {
            return C80361dw.m139333a(new String(aVar.getPayload()), CouponMessage.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}

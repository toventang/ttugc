package com.p2082ss.android.ugc.aweme.notice.api.p3514e;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.websocket.internal.AbstractC85632a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.api.e.v */
public final class C61603v implements AbstractC85632a {

    /* renamed from: a */
    public final WsChannelMsg f139802a;

    static {
        Covode.recordClassIndex(72281);
    }

    @Override // com.p2082ss.android.websocket.internal.AbstractC85632a
    public final int getMethod() {
        return this.f139802a.f33469g;
    }

    @Override // com.p2082ss.android.websocket.internal.AbstractC85632a
    public final int getService() {
        return this.f139802a.f33468f;
    }

    @Override // com.p2082ss.android.websocket.internal.AbstractC85632a
    public final byte[] getPayload() {
        byte[] a = this.f139802a.mo22159a();
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.websocket.internal.AbstractC85632a
    public final String getPayloadEncoding() {
        String str = this.f139802a.f33471i;
        C89219l.m154716b(str, "");
        return str;
    }

    @Override // com.p2082ss.android.websocket.internal.AbstractC85632a
    public final String getPayloadType() {
        String str = this.f139802a.f33472j;
        C89219l.m154716b(str, "");
        return str;
    }

    public C61603v(WsChannelMsg wsChannelMsg) {
        C89219l.m154721d(wsChannelMsg, "");
        this.f139802a = wsChannelMsg;
    }
}

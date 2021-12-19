package com.bytedance.android.livesdk.p430ab.p432b;

import com.bytedance.android.livesdkapi.p692h.C11777a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;

/* renamed from: com.bytedance.android.livesdk.ab.b.a */
public abstract class AbstractC6571a extends C11777a implements IMessage {

    /* renamed from: b */
    public boolean f16441b;

    /* renamed from: c */
    public boolean f16442c;

    /* renamed from: d */
    public int f16443d;

    /* renamed from: e */
    public int f16444e;

    static {
        Covode.recordClassIndex(7307);
    }

    /* renamed from: a */
    public boolean mo12726a() {
        return false;
    }

    @Override // com.p2082ss.ugc.live.sdk.message.data.IMessage
    public int getPriority() {
        return 0;
    }

    @Override // com.p2082ss.ugc.live.sdk.message.data.IMessage
    public int getGeneralMessageType() {
        return this.f16444e;
    }

    @Override // com.p2082ss.ugc.live.sdk.message.data.IMessage
    public int getMessageFrom() {
        return this.f16443d;
    }

    @Override // com.p2082ss.ugc.live.sdk.message.data.IMessage
    public int getIntType() {
        return this.f28131L.getIntType();
    }

    @Override // com.p2082ss.ugc.live.sdk.message.data.IMessage
    public long getMessageId() {
        if (this.f28134O != null) {
            return this.f28134O.f28138d;
        }
        return 0;
    }

    @Override // com.p2082ss.ugc.live.sdk.message.data.IMessage
    public boolean needMonitor() {
        if (this.f28134O == null || this.f28134O.f28143i == 0) {
            return false;
        }
        return true;
    }
}

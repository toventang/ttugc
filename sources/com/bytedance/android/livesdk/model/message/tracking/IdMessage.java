package com.bytedance.android.livesdk.model.message.tracking;

import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;

public class IdMessage extends EventTrackingMessage {
    public final long messageId;

    static {
        Covode.recordClassIndex(11434);
    }

    public static IdMessage from(AbstractC6571a aVar) {
        return new IdMessage(aVar.f28131L.getWsMethod(), !aVar.f16442c, aVar.getMessageId());
    }

    IdMessage(String str, boolean z, long j) {
        super(str, z);
        this.messageId = j;
    }
}

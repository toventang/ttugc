package com.bytedance.android.livesdk.model.message.tracking;

import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;

public class IdReasonMessage extends IdMessage {
    public final String reason;

    static {
        Covode.recordClassIndex(11435);
    }

    public static IdReasonMessage from(AbstractC6571a aVar, String str) {
        return new IdReasonMessage(aVar.f28131L.getWsMethod(), aVar.f16442c, aVar.getMessageId(), str);
    }

    IdReasonMessage(String str, boolean z, long j, String str2) {
        super(str, z, j);
        this.reason = str2;
    }
}

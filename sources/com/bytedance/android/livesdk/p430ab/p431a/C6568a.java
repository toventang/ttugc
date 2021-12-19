package com.bytedance.android.livesdk.p430ab.p431a;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.message.IMessageService;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28023p;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageConverter;

/* renamed from: com.bytedance.android.livesdk.ab.a.a */
public final class C6568a implements IMessageConverter {
    static {
        Covode.recordClassIndex(7304);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageConverter
    public final IMessage convert(String str, String str2, long j) {
        Class<? extends AbstractC6571a> messageClass = ((IMessageService) C6193a.m13435a(IMessageService.class)).getMessageClass(str);
        if (messageClass == null) {
            return null;
        }
        try {
            AbstractC6571a aVar = (AbstractC6571a) C4139e.C4140a.f11575b.mo46670a(str2, (Class) messageClass);
            aVar.f28132M = j;
            return aVar;
        } catch (C28023p e) {
            C3854a.m9459b(e.toString());
            return null;
        }
    }
}

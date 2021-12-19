package com.bytedance.ies.p1208im.core.p1225f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.p1399im.core.p1404a.AbstractC19482c;
import com.bytedance.p1399im.core.proto.MessageBody;

/* renamed from: com.bytedance.ies.im.core.f.c */
public final class C17559c implements AbstractC19482c {

    /* renamed from: a */
    public static final C17559c f42008a = new C17559c();

    private C17559c() {
    }

    static {
        Covode.recordClassIndex(20048);
    }

    @Override // com.bytedance.p1399im.core.p1404a.AbstractC19482c
    /* renamed from: a */
    public final MessageBody mo27975a(MessageBody messageBody) {
        Integer num;
        if (messageBody != null && ((num = messageBody.message_type) == null || num.intValue() != 60001)) {
            if (messageBody.message_type.intValue() > 50000) {
                return messageBody;
            }
            if (messageBody.message_type.intValue() >= 0 && messageBody.message_type.intValue() <= 1999) {
                return C17415a.m32259f().mo27804a(messageBody);
            }
        }
        return null;
    }
}

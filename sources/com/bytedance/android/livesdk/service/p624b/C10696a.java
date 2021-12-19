package com.bytedance.android.livesdk.service.p624b;

import com.bytedance.android.livesdk.model.C9914v;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.service.b.a */
public final class C10696a {

    /* renamed from: a */
    public EnumC10697a f25752a;

    /* renamed from: b */
    public C9914v f25753b;

    /* renamed from: com.bytedance.android.livesdk.service.b.a$a */
    public enum EnumC10697a {
        TAB_EVENT,
        TAB_EMPTY_EVENT,
        GIFT_EVENT,
        GIFT_EMPTY_EVENT;

        static {
            Covode.recordClassIndex(12294);
        }
    }

    static {
        Covode.recordClassIndex(12293);
    }

    public C10696a(EnumC10697a aVar, C9914v vVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(vVar, "");
        this.f25752a = aVar;
        this.f25753b = vVar;
    }
}

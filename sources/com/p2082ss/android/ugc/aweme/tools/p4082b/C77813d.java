package com.p2082ss.android.ugc.aweme.tools.p4082b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.tools.b.d */
public final class C77813d implements AbstractC77812c {

    /* renamed from: a */
    final AbstractC77812c f174561a;

    static {
        Covode.recordClassIndex(90898);
    }

    public C77813d(AbstractC77812c cVar) {
        this.f174561a = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.p4082b.AbstractC77812c
    /* renamed from: a */
    public final String mo121394a(String str, EnumC77814e eVar, EnumC77814e eVar2) {
        if (str == null || str.length() <= 5000) {
            return this.f174561a.mo121394a(str, eVar, eVar2);
        }
        throw new IllegalArgumentException("Struct in tools line is too long! MAX_LENGTH is 5000, while input.length() is " + str.length() + "!");
    }
}

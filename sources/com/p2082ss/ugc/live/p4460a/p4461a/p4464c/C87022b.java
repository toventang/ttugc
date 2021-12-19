package com.p2082ss.ugc.live.p4460a.p4461a.p4464c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.p4460a.p4461a.C87020c;

/* renamed from: com.ss.ugc.live.a.a.c.b */
public final class C87022b extends C87021a {

    /* renamed from: a */
    private String f196198a;

    static {
        Covode.recordClassIndex(102788);
    }

    @Override // com.p2082ss.ugc.live.p4460a.p4461a.p4464c.C87021a
    public final String getMessage() {
        return "md5:" + this.f196198a + "\n" + super.getMessage();
    }

    public C87022b(C87020c cVar, String str) {
        super(cVar);
        this.f196198a = str;
    }

    public C87022b(String str, C87020c cVar, String str2) {
        super(str, cVar);
        this.f196198a = str2;
    }

    public C87022b(String str, Throwable th, C87020c cVar, String str2) {
        super(str, th, cVar);
        this.f196198a = str2;
    }
}

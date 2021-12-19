package com.p2082ss.ugc.live.p4460a.p4461a.p4464c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.p4460a.p4461a.C87020c;
import com.p2082ss.ugc.live.p4460a.p4461a.p4463b.C87014a;

/* renamed from: com.ss.ugc.live.a.a.c.c */
public final class C87023c extends C87021a {

    /* renamed from: a */
    private int f196199a;

    /* renamed from: b */
    private C87014a f196200b;

    static {
        Covode.recordClassIndex(102789);
    }

    public final int getErrorCode() {
        return this.f196199a;
    }

    @Override // com.p2082ss.ugc.live.p4460a.p4461a.p4464c.C87021a
    public final String getMessage() {
        return this.f196200b.toString() + "\n" + super.getMessage();
    }

    public C87023c(C87020c cVar, int i, C87014a aVar) {
        super(cVar);
        this.f196199a = i;
        this.f196200b = aVar;
    }

    public C87023c(String str, C87020c cVar, int i, C87014a aVar) {
        super(str, cVar);
        this.f196199a = i;
        this.f196200b = aVar;
    }

    public C87023c(String str, Throwable th, C87020c cVar, int i, C87014a aVar) {
        super(str, th, cVar);
        this.f196199a = i;
        this.f196200b = aVar;
    }
}

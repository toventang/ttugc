package com.bytedance.android.livesdk.manage.p572a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.p4460a.p4461a.C87020c;
import com.p2082ss.ugc.live.p4460a.p4461a.p4463b.C87014a;
import com.p2082ss.ugc.live.p4460a.p4461a.p4464c.C87021a;

/* renamed from: com.bytedance.android.livesdk.manage.a.a */
public final class C9478a extends C87021a {

    /* renamed from: a */
    private int f23018a;

    /* renamed from: b */
    private C87014a f23019b;

    static {
        Covode.recordClassIndex(10986);
    }

    public final int getErrorCode() {
        return this.f23018a;
    }

    @Override // com.p2082ss.ugc.live.p4460a.p4461a.p4464c.C87021a
    public final String getMessage() {
        return this.f23019b.toString() + "\n" + super.getMessage();
    }

    public C9478a(String str, Throwable th, C87020c cVar, int i, C87014a aVar) {
        super(str, th, cVar);
        this.f23018a = i;
        this.f23019b = aVar;
    }
}

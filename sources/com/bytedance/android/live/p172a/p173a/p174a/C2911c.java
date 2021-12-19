package com.bytedance.android.live.p172a.p173a.p174a;

import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.a.a.a.c */
public final class C2911c extends C2909a {

    /* renamed from: a */
    private C5830b f8663a;

    static {
        Covode.recordClassIndex(3341);
    }

    public final C5830b getResponse() {
        return this.f8663a;
    }

    public C2911c() {
        super(-2);
    }

    @Override // com.bytedance.android.live.p172a.p173a.C2908a, com.bytedance.android.live.p172a.p173a.p174a.C2909a
    public final String getMessage() {
        return " TYPE = ResponseNoDataException " + super.getMessage();
    }

    public C2911c(C5830b bVar) {
        super(-2);
        this.f8663a = bVar;
    }
}

package com.bytedance.ies.p1121b.p1124c;

import com.bytedance.covode.number.Covode;
import java.util.Objects;
import okhttp3.AbstractC90025ab;
import okhttp3.C90204w;
import p4632k.AbstractC89425g;

/* renamed from: com.bytedance.ies.b.c.d */
public final class C16113d extends AbstractC90025ab {

    /* renamed from: a */
    AbstractC90025ab f38807a;

    static {
        Covode.recordClassIndex(18406);
    }

    @Override // okhttp3.AbstractC90025ab
    public final C90204w contentType() {
        return this.f38807a.contentType();
    }

    public C16113d(AbstractC90025ab abVar) {
        Objects.requireNonNull(abVar, "requestBody == null");
        this.f38807a = abVar;
    }

    @Override // okhttp3.AbstractC90025ab
    public final void writeTo(AbstractC89425g gVar) {
        this.f38807a.writeTo(gVar);
        gVar.flush();
    }
}

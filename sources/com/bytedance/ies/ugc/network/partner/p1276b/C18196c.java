package com.bytedance.ies.ugc.network.partner.p1276b;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedOutput;
import okhttp3.AbstractC90025ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.network.partner.b.c */
public final class C18196c {

    /* renamed from: a */
    public String f43332a;

    /* renamed from: b */
    public TypedOutput f43333b;

    /* renamed from: c */
    public final AbstractC90025ab f43334c;

    static {
        Covode.recordClassIndex(20852);
    }

    public C18196c(Request request) {
        C89219l.m154721d(request, "");
        String method = request.getMethod();
        if (method != null) {
            this.f43332a = method;
            this.f43333b = request.getBody();
            this.f43334c = request.getRequestBody();
            return;
        }
        throw new NullPointerException("Method must not be null.");
    }
}

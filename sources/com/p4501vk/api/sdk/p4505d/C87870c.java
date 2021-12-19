package com.p4501vk.api.sdk.p4505d;

import com.bytedance.covode.number.Covode;
import com.p4501vk.api.sdk.C87831b;
import com.p4501vk.api.sdk.internal.C87906e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.d.c */
public final class C87870c {

    /* renamed from: a */
    public final C87831b f199590a;

    static {
        Covode.recordClassIndex(103880);
    }

    /* renamed from: a */
    public final String mo142345a() {
        return this.f199590a.f199529o.getValue();
    }

    /* renamed from: b */
    public final String mo142346b() {
        return this.f199590a.f199524j.getValue();
    }

    /* renamed from: c */
    public final String mo142347c() {
        return this.f199590a.f199525k.getValue();
    }

    public final String toString() {
        return "OkHttpExecutorConfig(host='" + mo142345a() + "', accessToken='" + mo142346b() + "', secret='" + mo142347c() + "', logFilterCredentials=" + this.f199590a.f199526l + ')';
    }

    public C87870c(C87831b bVar) {
        C89219l.m154719c(bVar, "");
        this.f199590a = bVar;
        if (bVar.f199515a != null) {
            String a = mo142345a();
            if (a == null || a.length() == 0) {
                StringBuilder sb = new StringBuilder("Illegal host value: ");
                if (a == null) {
                    C89219l.m154707a();
                }
                throw new IllegalArgumentException(sb.append(a).toString());
            }
            C87906e.m152919a(mo142346b());
            return;
        }
        throw new IllegalArgumentException("context is null");
    }
}

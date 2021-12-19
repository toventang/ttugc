package com.facebook.imagepipeline.p1882g;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1885j.C24456e;

/* renamed from: com.facebook.imagepipeline.g.a */
public final class C24439a extends RuntimeException {

    /* renamed from: a */
    private final C24456e f58066a;

    static {
        Covode.recordClassIndex(28582);
    }

    public final C24456e getEncodedImage() {
        return this.f58066a;
    }

    public C24439a(String str, C24456e eVar) {
        super(str);
        this.f58066a = eVar;
    }

    public C24439a(String str, Throwable th, C24456e eVar) {
        super(str, th);
        this.f58066a = eVar;
    }
}

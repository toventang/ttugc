package com.snapchat.kit.sdk.creative.p2074d;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.creative.p2073c.C29055c;
import java.io.File;

/* renamed from: com.snapchat.kit.sdk.creative.d.c */
public final class C29060c extends AbstractC29058a {

    /* renamed from: d */
    private C29055c f68646d;

    static {
        Covode.recordClassIndex(35407);
    }

    @Override // com.snapchat.kit.sdk.creative.p2074d.AbstractC29058a
    /* renamed from: a */
    public final String mo50725a() {
        return "preview";
    }

    @Override // com.snapchat.kit.sdk.creative.p2074d.AbstractC29058a
    /* renamed from: b */
    public final String mo50726b() {
        return "image/*";
    }

    @Override // com.snapchat.kit.sdk.creative.p2074d.AbstractC29058a
    /* renamed from: c */
    public final File mo50727c() {
        return this.f68646d.f68629a;
    }

    public C29060c(C29055c cVar) {
        this.f68646d = cVar;
    }
}

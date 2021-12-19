package com.facebook.drawee.p1845a.p1846a.p1848b.p1849a;

import com.bytedance.covode.number.Covode;
import com.facebook.common.time.AbstractC24140b;
import com.facebook.drawee.p1845a.p1846a.p1848b.C24181h;
import com.facebook.imagepipeline.p1886k.C24460a;
import com.facebook.imagepipeline.p1890o.C24636b;

/* renamed from: com.facebook.drawee.a.a.b.a.c */
public final class C24174c extends C24460a {

    /* renamed from: a */
    private final AbstractC24140b f57166a;

    /* renamed from: b */
    private final C24181h f57167b;

    static {
        Covode.recordClassIndex(28305);
    }

    @Override // com.facebook.imagepipeline.p1886k.C24460a, com.facebook.imagepipeline.p1886k.AbstractC24462c
    public final void onRequestCancellation(String str) {
        this.f57167b.f57210l = this.f57166a.now();
        this.f57167b.f57200b = str;
    }

    public C24174c(AbstractC24140b bVar, C24181h hVar) {
        this.f57166a = bVar;
        this.f57167b = hVar;
    }

    @Override // com.facebook.imagepipeline.p1886k.C24460a, com.facebook.imagepipeline.p1886k.AbstractC24462c
    public final void onRequestSuccess(C24636b bVar, String str, boolean z) {
        this.f57167b.f57210l = this.f57166a.now();
        this.f57167b.f57201c = bVar;
        this.f57167b.f57200b = str;
        this.f57167b.f57212n = z;
    }

    @Override // com.facebook.imagepipeline.p1886k.C24460a, com.facebook.imagepipeline.p1886k.AbstractC24462c
    public final void onRequestFailure(C24636b bVar, String str, Throwable th, boolean z) {
        this.f57167b.f57210l = this.f57166a.now();
        this.f57167b.f57201c = bVar;
        this.f57167b.f57200b = str;
        this.f57167b.f57212n = z;
    }

    @Override // com.facebook.imagepipeline.p1886k.C24460a, com.facebook.imagepipeline.p1886k.AbstractC24462c
    public final void onRequestStart(C24636b bVar, Object obj, String str, boolean z) {
        this.f57167b.f57209k = this.f57166a.now();
        this.f57167b.f57201c = bVar;
        this.f57167b.f57202d = obj;
        this.f57167b.f57200b = str;
        this.f57167b.f57212n = z;
    }
}

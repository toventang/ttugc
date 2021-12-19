package com.bytedance.lighten.loader;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.C20778a;
import com.bytedance.lighten.p1477a.C20758o;
import com.bytedance.lighten.p1477a.C20765u;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20734k;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.facebook.imagepipeline.p1885j.C24452a;

/* renamed from: com.bytedance.lighten.loader.c */
public final class C20784c extends C24202c<AbstractC24457f> {

    /* renamed from: a */
    public AbstractC20734k f49174a;

    /* renamed from: b */
    public boolean f49175b;

    /* renamed from: c */
    public boolean f49176c;

    /* renamed from: d */
    private SmartImageView f49177d;

    /* renamed from: e */
    private Uri f49178e;

    /* renamed from: f */
    private C24452a f49179f;

    /* renamed from: g */
    private C20765u f49180g;

    static {
        Covode.recordClassIndex(24360);
    }

    C20784c() {
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
    public final void onRelease(String str) {
        super.onRelease(str);
        AbstractC20734k kVar = this.f49174a;
        if (kVar != null) {
            kVar.mo34146a(this.f49178e);
        }
        this.f49175b = false;
        this.f49176c = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34218a(C20765u uVar) {
        this.f49180g = uVar;
        this.f49177d = (SmartImageView) uVar.f49049D;
        this.f49174a = uVar.f49051F;
        if (uVar.f49059N == null || uVar.f49059N.mo34125a()) {
            this.f49178e = uVar.f49061a;
        } else {
            this.f49178e = Uri.parse(uVar.f49059N.f48941a.get(0));
        }
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
    public final void onFailure(String str, Throwable th) {
        AbstractC20734k kVar = this.f49174a;
        if (kVar != null) {
            kVar.mo34159a(this.f49178e, this.f49177d, th);
        }
        this.f49175b = false;
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
    public final void onSubmit(String str, Object obj) {
        AbstractC20734k kVar = this.f49174a;
        if (kVar != null) {
            kVar.mo34147a(this.f49178e, this.f49177d);
        }
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
    public final void onIntermediateImageFailed(String str, Throwable th) {
        super.onIntermediateImageFailed(str, th);
        AbstractC20734k kVar = this.f49174a;
        if (kVar != null) {
            kVar.mo34149a(this.f49178e, th);
        }
        this.f49175b = false;
        this.f49176c = false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
    @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
    public final /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
        AbstractC24457f fVar2 = fVar;
        super.onIntermediateImageSet(str, fVar2);
        AbstractC20734k kVar = this.f49174a;
        if (kVar != null) {
            if (fVar2 != null) {
                this.f49174a.mo34148a(this.f49178e, new C20758o(fVar2.getWidth(), fVar2.getHeight()));
            } else {
                kVar.mo34148a(this.f49178e, (C20758o) null);
            }
        }
        this.f49175b = false;
        this.f49176c = false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
    @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
    public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
        AbstractC24457f fVar2 = fVar;
        boolean z = fVar2 instanceof C24452a;
        if (z) {
            this.f49179f = (C24452a) fVar2;
        }
        boolean z2 = true;
        this.f49176c = true;
        if (animatable == null) {
            z2 = false;
        }
        this.f49175b = z2;
        AbstractC20734k kVar = this.f49174a;
        if (kVar != null) {
            if (fVar2 != null) {
                this.f49174a.mo34158a(this.f49178e, this.f49177d, new C20758o(fVar2.getWidth(), fVar2.getHeight()), animatable);
            } else {
                kVar.mo34158a(this.f49178e, this.f49177d, null, animatable);
            }
        }
        if (this.f49179f != null && this.f49180g.f49054I && !TextUtils.isEmpty(this.f49177d.getAnimPreviewFrameCacheKey()) && C20778a.C20782a.f49171a.mo34211a(this.f49177d.getAnimPreviewFrameCacheKey()) == null && z) {
            C20778a.C20782a.f49171a.mo34213a(this.f49177d.getAnimPreviewFrameCacheKey(), this.f49179f);
        }
        if (this.f49175b && this.f49180g.f49063c) {
            this.f49177d.mo34197b();
        }
    }
}

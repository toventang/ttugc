package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3185c;

import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3082b.C53637c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a.C55127a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a.C55135f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a.C55136g;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56226b;
import java.util.UUID;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b */
public final class C55201b implements AbstractC24203d<AbstractC24457f> {

    /* renamed from: a */
    public final String f126267a;

    /* renamed from: b */
    private final String f126268b;

    static {
        Covode.recordClassIndex(64946);
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public final void onFailure(String str, Throwable th) {
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public final void onIntermediateImageFailed(String str, Throwable th) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public final void onRelease(String str) {
    }

    public C55201b(String str) {
        this.f126267a = str;
        this.f126268b = C89219l.m154704a(str, (Object) UUID.randomUUID());
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public final void onSubmit(String str, Object obj) {
        String str2 = this.f126267a;
        if (str2 != null && !C89361p.m154870a((CharSequence) str2)) {
            C55127a.f126154a.mo92038a((AbstractC56226b) new C55136g(this.f126268b), true);
        }
    }

    /* renamed from: a */
    public final void mo92197a(AbstractC24457f fVar, Animatable animatable) {
        int i;
        if (C53637c.m98894a().f123058c) {
            String str = this.f126267a;
            boolean z = true;
            int i2 = 0;
            if (str != null && !C89361p.m154870a((CharSequence) str)) {
                C55127a aVar = C55127a.f126154a;
                C55136g gVar = new C55136g(this.f126268b);
                if (animatable == null) {
                    z = false;
                }
                if (fVar != null) {
                    i = fVar.getWidth();
                    i2 = fVar.getHeight();
                } else {
                    i = 0;
                }
                aVar.mo92037a(gVar, new C55135f(z, i, i2));
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
        mo92197a(fVar, animatable);
    }
}

package com.p2082ss.android.ugc.aweme.profile.p3565a;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService;

/* renamed from: com.ss.android.ugc.aweme.profile.a.j */
final /* synthetic */ class C63362j implements IAVInfoService.IGetInfoCallback {

    /* renamed from: a */
    private final C63356e f143863a;

    static {
        Covode.recordClassIndex(74653);
    }

    C63362j(C63356e eVar) {
        this.f143863a = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
    public final void finish(Object obj) {
        C63356e eVar = this.f143863a;
        Bitmap bitmap = (Bitmap) obj;
        if (eVar.f143853b != null && bitmap != null) {
            eVar.f143853b.setImageBitmap(bitmap);
        }
    }
}

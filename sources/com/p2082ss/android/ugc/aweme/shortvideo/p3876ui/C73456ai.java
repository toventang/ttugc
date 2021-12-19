package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ai */
final /* synthetic */ class C73456ai implements AbstractC1729g {

    /* renamed from: a */
    private final C73454ag f165007a;

    static {
        Covode.recordClassIndex(86193);
    }

    C73456ai(C73454ag agVar) {
        this.f165007a = agVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C73454ag agVar = this.f165007a;
        if (iVar.mo5545d() == null || ((Bitmap) iVar.mo5545d()).isRecycled() || agVar.f165002f == null) {
            return null;
        }
        agVar.f165002f.setImageBitmap((Bitmap) iVar.mo5545d());
        return null;
    }
}

package com.p2082ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.AbstractC24120c;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1878c.C24359g;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.facebook.imagepipeline.p1885j.C24458g;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.AbstractC70086a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89378p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.c */
final /* synthetic */ class C74278c implements AbstractC88433f {

    /* renamed from: a */
    private final C74266a f167026a;

    /* renamed from: b */
    private final AbstractC70086a f167027b;

    static {
        Covode.recordClassIndex(87050);
    }

    C74278c(C74266a aVar, AbstractC70086a aVar2) {
        this.f167026a = aVar;
        this.f167027b = aVar2;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        AbstractC24120c cVar;
        C74266a aVar = this.f167026a;
        AbstractC70086a aVar2 = this.f167027b;
        Bitmap bitmap = (Bitmap) ((C89378p) obj).getSecond();
        if (bitmap != null && !bitmap.isRecycled()) {
            if (aVar.f167008b) {
                cVar = C24359g.m46366a();
            } else {
                cVar = (C74281f) C74281f.f167029a.getValue();
            }
            aVar2.mo110587a(C24117a.m45706a(new C24455d(bitmap, cVar, C24458g.f58105a)));
        }
    }
}

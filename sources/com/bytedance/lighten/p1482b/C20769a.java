package com.bytedance.lighten.p1482b;

import android.graphics.Bitmap;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.common.C24361b;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1882g.AbstractC24442c;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.AbstractC24459h;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1885j.C24458g;
import com.facebook.imagepipeline.p1893r.AbstractC24655a;

/* renamed from: com.bytedance.lighten.b.a */
public final class C20769a implements AbstractC24442c {
    static {
        Covode.recordClassIndex(24342);
    }

    @Override // com.facebook.imagepipeline.p1882g.AbstractC24442c
    /* renamed from: a */
    public final AbstractC24454c mo34187a(C24456e eVar, int i, AbstractC24459h hVar, C24361b bVar) {
        C24117a<Bitmap> decodeFromEncodedImageWithColorSpace = C24428k.m46551a().mo40249g().decodeFromEncodedImageWithColorSpace(eVar, bVar.f57774i, null, bVar.f57773h);
        try {
            AbstractC24655a aVar = bVar.f57776k;
            if (aVar != null) {
                Bitmap a = decodeFromEncodedImageWithColorSpace.mo39695a();
                int i2 = Build.VERSION.SDK_INT;
                if (aVar.mo40488a()) {
                    a.setHasAlpha(true);
                }
            }
            return new C24455d(decodeFromEncodedImageWithColorSpace, C24458g.f58105a, eVar.mo40305d(), eVar.mo40306e());
        } finally {
            decodeFromEncodedImageWithColorSpace.close();
        }
    }
}

package dmt.p4542av.video;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20761r;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.common.C24364e;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p1879d.C24370c;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.h */
public final class C88273h {
    static {
        Covode.recordClassIndex(104308);
    }

    /* renamed from: a */
    public static final boolean m153392a(SingleImageCoverBitmapData singleImageCoverBitmapData) {
        if (singleImageCoverBitmapData == null || singleImageCoverBitmapData.getPreviewBitmapUri() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final Bitmap m153393b(SingleImageCoverBitmapData singleImageCoverBitmapData) {
        AbstractC24454c cVar;
        if (singleImageCoverBitmapData == null) {
            return null;
        }
        if (singleImageCoverBitmapData.getPreviewBitmapUri() != null) {
            return C20761r.m39063b().mo34141a(singleImageCoverBitmapData.getPreviewBitmapUri());
        }
        if (singleImageCoverBitmapData.getItemCoverWidth() <= 0) {
            return null;
        }
        C24428k a = C24428k.m46551a();
        C89219l.m154716b(a, "");
        C24117a<AbstractC24454c> a2 = a.mo40245c().mo40201a(new C24370c(C84896h.m145871d(singleImageCoverBitmapData.getSourcePath()).toString(), new C24363d(singleImageCoverBitmapData.getItemCoverWidth(), singleImageCoverBitmapData.getItemCoverWidth()), C24364e.f57783b, new ImageDecodeOptionsBuilder().setBitmapConfig(Bitmap.Config.RGB_565).mo40154a(), null, null, null));
        if (a2 != null) {
            cVar = a2.mo39695a();
        } else {
            cVar = null;
        }
        if (!(cVar instanceof C24455d)) {
            cVar = null;
        }
        C24455d dVar = (C24455d) cVar;
        if (dVar != null) {
            return dVar.f58089a;
        }
        return null;
    }
}

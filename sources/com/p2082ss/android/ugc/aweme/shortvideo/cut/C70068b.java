package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.InputStream;
import java.io.OutputStream;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.b */
public final class C70068b implements AbstractC70069c<Bitmap> {
    static {
        Covode.recordClassIndex(82488);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70069c
    /* renamed from: a */
    public final C70581y<Bitmap> mo110523a(InputStream inputStream) {
        MethodCollector.m26663i(12564);
        C89219l.m154721d(inputStream, "");
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
        C89219l.m154716b(decodeStream, "");
        C70581y<Bitmap> yVar = new C70581y<>(decodeStream.getWidth(), decodeStream.getHeight(), decodeStream);
        MethodCollector.m26664o(12564);
        return yVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70069c
    /* renamed from: a */
    public final void mo110524a(OutputStream outputStream, C70581y<Bitmap> yVar) {
        MethodCollector.m26663i(12668);
        C89219l.m154721d(outputStream, "");
        C89219l.m154721d(yVar, "");
        yVar.f157923c.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
        MethodCollector.m26664o(12668);
    }
}

package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3082b;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1830b.C24065a;
import com.facebook.imagepipeline.common.C24361b;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3082b.C53643f;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.b.g */
public final class RunnableC53645g implements Comparable<RunnableC53645g>, Runnable {

    /* renamed from: a */
    public final C53643f f123081a;

    /* renamed from: b */
    public final AbstractC53642e f123082b;

    static {
        Covode.recordClassIndex(63225);
    }

    public final void run() {
        C53643f fVar = this.f123081a;
        AbstractC53642e eVar = this.f123082b;
        for (T t : fVar.f123075b) {
            List<String> urlList = t.f123083a.getUrlList();
            C89219l.m154716b(urlList, "");
            String str = (String) C89070n.m154583g((List) urlList);
            if (str != null && str.length() != 0) {
                List<String> urlList2 = t.f123083a.getUrlList();
                C89219l.m154716b(urlList2, "");
                Uri parse = Uri.parse((String) C89070n.m154583g((List) urlList2));
                if (!C34577e.m70603a(parse)) {
                    ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                    if (fVar.f123076c) {
                        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
                        imageDecodeOptionsBuilder.mo40153a(1);
                        imageDecodeOptionsBuilder.f57756e = false;
                    } else {
                        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
                    }
                    C24639c a = C24639c.m47149a(parse);
                    a.f58555f = new C24361b(imageDecodeOptionsBuilder);
                    C24428k a2 = C24428k.m46551a();
                    C89219l.m154716b(a2, "");
                    a2.mo40247e().mo40232c(a.mo40483a(), null).mo39739a(new C53643f.C53644a(t, fVar, eVar), C24065a.f56998a);
                } else if (eVar != null) {
                    eVar.mo90204a(t);
                    return;
                } else {
                    return;
                }
            } else if (eVar != null) {
                eVar.mo90204a(t);
                return;
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(RunnableC53645g gVar) {
        RunnableC53645g gVar2 = gVar;
        C89219l.m154721d(gVar2, "");
        return this.f123081a.f123077d - gVar2.f123081a.f123077d;
    }

    public RunnableC53645g(C53643f fVar, AbstractC53642e eVar) {
        C89219l.m154721d(fVar, "");
        this.f123081a = fVar;
        this.f123082b = eVar;
    }
}

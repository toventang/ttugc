package com.p2082ss.android.ugc.aweme.filter.p2981a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41086b;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.AbstractC41088b;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.C41091e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.a.b */
public final class C50643b extends AbstractC41088b<Effect, C89391z> {
    static {
        Covode.recordClassIndex(59805);
    }

    @Override // com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.AbstractC41088b
    /* renamed from: b */
    public final void mo70305b(AbstractC41086b<Effect, C89391z> bVar) {
        List<String> urlList;
        C89219l.m154721d(bVar, "");
        File file = new File(this.f96050h.getZipPath());
        UrlModel fileUrl = this.f96050h.getFileUrl();
        if (fileUrl == null || (urlList = fileUrl.getUrlList()) == null || urlList.isEmpty()) {
            this.f96048f = new C41091e(-1, "", null);
            bVar.mo70294c(this);
            return;
        }
        Downloader.with(C63247i.f143610a).url(fileUrl.getUrlList().get(0)).savePath(file.getParent()).name(file.getName()).subThreadListener(new C50640a(this, bVar)).download();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50643b(String str, Effect effect) {
        super(str, effect);
        C89219l.m154721d(str, "");
        C89219l.m154721d(effect, "");
    }
}

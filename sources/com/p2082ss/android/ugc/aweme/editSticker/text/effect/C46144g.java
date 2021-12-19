package com.p2082ss.android.ugc.aweme.editSticker.text.effect;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41086b;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.AbstractC41088b;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.C41091e;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.aweme.editSticker.p2878b.C45850a;
import com.p2082ss.android.ugc.aweme.editSticker.p2878b.C45851b;
import com.p2082ss.android.ugc.effectmanager.common.model.UrlModel;
import java.io.File;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.g */
public final class C46144g<T extends C45850a> extends AbstractC41088b<T, Void> {

    /* renamed from: i */
    public static final C46145a f107424i = new C46145a((byte) 0);

    /* renamed from: j */
    private final AbstractC89183m<T, AbstractC89124d<? super C89391z>, Object> f107425j;

    static {
        Covode.recordClassIndex(54703);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.g$a */
    public static final class C46145a {
        static {
            Covode.recordClassIndex(54704);
        }

        private C46145a() {
        }

        public /* synthetic */ C46145a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.AbstractC41088b
    /* renamed from: a */
    public final boolean mo70304a() {
        return C45851b.m88478a(this.f96050h.f106810b);
    }

    @Override // com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.AbstractC41088b
    /* renamed from: b */
    public final void mo70305b(AbstractC41086b<T, Void> bVar) {
        List<String> urlList;
        C89219l.m154721d(bVar, "");
        File file = new File(this.f96050h.f106810b.getZipPath());
        UrlModel fileUrl = this.f96050h.f106810b.getFileUrl();
        if (fileUrl == null || (urlList = fileUrl.getUrlList()) == null || urlList.isEmpty()) {
            this.f96048f = new C41091e(-1, "EffectTextDownloadTask , effectId : " + this.f96050h.f106810b.getEffectId() + " , urlList is null or empty", null);
            bVar.mo70294c(this);
            return;
        }
        Downloader.with(C45866d.m88488a()).url(fileUrl.getUrlList().get(0)).savePath(file.getParent()).name(file.getName()).mainThreadListener(new C46137e(this, this.f107425j, bVar)).download();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.m<? super T extends com.ss.android.ugc.aweme.editSticker.b.a, ? super h.c.d<? super h.z>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46144g(String str, T t, AbstractC89183m<? super T, ? super AbstractC89124d<? super C89391z>, ? extends Object> mVar) {
        super(str, t);
        C89219l.m154721d(str, "");
        C89219l.m154721d(t, "");
        this.f107425j = mVar;
    }
}

package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3844b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.b */
public final class C72164b implements AbstractC72165c {
    static {
        Covode.recordClassIndex(84829);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3844b.AbstractC72165c
    /* renamed from: a */
    public final void mo114411a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3844b.AbstractC72165c
    /* renamed from: a */
    public final void mo114412a(long j, long j2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3844b.AbstractC72165c
    /* renamed from: a */
    public final void mo114418a(ShortVideoContext shortVideoContext, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3844b.AbstractC72165c
    /* renamed from: b */
    public final void mo114419b(ShortVideoContext shortVideoContext, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3844b.AbstractC72165c
    /* renamed from: a */
    public final void mo114413a(ShortVideoContext shortVideoContext, MediaState mediaState) {
        C89219l.m154721d(mediaState, "");
        C89219l.m154721d(mediaState, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3844b.AbstractC72165c
    /* renamed from: a */
    public final void mo114414a(ShortVideoContext shortVideoContext, MvImageChooseAdapter.MyMediaModel myMediaModel) {
        C89219l.m154721d(myMediaModel, "");
        C89219l.m154721d(myMediaModel, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3844b.AbstractC72165c
    /* renamed from: a */
    public final void mo114416a(ShortVideoContext shortVideoContext, String str) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3844b.AbstractC72165c
    /* renamed from: a */
    public final void mo114415a(ShortVideoContext shortVideoContext, MvImageChooseAdapter.EnumC72047b bVar, String str) {
        C39162r.m79460a("choose_upload_content", new C84425b().mo129406a("content_type", UGCMonitor.TYPE_PHOTO).mo129406a("upload_type", "multiple_content").f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3844b.AbstractC72165c
    /* renamed from: a */
    public final void mo114417a(ShortVideoContext shortVideoContext, List<? extends MvImageChooseAdapter.MyMediaModel> list, MvImageChooseAdapter.EnumC72047b bVar, String str) {
        C39162r.m79460a("choose_upload_content", new C84425b().mo129406a("content_type", "video").mo129406a("upload_type", "multiple_content").f188764a);
    }
}

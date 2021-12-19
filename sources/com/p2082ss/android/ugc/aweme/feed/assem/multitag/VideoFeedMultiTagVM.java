package com.p2082ss.android.ugc.aweme.feed.assem.multitag;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.multitag.VideoFeedMultiTagVM */
public final class VideoFeedMultiTagVM extends FeedBaseViewModel<C48767e> {
    static {
        Covode.recordClassIndex(57531);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C48767e();
    }

    /* renamed from: h */
    public final Aweme mo23343h() {
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (videoItemParams != null) {
            return videoItemParams.mAweme;
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.multitag.VideoFeedMultiTagVM$a */
    static final class C48749a extends AbstractC89220m implements AbstractC89172b<C48767e, C48767e> {

        /* renamed from: a */
        final /* synthetic */ int f112614a;

        static {
            Covode.recordClassIndex(57532);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48749a(int i) {
            super(1);
            this.f112614a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48767e invoke(C48767e eVar) {
            C48767e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            return C48767e.m92059a(eVar2, null, this.f112614a, 1);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.AbstractC14529j
    /* renamed from: b */
    public final /* synthetic */ VideoItemParams mo23373b(AbstractC12853j jVar, VideoItemParams videoItemParams) {
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(videoItemParams, "");
        return videoItemParams;
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /* renamed from: a */
    public final /* synthetic */ C48767e mo80488a(C48767e eVar, VideoItemParams videoItemParams) {
        String str;
        C48767e eVar2 = eVar;
        C89219l.m154721d(eVar2, "");
        C89219l.m154721d(videoItemParams, "");
        Aweme aweme = videoItemParams.mAweme;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        return C48767e.m92059a(eVar2, str, 0, 2);
    }
}

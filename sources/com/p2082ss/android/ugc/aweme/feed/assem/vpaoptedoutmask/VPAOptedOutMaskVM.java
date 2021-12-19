package com.p2082ss.android.ugc.aweme.feed.assem.vpaoptedoutmask;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.VPAOptedOutMaskVM */
public final class VPAOptedOutMaskVM extends FeedBaseViewModel<C49267e> {
    static {
        Covode.recordClassIndex(58042);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C49267e();
    }

    /* renamed from: h */
    public final int mo23343h() {
        String str;
        VideoItemParams videoItemParams;
        VideoItemParams videoItemParams2;
        VideoItemParams videoItemParams3 = (VideoItemParams) mo23342g();
        Aweme aweme = null;
        if (videoItemParams3 != null) {
            str = videoItemParams3.mEventType;
        } else {
            str = null;
        }
        if (!C89219l.m154714a((Object) "homepage_hot", (Object) str) || (videoItemParams = (VideoItemParams) mo23342g()) == null || videoItemParams.mPageType != 0 || (videoItemParams2 = (VideoItemParams) mo23342g()) == null || videoItemParams2.mAwemeFromPage != 1) {
            return 8;
        }
        VideoItemParams videoItemParams4 = (VideoItemParams) mo23342g();
        if (videoItemParams4 != null) {
            aweme = videoItemParams4.mAweme;
        }
        if (!C50539g.m94744a(aweme) || C39223a.m79591e().mo68728c() != 3) {
            return 8;
        }
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.VPAOptedOutMaskVM$b */
    static final class C49247b extends AbstractC89220m implements AbstractC89172b<C49267e, C49267e> {

        /* renamed from: a */
        final /* synthetic */ VPAOptedOutMaskVM f113237a;

        static {
            Covode.recordClassIndex(58044);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49247b(VPAOptedOutMaskVM vPAOptedOutMaskVM) {
            super(1);
            this.f113237a = vPAOptedOutMaskVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C49267e invoke(C49267e eVar) {
            C49267e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            VPAOptedOutMaskVM vPAOptedOutMaskVM = this.f113237a;
            Object g = vPAOptedOutMaskVM.mo23342g();
            if (g == null) {
                C89219l.m154715b();
            }
            return vPAOptedOutMaskVM.mo80488a(eVar2, (VideoItemParams) g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.VPAOptedOutMaskVM$a */
    static final class C49246a extends AbstractC89220m implements AbstractC89172b<C49267e, C89391z> {

        /* renamed from: a */
        public static final C49246a f113236a = new C49246a();

        static {
            Covode.recordClassIndex(58043);
        }

        C49246a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C49267e eVar) {
            C49267e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            if (eVar2.f113253a == 0) {
                AbstractC80747i O = C81079v.m140776O();
                C89219l.m154716b(O, "");
                if (O.mo123892o()) {
                    C81079v.m140776O().mo123908B();
                }
            }
            return C89391z.f203057a;
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

    /* renamed from: a */
    public final C49267e mo80488a(C49267e eVar, VideoItemParams videoItemParams) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(videoItemParams, "");
        return new C49267e(mo23343h());
    }
}

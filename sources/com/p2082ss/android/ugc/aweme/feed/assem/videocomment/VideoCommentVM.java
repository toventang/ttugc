package com.p2082ss.android.ugc.aweme.feed.assem.videocomment;

import android.graphics.drawable.Drawable;
import androidx.core.content.C0643b;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38255s;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50108be;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.login.p3424b.C58956a;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.p2335aq.p2336a.C33918a;
import com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.p2082ss.android.ugc.aweme.setting.services.VideoGiftService;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM */
public final class VideoCommentVM extends FeedBaseViewModel<C49216n> {
    static {
        Covode.recordClassIndex(57966);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C49216n();
    }

    /* renamed from: h */
    public static Drawable m92264h() {
        C33918a.m69450a();
        return C0643b.m2369a(C17879g.m33104a(), 2131233147);
    }

    /* renamed from: c */
    public final void mo80851c(Aweme aweme) {
        mo20662a(new C49177d(this, aweme));
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM$c */
    static final class C49176c extends AbstractC89220m implements AbstractC89172b<C49216n, C49216n> {

        /* renamed from: a */
        final /* synthetic */ VideoCommentVM f113158a;

        static {
            Covode.recordClassIndex(57971);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49176c(VideoCommentVM videoCommentVM) {
            super(1);
            this.f113158a = videoCommentVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C49216n invoke(C49216n nVar) {
            C49216n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            return C49216n.m92282a(nVar2, VideoCommentVM.m92264h(), 0, false, null, 0, 0, 62);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM$d */
    static final class C49177d extends AbstractC89220m implements AbstractC89172b<C49216n, C49216n> {

        /* renamed from: a */
        final /* synthetic */ VideoCommentVM f113159a;

        /* renamed from: b */
        final /* synthetic */ Aweme f113160b;

        static {
            Covode.recordClassIndex(57972);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49177d(VideoCommentVM videoCommentVM, Aweme aweme) {
            super(1);
            this.f113159a = videoCommentVM;
            this.f113160b = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C49216n invoke(C49216n nVar) {
            C49216n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            return C49216n.m92282a(nVar2, null, 0, false, VideoCommentVM.m92262a(this.f113160b), VideoCommentVM.m92263b(this.f113160b), 0, 39);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM$b */
    static final class C49174b extends AbstractC89220m implements AbstractC89172b<C49216n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCommentVM f113156a;

        static {
            Covode.recordClassIndex(57969);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49174b(VideoCommentVM videoCommentVM) {
            super(1);
            this.f113156a = videoCommentVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C49216n nVar) {
            Aweme aweme;
            C49216n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            IVideoGiftService l = VideoGiftService.m120814l();
            VideoItemParams videoItemParams = (VideoItemParams) this.f113156a.mo23342g();
            if (videoItemParams != null) {
                aweme = videoItemParams.mAweme;
            } else {
                aweme = null;
            }
            if (l.mo108903a(aweme) && nVar2.f113200b == 8) {
                this.f113156a.mo20662a(C491751.f113157a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public static int m92263b(Aweme aweme) {
        if (aweme == null) {
            C89219l.m154715b();
        }
        if (!aweme.isAd() && C37699a.m76217T(aweme)) {
            return 0;
        }
        if (aweme.isCmtSwt() || C37699a.m76218U(aweme)) {
            return 4;
        }
        return 0;
    }

    /* renamed from: a */
    public static String m92262a(Aweme aweme) {
        long j;
        Long l;
        C38255s adCommentStruct;
        long j2 = 0;
        if (aweme != null && !CommentServiceImpl.m73664e().mo63307c(aweme) && !C58956a.m108315a(aweme)) {
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                j = statistics.getCommentCount();
            } else {
                j = 0;
            }
            C38255s a = CommentServiceImpl.m73664e().mo63280a(aweme);
            AwemeStatistics statistics2 = aweme.getStatistics();
            if (statistics2 != null) {
                l = Long.valueOf(statistics2.getCommentCount());
            } else {
                l = null;
            }
            if (l != null) {
                j2 = (a != null || (aweme.getAdCommentStruct() != null && (j > 0 || ((adCommentStruct = aweme.getAdCommentStruct()) != null && adCommentStruct.showAsDefault())))) ? 1 + j : j;
            }
        }
        try {
            String a2 = C53437b.m98615a(j2);
            C89219l.m154716b(a2, "");
            return a2;
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return "0";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM$a */
    static final class C49172a extends AbstractC89220m implements AbstractC89172b<C49216n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCommentVM f113154a;

        static {
            Covode.recordClassIndex(57967);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49172a(VideoCommentVM videoCommentVM) {
            super(1);
            this.f113154a = videoCommentVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C49216n nVar) {
            Aweme aweme;
            VideoItemParams videoItemParams;
            Aweme aweme2;
            C89219l.m154721d(nVar, "");
            IVideoGiftService l = VideoGiftService.m120814l();
            VideoItemParams videoItemParams2 = (VideoItemParams) this.f113154a.mo23342g();
            String str = null;
            if (videoItemParams2 != null) {
                aweme = videoItemParams2.mAweme;
            } else {
                aweme = null;
            }
            if (!(!l.mo108903a(aweme) || (videoItemParams = (VideoItemParams) this.f113154a.mo23342g()) == null || (aweme2 = videoItemParams.mAweme) == null)) {
                String aid = aweme2.getAid();
                C89219l.m154716b(aid, "");
                if (C50108be.m94062b(aid)) {
                    C33744d dVar = new C33744d();
                    VideoItemParams videoItemParams3 = (VideoItemParams) this.f113154a.mo23342g();
                    if (videoItemParams3 != null) {
                        str = videoItemParams3.mEventType;
                    }
                    C33744d a = dVar.mo59983a("enter_from", str).mo59983a("group_id", C59208ac.m108771e(aweme2)).mo59983a("author_id", C59208ac.m108758a(aweme2));
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    C33744d a2 = a.mo59983a("user_id", g.getCurUserId());
                    int i = 1;
                    if (aweme2.getFollowStatus() != 1) {
                        i = 0;
                    }
                    C39162r.m79460a("show_gift_icon", a2.mo59980a("is_follow", i).mo59980a("is_like", aweme2.isLike() ? 1 : 0).f79943a);
                    this.f113154a.mo20662a(C491731.f113155a);
                } else {
                    String aid2 = aweme2.getAid();
                    C89219l.m154716b(aid2, "");
                    C50108be.m94061a(aid2);
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

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /* renamed from: a */
    public final /* synthetic */ C49216n mo80488a(C49216n nVar, VideoItemParams videoItemParams) {
        int i;
        Aweme aweme;
        int i2;
        C89219l.m154721d(nVar, "");
        C89219l.m154721d(videoItemParams, "");
        Drawable h = m92264h();
        Aweme aweme2 = videoItemParams.mAweme;
        if (!(aweme2 == null || aweme2.getAid() == null)) {
            String aid = aweme2.getAid();
            C89219l.m154716b(aid, "");
            if (C50108be.m94063c(aid)) {
                i = 0;
                String a = m92262a(videoItemParams.mAweme);
                int b = m92263b(videoItemParams.mAweme);
                aweme = videoItemParams.mAweme;
                if (aweme != null || aweme.isDelete()) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                return C49216n.m92281a(h, i, false, a, b, i2);
            }
        }
        i = 8;
        String a2 = m92262a(videoItemParams.mAweme);
        int b2 = m92263b(videoItemParams.mAweme);
        aweme = videoItemParams.mAweme;
        if (aweme != null) {
        }
        i2 = 8;
        return C49216n.m92281a(h, i, false, a2, b2, i2);
    }
}

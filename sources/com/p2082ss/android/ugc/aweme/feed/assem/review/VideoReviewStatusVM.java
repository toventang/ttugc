package com.p2082ss.android.ugc.aweme.feed.assem.review;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.review.VideoReviewStatusVM */
public final class VideoReviewStatusVM extends FeedBaseViewModel<C48988a> {

    /* renamed from: k */
    public static final List<Integer> f112887k = C89070n.m154524c(1, 2);

    /* renamed from: l */
    public static final C48984a f112888l = new C48984a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.review.VideoReviewStatusVM$a */
    public static final class C48984a {
        static {
            Covode.recordClassIndex(57774);
        }

        private C48984a() {
        }

        public /* synthetic */ C48984a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C48988a();
    }

    static {
        Covode.recordClassIndex(57773);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.review.VideoReviewStatusVM$c */
    static final class C48986c extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoReviewStatusVM f112890a;

        static {
            Covode.recordClassIndex(57776);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48986c(VideoReviewStatusVM videoReviewStatusVM) {
            super(1);
            this.f112890a = videoReviewStatusVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2;
            Aweme aweme;
            String aid;
            String str3 = str;
            String str4 = "";
            C89219l.m154721d(str3, str4);
            if (str3.length() == 0) {
                str2 = "2";
            } else {
                str2 = "1";
            }
            VideoReviewStatusVM videoReviewStatusVM = this.f112890a;
            C33744d dVar = new C33744d();
            VideoItemParams videoItemParams = (VideoItemParams) videoReviewStatusVM.mo23342g();
            if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null || (aid = aweme.getAid()) == null)) {
                str4 = aid;
            }
            C39162r.m79460a("video_play_page_mute_tag_show", dVar.mo59983a("object_id", str4).mo59983a("tag_type", str2).f79943a);
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

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.review.VideoReviewStatusVM$b */
    static final class C48985b extends AbstractC89220m implements AbstractC89183m<View, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoReviewStatusVM f112889a;

        static {
            Covode.recordClassIndex(57775);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48985b(VideoReviewStatusVM videoReviewStatusVM) {
            super(2);
            this.f112889a = videoReviewStatusVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(View view, String str) {
            View view2 = view;
            String str2 = str;
            C89219l.m154721d(view2, "");
            C89219l.m154721d(str2, "");
            VideoReviewStatusVM videoReviewStatusVM = this.f112889a;
            C89219l.m154721d(view2, "");
            C89219l.m154721d(str2, "");
            VideoItemParams videoItemParams = (VideoItemParams) videoReviewStatusVM.mo23342g();
            if (videoItemParams != null) {
                C33744d a = new C33744d().mo59983a("enter_from", "personal_homepage");
                Aweme aweme = videoItemParams.mAweme;
                C89219l.m154716b(aweme, "");
                C39162r.m79460a("enter_appeal", a.mo59983a("group_id", aweme.getFromGroupId()).f79943a);
                if (!TextUtils.isEmpty(str2)) {
                    SmartRouter.buildRoute(view2.getContext(), "aweme://webview/").withParam(Uri.parse(str2)).open();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.review.VideoReviewStatusVM$d */
    static final class C48987d extends AbstractC89220m implements AbstractC89183m<View, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoReviewStatusVM f112891a;

        static {
            Covode.recordClassIndex(57777);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48987d(VideoReviewStatusVM videoReviewStatusVM) {
            super(2);
            this.f112891a = videoReviewStatusVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(View view, String str) {
            Aweme aweme;
            String str2;
            View view2 = view;
            String str3 = str;
            String str4 = "";
            C89219l.m154721d(view2, str4);
            C89219l.m154721d(str3, str4);
            VideoReviewStatusVM videoReviewStatusVM = this.f112891a;
            C89219l.m154721d(view2, str4);
            C89219l.m154721d(str3, str4);
            VideoItemParams videoItemParams = (VideoItemParams) videoReviewStatusVM.mo23342g();
            if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null || str3.length() <= 0)) {
                SmartRouter.buildRoute(view2.getContext(), "//webview").withParam(Uri.parse(str3)).open();
                C33744d a = new C33744d().mo59983a("enter_from", "personal_homepage").mo59983a("group_id", aweme.getAid());
                Music music = aweme.getMusic();
                Object obj = str4;
                if (music != null) {
                    obj = Long.valueOf(music.getId());
                }
                C33744d a2 = a.mo59982a("music_id", obj);
                Video video = aweme.getVideo();
                if (video == null || !video.isLongVideo()) {
                    str2 = "0";
                } else {
                    str2 = "1";
                }
                C39162r.m79460a("click_music_mute_detail", a2.mo59983a("is_long_video", str2).f79943a);
            }
            return C89391z.f203057a;
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /* renamed from: a */
    public final /* synthetic */ C48988a mo80488a(C48988a aVar, VideoItemParams videoItemParams) {
        String str;
        AwemeStatus status;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        String muteDetailUrl;
        AwemeStatus status2;
        AwemeStatus.VideoMuteInfo videoMuteInfo2;
        String str2;
        String reviewDetailUrl;
        C48988a aVar2 = aVar;
        String str3 = "";
        C89219l.m154721d(aVar2, str3);
        C89219l.m154721d(videoItemParams, str3);
        Aweme aweme = videoItemParams.mAweme;
        C89219l.m154716b(aweme, str3);
        if (aweme.isProhibitedAndShouldTell()) {
            Aweme aweme2 = videoItemParams.mAweme;
            C89219l.m154716b(aweme2, str3);
            String videoDetailNoticeBottom = aweme2.getVideoDetailNoticeBottom();
            if (TextUtils.isEmpty(videoDetailNoticeBottom)) {
                VideoItemParams videoItemParams2 = (VideoItemParams) mo23342g();
                if (videoItemParams2 != null) {
                    C33743c a = new C33743c().mo59976a(StringSet.type, "video_detail_notice_bottom");
                    Aweme aweme3 = videoItemParams2.mAweme;
                    C89219l.m154716b(aweme3, str3);
                    C33743c a2 = a.mo59976a("log_id", aweme3.getRequestId());
                    Aweme aweme4 = videoItemParams2.mAweme;
                    C89219l.m154716b(aweme4, str3);
                    C33830n.m69192a("notice_content_empty", str3, a2.mo59976a("item_id", aweme4.getAid()).mo59977a());
                }
                Activity j = C17873f.m33102j();
                if (j == null || (videoDetailNoticeBottom = j.getString(R.string.h71)) == null) {
                    videoDetailNoticeBottom = str3;
                }
                C89219l.m154716b(videoDetailNoticeBottom, str3);
            } else {
                C89219l.m154716b(videoDetailNoticeBottom, str3);
            }
            Aweme aweme5 = videoItemParams.mAweme;
            if (!(aweme5 == null || (reviewDetailUrl = aweme5.getReviewDetailUrl()) == null)) {
                str3 = reviewDetailUrl;
            }
            return C48988a.m92156a(aVar2, 1, R.color.c8, R.raw.icon_exclamation_mark_circle_fill, videoDetailNoticeBottom, str3, null, new C48985b(this), 32);
        } else if (!C80635y.m139806a(videoItemParams.mAweme)) {
            return aVar2;
        } else {
            Aweme aweme6 = videoItemParams.mAweme;
            C89219l.m154716b(aweme6, str3);
            AwemeStatus status3 = aweme6.getStatus();
            C89219l.m154716b(status3, str3);
            if (status3.getMusicEditStatus() == 2) {
                Activity j2 = C17873f.m33102j();
                if (j2 == null || (str2 = j2.getString(R.string.faw)) == null) {
                    str2 = str3;
                }
                C89219l.m154716b(str2, str3);
                return C48988a.m92156a(aVar2, 2, R.color.a4, 0, str2, null, null, null, 116);
            }
            Aweme aweme7 = videoItemParams.mAweme;
            if (aweme7 == null || (status2 = aweme7.getStatus()) == null || (videoMuteInfo2 = status2.getVideoMuteInfo()) == null || (str = videoMuteInfo2.getMuteDetailNotice()) == null) {
                str = str3;
            }
            Aweme aweme8 = videoItemParams.mAweme;
            if (!(aweme8 == null || (status = aweme8.getStatus()) == null || (videoMuteInfo = status.getVideoMuteInfo()) == null || (muteDetailUrl = videoMuteInfo.getMuteDetailUrl()) == null)) {
                str3 = muteDetailUrl;
            }
            return C48988a.m92155a(2, R.color.a4, R.raw.icon_speaker_x_mark_fill_ltr, str, str3, new C48986c(this), new C48987d(this));
        }
    }
}

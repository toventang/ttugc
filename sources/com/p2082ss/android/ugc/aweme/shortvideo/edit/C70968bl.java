package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.AbstractC14088a;
import com.google.p1998c.p1999a.AbstractC27242j;
import com.p2082ss.android.ugc.aweme.beauty.C34806c;
import com.p2082ss.android.ugc.aweme.common.C39161q;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.property.C65387c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70856f;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.model.FlowDataMusicInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.p3790ac.C69791b;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.performance.C74029a;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84906m;
import dmt.p4542av.video.C88168aj;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bl */
public final class C70968bl {
    static {
        Covode.recordClassIndex(83462);
    }

    /* renamed from: a */
    private static String m125248a(int i) {
        if (i == 0) {
            return "general_draft_list";
        }
        return null;
    }

    /* renamed from: a */
    public static final void m125260a(VideoPublishEditModel videoPublishEditModel, boolean z) {
        C89219l.m154721d(videoPublishEditModel, "");
        C84425b a = m125280l(videoPublishEditModel).mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129403a("is_multi_content", m125279k(videoPublishEditModel)).mo129406a("from_group_id", C70747dv.m124972a());
        if (videoPublishEditModel.draftId != 0) {
            a.mo129403a("draft_id", videoPublishEditModel.draftId);
        }
        String str = videoPublishEditModel.newDraftId;
        C89219l.m154716b(str, "");
        if (str.length() > 0) {
            a.mo129406a("new_draft_id", videoPublishEditModel.newDraftId);
        }
        if (z) {
            a.mo129406a("is_red_dot", "1");
        } else {
            a.mo129406a("is_red_dot", "0");
        }
        C39162r.m79460a("click_effect_entrance", a.f188764a);
    }

    /* renamed from: a */
    public static final void m125259a(VideoPublishEditModel videoPublishEditModel, String str, String str2, int i) {
        C89219l.m154721d(videoPublishEditModel, "");
        C84425b a = m125280l(videoPublishEditModel).mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("enter_method", str).mo129406a("enter_from", "video_edit_page").mo129406a("filter_name", str2).mo129403a("filter_id", i).mo129405a("filter_value", Float.valueOf(videoPublishEditModel.mSelectedFilterIntensity)).mo129403a("is_selected_from_entrance", !C89219l.m154714a(str, "slide") ? 1 : 0);
        if (videoPublishEditModel.draftId != 0) {
            a.mo129403a("draft_id", videoPublishEditModel.draftId);
        }
        String str3 = videoPublishEditModel.newDraftId;
        C89219l.m154716b(str3, "");
        if (str3.length() > 0) {
            a.mo129406a("new_draft_id", videoPublishEditModel.newDraftId);
        }
        C39161q.m79451a("select_filter", a.f188764a);
    }

    /* renamed from: a */
    public static final void m125256a(VideoPublishEditModel videoPublishEditModel, String str, int i, int i2, String str2, boolean z) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(str, "");
        C39162r.m79460a("select_music", m125280l(videoPublishEditModel).mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("content_source", m125262b(videoPublishEditModel)).mo129406a("content_type", m125249a(videoPublishEditModel)).mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("enter_from", "video_edit_page").mo129406a("music_id", str).mo129406a("music_selected_method", z ? "auto" : "manual").mo129403a("creation_duration", videoPublishEditModel.getPreviewInfo().getPreviewVideoLength()).mo129403a("music_show_rank", i).mo129403a("music_rec_type", i2).mo129406a("tab_name", str2).f188764a);
    }

    /* renamed from: a */
    public static final void m125257a(VideoPublishEditModel videoPublishEditModel, String str, int i, String str2, int i2) {
        C89219l.m154721d(videoPublishEditModel, "");
        C39162r.m79460a("music_show", m125280l(videoPublishEditModel).mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("content_source", m125262b(videoPublishEditModel)).mo129406a("content_type", m125249a(videoPublishEditModel)).mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("enter_from", "video_edit_page").mo129406a("music_id", str).mo129403a("music_rec_type", i).mo129406a("tab_name", str2).mo129403a("order", i2).mo129406a("shoot_entrance", C70856f.m125132a("shoot_entrance", videoPublishEditModel)).mo129406a("mix_type", m125266c(videoPublishEditModel)).f188764a);
    }

    /* renamed from: a */
    public static final void m125261a(String str, boolean z, int i, VideoPublishEditModel videoPublishEditModel, String str2) {
        String str3;
        C89219l.m154721d(str, "");
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(str2, "");
        if (z) {
            str3 = "favourite_song";
        } else {
            str3 = "cancel_favourite_song";
        }
        C39162r.m79460a(str3, m125280l(videoPublishEditModel).mo129406a("music_id", str).mo129406a("enter_from", "video_edit_page").mo129406a("mix_type", m125266c(videoPublishEditModel)).mo129403a("music_rec_type", i).mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("content_source", m125262b(videoPublishEditModel)).mo129406a("shoot_entrance", C70856f.m125132a("shoot_entrance", videoPublishEditModel)).mo129406a("content_type", m125249a(videoPublishEditModel)).mo129406a("enter_method", str2).f188764a);
    }

    /* renamed from: a */
    public static final void m125258a(VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C84425b a = new C84425b().mo129406a("creation_id", videoPublishEditModel.creationId);
        FlowDataMusicInfo flowDataMusicInfo = videoPublishEditModel.creativeFlowData.getFlowDataMusicInfo();
        C39162r.m79460a("unselect_music", a.mo129406a("music_selected_method", (flowDataMusicInfo == null || !flowDataMusicInfo.isSelectedByAuto()) ? "manual" : "auto").mo129406a("enter_from", "video_edit_page").mo129406a("content_source", m125262b(videoPublishEditModel)).mo129406a("content_type", m125249a(videoPublishEditModel)).mo129406a("tab_name", str2).mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("music_id", str).f188764a);
    }

    /* renamed from: a */
    public static final String m125249a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        return C71817eu.m126792c(videoPublishEditModel);
    }

    /* renamed from: b */
    public static final String m125262b(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        return C71817eu.m126790a(videoPublishEditModel);
    }

    /* renamed from: m */
    private static final String m125281m(VideoPublishEditModel videoPublishEditModel) {
        String shootPage;
        StoryEditEtParam storyEditEtParam = videoPublishEditModel.storyEditEtParam;
        if (storyEditEtParam == null || (shootPage = storyEditEtParam.getShootPage()) == null) {
            return "video_shoot_page";
        }
        return shootPage;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bl$a */
    public static final class C70969a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f158871a;

        static {
            Covode.recordClassIndex(83463);
        }

        C70969a(VideoPublishEditModel videoPublishEditModel) {
            this.f158871a = videoPublishEditModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            return AbstractC27242j.fromNullable(C88168aj.m153237a(this.f158871a.videoPath()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bl$c */
    static final class C70971c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f158876a;

        static {
            Covode.recordClassIndex(83465);
        }

        C70971c(VideoPublishEditModel videoPublishEditModel) {
            this.f158876a = videoPublishEditModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            return AbstractC27242j.fromNullable(C88168aj.m153237a(this.f158876a.videoPath()));
        }
    }

    /* renamed from: j */
    public static final void m125278j(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        C39162r.m79460a("text_duration_adjust", m125247a(videoPublishEditModel, false, false, 6).f188764a);
    }

    /* renamed from: n */
    private static final String m125282n(VideoPublishEditModel videoPublishEditModel) {
        String shootTabName;
        StoryEditEtParam storyEditEtParam = videoPublishEditModel.storyEditEtParam;
        if (storyEditEtParam != null && (shootTabName = storyEditEtParam.getShootTabName()) != null) {
            return shootTabName;
        }
        String e = C71817eu.m126794e(videoPublishEditModel);
        if (e == null) {
            return "";
        }
        return e;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bl$d */
    static final class C70972d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ Intent f158877a;

        /* renamed from: b */
        final /* synthetic */ int f158878b;

        /* renamed from: c */
        final /* synthetic */ VideoPublishEditModel f158879c;

        static {
            Covode.recordClassIndex(83466);
        }

        C70972d(Intent intent, int i, VideoPublishEditModel videoPublishEditModel) {
            this.f158877a = intent;
            this.f158878b = i;
            this.f158879c = videoPublishEditModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String a;
            AbstractC27242j jVar = (AbstractC27242j) obj;
            Intent intent = this.f158877a;
            String str = "click_next_button";
            if (!(intent == null || (a = m125283a(intent, "enter_edit_page_method")) == null)) {
                str = a;
            }
            C70968bl.m125250a(this.f158878b, this.f158879c, this.f158877a, (int[]) jVar.orNull(), str);
        }

        /* renamed from: a */
        private static String m125283a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: c */
    public static final String m125266c(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89378p<Integer, Integer> a = C84906m.m145912a(videoPublishEditModel);
        return C69791b.m123314a(a.component1().intValue(), a.component2().intValue());
    }

    /* renamed from: d */
    public static final C84425b m125268d(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        C84425b a = m125280l(videoPublishEditModel).mo129406a("enter_from", "video_edit_page").mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("content_source", m125262b(videoPublishEditModel)).mo129406a("content_type", m125249a(videoPublishEditModel));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: g */
    public static final void m125274g(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        C39162r.m79460a("music_loading", m125280l(videoPublishEditModel).mo129406a("enter_from", "video_edit_page").mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("content_source", m125262b(videoPublishEditModel)).mo129406a("content_type", m125249a(videoPublishEditModel)).f188764a);
    }

    /* renamed from: k */
    public static final int m125279k(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return 0;
        }
        if (videoPublishEditModel.storyEditEtParam != null) {
            StoryEditEtParam storyEditEtParam = videoPublishEditModel.storyEditEtParam;
            if (storyEditEtParam == null || !storyEditEtParam.isMultiContent()) {
                return 0;
            }
            return 1;
        } else if ((videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut) && videoPublishEditModel.videoCount + videoPublishEditModel.photoCount > 1) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: l */
    public static final C84425b m125280l(VideoPublishEditModel videoPublishEditModel) {
        int i;
        C89219l.m154721d(videoPublishEditModel, "");
        C84425b a = new C84425b().mo129406a("shoot_page", m125281m(videoPublishEditModel)).mo129406a("shoot_tab_name", m125282n(videoPublishEditModel));
        if (videoPublishEditModel.storyEditEtParam != null) {
            StoryEditEtParam storyEditEtParam = videoPublishEditModel.storyEditEtParam;
            if (storyEditEtParam != null) {
                i = storyEditEtParam.getClipCount();
            } else {
                i = 1;
            }
            a.mo129403a("clips_cnt", i);
        }
        C89219l.m154716b(a, "");
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0058, code lost:
        if (r0.mo93969f() != false) goto L_0x005a;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m125272f(com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl.m125272f(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):void");
    }

    /* renamed from: h */
    public static final void m125276h(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        C39162r.m79460a("click_music_entrance", m125280l(videoPublishEditModel).mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("content_source", m125262b(videoPublishEditModel)).mo129406a("content_type", m125249a(videoPublishEditModel)).mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("enter_from", "video_edit_page").mo129403a("is_multi_content", m125279k(videoPublishEditModel)).mo129403a("creation_duration", videoPublishEditModel.getPreviewInfo().getPreviewVideoLength()).f188764a);
    }

    /* renamed from: i */
    static final long m125277i(VideoPublishEditModel videoPublishEditModel) {
        List<EditVideoSegment> videoList;
        List<EditVideoSegment> videoList2;
        long j;
        long j2;
        long j3 = 0;
        if (videoPublishEditModel.isFastImport) {
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            if (previewInfo == null || (videoList2 = previewInfo.getVideoList()) == null) {
                return 0;
            }
            long j4 = 0;
            for (T t : videoList2) {
                VideoCutInfo videoCutInfo = t.getVideoCutInfo();
                if (videoCutInfo != null) {
                    j = videoCutInfo.getEnd();
                } else {
                    j = 0;
                }
                VideoCutInfo videoCutInfo2 = t.getVideoCutInfo();
                if (videoCutInfo2 != null) {
                    j2 = videoCutInfo2.getStart();
                } else {
                    j2 = 0;
                }
                j4 += Math.max(0L, j - j2);
            }
            return j4;
        }
        EditPreviewInfo previewInfo2 = videoPublishEditModel.getPreviewInfo();
        if (!(previewInfo2 == null || (videoList = previewInfo2.getVideoList()) == null)) {
            Iterator<T> it = videoList.iterator();
            while (it.hasNext()) {
                j3 += it.next().getVideoFileInfo().getDuration();
            }
        }
        return j3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bl$b */
    public static final class C70970b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f158872a;

        /* renamed from: b */
        final /* synthetic */ AbstractC72510a f158873b;

        /* renamed from: c */
        final /* synthetic */ float f158874c;

        /* renamed from: d */
        final /* synthetic */ String f158875d;

        static {
            Covode.recordClassIndex(83464);
        }

        C70970b(VideoPublishEditModel videoPublishEditModel, AbstractC72510a aVar, float f, String str) {
            this.f158872a = videoPublishEditModel;
            this.f158873b = aVar;
            this.f158874c = f;
            this.f158875d = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int i;
            String str;
            VideoPublishEditModel videoPublishEditModel = this.f158872a;
            AbstractC72510a aVar = this.f158873b;
            float f = this.f158874c;
            String str2 = this.f158875d;
            int[] iArr = (int[]) ((AbstractC27242j) obj).orNull();
            AbstractC14088a G = aVar.mo114782G();
            String sb = new StringBuilder().append(G.getPreviewWidth()).append('*').append(G.getPreviewHeight()).toString();
            C84425b l = C70968bl.m125280l(videoPublishEditModel);
            int i2 = 0;
            if (iArr != null) {
                i = iArr[7];
            } else {
                i = 0;
            }
            C84425b a = l.mo129403a("file_fps", i).mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129405a("play_fps", Float.valueOf(f)).mo129406a("next_action", str2).mo129403a("beautify_used", C34806c.m71113b(C34806c.f82229b)).mo129406a("beautify_info", C34806c.m71111a(C34806c.f82229b)).mo129403a("is_composer", C34806c.m71115c(C34806c.f82229b)).mo129406a("preview_resolution", sb).mo129406a("duration", String.valueOf(C70968bl.m125277i(videoPublishEditModel))).mo129406a("filter_id_list", VideoPublishEditModel.translateNullFilter(videoPublishEditModel.mCurFilterIds));
            if (C65357b.m117043a()) {
                str = "1";
            } else {
                str = "0";
            }
            C84425b a2 = a.mo129406a("is_hardcode", str).mo129403a("video_quality", C65357b.m117048d()).mo129405a("bitrate", Float.valueOf(C65357b.m117047c()));
            if (iArr != null) {
                i2 = iArr[6];
            }
            Map<String, String> map = a2.mo129403a("file_bitrate", i2).mo129406a("resolution", videoPublishEditModel.getVideoResolution()).mo129406a("content_type", C70968bl.m125249a(videoPublishEditModel)).mo129406a("content_source", C70968bl.m125262b(videoPublishEditModel)).mo129406a("prop_list", videoPublishEditModel.mStickerID).mo129403a("source_duration", videoPublishEditModel.getPreviewInfo().getPreviewVideoLength()).f188764a;
            C89219l.m154716b(map, "");
            C74029a.m130192a("tool_performance_edit_preview", map);
        }
    }

    /* renamed from: e */
    public static final void m125270e(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        C89219l.m154721d(videoPublishEditModel, "");
        C84425b b = m125280l(videoPublishEditModel).mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("filter_name", videoPublishEditModel.mRecordFilterLabels).mo129406a("filter_id", videoPublishEditModel.mRecordFilterIds).mo129406a("content_type", m125249a(videoPublishEditModel)).mo129406a("content_source", m125262b(videoPublishEditModel)).mo129409b("is_restore_crash", videoPublishEditModel.isFromCrash());
        if (videoPublishEditModel.draftId != 0) {
            b.mo129403a("draft_id", videoPublishEditModel.draftId);
        }
        String str = videoPublishEditModel.newDraftId;
        C89219l.m154716b(str, "");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "click_back_button";
        if (z) {
            b.mo129406a("new_draft_id", videoPublishEditModel.newDraftId);
            String a = m125248a(videoPublishEditModel.mDraftToEditFrom);
            if (a != null) {
                b.mo129406a("draft_way", a);
            }
            b.mo129406a("enter_method", str2);
        }
        if (C63244g.m114602a().mo73276d().mo101837f()) {
            str2 = "click_continue_popup";
        }
        b.mo129406a("enter_method", str2);
        String stickers = videoPublishEditModel.getStickers();
        if (!(stickers == null || stickers.length() == 0)) {
            b.mo129406a("prop_id", videoPublishEditModel.getStickers());
        }
        if (TextUtils.equals(videoPublishEditModel.enterFrom, "super_entrance")) {
            b.mo129403a("is_special_icon", 1);
        }
        if (videoPublishEditModel.isShoutout()) {
            b.mo129406a("shoot_entrance", videoPublishEditModel.mShootWay);
            b.mo129403a("reviewed", videoPublishEditModel.mShoutOutsData.getReviewed());
            if (!TextUtils.isEmpty(videoPublishEditModel.mShoutOutsData.getOrderId())) {
                b.mo129406a(C74418d.MOD_ORDER_ID, videoPublishEditModel.mShoutOutsData.getOrderId());
            }
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.clientId)) {
            b.mo129406a("channel", videoPublishEditModel.clientId);
        }
        b.mo129406a("is_westwindow_exist", videoPublishEditModel.isWestWindowExistStr);
        if (!TextUtils.isEmpty(videoPublishEditModel.shareId)) {
            b.mo129406a("open_platform_share_id", videoPublishEditModel.shareId);
        }
        C39162r.m79460a("enter_video_shoot_page", b.f188764a);
    }

    /* renamed from: c */
    public static final void m125267c(VideoPublishEditModel videoPublishEditModel, String str) {
        C89219l.m154721d(videoPublishEditModel, "");
        C39162r.m79460a("enter_edit_subtitle", m125268d(videoPublishEditModel).mo129406a("enter_method", str).f188764a);
    }

    /* renamed from: b */
    public static final void m125265b(VideoPublishEditModel videoPublishEditModel, boolean z) {
        C89219l.m154721d(videoPublishEditModel, "");
        C39162r.m79460a("prop_duration_adjust", m125247a(videoPublishEditModel, z, false, 4).f188764a);
    }

    /* renamed from: b */
    public static final void m125263b(VideoPublishEditModel videoPublishEditModel, String str) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(str, "");
        C39162r.m79460a("click_auto_subtitle", m125280l(videoPublishEditModel).mo129406a("enter_from", "video_edit_page").mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("enter_method", str).mo129406a("content_source", m125262b(videoPublishEditModel)).mo129406a("content_type", m125249a(videoPublishEditModel)).mo129403a("is_multi_content", m125279k(videoPublishEditModel)).f188764a);
    }

    /* renamed from: d */
    public static final void m125269d(VideoPublishEditModel videoPublishEditModel, String str) {
        C89219l.m154721d(videoPublishEditModel, "");
        C39162r.m79460a("click_music_tab", m125280l(videoPublishEditModel).mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("content_source", m125262b(videoPublishEditModel)).mo129406a("content_type", m125249a(videoPublishEditModel)).mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("enter_from", "video_edit_page").mo129406a("tab_name", str).f188764a);
    }

    /* renamed from: e */
    public static final void m125271e(VideoPublishEditModel videoPublishEditModel, String str) {
        C89219l.m154721d(videoPublishEditModel, "");
        C39162r.m79460a("click_music_tab", m125280l(videoPublishEditModel).mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("content_source", m125262b(videoPublishEditModel)).mo129406a("content_type", m125249a(videoPublishEditModel)).mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("enter_from", "video_edit_page").mo129406a("tab_name", str).f188764a);
    }

    /* renamed from: a */
    public static final void m125251a(VideoPublishEditModel videoPublishEditModel, int i) {
        C89219l.m154721d(videoPublishEditModel, "");
        C39162r.m79460a("edit_music", m125280l(videoPublishEditModel).mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("content_source", m125262b(videoPublishEditModel)).mo129406a("content_type", m125249a(videoPublishEditModel)).mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("music_id", videoPublishEditModel.musicId).mo129403a("music_rec_type", i).mo129403a("can_music_loop", 0).mo129406a("enter_from", "video_edit_page").f188764a);
    }

    /* renamed from: f */
    public static final void m125273f(VideoPublishEditModel videoPublishEditModel, String str) {
        C89219l.m154721d(videoPublishEditModel, "");
        C39162r.m79460a("enter_music_tab", m125280l(videoPublishEditModel).mo129406a("enter_from", "video_edit_page").mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129403a("creation_duration", videoPublishEditModel.getPreviewInfo().getPreviewVideoLength()).mo129406a("content_source", m125262b(videoPublishEditModel)).mo129406a("content_type", m125249a(videoPublishEditModel)).mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("tab_name", str).f188764a);
    }

    /* renamed from: a */
    public static final void m125254a(VideoPublishEditModel videoPublishEditModel, String str) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(str, "");
        C39162r.m79460a("click_text_entrance", m125280l(videoPublishEditModel).mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("enter_method", str).mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("content_type", m125249a(videoPublishEditModel)).mo129406a("content_source", m125262b(videoPublishEditModel)).mo129403a("is_multi_content", m125279k(videoPublishEditModel)).mo129406a("enter_from", "video_edit_page").f188764a);
    }

    /* renamed from: a */
    public static final void m125252a(VideoPublishEditModel videoPublishEditModel, int i, long j, String str) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(str, "");
        C39162r.m79460a("auto_subtitle_end", m125268d(videoPublishEditModel).mo129403a("video_duration", i).mo129404a("load_time", SystemClock.elapsedRealtime() - j).mo129406a("load_status", str).f188764a);
    }

    /* renamed from: a */
    public static /* synthetic */ C84425b m125247a(VideoPublishEditModel videoPublishEditModel, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        C89219l.m154721d(videoPublishEditModel, "");
        C84425b a = m125280l(videoPublishEditModel).mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("content_type", m125249a(videoPublishEditModel)).mo129406a("content_source", m125262b(videoPublishEditModel)).mo129406a("enter_from", "video_edit_page");
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        C84425b a2 = a.mo129403a("is_diy_prop", i2);
        int i5 = z2 ? 1 : 0;
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        C84425b a3 = a2.mo129403a("is_text_reading", i5);
        C89219l.m154716b(a3, "");
        return a3;
    }

    /* renamed from: a */
    public static final void m125253a(VideoPublishEditModel videoPublishEditModel, AbstractC72510a aVar, float f, String str) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        AbstractC88979t.m154310b(videoPublishEditModel).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143292d(new C70969a(videoPublishEditModel)).mo143289d(new C70970b(videoPublishEditModel, aVar, f, str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x046a  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x047f  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x048e  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x04e9  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02c6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m125250a(int r16, com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r17, android.content.Intent r18, int[] r19, java.lang.String r20) {
        /*
        // Method dump skipped, instructions count: 1267
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl.m125250a(int, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, android.content.Intent, int[], java.lang.String):void");
    }

    /* renamed from: a */
    public static final void m125255a(VideoPublishEditModel videoPublishEditModel, String str, int i, int i2, String str2) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C84425b a = m125280l(videoPublishEditModel).mo129406a("enter_from", "video_edit_page").mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("creation_id", videoPublishEditModel.creationId).mo129403a("is_subtitle", i).mo129406a("enter_method", str).mo129406a("content_source", m125262b(videoPublishEditModel)).mo129406a("content_type", m125249a(videoPublishEditModel));
        if (C65387c.m117084a()) {
            a.mo129403a("is_guidance_text", i2).mo129406a("delete_method", str2);
        }
        C39162r.m79460a("text_delete", a.f188764a);
    }
}

package com.p2082ss.android.ugc.aweme.shortvideo.eventtrack;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.beauty.C34807d;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.common.C39099e;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.services.edit.VideoInfoData;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b.C70935a;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.p2082ss.android.ugc.aweme.shortvideo.model.FlowDataMusicInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.p3790ac.C69791b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73933a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73964ar;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73967at;
import com.p2082ss.android.ugc.aweme.shortvideo.util.performance.C74029a;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.aweme.sticker.StickerInfo;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.tools.C78609k;
import com.p2082ss.android.ugc.gamora.editor.EditVideoInfoServiceImpl;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.util.Map;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.eventtrack.e */
public final class C71824e {

    /* renamed from: a */
    public static final C71825a f160970a = new C71825a((byte) 0);

    static {
        Covode.recordClassIndex(84370);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.eventtrack.e$a */
    public static final class C71825a {
        static {
            Covode.recordClassIndex(84371);
        }

        private C71825a() {
        }

        public /* synthetic */ C71825a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static String m126816a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Object[] array = new C89350l(";").split(str, 0).toArray(new String[0]);
            if (array != null) {
                StringBuilder sb = new StringBuilder();
                for (String str3 : (String[]) array) {
                    int parseInt = Integer.parseInt(str3);
                    if (parseInt == 1) {
                        str2 = "local";
                    } else if (parseInt == 2) {
                        str2 = "instagram";
                    } else if (parseInt == 3) {
                        str2 = "instagram_story";
                    } else if (parseInt != 101) {
                        str2 = "";
                    } else {
                        str2 = "twitter";
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        sb.append(str2);
                        sb.append(",");
                    }
                }
                String sb2 = sb.toString();
                C89219l.m154716b(sb2, "");
                if (C89361p.m154876c(sb2, ",", false)) {
                    sb2 = sb2.substring(0, sb2.length() - 1);
                    C89219l.m154716b(sb2, "");
                }
                return sb2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static final void m126818a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        C84425b a = new C84425b().mo129406a("scene", "create_publish").mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("enter_from", "publish");
        C73964ar arVar = C73964ar.f166038a;
        C89219l.m154716b(arVar, "");
        C84425b a2 = a.mo129404a("dalvikPss", arVar.f166040c);
        C73964ar arVar2 = C73964ar.f166038a;
        C89219l.m154716b(arVar2, "");
        C84425b a3 = a2.mo129404a("nativePss", arVar2.f166041d);
        C73964ar arVar3 = C73964ar.f166038a;
        C89219l.m154716b(arVar3, "");
        C84425b a4 = a3.mo129404a("otherPss", arVar3.f166043f);
        C73964ar arVar4 = C73964ar.f166038a;
        C89219l.m154716b(arVar4, "");
        C39162r.m79460a("av_memory_log", a4.mo129404a("totalPss", arVar4.f166042e).f188764a);
    }

    /* renamed from: a */
    public static final void m126819a(VideoPublishEditModel videoPublishEditModel, boolean z) {
        String str;
        int i;
        String str2;
        int i2;
        int i3;
        int i4;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i5;
        String str8;
        C89219l.m154721d(videoPublishEditModel, "");
        C84425b a = new C84425b().mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("shoot_tab_name", C71817eu.m126794e(videoPublishEditModel)).mo129406a("shoot_enter_method", videoPublishEditModel.shootEnterMethod);
        C89219l.m154716b(a, "");
        C84425b a2 = C34807d.m71117a(C70976bp.m125299a(a, videoPublishEditModel), videoPublishEditModel.mBeautyMobParam);
        String str9 = "0";
        if (C65357b.m117043a()) {
            str = "1";
        } else {
            str = str9;
        }
        C84425b a3 = a2.mo129406a("is_hardcode", str).mo129406a("bite_rate", String.valueOf(C65357b.m117047c())).mo129403a("video_quality", C65357b.m117048d()).mo129406a("resolution", videoPublishEditModel.getVideoResolution()).mo129406a("content_type", C71817eu.m126792c(videoPublishEditModel));
        if (videoPublishEditModel.veAudioRecorderParam == null || !videoPublishEditModel.veAudioRecorderParam.hasRecord()) {
            i = 0;
        } else {
            i = 1;
        }
        C84425b b = a3.mo129403a("is_dubbed", i).mo129403a("is_subtitle", videoPublishEditModel.hasSubtitle() ? 1 : 0).mo129406a("original_resolution", C70976bp.m125319o(videoPublishEditModel)).mo129409b("is_restore_crash", videoPublishEditModel.isFromCrash());
        CommentVideoModel commentVideoModel = videoPublishEditModel.commentVideoModel;
        if (commentVideoModel == null || (str2 = commentVideoModel.getEnterMethod()) == null) {
            str2 = "";
        }
        C84425b a4 = b.mo129406a("enter_method", str2);
        if (C71817eu.m126792c(videoPublishEditModel).equals("photo_canvas")) {
            a4.mo129406a("content_source", "upload");
        } else {
            a4.mo129406a("content_source", videoPublishEditModel.getAvetParameter().getContentSource());
        }
        if (videoPublishEditModel.draftId != 0) {
            a4.mo129403a("draft_id", videoPublishEditModel.draftId);
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.clientId)) {
            a4.mo129406a("channel", videoPublishEditModel.clientId);
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.shareId)) {
            a4.mo129406a("open_platform_share_id", videoPublishEditModel.shareId);
        }
        if (!z || videoPublishEditModel.isFromCrash()) {
            a4.mo129406a("enter_method", "click_next_button");
            a4.mo129406a("enter_from", "video_edit_page");
        } else if (!TextUtils.isEmpty(videoPublishEditModel.newDraftId)) {
            a4.mo129406a("new_draft_id", videoPublishEditModel.newDraftId);
            if (videoPublishEditModel.mDraftToEditFrom == 0) {
                a4.mo129406a("enter_method", "click_draft");
                if ("general_draft_list" != 0) {
                    a4.mo129406a("draft_way", "general_draft_list");
                }
            }
        }
        if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut) {
            i2 = videoPublishEditModel.videoCount;
            i3 = videoPublishEditModel.photoCount;
            if (videoPublishEditModel.mFromMultiCut) {
                str8 = "multiple_content";
            } else {
                str8 = "single_content";
            }
            a4.mo129406a("upload_type", str8);
        } else {
            if (videoPublishEditModel.extractFramesModel != null) {
                i2 = videoPublishEditModel.extractFramesModel.getFrames().size();
            } else if (videoPublishEditModel.mvCreateVideoData == null || videoPublishEditModel.mvCreateVideoData.selectMediaList == null) {
                i2 = 0;
            } else {
                i3 = videoPublishEditModel.mvCreateVideoData.selectMediaList.size();
                i2 = 0;
            }
            i3 = 0;
        }
        StickerInfo stickerInfo = videoPublishEditModel.stickerInfo;
        if (stickerInfo != null) {
            if (stickerInfo.hasTabOrder()) {
                a4.mo129406a("prop_tab_order", stickerInfo.getTabOrder());
            }
            if (stickerInfo.hasImprPosition()) {
                a4.mo129406a("prop_impr_position", stickerInfo.getImprPosition());
            }
        }
        a4.mo129403a("video_cnt", i2);
        a4.mo129403a("pic_cnt", i3);
        a4.mo129406a("music_selected_from", videoPublishEditModel.getMusicOrigin());
        if (i2 + i3 > 1) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        a4.mo129403a("is_multi_content", i4);
        a4.mo129406a("mix_type", C69791b.m123314a(i2, i3));
        if (CommentUtils.needMob(videoPublishEditModel)) {
            str3 = videoPublishEditModel.commentVideoModel.getCommentId();
        } else {
            str3 = "";
        }
        a4.mo129406a("reply_comment_id", str3);
        if (CommentUtils.needMob(videoPublishEditModel)) {
            str4 = videoPublishEditModel.commentVideoModel.getUserId();
        } else {
            str4 = "";
        }
        a4.mo129406a("reply_user_id", str4);
        if (!TextUtils.isEmpty(videoPublishEditModel.getBindMvId())) {
            a4.mo129406a("mv_id", videoPublishEditModel.getBindMvId());
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.pic2VideoSource)) {
            StringBuilder sb = new StringBuilder();
            String str10 = videoPublishEditModel.pic2VideoSource;
            C89219l.m154716b(str10, "");
            Object[] array = new C89350l(",").split(str10, 0).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            if (!C34717d.m70909a(strArr)) {
                for (String str11 : strArr) {
                    if (str11.length() != 0) {
                        if (sb.length() > 0) {
                            sb.append(",");
                        }
                        sb.append(str11);
                    }
                }
            }
            if (!TextUtils.isEmpty(sb)) {
                a4.mo129406a("picture_source", sb.toString());
            }
        }
        if (videoPublishEditModel.stickerInfo != null && !TextUtils.isEmpty(videoPublishEditModel.stickerInfo.getRecId())) {
            a4.mo129406a("prop_rec_id", videoPublishEditModel.stickerInfo.getRecId());
        }
        if (videoPublishEditModel.infoStickerModel != null) {
            InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
            C89219l.m154716b(infoStickerModel, "");
            boolean[] a5 = C78609k.m137209a(infoStickerModel);
            a4.mo129403a("is_diy_prop", a5[0] ? 1 : 0);
            a4.mo129403a("remove_background", a5[1] ? 1 : 0);
        }
        a4.mo129403a("app_mem_use", C73933a.C73934a.m130028a("av_video_record_init").getFirst().intValue());
        a4.mo129403a("availble_mem", C73933a.C73934a.m130028a("av_video_record_init").getSecond().intValue());
        a4.mo129403a("text_added", videoPublishEditModel.hasTextSticker() ? 1 : 0);
        a4.mo129403a("is_text_reading", videoPublishEditModel.hasReadTextAudio() ? 1 : 0);
        if (videoPublishEditModel.hasReadTextAudio()) {
            a4.mo129406a("tone_list", videoPublishEditModel.getReadTextAllSpeakerId());
        }
        a4.mo129403a("brightness", C39099e.m79372a(C63247i.f143610a));
        a4.mo129405a("zoom_value", Float.valueOf(videoPublishEditModel.currentZoomValue));
        a4.mo129406a("prop_id", videoPublishEditModel.getStickers());
        a4.mo129406a("prop_list", videoPublishEditModel.getStickers());
        a4.mo129403a("creation_duration", videoPublishEditModel.getPreviewInfo().getPreviewVideoLength());
        a4.mo129406a("effect_list", videoPublishEditModel.getEditEffectList());
        if (videoPublishEditModel.isDuet()) {
            a4.mo129403a("is_through_duet_sticker", videoPublishEditModel.duetFromDuetSticker).mo129403a("is_from_duet_button", videoPublishEditModel.mDuetFromDuetButton);
        }
        String giphyGifIds = VideoPublishEditModel.getGiphyGifIds(videoPublishEditModel.greenScreenMaterialList);
        a4.mo129403a("is_giphy", !TextUtils.isEmpty(giphyGifIds) ? 1 : 0);
        a4.mo129406a("giphy_id", giphyGifIds);
        if (TextUtils.equals(videoPublishEditModel.enterFrom, "super_entrance")) {
            a4.mo129403a("is_special_icon", 1);
        }
        if (videoPublishEditModel.isShoutout()) {
            a4.mo129406a("shoot_entrance", C74418d.shootWay);
            a4.mo129406a("enter_from", "shoutouts_detail_page");
        }
        a4.mo129403a("creation_duration", videoPublishEditModel.getPreviewInfo().getPreviewVideoLength());
        if (videoPublishEditModel.isAutoEnhanceEnable(C70935a.m125235a())) {
            a4.mo129403a("is_quality_improve", videoPublishEditModel.autoEnhanceOn ? 1 : 0);
        }
        if (videoPublishEditModel.commentVideoModel != null) {
            str5 = videoPublishEditModel.commentVideoModel.getCommentId();
        } else {
            str5 = null;
        }
        a4.mo129406a("comment_id", str5);
        QaStruct b2 = C71073b.m125569b(videoPublishEditModel.getMainBusinessContext());
        if (b2 != null) {
            if (b2.getQuestionId() != 0) {
                a4.mo129404a("question_id", b2.getQuestionId());
                a4.mo129406a("qa_type", "answer");
                a4.mo129403a("is_qa_sticker", 1);
            } else {
                a4.mo129406a("shoot_way", "question");
                a4.mo129406a("question_id", (String) null);
                a4.mo129406a("qa_type", "question");
                a4.mo129403a("is_qa_sticker", 1);
            }
        }
        if (C63253l.f143623a.mo73304C().mo93890b()) {
            str6 = "1";
        } else {
            str6 = str9;
        }
        a4.mo129406a("awareness_dot", str6);
        a4.mo129406a("prop_selected_from", videoPublishEditModel.getPropSource());
        a4.mo129403a("original_prop_count", videoPublishEditModel.mOriginalStickerCount);
        String str12 = videoPublishEditModel.mDesignerIdList;
        if (str12 == null) {
            str12 = "";
        }
        a4.mo129406a("prop_author_id", str12);
        if (!TextUtils.isEmpty(videoPublishEditModel.mMusicPath)) {
            FlowDataMusicInfo flowDataMusicInfo = videoPublishEditModel.creativeFlowData.getFlowDataMusicInfo();
            if (flowDataMusicInfo == null || !flowDataMusicInfo.isSelectedByAuto()) {
                a4.mo129406a("music_selected_method", "manual");
            } else {
                a4.mo129406a("music_selected_method", "auto");
            }
        }
        if (videoPublishEditModel.veAudioRecorderParam != null) {
            if (videoPublishEditModel.veAudioRecorderParam.getNeedOriginalSound()) {
                str9 = "1";
            }
            a4.mo129406a("has_original_sound", str9);
        } else {
            a4.mo129406a("has_original_sound", "1");
        }
        VideoInfoData videoInfoData = EditVideoInfoServiceImpl.m141997a().getVideoInfoData(videoPublishEditModel.creationId);
        if (videoInfoData != null) {
            a4.mo129403a("volume_original_delta", (int) ((videoPublishEditModel.voiceVolume - videoInfoData.getRusumeVolumeOrigin()) * 100.0f));
            a4.mo129403a("volume_music_delta", (int) ((videoPublishEditModel.musicVolume - videoInfoData.getRusumeVolumeMusic()) * 100.0f));
        }
        if (videoPublishEditModel.isAudioEnhance) {
            str7 = "on";
        } else {
            str7 = "off";
        }
        a4.mo129406a("noise_reducer_status", str7);
        a4.mo129406a("tag_id_list", C89070n.m154551a(videoPublishEditModel.getTextStickerChallenges().getReadTextChallengeIds(), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62));
        if (C63244g.m114602a().mo73287o().mo104784d()) {
            i5 = C63244g.m114602a().mo73287o().mo104785e();
        } else {
            i5 = 0;
        }
        a4.mo129403a("publish_cnt", i5);
        C73967at.m130094a("enter_video_post_page");
        Map<String, String> map = a4.f188764a;
        C89219l.m154716b(map, "");
        C74029a.m130192a("enter_video_post_page", map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x04f5  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0506  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x051f  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x055f A[SYNTHETIC, Splitter:B:216:0x055f] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x05a9  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0601  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0621  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x065d  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0668  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x067b  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x069b  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x06b9  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x06cd  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x06df  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x070e  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0727  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0729  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x074c  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x075d  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0784  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x07a0  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x07e6  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x080b  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x0823  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x0859  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x086b  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x087f  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0881  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0884  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0887  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x088c  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0897  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x08a8  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x08c1  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x08ca  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x08cc  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x08ce  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x08d0  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0924  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x09be  */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x0a11  */
    /* JADX WARNING: Removed duplicated region for block: B:417:0x0a20  */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0a2a  */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0a43  */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x0a5f  */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x0a8a  */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0ab3  */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x0ab9  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0abc  */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x0af3  */
    /* JADX WARNING: Removed duplicated region for block: B:467:0x0b4a  */
    /* JADX WARNING: Removed duplicated region for block: B:470:0x0b65  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x0b8d  */
    /* JADX WARNING: Removed duplicated region for block: B:501:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0370  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m126817a(android.app.Activity r22, com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r23, android.widget.CheckBox r24, int r25, com.p2082ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText r26, com.p2082ss.android.ugc.aweme.shortvideo.AbstractC72463p r27, java.lang.String r28, java.lang.String r29, com.p2082ss.android.ugc.aweme.shortvideo.model.Mission r30, java.lang.String r31, boolean r32, int r33) {
        /*
        // Method dump skipped, instructions count: 3058
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.eventtrack.C71824e.m126817a(android.app.Activity, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, android.widget.CheckBox, int, com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText, com.ss.android.ugc.aweme.shortvideo.p, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.shortvideo.model.Mission, java.lang.String, boolean, int):void");
    }
}

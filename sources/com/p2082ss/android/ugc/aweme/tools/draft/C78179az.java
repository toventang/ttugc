package com.p2082ss.android.ugc.aweme.tools.draft;

import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2001c.C27404ap;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.p2082ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.effectplatform.C46427p;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65414cx;
import com.p2082ss.android.ugc.aweme.services.IFoundationAVService;
import com.p2082ss.android.ugc.aweme.sharedar.SharedARModel;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.C71815es;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.C72700q;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.C69743b;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3801b.C70418a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b.C70943g;
import com.p2082ss.android.ugc.aweme.tools.p4082b.C77816g;
import com.p2082ss.android.ugc.aweme.tools.p4082b.EnumC77814e;
import com.p2082ss.android.ugc.aweme.utils.C80357ds;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.widgetcompat.ProgressDialogC81636a;
import com.p2082ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.editor.p4274a.C82030c;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p077b.C1743j;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.az */
public final class C78179az {

    /* renamed from: a */
    static final AtomicInteger f175581a = new AtomicInteger(0);

    /* renamed from: b */
    static ProgressDialogC81636a f175582b;

    /* renamed from: c */
    public static final C78179az f175583c = new C78179az();

    private C78179az() {
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.az$e */
    public static final class C78184e implements FetchResourcesListener {

        /* renamed from: a */
        final /* synthetic */ C1743j f175589a;

        static {
            Covode.recordClassIndex(91299);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
        public final void onSuccess() {
            C84911q.m145928d("fetchRequirement onSuccess");
            this.f175589a.mo5555a((Object) null);
        }

        C78184e(C1743j jVar) {
            this.f175589a = jVar;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
        public final void onFailed(Exception exc) {
            C84911q.m145926b("fetchRequirement fail : ".concat(String.valueOf(exc)));
            this.f175589a.mo5555a((Object) null);
        }
    }

    static {
        Covode.recordClassIndex(91294);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.az$a */
    public static final class C78180a implements IFoundationAVService.IFetchResourcesListener {

        /* renamed from: a */
        final /* synthetic */ C1743j f175584a;

        /* renamed from: b */
        final /* synthetic */ VideoPublishEditModel f175585b;

        static {
            Covode.recordClassIndex(91295);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onFailed(Exception exc) {
            this.f175585b.editMusicSyncMode = false;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onSuccess(String[] strArr) {
            this.f175584a.mo5555a(C89391z.f203057a);
        }

        C78180a(C1743j jVar, VideoPublishEditModel videoPublishEditModel) {
            this.f175584a = jVar;
            this.f175585b = videoPublishEditModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.az$d */
    public static final class C78183d implements IFetchEffectListListener {

        /* renamed from: a */
        final /* synthetic */ C1743j f175588a;

        static {
            Covode.recordClassIndex(91298);
        }

        C78183d(C1743j jVar) {
            this.f175588a = jVar;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
        public final void onFail(ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            C84911q.m145926b("uniformFetchList fail : ".concat(String.valueOf(exceptionResult)));
            this.f175588a.mo5555a((Object) null);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(List<Effect> list) {
            C89219l.m154721d(list, "");
            C84911q.m145928d("uniformFetchList onSuccess");
            this.f175588a.mo5555a((Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.az$c */
    public static final class C78182c extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C1743j f175587a;

        static {
            Covode.recordClassIndex(91297);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78182c(C1743j jVar) {
            super(1);
            this.f175587a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            this.f175587a.mo5555a((Object) null);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.az$f */
    public static final class C78185f<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ long f175590a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f175591b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f175592c;

        static {
            Covode.recordClassIndex(91300);
        }

        C78185f(long j, ActivityC0945e eVar, AbstractC89171a aVar) {
            this.f175590a = j;
            this.f175591b = eVar;
            this.f175592c = aVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C84911q.m145928d("VideoPublish finish prepareEffectPlatform, cost: " + (System.currentTimeMillis() - this.f175590a) + "ms.");
            ActivityC0945e eVar = this.f175591b;
            if (C78179az.f175581a.decrementAndGet() == 0 && C78179az.f175582b != null) {
                ProgressDialogC81636a aVar = C78179az.f175582b;
                if (aVar == null) {
                    C89219l.m154715b();
                }
                if (aVar.isShowing() && eVar != null && !eVar.isFinishing()) {
                    ProgressDialogC81636a aVar2 = C78179az.f175582b;
                    if (aVar2 != null) {
                        aVar2.dismiss();
                    }
                    C78179az.f175582b = null;
                }
            }
            this.f175592c.invoke();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static Intent m136668a(VideoPublishEditModel videoPublishEditModel, int i) {
        String str;
        C89219l.m154721d(videoPublishEditModel, "");
        Intent intent = new Intent();
        intent.putExtra("draft_to_edit_from", i);
        intent.putExtra("workspace", C69743b.m123265a(videoPublishEditModel));
        intent.putExtra("sticker_challenge", (Parcelable) videoPublishEditModel.stickerChallenge);
        intent.putExtra("creation_id", videoPublishEditModel.creationId);
        intent.putExtra("dir", C70637di.f158101d);
        intent.putExtra("face_beauty", videoPublishEditModel.mFaceBeauty);
        intent.putExtra("face_beauty_open", videoPublishEditModel.faceBeautyOpen);
        if (videoPublishEditModel.mBeautyMetadatas != null && !videoPublishEditModel.mBeautyMetadatas.isEmpty()) {
            intent.putParcelableArrayListExtra("extra_beauty_data", videoPublishEditModel.mBeautyMetadatas);
        }
        intent.putExtra("filter_id", videoPublishEditModel.mSelectedId);
        intent.putExtra("selected_filter_id", videoPublishEditModel.mSelectedFilterId);
        intent.putExtra("selected_filter_name", videoPublishEditModel.mSelectedFilterLabel);
        intent.putExtra("selected_filter_res_id", videoPublishEditModel.mSelectedFilterResId);
        intent.putExtra("extra_selected_filter_intensity", videoPublishEditModel.mSelectedFilterIntensity);
        intent.putExtra("camera", videoPublishEditModel.mCameraPosition);
        intent.putExtra("record_filter_names", videoPublishEditModel.mRecordFilterLabels);
        intent.putExtra("record_filter_values", videoPublishEditModel.mRecordFilterValues);
        intent.putExtra("record_beauty_mob_param", (Parcelable) videoPublishEditModel.mBeautyMobParam);
        intent.putExtra("record_filter_ids", videoPublishEditModel.mRecordFilterIds);
        intent.putExtra("filter_lables", videoPublishEditModel.mCurFilterLabels);
        intent.putExtra("filter_ids", videoPublishEditModel.mCurFilterIds);
        intent.putExtra("smooth_skin_labels", videoPublishEditModel.mSmoothSkinLabels);
        intent.putExtra("smooth_reshape_labels", videoPublishEditModel.mReshapeLabels);
        intent.putExtra("smooth_eyes_labels", videoPublishEditModel.mEyesLabels);
        intent.putExtra("smooth_tanning_labels", videoPublishEditModel.mTanningLabels);
        intent.putExtra("extra_aweme_speed", videoPublishEditModel.videoSpeed);
        intent.putExtra("extra_av_camera_ids", videoPublishEditModel.cameraIds);
        intent.putExtra("extra_beauty_type", videoPublishEditModel.beautyType);
        intent.putExtra("extra_video_record_metadata", C80357ds.m139323a(videoPublishEditModel.metadataMap));
        intent.putExtra("music_start", videoPublishEditModel.mMusicStart);
        intent.putExtra("extra_music_end", videoPublishEditModel.mMusicEnd);
        intent.putExtra("max_duration", videoPublishEditModel.maxDuration);
        intent.putExtra("wav_form", videoPublishEditModel.audioTrack);
        intent.putExtra("video_segment", videoPublishEditModel.mVideoSegmentsDesc);
        intent.putExtra("content_type", C71817eu.m126792c(videoPublishEditModel));
        if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut || videoPublishEditModel.isMvThemeVideoType()) {
            str = "upload";
        } else {
            str = "shoot";
        }
        intent.putExtra("content_source", str);
        intent.putExtra("hard_encode", videoPublishEditModel.mHardEncode);
        intent.putExtra("sticker_path", videoPublishEditModel.mStickerPath);
        intent.putExtra("sticker_id", videoPublishEditModel.mStickerID);
        intent.putExtra("first_sticker_music_ids", videoPublishEditModel.mFirstStickerMusicIdsJson);
        intent.putExtra("draft_id", videoPublishEditModel.draftId);
        intent.putExtra("new_draft_id", videoPublishEditModel.newDraftId);
        intent.putExtra("isFromDraft", true);
        intent.putExtra("videoCoverStartTm", videoPublishEditModel.mVideoCoverStartTm);
        intent.putExtra("cover_publish_model", (Parcelable) videoPublishEditModel.getCoverPublishModel());
        intent.putExtra("effectList", videoPublishEditModel.mEffectList);
        if (videoPublishEditModel.mEffectList != null) {
            Integer.valueOf(videoPublishEditModel.mEffectList.size());
        }
        intent.putExtra("extra_video_canvas_width", videoPublishEditModel.mVideoCanvasWidth);
        intent.putExtra("extra_video_canvas_height", videoPublishEditModel.mVideoCanvasHeight);
        intent.putExtra("origin", videoPublishEditModel.mOrigin);
        intent.putExtra("extra_import_video_info_list", videoPublishEditModel.importInfoList);
        intent.putExtra("extra_video_count", videoPublishEditModel.videoCount);
        intent.putExtra("extra_photo_count", videoPublishEditModel.photoCount);
        intent.putExtra("challenge", (Serializable) videoPublishEditModel.challenges);
        intent.putExtra("shoot_way", videoPublishEditModel.mShootWay);
        intent.putExtra("video_title", videoPublishEditModel.title);
        intent.putExtra("video_title_chain", videoPublishEditModel.chain);
        intent.putExtra("disable_delete_title_chain", videoPublishEditModel.disableDeleteChain);
        intent.putExtra("struct_list", (Serializable) videoPublishEditModel.structList);
        intent.putExtra("is_rivate", videoPublishEditModel.isPrivate);
        intent.putExtra("exclude_user_list", (Serializable) videoPublishEditModel.excludeUserList);
        intent.putExtra("allow_recommend", videoPublishEditModel.allowRecommend);
        if (!C13603b.m24435a((Collection) videoPublishEditModel.geofencingSetting)) {
            intent.putExtra("geo_fencing", (Serializable) videoPublishEditModel.geofencingSetting);
        }
        intent.putExtra("comment_setting", videoPublishEditModel.commentSetting);
        intent.putExtra("duet_from", videoPublishEditModel.getDuetFrom());
        intent.putExtra("duet_author", videoPublishEditModel.getDuetAuthor());
        intent.putExtra("duet_hash_tag", videoPublishEditModel.getDuetHashTag());
        intent.putExtra("fromMultiCut", videoPublishEditModel.mFromMultiCut);
        intent.putExtra("edit_video_length", videoPublishEditModel.mCropVideo);
        intent.putExtra("fromCut", videoPublishEditModel.mFromCut);
        intent.putExtra("shoot_mode", videoPublishEditModel.mShootMode);
        intent.putExtra("shooted_shoot_mode", videoPublishEditModel.mShootedShootMode);
        intent.putExtra("duration_mode", videoPublishEditModel.mDurationMode);
        intent.putExtra("tag_id", videoPublishEditModel.tagId);
        intent.putExtra("contain_backgroundvideo", videoPublishEditModel.containBackgroundVideo);
        intent.putExtra("upload_video_type", videoPublishEditModel.mIsMultiVideo);
        intent.putExtra("record_mode", videoPublishEditModel.recordMode);
        intent.putExtra("record_game_score", videoPublishEditModel.gameScore);
        intent.putExtra("extra_auto_enhance_state", videoPublishEditModel.autoEnhanceOn);
        intent.putExtra("extra_auto_enhance_type", videoPublishEditModel.autoEnhanceType);
        intent.putExtra("time_effect", (Parcelable) videoPublishEditModel.mTimeEffect);
        intent.putExtra("reaction_params", (Parcelable) videoPublishEditModel.reactionParams);
        intent.putExtra("is_muted", videoPublishEditModel.isMuted);
        intent.putExtra("music_volume", videoPublishEditModel.musicVolume);
        intent.putExtra("record_bgm_delay", videoPublishEditModel.recordBgmDelay);
        intent.putExtra("edit_loudness_param", (Parcelable) videoPublishEditModel.loudnessBalanceParam);
        intent.putExtra("music_origin", videoPublishEditModel.getMusicOrigin());
        intent.putExtra("voice_volume", videoPublishEditModel.voiceVolume);
        if (videoPublishEditModel.veCherEffectParam != null) {
            intent.putExtra("extra_ve_cher_effect_param", (Parcelable) videoPublishEditModel.veCherEffectParam);
        }
        if (videoPublishEditModel.veAudioEffectParam != null) {
            intent.putExtra("extra_ve_audio_effect_param", (Parcelable) videoPublishEditModel.veAudioEffectParam);
        }
        if (videoPublishEditModel.veAudioRecorderParam != null) {
            intent.putExtra("audio_record_param", (Parcelable) videoPublishEditModel.veAudioRecorderParam);
        }
        if (videoPublishEditModel.creativeFlowData != null) {
            intent.putExtra("creative_flow_data", (Parcelable) videoPublishEditModel.creativeFlowData);
        }
        if (videoPublishEditModel.commentVideoModel != null) {
            intent.putExtra("comment_video_model", videoPublishEditModel.commentVideoModel);
        }
        C77816g.m135933a(intent, C72700q.m128164a(videoPublishEditModel), EnumC77814e.PUBLISH, EnumC77814e.EDIT);
        intent.putExtra("extract_model", videoPublishEditModel.extractFramesModel);
        intent.putExtra("infosticker_model", (Parcelable) videoPublishEditModel.infoStickerModel);
        intent.putExtra("download_setting", videoPublishEditModel.allowDownloadSetting);
        if (C65414cx.m117133a() != 0) {
            C63244g.m114602a().mo73255A().mo93901a();
        }
        intent.putExtra("av_upload_struct", videoPublishEditModel.uploadMiscInfoStruct);
        if (videoPublishEditModel.isMvThemeVideoType()) {
            intent.putExtra("key_mv_theme_data", videoPublishEditModel.mvCreateVideoData);
        }
        intent.putExtra("extra_multi_edit_video_data", (Parcelable) videoPublishEditModel.multiEditVideoRecordData);
        SharedARModel sharedARModel = videoPublishEditModel.getSharedARModel();
        if (sharedARModel != null) {
            intent.putExtra("extra_shared_ar_effect", (Parcelable) sharedARModel);
        }
        intent.putExtra("extra_stickpoint_mode", videoPublishEditModel.isStickPointMode);
        intent.putExtra("key_stick_point_data", videoPublishEditModel.stickPointData);
        intent.putExtra("cutsame_data", videoPublishEditModel.cutSameEditData);
        intent.putExtra("extra_av_is_fast_import", videoPublishEditModel.isFastImport);
        if (videoPublishEditModel.getPreviewInfo() != null) {
            intent.putExtra("extra_edit_preview_info", (Parcelable) videoPublishEditModel.getPreviewInfo());
        }
        if (videoPublishEditModel.draftEditTransferModel != null) {
            intent.putExtra("extra_draft_transform_model", (Parcelable) videoPublishEditModel.draftEditTransferModel);
        }
        if (!C13603b.m24435a((Collection) videoPublishEditModel.messageBubbleTexts)) {
            intent.putStringArrayListExtra("extra_sticker_text", videoPublishEditModel.messageBubbleTexts);
        }
        intent.putExtra("picture_source", videoPublishEditModel.pic2VideoSource);
        intent.putExtra("use_music_before_edit", videoPublishEditModel.mUseMusicBeforeEdit);
        C71529w.f160314l = false;
        intent.putExtra("sticker_info", videoPublishEditModel.stickerInfo);
        intent.putStringArrayListExtra("extra_camera_lens_info", videoPublishEditModel.cameraLensInfo);
        if (videoPublishEditModel.isStitchMode()) {
            intent.putExtra("stitch_params", (Parcelable) videoPublishEditModel.getStitchParams());
        }
        intent.putExtra("extra_publish_stage", videoPublishEditModel.publishStage);
        intent.putExtra("extra_photo_mv_mode", videoPublishEditModel.isPhotoMvMode);
        intent.putExtra("extra_photo_mv_mode_1080p", videoPublishEditModel.isPhotoMvMode1080p);
        intent.putExtra("is_photo_mv_music", videoPublishEditModel.isPhotoMvMusic);
        Boolean bool = videoPublishEditModel.isSoundLoop;
        C89219l.m154716b(bool, "");
        intent.putExtra("extra_is_sound_loop", bool.booleanValue());
        intent.putExtra("draft_music_legal_param", videoPublishEditModel.isDraftMusicIllegal);
        intent.putExtra("extra_audio_aec_delay_time", videoPublishEditModel.audioAecDelayTime);
        intent.putExtra("enter_edit_page_method", "click_back_button");
        intent.putExtra("extra_current_zoom_value", videoPublishEditModel.currentZoomValue);
        if (videoPublishEditModel.isDuet()) {
            intent.putExtra(DuetExtraInfo.class.getName(), (Parcelable) videoPublishEditModel.draftDuetExtraInfo);
            intent.putExtra("extra_duet_layout", videoPublishEditModel.duetLayout);
            intent.putExtra("duet_from", videoPublishEditModel.getDuetFrom());
        }
        intent.putExtra("is_west_window_exist", videoPublishEditModel.isWestWindowExistStr);
        if (videoPublishEditModel.canvasVideoData != null) {
            intent.putExtra("photo_canvas_data", videoPublishEditModel.canvasVideoData);
        }
        if (!C13603b.m24435a((Collection) videoPublishEditModel.tagUserList)) {
            intent.putExtra("extra_social_video_tag_list", videoPublishEditModel.tagUserList);
        }
        intent.putExtra("is_audio_enhance", videoPublishEditModel.isAudioEnhance);
        intent.putExtra("edit_music_sync_mode", videoPublishEditModel.editMusicSyncMode);
        Cut2EditTransferModel cut2EditTransferModel = videoPublishEditModel.cut2EditTransferModel;
        if (!(cut2EditTransferModel instanceof Parcelable)) {
            cut2EditTransferModel = null;
        }
        intent.putExtra("cut_to_edit_transfer_model", (Parcelable) cut2EditTransferModel);
        intent.putExtra("draft_save_time", videoPublishEditModel.draftSaveTime);
        return intent;
    }

    /* renamed from: a */
    public static void m136669a(VideoPublishEditModel videoPublishEditModel, ActivityC0945e eVar, AbstractC89171a<C89391z> aVar) {
        String str;
        C1731i<TResult> iVar;
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aVar, "");
        long currentTimeMillis = System.currentTimeMillis();
        C1743j jVar = new C1743j();
        f175581a.incrementAndGet();
        if (f175582b == null && eVar != null && !eVar.isFinishing()) {
            f175582b = ProgressDialogC81636a.m141497a(eVar, eVar.getString(R.string.fbq));
        }
        C63238c.m114590a(C71815es.m126788a());
        if (videoPublishEditModel.mEffectList == null || videoPublishEditModel.mEffectList.isEmpty()) {
            C84911q.m145928d("ignore fetch specialfilter because of empty effects");
            jVar.mo5555a((Object) null);
        } else {
            HashSet hashSet = new HashSet();
            Iterator<EffectPointModel> it = videoPublishEditModel.mEffectList.iterator();
            while (it.hasNext()) {
                EffectPointModel next = it.next();
                C89219l.m154716b(next, "");
                if (TextUtils.equals(next.getCategory(), "motion")) {
                    hashSet.add(next.getKey());
                } else if (!C80720e.m139927b(next.getResDir())) {
                    hashSet.add(next.getKey());
                }
            }
            if (!hashSet.isEmpty()) {
                AbstractC46415f a = C46404c.m89554a(eVar, null);
                a.mo78886a(eVar);
                a.mo78912a((List<String>) new ArrayList(hashSet), (Map<String, String>) null, true, (IFetchEffectListListener) new C78183d(jVar));
            } else {
                C84911q.m145928d("All effects needn't download");
                jVar.mo5555a((Object) null);
            }
        }
        C1731i a2 = C1731i.m5633a((Object) null);
        C1743j jVar2 = new C1743j();
        ArrayList arrayList = new ArrayList();
        if (videoPublishEditModel.mIsFromDraft && C70943g.m125240a()) {
            arrayList.add("lens_hdr");
        }
        if (videoPublishEditModel.isAudioEnhance && !C82030c.m142035b()) {
            arrayList.add("unet_denoise_44k_music_model_v1.0");
        }
        if (!arrayList.isEmpty()) {
            C46427p pVar = new C46427p();
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            pVar.mo78947a((String[]) array, new C78184e(jVar2));
        } else {
            jVar2.mo5555a((Object) null);
        }
        C1731i[] iVarArr = new C1731i[5];
        iVarArr[0] = a2;
        iVarArr[1] = jVar.f5610a;
        iVarArr[2] = jVar2.f5610a;
        C1743j jVar3 = new C1743j();
        AbstractC32846a e = C63244g.m114602a().mo73255A().mo93906e();
        List<EditVideoSegment> videoList = videoPublishEditModel.getPreviewInfo().getVideoList();
        if (!C84892d.m145850a(videoList)) {
            str = videoList.get(0).getVideoPath();
        } else {
            str = null;
        }
        if (e != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(videoPublishEditModel.videoWidth()));
            arrayList2.add(Integer.valueOf(videoPublishEditModel.videoHeight()));
            C63244g.m114602a().mo73288p().mo125206a(arrayList2, String.valueOf(str), e, new C78181b(jVar3), new C78182c(jVar3));
        } else {
            jVar3.mo5555a((Object) null);
        }
        C1731i<TResult> iVar2 = jVar3.f5610a;
        C89219l.m154716b(iVar2, "");
        iVarArr[3] = iVar2;
        if (!C71817eu.m126800k(videoPublishEditModel) || !C70455f.f157420d) {
            iVar = C1731i.m5633a(C89391z.f203057a);
            C89219l.m154716b(iVar, "");
        } else {
            C1743j jVar4 = new C1743j();
            C70418a.m124206a(new C78180a(jVar4, videoPublishEditModel));
            iVar = jVar4.f5610a;
            C89219l.m154716b(iVar, "");
        }
        iVarArr[4] = iVar;
        ArrayList a3 = C27404ap.m54809a(iVarArr);
        C89219l.m154716b(a3, "");
        C1731i.m5638b((Collection<? extends C1731i<?>>) a3).mo5534a(new C78185f(currentTimeMillis, eVar, aVar), C1731i.f5564c, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.az$b */
    public static final class C78181b extends AbstractC89220m implements AbstractC89188r<Boolean, List<? extends String>, String, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C1743j f175586a;

        static {
            Covode.recordClassIndex(91296);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78181b(C1743j jVar) {
            super(4);
            this.f175586a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C89391z mo8774a(Boolean bool, List<? extends String> list, String str, String str2) {
            this.f175586a.mo5555a((Object) null);
            return C89391z.f203057a;
        }
    }
}

package com.p2082ss.android.ugc.aweme.ftc.pages;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxCompoundIconTextView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1717e.C23073a;
import com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b;
import com.p2082ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.C72700q;
import com.p2082ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.C69743b;
import com.p2082ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p2082ss.android.ugc.aweme.tools.p4082b.C77816g;
import com.p2082ss.android.ugc.aweme.tools.p4082b.EnumC77814e;
import com.p2082ss.android.ugc.aweme.utils.C80357ds;
import com.p2082ss.android.ugc.aweme.utils.permission.C80611a;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.tools.p4341d.p4342a.C84412c;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity */
public final class FTCVideoPublishActivity extends ActivityC33402b {

    /* renamed from: e */
    public static final C52751a f121390e = new C52751a((byte) 0);

    /* renamed from: d */
    public VideoPublishEditModel f121391d;

    /* renamed from: f */
    private boolean f121392f;

    /* renamed from: g */
    private int f121393g;

    /* renamed from: h */
    private boolean f121394h;

    /* renamed from: i */
    private boolean f121395i;

    /* renamed from: j */
    private HashMap f121396j;

    static {
        Covode.recordClassIndex(62148);
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    /* renamed from: d_ */
    public final View mo59481d_(int i) {
        if (this.f121396j == null) {
            this.f121396j = new HashMap();
        }
        View view = (View) this.f121396j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f121396j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity$a */
    public static final class C52751a {
        static {
            Covode.recordClassIndex(62149);
        }

        private C52751a() {
        }

        public /* synthetic */ C52751a(byte b) {
            this();
        }
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.x);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        C84412c.m145200a(this);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onBackPressed() {
        String str;
        if (getIntent().getIntExtra("fromDraft", 0) == 1) {
            Fragment a = getSupportFragmentManager().mo3549a(R.id.b82);
            DraftEditTransferModel draftEditTransferModel = null;
            if (!(a instanceof C52780d)) {
                a = null;
            }
            C52780d dVar = (C52780d) a;
            if (dVar != null) {
                VideoPublishEditModel videoPublishEditModel = dVar.f121459a;
                if (videoPublishEditModel == null) {
                    C89219l.m154710a("mModel");
                } else {
                    Intent intent = new Intent();
                    intent.putExtra("draft_to_edit_from", this.f121393g);
                    intent.putExtra("workspace", C69743b.m123265a(videoPublishEditModel));
                    StickerChallenge stickerChallenge = videoPublishEditModel.stickerChallenge;
                    if (!(stickerChallenge instanceof Parcelable)) {
                        stickerChallenge = null;
                    }
                    intent.putExtra("sticker_challenge", (Parcelable) stickerChallenge);
                    intent.putExtra("creation_id", videoPublishEditModel.creationId);
                    intent.putExtra("dir", C70637di.f158101d);
                    intent.putExtra("face_beauty", videoPublishEditModel.mFaceBeauty);
                    intent.putExtra("face_beauty_open", videoPublishEditModel.faceBeautyOpen);
                    if (videoPublishEditModel.mBeautyMetadatas != null) {
                        ArrayList<BeautyMetadata> arrayList = videoPublishEditModel.mBeautyMetadatas;
                        C89219l.m154716b(arrayList, "");
                        if (!arrayList.isEmpty()) {
                            intent.putParcelableArrayListExtra("extra_beauty_data", videoPublishEditModel.mBeautyMetadatas);
                        }
                    }
                    intent.putExtra("filter_id", videoPublishEditModel.mSelectedId);
                    intent.putExtra("selected_filter_id", videoPublishEditModel.mSelectedFilterId);
                    intent.putExtra("extra_selected_filter_intensity", videoPublishEditModel.mSelectedFilterIntensity);
                    intent.putExtra("camera", videoPublishEditModel.mCameraPosition);
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
                    intent.putExtra("isFromDraft", true);
                    intent.putExtra("videoCoverStartTm", videoPublishEditModel.mVideoCoverStartTm);
                    CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
                    if (!(coverPublishModel instanceof Parcelable)) {
                        coverPublishModel = null;
                    }
                    intent.putExtra("cover_publish_model", (Parcelable) coverPublishModel);
                    intent.putExtra("effectList", videoPublishEditModel.mEffectList);
                    intent.putExtra("extra_video_canvas_width", videoPublishEditModel.mVideoCanvasWidth);
                    intent.putExtra("extra_video_canvas_height", videoPublishEditModel.mVideoCanvasHeight);
                    intent.putExtra("origin", videoPublishEditModel.mOrigin);
                    intent.putExtra("extra_import_video_info_list", videoPublishEditModel.importInfoList);
                    intent.putExtra("extra_video_count", videoPublishEditModel.videoCount);
                    intent.putExtra("extra_photo_count", videoPublishEditModel.photoCount);
                    List list = videoPublishEditModel.challenges;
                    if (!(list instanceof Serializable)) {
                        list = null;
                    }
                    intent.putExtra("challenge", (Serializable) list);
                    intent.putExtra("shoot_way", videoPublishEditModel.mShootWay);
                    intent.putExtra("video_title", videoPublishEditModel.title);
                    intent.putExtra("video_title_chain", videoPublishEditModel.chain);
                    intent.putExtra("disable_delete_title_chain", videoPublishEditModel.disableDeleteChain);
                    List list2 = videoPublishEditModel.structList;
                    if (!(list2 instanceof Serializable)) {
                        list2 = null;
                    }
                    intent.putExtra("struct_list", (Serializable) list2);
                    intent.putExtra("is_rivate", videoPublishEditModel.isPrivate);
                    List list3 = videoPublishEditModel.excludeUserList;
                    if (!(list3 instanceof Serializable)) {
                        list3 = null;
                    }
                    intent.putExtra("exclude_user_list", (Serializable) list3);
                    intent.putExtra("allow_recommend", videoPublishEditModel.allowRecommend);
                    if (!C13603b.m24435a((Collection) videoPublishEditModel.geofencingSetting)) {
                        List list4 = videoPublishEditModel.geofencingSetting;
                        if (!(list4 instanceof Serializable)) {
                            list4 = null;
                        }
                        intent.putExtra("geo_fencing", (Serializable) list4);
                    }
                    intent.putExtra("comment_setting", videoPublishEditModel.commentSetting);
                    intent.putExtra("edit_loudness_param", (Parcelable) videoPublishEditModel.loudnessBalanceParam);
                    intent.putExtra("duet_author", videoPublishEditModel.getDuetAuthor());
                    intent.putExtra("duet_hash_tag", videoPublishEditModel.getDuetHashTag());
                    intent.putExtra("fromMultiCut", videoPublishEditModel.mFromMultiCut);
                    intent.putExtra("fromCut", videoPublishEditModel.mFromCut);
                    intent.putExtra("shoot_mode", videoPublishEditModel.mShootMode);
                    intent.putExtra("duration_mode", videoPublishEditModel.mDurationMode);
                    intent.putExtra("tag_id", videoPublishEditModel.tagId);
                    intent.putExtra("contain_backgroundvideo", videoPublishEditModel.containBackgroundVideo);
                    intent.putExtra("upload_video_type", videoPublishEditModel.mIsMultiVideo);
                    intent.putExtra("record_mode", videoPublishEditModel.recordMode);
                    EffectPointModel effectPointModel = videoPublishEditModel.mTimeEffect;
                    if (!(effectPointModel instanceof Parcelable)) {
                        effectPointModel = null;
                    }
                    intent.putExtra("time_effect", (Parcelable) effectPointModel);
                    ReactionParams reactionParams = videoPublishEditModel.reactionParams;
                    if (!(reactionParams instanceof Parcelable)) {
                        reactionParams = null;
                    }
                    intent.putExtra("reaction_params", (Parcelable) reactionParams);
                    intent.putExtra("is_muted", videoPublishEditModel.isMuted);
                    intent.putExtra("music_volume", videoPublishEditModel.musicVolume);
                    intent.putExtra("music_origin", videoPublishEditModel.getMusicOrigin());
                    intent.putExtra("voice_volume", videoPublishEditModel.voiceVolume);
                    ClientCherEffectParam clientCherEffectParam = videoPublishEditModel.veCherEffectParam;
                    if (clientCherEffectParam != null) {
                        Objects.requireNonNull(clientCherEffectParam, "null cannot be cast to non-null type android.os.Parcelable");
                        intent.putExtra("extra_ve_cher_effect_param", (Parcelable) clientCherEffectParam);
                    }
                    AudioEffectParam audioEffectParam = videoPublishEditModel.veAudioEffectParam;
                    if (audioEffectParam != null) {
                        Objects.requireNonNull(audioEffectParam, "null cannot be cast to non-null type android.os.Parcelable");
                        intent.putExtra("extra_ve_audio_effect_param", (Parcelable) audioEffectParam);
                    }
                    AudioRecorderParam audioRecorderParam = videoPublishEditModel.veAudioRecorderParam;
                    if (audioRecorderParam != null) {
                        Objects.requireNonNull(audioRecorderParam, "null cannot be cast to non-null type android.os.Parcelable");
                        intent.putExtra("audio_record_param", (Parcelable) audioRecorderParam);
                    }
                    C77816g.m135933a(getIntent(), C72700q.m128164a(videoPublishEditModel), EnumC77814e.PUBLISH, EnumC77814e.EDIT);
                    intent.putExtra("extract_model", videoPublishEditModel.extractFramesModel);
                    InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
                    if (!(infoStickerModel instanceof Parcelable)) {
                        infoStickerModel = null;
                    }
                    intent.putExtra("infosticker_model", (Parcelable) infoStickerModel);
                    intent.putExtra("download_setting", videoPublishEditModel.allowDownloadSetting);
                    if (videoPublishEditModel.isMvThemeVideoType()) {
                        intent.putExtra("key_mv_theme_data", videoPublishEditModel.mvCreateVideoData);
                    }
                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
                    if (!(multiEditVideoStatusRecordData instanceof Parcelable)) {
                        multiEditVideoStatusRecordData = null;
                    }
                    intent.putExtra("extra_multi_edit_video_data", (Parcelable) multiEditVideoStatusRecordData);
                    intent.setClass(this, VEVideoPublishEditActivity.class);
                    intent.putExtra("extra_av_is_fast_import", videoPublishEditModel.isFastImport);
                    EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
                    if (previewInfo != null) {
                        Objects.requireNonNull(previewInfo, "null cannot be cast to non-null type android.os.Parcelable");
                        intent.putExtra("extra_edit_preview_info", (Parcelable) previewInfo);
                    }
                    DraftEditTransferModel draftEditTransferModel2 = videoPublishEditModel.draftEditTransferModel;
                    if (draftEditTransferModel2 != null) {
                        if (draftEditTransferModel2 instanceof Parcelable) {
                            draftEditTransferModel = draftEditTransferModel2;
                        }
                        intent.putExtra("extra_draft_transform_model", (Parcelable) draftEditTransferModel);
                    }
                    if (!C13603b.m24435a((Collection) videoPublishEditModel.messageBubbleTexts)) {
                        intent.putStringArrayListExtra("extra_sticker_text", videoPublishEditModel.messageBubbleTexts);
                    }
                    intent.putExtra("picture_source", videoPublishEditModel.pic2VideoSource);
                    intent.putExtra("use_music_before_edit", videoPublishEditModel.mUseMusicBeforeEdit);
                    intent.putExtra("sticker_info", videoPublishEditModel.stickerInfo);
                    intent.putStringArrayListExtra("extra_camera_lens_info", videoPublishEditModel.cameraLensInfo);
                    intent.putExtra("extra_photo_mv_mode", videoPublishEditModel.isPhotoMvMode);
                    Boolean bool = videoPublishEditModel.isSoundLoop;
                    C89219l.m154716b(bool, "");
                    intent.putExtra("extra_is_sound_loop", bool.booleanValue());
                    C84349a.m145093a(intent, this);
                    startActivity(intent);
                    finish();
                    return;
                }
            }
            throw new IllegalStateException("Empty VideoPublishEditModel in FTC Publish Page.");
        }
        super.onBackPressed();
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity$b */
    public static final class C52752b extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ FTCVideoPublishActivity f121397a;

        static {
            Covode.recordClassIndex(62150);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52752b(FTCVideoPublishActivity fTCVideoPublishActivity) {
            this.f121397a = fTCVideoPublishActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            String str;
            String str2;
            String obj;
            this.f121397a.onBackPressed();
            C84425b bVar = new C84425b();
            VideoPublishEditModel videoPublishEditModel = this.f121397a.f121391d;
            Integer num = null;
            if (videoPublishEditModel != null) {
                str = videoPublishEditModel.creationId;
            } else {
                str = null;
            }
            C84425b a = bVar.mo129406a("creation_id", str).mo129406a("enter_from", "video_post_page");
            DmtEditText dmtEditText = (DmtEditText) this.f121397a.mo59481d_(R.id.awy);
            C89219l.m154716b(dmtEditText, "");
            Editable text = dmtEditText.getText();
            if (text == null || (obj = text.toString()) == null) {
                str2 = null;
            } else {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                str2 = C89361p.m154910b((CharSequence) obj).toString();
            }
            C84425b a2 = a.mo129406a("desc_detail", str2);
            VideoPublishEditModel videoPublishEditModel2 = this.f121397a.f121391d;
            if (videoPublishEditModel2 == null || videoPublishEditModel2.draftId != 0) {
                VideoPublishEditModel videoPublishEditModel3 = this.f121397a.f121391d;
                if (videoPublishEditModel3 != null) {
                    num = Integer.valueOf(videoPublishEditModel3.draftId);
                }
                a2.mo129405a("draft_id", num);
            }
            C39162r.m79460a("click_back", a2.f188764a);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onSaveInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        super.onSaveInstanceState(bundle);
        getIntent();
        C84412c.m145203a(this, bundle);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onCreate(Bundle bundle) {
        boolean z;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.bb);
        C84412c.m145202a(this, getIntent(), bundle);
        Serializable serializableExtra = getIntent().getSerializableExtra("args");
        if (!(serializableExtra instanceof VideoPublishEditModel)) {
            serializableExtra = null;
        }
        this.f121391d = (VideoPublishEditModel) serializableExtra;
        if (getIntent().getIntExtra("fromDraft", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f121395i = z;
        this.f121392f = getIntent().getBooleanExtra("enter_record_from_other_platform", false);
        this.f121394h = getIntent().getBooleanExtra("extra_enter_from_live", false);
        this.f121393g = getIntent().getIntExtra("draft_to_edit_from", 0);
        if (this.f121391d == null) {
            C84911q.m145926b("VideoPublishActivity onCreate error, model == null");
            finish();
        } else {
            C23073a.C23074a.m43508a(this).mo37494a(R.color.l).mo37503d(R.color.l).mo37495a(true).f54627a.mo33415d();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("args", this.f121391d);
            bundle2.putInt("music_rec_type", getIntent().getIntExtra("music_rec_type", -1));
            bundle2.putBoolean("enter_record_from_other_platform", this.f121392f);
            bundle2.putBoolean("extra_enter_from_live", this.f121394h);
            bundle2.putBoolean("edit_publish_session_end_together", getIntent().getBooleanExtra("edit_publish_session_end_together", false));
            bundle2.putBoolean("fromDraft", this.f121395i);
            AbstractC0952i supportFragmentManager = getSupportFragmentManager();
            Fragment a = supportFragmentManager.mo3549a(R.id.b82);
            if (!(a instanceof C52780d) || a == null) {
                C52780d dVar = new C52780d();
                dVar.setArguments(bundle2);
                supportFragmentManager.mo3552a().mo3453a(R.id.b82, dVar).mo3467b();
            }
            ((TuxCompoundIconTextView) mo59481d_(R.id.pf)).setOnClickListener(new C52752b(this));
            Typeface a2 = C17301b.m32033a().mo27611a(C17303d.f41568b);
            if (a2 != null) {
                ((TuxTextView) mo59481d_(R.id.erq)).setTypeface(a2);
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity", "onCreate", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.core.app.C0569a.AbstractC0571a
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C89219l.m154721d(strArr, "");
        C89219l.m154721d(iArr, "");
        C80611a.m139766a(this, i, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment a = getSupportFragmentManager().mo3549a(R.id.b82);
        if ((a instanceof C52780d) && a != null && a.isAdded()) {
            a.onActivityResult(i, i2, intent);
        }
    }
}

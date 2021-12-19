package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.editorInfo.C30652a;
import com.p2082ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.common.C39053a;
import com.p2082ss.android.ugc.aweme.common.C39078ad;
import com.p2082ss.android.ugc.aweme.draft.model.C43221a;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.draft.model.C43231e;
import com.p2082ss.android.ugc.aweme.draft.model.C43235i;
import com.p2082ss.android.ugc.aweme.draft.model.CutSameEditData;
import com.p2082ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.p2082ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.p2082ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.effect.EffectListModel;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.p2082ss.android.ugc.aweme.mvtheme.C61288d;
import com.p2082ss.android.ugc.aweme.p2306ah.C33463g;
import com.p2082ss.android.ugc.aweme.p2363ba.C34411c;
import com.p2082ss.android.ugc.aweme.p2690cr.p2704g.C40383b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.property.C65336af;
import com.p2082ss.android.ugc.aweme.sharedar.SharedARModel;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.C71872i;
import com.p2082ss.android.ugc.aweme.shortvideo.C72700q;
import com.p2082ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.C69743b;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.C69744c;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.C70898f;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71164e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71418g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVETParameterKt;
import com.p2082ss.android.ugc.aweme.shortvideo.model.BeautyMobParam;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3790ac.C69790a;
import com.p2082ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.aweme.sticker.StickerInfo;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.C75926c;
import com.p2082ss.android.ugc.aweme.tools.p4082b.C77816g;
import com.p2082ss.android.ugc.aweme.tools.p4082b.EnumC77814e;
import com.p2082ss.android.ugc.aweme.utils.C80357ds;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import dmt.p4542av.video.SingleImageCoverBitmapData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bn */
public final class C70974bn {

    /* renamed from: a */
    private final String f158880a;

    static {
        Covode.recordClassIndex(83468);
    }

    public C70974bn(String str) {
        this.f158880a = str;
    }

    /* renamed from: a */
    public static C43223c m125287a(VideoPublishEditModel videoPublishEditModel) {
        return m125291b(videoPublishEditModel);
    }

    /* renamed from: b */
    private static ClientCherEffectParam m125292b(C43223c cVar) {
        if (cVar == null || cVar.f100900W == null || cVar.f100900W.f100761U == null) {
            return null;
        }
        C43231e eVar = cVar.f100900W.f100761U;
        return new ClientCherEffectParam(eVar.f100937a, eVar.f100938b, eVar.f100939c);
    }

    /* renamed from: c */
    private static C43231e m125293c(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null || videoPublishEditModel.veCherEffectParam == null) {
            return null;
        }
        return new C43231e(videoPublishEditModel.veCherEffectParam.getMatrix(), videoPublishEditModel.veCherEffectParam.getDuration(), videoPublishEditModel.veCherEffectParam.getSegUseCher());
    }

    /* renamed from: c */
    private static AudioEffectParam m125294c(C43223c cVar) {
        String str;
        if (cVar == null || cVar.f100900W == null || cVar.mo73722q() == null) {
            return null;
        }
        C43235i q = cVar.mo73722q();
        if (q.f100948a != null) {
            str = q.f100948a;
        } else {
            str = "";
        }
        return new AudioEffectParam(str, q.f100949b, q.f100950c, q.f100951d, q.f100952e, q.f100953f, q.f100954g, null, q.f100955h);
    }

    /* renamed from: d */
    private static C43235i m125295d(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null || videoPublishEditModel.veAudioEffectParam == null) {
            return null;
        }
        return new C43235i(videoPublishEditModel.veAudioEffectParam.getUploadId(), videoPublishEditModel.veAudioEffectParam.getTrackType(), videoPublishEditModel.veAudioEffectParam.getTrackIndex(), videoPublishEditModel.veAudioEffectParam.getEffectPath(), videoPublishEditModel.veAudioEffectParam.getEffectTag(), videoPublishEditModel.veAudioEffectParam.getSeqIn(), videoPublishEditModel.veAudioEffectParam.getSeqOut(), videoPublishEditModel.veAudioEffectParam.getChallenge());
    }

    /* renamed from: b */
    public static C43223c m125291b(VideoPublishEditModel videoPublishEditModel) {
        C43223c cVar = new C43223c();
        cVar.mo73632a(videoPublishEditModel.getPreviewInfo());
        cVar.f100895R = videoPublishEditModel.getNewVersion();
        C43221a aVar = new C43221a();
        aVar.f100735a = videoPublishEditModel.title;
        aVar.f100739e = videoPublishEditModel.chain;
        aVar.f100740f = videoPublishEditModel.disableDeleteChain;
        aVar.f100737c = videoPublishEditModel.challenges;
        aVar.f100738d = videoPublishEditModel.getVideoLength();
        aVar.f100736b = videoPublishEditModel.getStructList();
        cVar.f100902b = aVar;
        cVar.f100906f = C70005cr.m123611a().f156482a;
        cVar.mo73621a(videoPublishEditModel.commentVideoModel);
        cVar.mo73645a(videoPublishEditModel.qaStruct);
        cVar.mo73733t(videoPublishEditModel.isWestWindowExistStr);
        cVar.f100908h = videoPublishEditModel.mMusicPath;
        cVar.f100914n = videoPublishEditModel.mMusicStart;
        cVar.mo73686h(videoPublishEditModel.mMusicEnd);
        cVar.mo73699k(videoPublishEditModel.mMusicOrigin);
        C43225d.m86325a(cVar, videoPublishEditModel.getFilterIndex());
        cVar.mo73656b(videoPublishEditModel.mRecordFilterIds);
        cVar.mo73661c(videoPublishEditModel.mRecordFilterLabels);
        cVar.mo73668d(videoPublishEditModel.mRecordFilterValues);
        cVar.mo73637a(videoPublishEditModel.mBeautyMobParam);
        cVar.mo73672e(videoPublishEditModel.mSelectedFilterId);
        cVar.mo73678f(videoPublishEditModel.mSelectedFilterLabel);
        cVar.mo73683g(videoPublishEditModel.mSelectedFilterResId);
        cVar.mo73618a(videoPublishEditModel.mSelectedFilterIntensity);
        cVar.f100884G = videoPublishEditModel.mFaceBeauty;
        cVar.f100922v = videoPublishEditModel.mCameraPosition;
        cVar.f100921u = videoPublishEditModel.mCurFilterLabels;
        cVar.mo73647a(videoPublishEditModel.mCurFilterIds);
        cVar.f100916p = videoPublishEditModel.mOrigin;
        cVar.f100885H = C63244g.m114602a().mo73255A().mo93904c();
        cVar.f100888K = videoPublishEditModel.mVideoSegmentsDesc;
        cVar.f100889L = videoPublishEditModel.mHardEncode;
        cVar.f100892O = videoPublishEditModel.mStickerID;
        cVar.mo73692i(videoPublishEditModel.getVideoCoverPath());
        cVar.f100923w = videoPublishEditModel.faceBeautyOpen ? 1 : 0;
        cVar.mo73648a(videoPublishEditModel.mBeautyMetadatas);
        cVar.f100881D = videoPublishEditModel.isPrivate;
        cVar.mo73658b(videoPublishEditModel.excludeUserList);
        cVar.mo73643a(videoPublishEditModel.mShoutOutsData);
        cVar.mo73695j(videoPublishEditModel.allowRecommend);
        cVar.mo73698k(videoPublishEditModel.commentSetting);
        cVar.f100883F = videoPublishEditModel.maxDuration;
        cVar.f100919s = videoPublishEditModel.audioTrack;
        cVar.f100918r = videoPublishEditModel.videoSpeed;
        cVar.mo73696j(videoPublishEditModel.cameraIds);
        cVar.mo73702l(videoPublishEditModel.beautyType);
        cVar.mo73657b(videoPublishEditModel.importInfoList);
        cVar.mo73650a(videoPublishEditModel.metadataMap);
        cVar.mo73667d(videoPublishEditModel.mOutVideoWidth);
        cVar.mo73671e(videoPublishEditModel.mOutVideoHeight);
        cVar.mo73677f(videoPublishEditModel.mVideoCanvasWidth);
        cVar.mo73682g(videoPublishEditModel.mVideoCanvasHeight);
        EffectListModel effectListModel = new EffectListModel();
        effectListModel.setEffectPointModels(videoPublishEditModel.mEffectList);
        cVar.f100882E = effectListModel;
        cVar.f100915o = videoPublishEditModel.getEffect();
        cVar.mo73691i(videoPublishEditModel.getTimeEffectStartPoint());
        cVar.f100890M = videoPublishEditModel.getSpecialPoints();
        cVar.f100896S = videoPublishEditModel.mVideoCoverStartTm;
        cVar.f100897T = videoPublishEditModel.mDuetFrom;
        cVar.mo73687h(videoPublishEditModel.mUploadPath);
        cVar.f100898U = videoPublishEditModel.mSyncPlatforms;
        cVar.mo73715o(videoPublishEditModel.getFrom());
        cVar.mo73719p(videoPublishEditModel.mShootMode);
        cVar.mo73720p(videoPublishEditModel.microAppId);
        cVar.mo73634a(videoPublishEditModel.microAppModel);
        cVar.mo73703l(videoPublishEditModel.creationId);
        cVar.mo73730s(videoPublishEditModel.draftId);
        cVar.mo73716o(videoPublishEditModel.newDraftId);
        cVar.mo73707m(videoPublishEditModel.mShootWay);
        cVar.mo73697j(videoPublishEditModel.autoEnhanceOn);
        cVar.mo73738v(videoPublishEditModel.autoEnhanceType);
        cVar.mo73711n(videoPublishEditModel.getShootFrom());
        cVar.mo73664c(videoPublishEditModel.mDurationMode);
        cVar.mo73670d(videoPublishEditModel.mIsMultiVideo);
        cVar.mo73641a(videoPublishEditModel.reactionParams);
        cVar.mo73674e(videoPublishEditModel.isMuted);
        cVar.mo73649a(videoPublishEditModel.geofencingSetting);
        cVar.mo73723q(videoPublishEditModel.recordMode);
        cVar.mo73727r(videoPublishEditModel.gameScore);
        cVar.mo73639a(videoPublishEditModel.extractFramesModel);
        cVar.mo73636a(videoPublishEditModel.getSaveModel());
        cVar.mo73628a(videoPublishEditModel.infoStickerModel);
        cVar.mo73736u(videoPublishEditModel.videoType);
        cVar.mo73673e(videoPublishEditModel.texts);
        cVar.mo73680f(videoPublishEditModel.usePaint);
        cVar.mo73640a(videoPublishEditModel.socialModel);
        cVar.mo73629a(videoPublishEditModel.stickerChallenge);
        cVar.mo73646a(videoPublishEditModel.getTextStickerChallenges());
        int newVersion = videoPublishEditModel.getNewVersion();
        C63244g.m114602a().mo73275c();
        if (newVersion == 3) {
            cVar.f100911k = (int) ((videoPublishEditModel.musicVolume / 2.0f) * 100.0f);
            cVar.f100910j = (int) ((videoPublishEditModel.voiceVolume / 2.0f) * 100.0f);
        }
        C77816g.m135934a(C72700q.m128164a(videoPublishEditModel), C72700q.m128162a(cVar.f100900W), EnumC77814e.PUBLISH, EnumC77814e.DRAFT);
        cVar.f100900W.f100775aH = videoPublishEditModel.getStickPointType();
        cVar.f100900W.f100840bm = Integer.valueOf(videoPublishEditModel.recordBgmDelay);
        cVar.f100900W.f100844bq = videoPublishEditModel.loudnessBalanceParam;
        cVar.f100900W.f100752L = videoPublishEditModel.mFirstStickerMusicIdsJson;
        cVar.f100900W.f100835bh = videoPublishEditModel.mShootedShootMode;
        cVar.mo73724q(videoPublishEditModel.commerceData);
        cVar.mo73693i(videoPublishEditModel.isFastImport);
        cVar.mo73630a(videoPublishEditModel.mvCreateVideoData);
        cVar.mo73685g(videoPublishEditModel.isStickPointMode);
        cVar.mo73688h(videoPublishEditModel.containBackgroundVideo);
        cVar.mo73635a(videoPublishEditModel.uploadMiscInfoStruct);
        cVar.mo73638a(videoPublishEditModel.creativeFlowData);
        if (videoPublishEditModel.draftEditTransferModel != null) {
            cVar.f100905e = videoPublishEditModel.draftEditTransferModel.getPrimaryKey();
            if (videoPublishEditModel.draftEditTransferModel.getVideoSegmentsCopy() != null) {
                cVar.mo73679f(videoPublishEditModel.draftEditTransferModel.getVideoSegmentsCopy());
            }
        }
        videoPublishEditModel.draftEditTransferModel = new DraftEditTransferModel(cVar.mo73726r(), C43225d.m86339i(cVar));
        cVar.mo73625a(m125293c(videoPublishEditModel));
        cVar.mo73626a(m125295d(videoPublishEditModel));
        if (videoPublishEditModel.veAudioRecorderParam != null) {
            C43225d.m86326a(cVar, videoPublishEditModel.veAudioRecorderParam);
        }
        if (videoPublishEditModel.metadataMap == null) {
            videoPublishEditModel.metadataMap = C30652a.m63003a();
        } else {
            Map<String, Object> a = C30652a.m63003a();
            if (a != null) {
                videoPublishEditModel.metadataMap.putAll(a);
            }
        }
        cVar.mo73650a(videoPublishEditModel.metadataMap);
        cVar.mo73706m(videoPublishEditModel.videoCount);
        cVar.mo73710n(videoPublishEditModel.photoCount);
        cVar.mo73728r(videoPublishEditModel.pic2VideoSource);
        cVar.mo73740w(videoPublishEditModel.allowDownloadSetting);
        cVar.mo73651a(videoPublishEditModel.mUseMusicBeforeEdit);
        SharedARModel sharedARModel = videoPublishEditModel.getSharedARModel();
        if (sharedARModel != null) {
            cVar.f100900W.f100790aW = sharedARModel;
        }
        cVar.mo73633a(videoPublishEditModel.multiEditVideoRecordData);
        cVar.mo73700k(videoPublishEditModel.supportRetake);
        cVar.mo73631a(videoPublishEditModel.stickPointData);
        cVar.mo73737u(C75926c.m133131a(videoPublishEditModel));
        cVar.mo73739v(videoPublishEditModel.getMainBusinessData());
        cVar.mo73644a(videoPublishEditModel.stickerInfo);
        if (C65336af.m117022a() == 1) {
            cVar.f100900W.f100772aE = false;
        }
        cVar.mo73741w(videoPublishEditModel.duetLayout);
        cVar.mo73642a(videoPublishEditModel.stitchParams);
        cVar.mo73704l(videoPublishEditModel.isCommerceMusic);
        cVar.mo73662c(videoPublishEditModel.cameraLensInfo);
        cVar.mo73708m(videoPublishEditModel.isPhotoMvMode);
        cVar.mo73717o(videoPublishEditModel.isPhotoMvMusic);
        cVar.mo73721p(videoPublishEditModel.isPhotoMvMode1080p);
        cVar.mo73712n(videoPublishEditModel.isDuetGreenSrceen);
        if (videoPublishEditModel.isSoundLoop.booleanValue()) {
            cVar.mo73742x("on");
        } else {
            cVar.mo73742x("off");
        }
        cVar.mo73725q(videoPublishEditModel.isDraftMusicIllegal);
        cVar.mo73684g(videoPublishEditModel.messageBubbleTexts);
        C84911q.m145921a("SoundLoop, convertToDraft " + videoPublishEditModel.isSoundLoop);
        cVar.mo73622a(videoPublishEditModel.cutSameEditData);
        cVar.mo73627a(videoPublishEditModel.getCoverPublishModel());
        cVar.mo73620a(videoPublishEditModel.audioAecDelayTime);
        cVar.mo73654b(videoPublishEditModel.currentZoomValue);
        cVar.mo73663c(videoPublishEditModel.mentionTextList);
        cVar.mo73669d(videoPublishEditModel.hashTagTextList);
        cVar.mo73619a(videoPublishEditModel.allowAutoCaptionSetting);
        cVar.mo73655b(videoPublishEditModel.duetFromDuetSticker);
        cVar.mo73660c(videoPublishEditModel.mDuetFromDuetButton);
        cVar.f100900W.f100842bo = videoPublishEditModel.canvasVideoData;
        cVar.f100900W.f100849bv = videoPublishEditModel.tagUserList;
        cVar.mo73659b(videoPublishEditModel.isAudioEnhance);
        cVar.f100900W.f100850bw = videoPublishEditModel.autoAttachedAnchor;
        cVar.f100900W.f100851bx = videoPublishEditModel.openPlatformExtra;
        cVar.f100900W.f100852by = videoPublishEditModel.openPlatformClientKey;
        cVar.f100900W.f100821bA = videoPublishEditModel.editMusicSyncMode;
        cVar.f100900W.f100822bB = videoPublishEditModel.cut2EditTransferModel;
        cVar.f100900W.f100823bC = true;
        cVar.f100887J = videoPublishEditModel.draftSaveTime;
        cVar.f100900W.f100824bD = videoPublishEditModel.sessionId;
        cVar.f100900W.f100825bE = videoPublishEditModel.ttStoryUploadModel;
        cVar.f100900W.f100827bG = videoPublishEditModel.isStoryEditMode;
        return cVar;
    }

    /* renamed from: a */
    public static VideoPublishEditModel m125288a(Intent intent) {
        String str;
        int i;
        float f;
        float f2;
        VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        videoPublishEditModel.setPreviewInfo((EditPreviewInfo) intent.getParcelableExtra("extra_edit_preview_info"));
        videoPublishEditModel.setAvetParameter(AVETParameterKt.generateAVETParam(intent));
        videoPublishEditModel.mWorkspace = (Workspace) intent.getParcelableExtra("workspace");
        if (videoPublishEditModel.mWorkspace == null) {
            videoPublishEditModel.mWorkspace = C69744c.m123266a();
        }
        videoPublishEditModel.mFromCut = intent.getBooleanExtra("fromCut", false);
        videoPublishEditModel.mFromMultiCut = intent.getBooleanExtra("fromMultiCut", false);
        videoPublishEditModel.startTime = intent.getLongExtra("record_timer", 0);
        videoPublishEditModel.mDir = m125290a(intent, "dir");
        if (TextUtils.isEmpty(videoPublishEditModel.mDir)) {
            str = C70637di.f158101d;
        } else {
            str = videoPublishEditModel.mDir;
        }
        videoPublishEditModel.mDir = str;
        videoPublishEditModel.mEncodedAudioOutputFile = videoPublishEditModel.mWorkspace.mo110100i().getPath();
        videoPublishEditModel.mParallelUploadOutputFile = videoPublishEditModel.mWorkspace.mo110101j().getPath();
        videoPublishEditModel.mFaceBeauty = intent.getIntExtra("face_beauty", 0);
        videoPublishEditModel.faceBeautyOpen = intent.getBooleanExtra("face_beauty_open", false);
        if (intent.hasExtra("extra_beauty_data")) {
            videoPublishEditModel.mBeautyMetadatas = intent.getParcelableArrayListExtra("extra_beauty_data");
        }
        videoPublishEditModel.mSelectedId = intent.getIntExtra("filter_id", 0);
        videoPublishEditModel.mSelectedFilterId = m125290a(intent, "selected_filter_id");
        videoPublishEditModel.mSelectedFilterLabel = m125290a(intent, "selected_filter_name");
        videoPublishEditModel.mSelectedFilterResId = m125290a(intent, "selected_filter_res_id");
        videoPublishEditModel.mSelectedFilterIntensity = intent.getFloatExtra("extra_selected_filter_intensity", -1.0f);
        videoPublishEditModel.mRecordVideoSelectedFilterIndex = intent.getIntExtra("extra_record_video_selected_filter_index", 0);
        videoPublishEditModel.mRecordVideoSelectedFilterIntensity = intent.getFloatExtra("extra_record_video_selected_filter_intensity", -1.0f);
        videoPublishEditModel.mCameraPosition = intent.getIntExtra("camera", 0);
        videoPublishEditModel.mRecordFilterIds = m125290a(intent, "record_filter_ids");
        videoPublishEditModel.mRecordFilterLabels = m125290a(intent, "record_filter_names");
        videoPublishEditModel.mRecordFilterValues = m125290a(intent, "record_filter_values");
        videoPublishEditModel.mBeautyMobParam = (BeautyMobParam) intent.getParcelableExtra("record_beauty_mob_param");
        videoPublishEditModel.mCurFilterLabels = m125290a(intent, "filter_lables");
        videoPublishEditModel.mCurFilterIds = m125290a(intent, "filter_ids");
        videoPublishEditModel.mSmoothSkinLabels = m125290a(intent, "smooth_skin_labels");
        videoPublishEditModel.mReshapeLabels = m125290a(intent, "smooth_reshape_labels");
        videoPublishEditModel.mTanningLabels = m125290a(intent, "smooth_tanning_labels");
        videoPublishEditModel.mEyesLabels = m125290a(intent, "smooth_eyes_labels");
        videoPublishEditModel.recordBgmDelay = intent.getIntExtra("record_bgm_delay", 0);
        videoPublishEditModel.loudnessBalanceParam = (LoudnessBalanceParam) intent.getParcelableExtra("edit_loudness_param");
        videoPublishEditModel.commentVideoModel = (CommentVideoModel) intent.getSerializableExtra("comment_video_model");
        videoPublishEditModel.qaStruct = (QaStruct) intent.getSerializableExtra("question_answer_video_model");
        videoPublishEditModel.hasQaSticker = Boolean.valueOf(videoPublishEditModel.isQaAnswer());
        videoPublishEditModel.setSharedARModel((SharedARModel) intent.getParcelableExtra("extra_shared_ar_effect"));
        videoPublishEditModel.videoSpeed = m125290a(intent, "extra_aweme_speed");
        videoPublishEditModel.cameraIds = m125290a(intent, "extra_av_camera_ids");
        videoPublishEditModel.beautyType = intent.getIntExtra("extra_beauty_type", 0);
        videoPublishEditModel.metadataMap = C80357ds.m139324a(m125290a(intent, "extra_video_record_metadata"));
        if (videoPublishEditModel.mWorkspace.mo110093c() != null) {
            videoPublishEditModel.mMusicPath = videoPublishEditModel.mWorkspace.mo110093c();
            videoPublishEditModel.mMusicStart = intent.getIntExtra("music_start", 0);
            videoPublishEditModel.mMusicEnd = intent.getIntExtra("extra_music_end", 0);
        }
        videoPublishEditModel.mOutputFile = videoPublishEditModel.mWorkspace.mo110099h().getPath();
        if (intent.getBooleanExtra("enable_music_path_check", true) && videoPublishEditModel.mMusicPath == null) {
            C70005cr.m123611a().mo70083a((C69905c) null);
        }
        videoPublishEditModel.maxDuration = intent.getLongExtra("max_duration", 15000);
        videoPublishEditModel.audioTrack = (UrlModel) intent.getSerializableExtra("wav_form");
        if (!videoPublishEditModel.mFromCut) {
            videoPublishEditModel.mVideoSegmentsDesc = m125290a(intent, "video_segment");
        }
        videoPublishEditModel.mHardEncode = intent.getIntExtra("hard_encode", 0);
        videoPublishEditModel.mStickerPath = m125290a(intent, "sticker_path");
        videoPublishEditModel.mStickerID = m125290a(intent, "sticker_id");
        videoPublishEditModel.mDesignerIdList = m125290a(intent, "original_designer_uid_list");
        videoPublishEditModel.mOriginalStickerCount = intent.getIntExtra("original_sticker_count", 0);
        videoPublishEditModel.stickerInfo = (StickerInfo) intent.getSerializableExtra("sticker_info");
        videoPublishEditModel.mFirstStickerMusicIdsJson = m125290a(intent, "first_sticker_music_ids");
        videoPublishEditModel.draftFromShoot = intent.getBooleanExtra("draft_from_shoot", false);
        videoPublishEditModel.mRestoreType = intent.getIntExtra("restore", 0);
        if (videoPublishEditModel.mSelectedId == 0) {
            i = 1;
        } else {
            i = 0;
        }
        videoPublishEditModel.mUseFilter = i;
        videoPublishEditModel.mWillGoOnShortVideo = intent.getBooleanExtra("com.ss.android.ugc.aweme.intent.extra.RECORD_FILTER", false);
        videoPublishEditModel.mShootWay = m125290a(intent, "shoot_way");
        if (C70976bp.m125314j(videoPublishEditModel)) {
            videoPublishEditModel.replaceMusicModel = new C71418g();
            videoPublishEditModel.replaceMusicModel.setAid(m125290a(intent, "id"));
            videoPublishEditModel.replaceMusicModel.setVid(m125290a(intent, "video_id"));
            videoPublishEditModel.replaceMusicModel.setCover(m125290a(intent, "video_cover"));
            String a = m125290a(intent, "music_id");
            if (!TextUtils.isEmpty(a)) {
                videoPublishEditModel.replaceMusicModel.setMid(a);
            }
        }
        videoPublishEditModel.setShootFrom(m125290a(intent, "shoot_from"));
        videoPublishEditModel.mIsFromDraft = intent.getBooleanExtra("isFromDraft", false);
        videoPublishEditModel.mDraftToEditFrom = intent.getIntExtra("draft_to_edit_from", -1);
        if (videoPublishEditModel.mIsFromDraft) {
            videoPublishEditModel.mVideoCanvasWidth = intent.getIntExtra("extra_video_canvas_width", 0);
            videoPublishEditModel.mVideoCanvasHeight = intent.getIntExtra("extra_video_canvas_height", 0);
        }
        videoPublishEditModel.mVideoCoverStartTm = intent.getFloatExtra("videoCoverStartTm", 0.0f);
        videoPublishEditModel.setCoverPublishModel((CoverPublishModel) intent.getParcelableExtra("cover_publish_model"));
        videoPublishEditModel.generateVideoCoverPath();
        videoPublishEditModel.mEffectList = intent.getParcelableArrayListExtra("effectList");
        videoPublishEditModel.mTimeEffect = (EffectPointModel) intent.getParcelableExtra("time_effect");
        videoPublishEditModel.mOrigin = intent.getIntExtra("origin", 0);
        videoPublishEditModel.challenges = (List) intent.getSerializableExtra("challenge");
        videoPublishEditModel.geofencingSetting = (List) intent.getSerializableExtra("geo_fencing");
        videoPublishEditModel.tagId = m125290a(intent, "tag_id");
        videoPublishEditModel.mDuetFrom = m125290a(intent, "duet_from");
        videoPublishEditModel.mDuetAuthor = (User) intent.getSerializableExtra("duet_author");
        videoPublishEditModel.mDuetHashTag = m125290a(intent, "duet_hash_tag");
        videoPublishEditModel.mShoutOutsData = (C74418d) intent.getSerializableExtra("shout_out_data");
        if (videoPublishEditModel.mShoutOutsData != null) {
            C70005cr.m123611a().mo110454d();
        }
        CreativeFlowData creativeFlowData = (CreativeFlowData) intent.getParcelableExtra("creative_flow_data");
        if (creativeFlowData != null) {
            videoPublishEditModel.creativeFlowData = creativeFlowData;
        }
        videoPublishEditModel.mSyncPlatforms = m125290a(intent, "sync_platform");
        videoPublishEditModel.mShootMode = intent.getIntExtra("shoot_mode", 0);
        videoPublishEditModel.mShootedShootMode = intent.getIntExtra("shooted_shoot_mode", -1);
        videoPublishEditModel.creationId = m125290a(intent, "creation_id");
        videoPublishEditModel.ccVid = m125290a(intent, "cc_vid");
        videoPublishEditModel.draftId = intent.getIntExtra("draft_id", 0);
        videoPublishEditModel.newDraftId = m125290a(intent, "new_draft_id");
        if (videoPublishEditModel.newDraftId == null) {
            videoPublishEditModel.newDraftId = "";
        }
        float f3 = 1.0f;
        if (videoPublishEditModel.hasOriginalSound()) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        videoPublishEditModel.voiceVolume = f;
        if (videoPublishEditModel.isMusic() <= 0) {
            f3 = 0.0f;
        }
        videoPublishEditModel.musicVolume = f3;
        videoPublishEditModel.title = m125290a(intent, "video_title");
        videoPublishEditModel.chain = m125290a(intent, "video_title_chain");
        videoPublishEditModel.duetFromDuetSticker = intent.getIntExtra("duet_from_duet_sticker", 0);
        videoPublishEditModel.mDuetFromDuetButton = intent.getIntExtra("duet_from_duet_button", 0);
        videoPublishEditModel.disableDeleteChain = intent.getBooleanExtra("disable_delete_title_chain", false);
        videoPublishEditModel.isPrivate = intent.getIntExtra("is_rivate", 0);
        videoPublishEditModel.excludeUserList = (List) intent.getSerializableExtra("exclude_user_list");
        videoPublishEditModel.allowRecommend = intent.getIntExtra("allow_recommend", 0);
        videoPublishEditModel.commentSetting = intent.getIntExtra("comment_setting", C40383b.f94572c);
        videoPublishEditModel.structList = (List) intent.getSerializableExtra("struct_list");
        videoPublishEditModel.mDurationMode = intent.getBooleanExtra("duration_mode", false);
        videoPublishEditModel.mIsMultiVideo = intent.getBooleanExtra("upload_video_type", false);
        videoPublishEditModel.autoEnhanceType = intent.getIntExtra("extra_auto_enhance_type", 0);
        videoPublishEditModel.autoEnhanceOn = intent.getBooleanExtra("extra_auto_enhance_state", false);
        C77816g.m135932a(intent, C72700q.m128165b(videoPublishEditModel));
        videoPublishEditModel.reactionParams = (ReactionParams) intent.getParcelableExtra("reaction_params");
        videoPublishEditModel.isMuted = intent.getBooleanExtra("is_muted", false);
        if (videoPublishEditModel.isMuted) {
            f2 = 0.0f;
        } else {
            f2 = videoPublishEditModel.voiceVolume;
        }
        videoPublishEditModel.voiceVolume = f2;
        videoPublishEditModel.recordMode = intent.getIntExtra("record_mode", 0);
        videoPublishEditModel.gameScore = intent.getIntExtra("record_game_score", 0);
        videoPublishEditModel.mMusicOrigin = m125290a(intent, "music_origin");
        videoPublishEditModel.microAppId = m125290a(intent, "micro_app_id");
        videoPublishEditModel.isDuetGreenSrceen = intent.getBooleanExtra("duet_green_srceen", false);
        videoPublishEditModel.microAppModel = (C71518t) intent.getSerializableExtra("micro_app_info");
        videoPublishEditModel.extractFramesModel = (ExtractFramesModel) intent.getSerializableExtra("extract_model");
        videoPublishEditModel.infoStickerModel = (InfoStickerModel) intent.getParcelableExtra("infosticker_model");
        videoPublishEditModel.md5 = m125290a(intent, "md5");
        if (intent.hasExtra("extra_import_video_info_list")) {
            videoPublishEditModel.importInfoList = intent.getParcelableArrayListExtra("extra_import_video_info_list");
        }
        videoPublishEditModel.videoCount = intent.getIntExtra("extra_video_count", 0);
        videoPublishEditModel.photoCount = intent.getIntExtra("extra_photo_count", 0);
        videoPublishEditModel.enterFrom = m125290a(intent, "enter_from");
        videoPublishEditModel.sendToUserHead = (UrlModel) intent.getSerializableExtra("send_to_user_head");
        videoPublishEditModel.isFastImport = intent.getBooleanExtra("extra_av_is_fast_import", false);
        videoPublishEditModel.fastImportErrorCode = intent.getIntExtra("extra_fast_import_error_code", -1);
        videoPublishEditModel.isStickPointMode = intent.getBooleanExtra("extra_stickpoint_mode", false);
        videoPublishEditModel.isPhotoMvMode = intent.getBooleanExtra("extra_photo_mv_mode", false);
        videoPublishEditModel.isPhotoMvMode1080p = intent.getBooleanExtra("extra_photo_mv_mode_1080p", false);
        videoPublishEditModel.isPhotoMvMusic = intent.getBooleanExtra("is_photo_mv_music", false);
        videoPublishEditModel.successEnableAEC = intent.getBooleanExtra("extra_success_enable_aec", false);
        videoPublishEditModel.audioAecDelayTime = intent.getLongExtra("extra_audio_aec_delay_time", -1);
        videoPublishEditModel.currentZoomValue = intent.getFloatExtra("extra_current_zoom_value", -1.0f);
        if (intent.hasExtra("extra_share_context")) {
            C39078ad adVar = (C39078ad) intent.getSerializableExtra("extra_share_context");
            if (adVar != null) {
                C33463g.m68567a(videoPublishEditModel, adVar);
            }
            C71164e eVar = new C71164e();
            eVar.setShareContext(adVar);
            videoPublishEditModel.creativeFlowData.setExtraShareOptions(adVar.mExtraShareOptions);
            videoPublishEditModel.setMainBusinessContext(eVar);
        }
        if (intent.hasExtra("extra_mention_user_model")) {
            videoPublishEditModel.mentionUserModel = (ExtraMentionUserModel) intent.getSerializableExtra("extra_mention_user_model");
        }
        if (intent.hasExtra("extra_ar_text")) {
            videoPublishEditModel.arTextList = intent.getStringArrayListExtra("extra_ar_text");
        }
        if (intent.hasExtra("extra_sticker_text")) {
            videoPublishEditModel.messageBubbleTexts = intent.getStringArrayListExtra("extra_sticker_text");
        }
        if (intent.hasExtra("extra_countdown_mode")) {
            videoPublishEditModel.countDownModes = intent.getIntegerArrayListExtra("extra_countdown_mode");
        }
        if (intent.hasExtra("extra_draft_transform_model")) {
            videoPublishEditModel.draftEditTransferModel = (DraftEditTransferModel) intent.getParcelableExtra("extra_draft_transform_model");
        }
        if (intent.hasExtra("av_upload_struct")) {
            videoPublishEditModel.uploadMiscInfoStruct = (C71872i) intent.getSerializableExtra("av_upload_struct");
        }
        videoPublishEditModel.containBackgroundVideo = intent.getBooleanExtra("contain_backgroundvideo", false);
        videoPublishEditModel.supportRetake = intent.getBooleanExtra("support_retake", true);
        if (intent.hasExtra("extra_multi_edit_video_data")) {
            videoPublishEditModel.multiEditVideoRecordData = (MultiEditVideoStatusRecordData) intent.getParcelableExtra("extra_multi_edit_video_data");
        }
        if (intent.hasExtra("key_mv_theme_data")) {
            videoPublishEditModel.mvCreateVideoData = (C61288d) intent.getSerializableExtra("key_mv_theme_data");
            if (videoPublishEditModel.mvCreateVideoData != null) {
                if (videoPublishEditModel.mvCreateVideoData.mvType == 1) {
                    videoPublishEditModel.videoEditorType = 3;
                } else {
                    videoPublishEditModel.videoEditorType = 2;
                }
            }
        } else if (videoPublishEditModel.isStickPointMode) {
            videoPublishEditModel.videoEditorType = 4;
        } else if (intent.hasExtra("stitch_params") || videoPublishEditModel.isStitchMode()) {
            videoPublishEditModel.videoEditorType = 7;
            videoPublishEditModel.stitchParams = (StitchParams) intent.getParcelableExtra("stitch_params");
            if (!(videoPublishEditModel.stitchParams == null || Float.compare(videoPublishEditModel.mVideoCoverStartTm, 0.0f) != 0 || videoPublishEditModel.getPreviewInfo().getVideoList().get(0).getVideoFileInfo() == null)) {
                videoPublishEditModel.mVideoCoverStartTm = ((float) videoPublishEditModel.getPreviewInfo().getVideoList().get(0).getVideoFileInfo().getDuration()) / 1000.0f;
            }
        } else if (C71817eu.m126803n(videoPublishEditModel)) {
            videoPublishEditModel.videoEditorType = 10;
        } else if (videoPublishEditModel.isMultiVideoEdit()) {
            videoPublishEditModel.videoEditorType = 6;
        } else if (intent.hasExtra("photo_canvas_data")) {
            videoPublishEditModel.videoEditorType = 11;
        }
        if (intent.hasExtra("key_stick_point_data")) {
            videoPublishEditModel.stickPointData = (C69790a) intent.getSerializableExtra("key_stick_point_data");
        }
        if (intent.hasExtra("extra_ve_cher_effect_param")) {
            videoPublishEditModel.veCherEffectParam = (ClientCherEffectParam) intent.getParcelableExtra("extra_ve_cher_effect_param");
        }
        if (intent.hasExtra("extra_ve_audio_effect_param")) {
            videoPublishEditModel.veAudioEffectParam = (AudioEffectParam) intent.getParcelableExtra("extra_ve_audio_effect_param");
        }
        if (intent.hasExtra("sticker_challenge")) {
            videoPublishEditModel.stickerChallenge = (StickerChallenge) intent.getParcelableExtra("sticker_challenge");
        }
        if (intent.hasExtra("audio_record_param")) {
            videoPublishEditModel.veAudioRecorderParam = (AudioRecorderParam) intent.getParcelableExtra("audio_record_param");
        }
        videoPublishEditModel.singleImageCoverBitmapData = (SingleImageCoverBitmapData) intent.getParcelableExtra("key_choose_media_item_cover_bitmap_data");
        videoPublishEditModel.pic2VideoSource = m125290a(intent, "picture_source");
        videoPublishEditModel.allowDownloadSetting = intent.getIntExtra("download_setting", 0);
        videoPublishEditModel.mUseMusicBeforeEdit = intent.getBooleanExtra("use_music_before_edit", false);
        videoPublishEditModel.duetLayout = m125290a(intent, "extra_duet_layout");
        videoPublishEditModel.draftDuetExtraInfo = (DuetExtraInfo) intent.getParcelableExtra(DuetExtraInfo.class.getName());
        videoPublishEditModel.greenScreenMaterialList = intent.getParcelableArrayListExtra("green_screen_material_list");
        videoPublishEditModel.cameraLensInfo = intent.getStringArrayListExtra("extra_camera_lens_info");
        videoPublishEditModel.cutSameEditData = (CutSameEditData) intent.getParcelableExtra("cutsame_data");
        videoPublishEditModel.isDraftMusicIllegal = intent.getBooleanExtra("draft_music_legal_param", false);
        videoPublishEditModel.videoDurationFromVideoCutPage = intent.getIntExtra("preview_video_length", -1);
        videoPublishEditModel.fromPropId = m125290a(intent, "from_prop_id");
        videoPublishEditModel.isDefaultProp = intent.getBooleanExtra("is_default_prop", false);
        videoPublishEditModel.publishStage = intent.getIntExtra("extra_publish_stage", 0);
        if (intent.hasExtra("photo_canvas_data")) {
            videoPublishEditModel.canvasVideoData = (CanvasVideoData) intent.getSerializableExtra("photo_canvas_data");
        }
        videoPublishEditModel.isWestWindowExistStr = m125290a(intent, "is_west_window_exist");
        if (intent.hasExtra("enter_method")) {
            videoPublishEditModel.shootEnterMethod = m125290a(intent, "enter_method");
        }
        videoPublishEditModel.autoAttachedAnchor = (C39053a) intent.getSerializableExtra("auto_selected_anchor");
        videoPublishEditModel.tagUserList = (ArrayList) intent.getSerializableExtra("extra_social_video_tag_list");
        videoPublishEditModel.isAudioEnhance = intent.getBooleanExtra("is_audio_enhance", false);
        if (videoPublishEditModel.autoAttachedAnchor == null) {
            videoPublishEditModel.autoAttachedAnchor = (C39053a) intent.getSerializableExtra("auto_selected_anchor");
        }
        if (videoPublishEditModel.openPlatformExtra == null) {
            videoPublishEditModel.openPlatformExtra = m125290a(intent, "open_platform_extra");
        }
        if (videoPublishEditModel.openPlatformClientKey == null) {
            videoPublishEditModel.openPlatformClientKey = m125290a(intent, "open_platform_client_key");
        }
        videoPublishEditModel.cut2EditTransferModel = (Cut2EditTransferModel) intent.getParcelableExtra("cut_to_edit_transfer_model");
        videoPublishEditModel.editMusicSyncMode = intent.getBooleanExtra("edit_music_sync_mode", false);
        videoPublishEditModel.draftSaveTime = intent.getLongExtra("draft_save_time", 0);
        return videoPublishEditModel;
    }

    /* renamed from: a */
    public static VideoPublishEditModel m125289a(C43223c cVar) {
        boolean z;
        boolean z2;
        float f;
        String str;
        VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        videoPublishEditModel.setPreviewInfo(C43225d.m86338h(cVar));
        videoPublishEditModel.mDir = C70638dj.f158101d;
        if (cVar.mo73701k()) {
            videoPublishEditModel.mvCreateVideoData = cVar.f100900W.f100753M;
            if (videoPublishEditModel.mvCreateVideoData == null || videoPublishEditModel.mvCreateVideoData.mvType != 1) {
                videoPublishEditModel.videoEditorType = 2;
            } else {
                videoPublishEditModel.videoEditorType = 3;
            }
            videoPublishEditModel.uploadMiscInfoStruct = cVar.f100900W.f100756P;
        }
        if (cVar.f100900W.f100842bo != null) {
            videoPublishEditModel.videoEditorType = 11;
        }
        videoPublishEditModel.isStickPointMode = cVar.f100900W.f100804ak;
        if (videoPublishEditModel.isStickPointMode) {
            videoPublishEditModel.stickPointData = cVar.f100900W.f100819az;
        }
        videoPublishEditModel.containBackgroundVideo = cVar.f100900W.f100818ay;
        videoPublishEditModel.isFastImport = cVar.f100900W.f100757Q;
        videoPublishEditModel.title = cVar.f100902b.f100735a;
        videoPublishEditModel.chain = cVar.f100902b.f100739e;
        videoPublishEditModel.challenges = cVar.f100902b.f100737c;
        videoPublishEditModel.setTextStickerChallenges(videoPublishEditModel.getTextStickerChallenges());
        videoPublishEditModel.commentVideoModel = cVar.f100900W.f100770aC;
        videoPublishEditModel.qaStruct = cVar.f100900W.f100848bu;
        videoPublishEditModel.hasQaSticker = Boolean.valueOf(videoPublishEditModel.isQaAnswer());
        videoPublishEditModel.isWestWindowExistStr = cVar.f100900W.f100847bt;
        CreativeFlowData creativeFlowData = cVar.f100900W.f100755O;
        if (creativeFlowData != null) {
            videoPublishEditModel.creativeFlowData = creativeFlowData;
        }
        videoPublishEditModel.setSharedARModel(cVar.f100900W.f100790aW);
        videoPublishEditModel.structList = cVar.f100902b.f100736b;
        videoPublishEditModel.musicId = C34411c.m70401a(cVar.f100906f);
        videoPublishEditModel.mMusicPath = cVar.f100908h;
        videoPublishEditModel.mMusicStart = cVar.f100914n;
        videoPublishEditModel.mMusicEnd = cVar.mo73653b();
        videoPublishEditModel.mMusicOrigin = cVar.f100900W.f100865n;
        videoPublishEditModel.mSelectedId = cVar.f100913m;
        videoPublishEditModel.mRecordFilterIds = cVar.f100900W.f100874w;
        videoPublishEditModel.mRecordFilterLabels = cVar.f100900W.f100875x;
        videoPublishEditModel.mRecordFilterValues = cVar.f100900W.f100876y;
        videoPublishEditModel.mBeautyMobParam = cVar.f100900W.f100877z;
        videoPublishEditModel.mSelectedFilterId = cVar.f100900W.f100741A;
        videoPublishEditModel.mSelectedFilterLabel = cVar.f100900W.f100742B;
        videoPublishEditModel.mSelectedFilterResId = cVar.f100900W.f100841bn;
        videoPublishEditModel.mFaceBeauty = cVar.f100884G;
        videoPublishEditModel.mCameraPosition = cVar.f100922v;
        videoPublishEditModel.mCurFilterLabels = cVar.f100921u;
        videoPublishEditModel.mCurFilterIds = cVar.f100900W.f100873v;
        videoPublishEditModel.mOrigin = cVar.f100916p;
        videoPublishEditModel.mVideoSegmentsDesc = cVar.f100888K;
        videoPublishEditModel.mHardEncode = cVar.f100889L;
        videoPublishEditModel.mStickerID = cVar.f100892O;
        videoPublishEditModel.isPrivate = cVar.f100881D;
        videoPublishEditModel.excludeUserList = cVar.f100900W.f100787aT;
        videoPublishEditModel.allowRecommend = cVar.f100900W.f100789aV;
        videoPublishEditModel.geofencingSetting = cVar.f100900W.f100786aS;
        videoPublishEditModel.commentSetting = cVar.f100900W.f100750J;
        videoPublishEditModel.maxDuration = cVar.f100883F;
        videoPublishEditModel.audioTrack = cVar.f100919s;
        videoPublishEditModel.videoSpeed = cVar.f100918r;
        videoPublishEditModel.cameraIds = cVar.f100900W.f100797ad;
        videoPublishEditModel.beautyType = cVar.f100900W.f100798ae;
        videoPublishEditModel.mBeautyMetadatas = cVar.f100900W.f100771aD;
        videoPublishEditModel.mUploadPath = cVar.f100900W.f100805al;
        videoPublishEditModel.importInfoList = cVar.f100900W.f100799af;
        videoPublishEditModel.metadataMap = cVar.f100900W.f100802ai;
        videoPublishEditModel.mShoutOutsData = cVar.f100900W.f100788aU;
        videoPublishEditModel.commerceData = C63253l.f143623a.mo73330z().mo93815a(cVar);
        videoPublishEditModel.mSelectedFilterIntensity = cVar.mo73729s();
        videoPublishEditModel.setVideoLength(cVar.f100902b.f100738d);
        videoPublishEditModel.recordBgmDelay = cVar.f100900W.f100840bm.intValue();
        videoPublishEditModel.loudnessBalanceParam = cVar.f100900W.f100844bq;
        if (cVar.f100882E != null) {
            videoPublishEditModel.mEffectList = cVar.f100882E.getEffectPointModels();
        }
        int i = cVar.f100915o;
        if (i != 0) {
            videoPublishEditModel.mTimeEffect = new EffectPointModel();
            videoPublishEditModel.mTimeEffect.setKey(String.valueOf(i));
            videoPublishEditModel.mTimeEffect.setStartPoint(cVar.mo73666d());
            videoPublishEditModel.mTimeEffect.setEndPoint(cVar.f100890M);
        }
        videoPublishEditModel.mVideoCoverStartTm = cVar.f100896S;
        videoPublishEditModel.setVideoCoverPath(cVar.f100900W.f100760T);
        videoPublishEditModel.mOutVideoWidth = cVar.f100900W.f100762V;
        videoPublishEditModel.mOutVideoHeight = cVar.f100900W.f100763W;
        videoPublishEditModel.mVideoCanvasWidth = cVar.f100900W.f100764X;
        videoPublishEditModel.mVideoCanvasHeight = cVar.f100900W.f100765Y;
        if (cVar.f100906f != null) {
            C63253l.f143623a.mo73311g();
        }
        videoPublishEditModel.mDuetFrom = cVar.f100897T;
        videoPublishEditModel.mSyncPlatforms = cVar.f100898U;
        if (cVar.f100900W.f100820b == 1) {
            z = true;
        } else {
            z = false;
        }
        videoPublishEditModel.mFromMultiCut = z;
        if (cVar.f100900W.f100820b == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        videoPublishEditModel.mFromCut = z2;
        videoPublishEditModel.mShootMode = cVar.f100900W.f100767a;
        videoPublishEditModel.microAppId = cVar.f100900W.f100863l;
        videoPublishEditModel.microAppModel = cVar.f100900W.f100746F;
        videoPublishEditModel.microAppModel = cVar.f100900W.f100746F;
        videoPublishEditModel.creationId = cVar.mo73676f();
        videoPublishEditModel.draftId = cVar.f100900W.f100856e;
        videoPublishEditModel.newDraftId = cVar.f100900W.f100857f;
        int i2 = cVar.f100895R;
        C63244g.m114602a().mo73275c();
        float f2 = 1.0f;
        float f3 = 0.0f;
        if (i2 == 3) {
            videoPublishEditModel.voiceVolume = (((float) cVar.f100910j) * 2.0f) / 100.0f;
            f2 = (((float) cVar.f100911k) * 2.0f) / 100.0f;
        } else {
            if (videoPublishEditModel.hasOriginalSound()) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            videoPublishEditModel.voiceVolume = f;
            if (videoPublishEditModel.isMusic() <= 0) {
                f2 = 0.0f;
            }
        }
        videoPublishEditModel.musicVolume = f2;
        videoPublishEditModel.mShootWay = cVar.f100900W.f100855d;
        videoPublishEditModel.autoEnhanceType = cVar.f100900W.f100774aG;
        videoPublishEditModel.autoEnhanceOn = cVar.f100900W.f100773aF;
        videoPublishEditModel.setShootFrom(cVar.f100900W.f100845br);
        videoPublishEditModel.mDurationMode = cVar.f100900W.f100859h;
        videoPublishEditModel.mIsMultiVideo = cVar.f100900W.f100858g;
        videoPublishEditModel.setNewVersion(cVar.f100895R);
        videoPublishEditModel.reactionParams = cVar.mo73681g();
        videoPublishEditModel.isMuted = cVar.mo73689h();
        if (!videoPublishEditModel.isMuted) {
            f3 = videoPublishEditModel.voiceVolume;
        }
        videoPublishEditModel.voiceVolume = f3;
        videoPublishEditModel.recordMode = cVar.f100900W.f100860i;
        videoPublishEditModel.gameScore = cVar.f100900W.f100861j;
        videoPublishEditModel.extractFramesModel = cVar.mo73690i();
        videoPublishEditModel.setSaveModel(cVar.f100900W.f100744D);
        videoPublishEditModel.infoStickerModel = cVar.mo73694j();
        videoPublishEditModel.videoType = cVar.f100900W.f100747G;
        videoPublishEditModel.usePaint = cVar.f100900W.f100749I;
        videoPublishEditModel.texts = cVar.f100900W.f100748H;
        videoPublishEditModel.socialModel = cVar.f100900W.f100751K;
        Workspace a = C69743b.m123265a(videoPublishEditModel);
        videoPublishEditModel.mOutputFile = a.mo110099h().getPath();
        videoPublishEditModel.mEncodedAudioOutputFile = a.mo110100i().getPath();
        videoPublishEditModel.mParallelUploadOutputFile = a.mo110101j().getPath();
        C77816g.m135934a(C72700q.m128166b(cVar.f100900W), C72700q.m128165b(videoPublishEditModel), EnumC77814e.DRAFT, EnumC77814e.PUBLISH);
        videoPublishEditModel.setStickPointType(cVar.f100900W.f100775aH);
        if (cVar.f100900W == null) {
            str = null;
        } else {
            str = cVar.f100900W.f100752L;
        }
        videoPublishEditModel.mFirstStickerMusicIdsJson = str;
        videoPublishEditModel.draftEditTransferModel = new DraftEditTransferModel(cVar.mo73726r(), C43225d.m86339i(cVar));
        videoPublishEditModel.veCherEffectParam = m125292b(cVar);
        videoPublishEditModel.veAudioEffectParam = m125294c(cVar);
        videoPublishEditModel.stickerChallenge = cVar.f100900W.f100800ag;
        if (C70898f.m125188a()) {
            videoPublishEditModel.veAudioRecorderParam = cVar.f100900W.f100803aj;
        }
        videoPublishEditModel.multiEditVideoRecordData = cVar.f100900W.f100817ax;
        videoPublishEditModel.supportRetake = cVar.f100900W.f100816aw;
        videoPublishEditModel.videoCount = cVar.f100900W.f100810aq;
        videoPublishEditModel.photoCount = cVar.f100900W.f100811ar;
        videoPublishEditModel.pic2VideoSource = cVar.f100900W.f100813at;
        videoPublishEditModel.allowDownloadSetting = cVar.f100900W.f100814au;
        videoPublishEditModel.mUseMusicBeforeEdit = cVar.mo73665c();
        if (cVar.f100900W.f100777aJ != null) {
            videoPublishEditModel.stitchParams = cVar.f100900W.f100777aJ;
        }
        if (cVar.mo73701k()) {
            videoPublishEditModel.mvCreateVideoData = cVar.f100900W.f100753M;
            if (videoPublishEditModel.mvCreateVideoData == null || videoPublishEditModel.mvCreateVideoData.mvType != 1) {
                videoPublishEditModel.videoEditorType = 2;
            } else {
                videoPublishEditModel.videoEditorType = 3;
            }
            videoPublishEditModel.uploadMiscInfoStruct = cVar.f100900W.f100756P;
        } else if (videoPublishEditModel.isStickPointMode) {
            videoPublishEditModel.videoEditorType = 4;
        } else if (videoPublishEditModel.isStitchMode()) {
            videoPublishEditModel.videoEditorType = 7;
        } else if (C71817eu.m126803n(videoPublishEditModel)) {
            videoPublishEditModel.videoEditorType = 10;
        } else if (videoPublishEditModel.isMultiVideoEdit()) {
            videoPublishEditModel.videoEditorType = 6;
        }
        videoPublishEditModel.setMainBusinessData(cVar.f100900W.f100866o);
        videoPublishEditModel.stickerInfo = cVar.f100900W.f100769aB;
        videoPublishEditModel.duetLayout = cVar.f100900W.f100776aI;
        videoPublishEditModel.draftDuetExtraInfo = cVar.f100900W.f100839bl;
        videoPublishEditModel.canvasVideoData = cVar.f100900W.f100842bo;
        videoPublishEditModel.cutSameEditData = cVar.f100900W.f100784aQ;
        if (videoPublishEditModel.isCutSameVideoType()) {
            videoPublishEditModel.uploadMiscInfoStruct = cVar.f100900W.f100756P;
        }
        videoPublishEditModel.mentionTextList = cVar.f100900W.f100833bf;
        videoPublishEditModel.hashTagTextList = cVar.f100900W.f100834bg;
        videoPublishEditModel.isCommerceMusic = cVar.f100900W.f100778aK;
        videoPublishEditModel.cameraLensInfo = cVar.f100900W.f100780aM;
        videoPublishEditModel.isPhotoMvMode = cVar.f100900W.f100781aN;
        videoPublishEditModel.isDuetGreenSrceen = cVar.f100900W.f100782aO;
        videoPublishEditModel.isPhotoMvMusic = cVar.f100900W.f100792aY;
        videoPublishEditModel.isPhotoMvMode1080p = cVar.f100900W.f100793aZ;
        videoPublishEditModel.isDraftMusicIllegal = cVar.f100900W.f100828ba;
        if (TextUtils.isEmpty(cVar.f100900W.f100783aP)) {
            videoPublishEditModel.isSoundLoop = false;
        } else {
            videoPublishEditModel.isSoundLoop = Boolean.valueOf(TextUtils.equals("on", cVar.f100900W.f100783aP));
        }
        C84911q.m145921a("SoundLoop, convertFromDraft " + videoPublishEditModel.isSoundLoop);
        videoPublishEditModel.setCoverPublishModel(cVar.f100900W.f100785aR);
        List<String> list = cVar.f100900W.f100791aX;
        if (!C84892d.m145850a(list)) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            videoPublishEditModel.messageBubbleTexts = arrayList;
        }
        cVar.mo73620a(videoPublishEditModel.audioAecDelayTime);
        videoPublishEditModel.currentZoomValue = cVar.f100900W.f100831bd;
        videoPublishEditModel.mShootedShootMode = cVar.f100900W.f100835bh;
        videoPublishEditModel.allowAutoCaptionSetting = cVar.f100900W.f100838bk;
        videoPublishEditModel.duetFromDuetSticker = cVar.f100900W.f100836bi;
        videoPublishEditModel.mDuetFromDuetButton = cVar.f100900W.f100837bj;
        videoPublishEditModel.publishStage = cVar.f100900W.f100829bb;
        videoPublishEditModel.tagUserList = cVar.f100900W.f100849bv;
        videoPublishEditModel.isAudioEnhance = cVar.f100900W.f100853bz;
        videoPublishEditModel.autoAttachedAnchor = cVar.f100900W.f100850bw;
        videoPublishEditModel.openPlatformExtra = cVar.f100900W.f100851bx;
        videoPublishEditModel.openPlatformClientKey = cVar.f100900W.f100852by;
        videoPublishEditModel.editMusicSyncMode = cVar.f100900W.f100821bA;
        videoPublishEditModel.cut2EditTransferModel = cVar.f100900W.f100822bB;
        videoPublishEditModel.draftSaveTime = cVar.f100887J;
        videoPublishEditModel.sessionId = cVar.f100900W.f100824bD;
        videoPublishEditModel.ttStoryUploadModel = cVar.f100900W.f100825bE;
        videoPublishEditModel.isStoryEditMode = cVar.f100900W.f100827bG;
        return videoPublishEditModel;
    }

    /* renamed from: a */
    private static String m125290a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}

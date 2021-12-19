package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.p036g.C0692e;
import com.bytedance.common.utility.C13607d;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.p936a.C14080a;
import com.bytedance.ies.abmock.C16048b;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27891c;
import com.google.p1998c.p2001c.AbstractC27375ag;
import com.google.p1998c.p2001c.AbstractC27479br;
import com.p2082ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.common.C39053a;
import com.p2082ss.android.ugc.aweme.draft.C43213k;
import com.p2082ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.p2082ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.p2082ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.p2082ss.android.ugc.aweme.infosticker.InfoStickerCategoryParams;
import com.p2082ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.mvtheme.C61288d;
import com.p2082ss.android.ugc.aweme.poi.PoiData;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.property.C65450ef;
import com.p2082ss.android.ugc.aweme.property.C65457el;
import com.p2082ss.android.ugc.aweme.services.video.VideoExposureData;
import com.p2082ss.android.ugc.aweme.sharedar.SharedARModel;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.C71872i;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.p2082ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71521v;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71164e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.EnumC71088d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71413b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71418g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3812e.C70995a;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.BeautyMobParam;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.p2082ss.android.ugc.aweme.shortvideo.model.SocialModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3790ac.C69790a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.HardcodeAdaptiveResult;
import com.p2082ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73838ab;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.aweme.sticker.data.C75309d;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.textsticker.TextStickerChallenges;
import com.p2082ss.android.ugc.aweme.utils.C80357ds;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import dmt.p4542av.video.SingleImageCoverBitmapData;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel */
public class VideoPublishEditModel extends BaseShortVideoContext implements Serializable, Cloneable {
    public static final Parcelable.Creator<VideoPublishEditModel> CREATOR = new Parcelable.Creator<VideoPublishEditModel>() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel.C707841 */

        static {
            Covode.recordClassIndex(83269);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VideoPublishEditModel[] newArray(int i) {
            return new VideoPublishEditModel[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VideoPublishEditModel createFromParcel(Parcel parcel) {
            return new VideoPublishEditModel(parcel);
        }
    };
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private EditPreviewInfo f158511a;
    public String aiMusicLogPbImprId;
    public long audioAecDelayTime;
    public UrlModel audioTrack;
    public C39053a autoAttachedAnchor;
    public boolean autoEnhanceOn;
    public int autoEnhanceType;

    /* renamed from: b */
    private SharedARModel f158512b;
    public int beautyType;

    /* renamed from: c */
    private String f158513c;
    public String cameraIds;
    public ArrayList<String> cameraLensInfo;
    public CanvasVideoData canvasVideoData;
    public transient C75309d captionStruct;
    public String ccVid;
    public long clickGoNextBtnTime;
    public String clientId;
    public int comFrom;
    public CommentVideoModel commentVideoModel;
    public CompileProbeResult compileProbeResult;
    public boolean containBackgroundVideo;
    public ArrayList<Integer> countDownModes;
    public String creationId;
    public CreativeFlowData creativeFlowData;
    public float currentZoomValue;
    public ArrayList<String> customStickerPaths;
    public Cut2EditTransferModel cut2EditTransferModel;

    /* renamed from: d */
    private CoverPublishModel f158514d;
    public DuetExtraInfo draftDuetExtraInfo;
    public boolean draftFromShoot;
    public int draftId;
    public long draftSaveTime;
    public int duetFromDuetSticker;
    public String duetLayout;

    /* renamed from: e */
    private VideoFileInfo f158515e;
    public boolean editMusicSyncMode;
    public String enterFrom;
    public ExtractFramesModel extractFramesModel;

    /* renamed from: f */
    private TextStickerChallenges f158516f;
    public boolean faceBeautyOpen;
    public int fastImportErrorCode;

    /* renamed from: g */
    private final transient C27910f f158517g;
    public int gameScore;
    public ArrayList<GreenScreenMaterial> greenScreenMaterialList;

    /* renamed from: h */
    private transient C71164e f158518h;
    public transient HardcodeAdaptiveResult hardcodeAdaptiveResult;
    public Boolean hasQaSticker;
    public String hotSpotTag;

    /* renamed from: i */
    private int f158519i;
    public ArrayList<ImportVideoInfo> importInfoList;
    public InfoStickerCategoryParams infoStickerCategoryParams;
    public InfoStickerModel infoStickerModel;
    public boolean isAudioEnhance;
    public boolean isBackgroundPublish;
    public boolean isCommerceMusic;
    public boolean isDraftMusicIllegal;
    public boolean isDuetGreenSrceen;
    public boolean isFastImport;
    public boolean isMuted;
    public boolean isOpenForegroundPublish;
    public boolean isOriginalSound;
    public boolean isPhotoMvMode;
    public boolean isPhotoMvMode1080p;
    public boolean isPhotoMvMusic;
    public Boolean isSoundLoop;
    public boolean isStickPointMode;
    public boolean isStoryEditMode;
    public boolean isStoryTextRecord;
    public transient boolean isSyntheticHardEncode;
    public String isWestWindowExistStr;
    @AbstractC27891c(mo46611a = "save_model")

    /* renamed from: j */
    private AVUploadSaveModel f158520j;

    /* renamed from: k */
    private AtomicReference<C65450ef> f158521k;

    /* renamed from: l */
    private int f158522l;
    public LoudnessBalanceParam loudnessBalanceParam;
    public int mAudioRecordIndex;
    public ArrayList<BeautyMetadata> mBeautyMetadatas;
    public BeautyMobParam mBeautyMobParam;
    public String mBindMvId;
    public int mCameraPosition;
    public transient boolean mCropVideo;
    public String mCurFilterIds;
    public String mCurFilterLabels;
    public int mCurMusicLength;
    public String mDesignerIdList;
    public String mDir;
    public User mDuetAuthor;
    public String mDuetFrom;
    public int mDuetFromDuetButton;
    public String mDuetHashTag;
    public boolean mDurationMode;
    public ArrayList<EffectPointModel> mEffectList;
    public String mEncodedAudioOutputFile;
    public String mEyesLabels;
    public int mFaceBeauty;
    public String mFirstStickerMusicIdsJson;
    public boolean mFromCut;
    public boolean mFromMultiCut;
    public int mHardEncode;
    public String mId3Album;
    public String mId3Author;
    public String mId3Title;
    public boolean mIsMultiVideo;
    public int mMusicEnd;
    public String mMusicOrigin;
    public String mMusicPath;
    public int mMusicRecType;
    public int mMusicShowRank;
    public int mMusicStart;
    public int mMusicType;
    public int mOrigin;
    public int mOriginalStickerCount;
    public int mOutVideoHeight;
    public int mOutVideoWidth;
    public String mOutputFile;
    public String mParallelUploadOutputFile;
    public PoiData mPoiData;
    public String mRecordFilterIds;
    public String mRecordFilterLabels;
    public String mRecordFilterValues;
    public int mRecordVideoSelectedFilterIndex;
    public float mRecordVideoSelectedFilterIntensity;
    public String mReshapeLabels;
    public int mRestoreType;
    public String mSelectedFilterId;
    public float mSelectedFilterIntensity;
    public String mSelectedFilterLabel;
    public String mSelectedFilterResId;
    public int mSelectedId;
    public int mShootMode;
    public int mShootedShootMode;
    public C74418d mShoutOutsData;
    public String mSmoothSkinLabels;
    public String mStickerID;
    public String mStickerPath;
    public C70995a mSubtitleMusicChangeChecker;
    public String mTanningLabels;
    public EffectPointModel mTimeEffect;
    public String mUploadPath;
    public int mUseFilter;
    public boolean mUseMusicBeforeEdit;
    public int mVideoCanvasHeight;
    public int mVideoCanvasWidth;
    public float mVideoCoverStartTm;
    public String mVideoSegmentsDesc;
    public int mWatermarkVideoHeight;
    public int mWatermarkVideoWidth;
    public boolean mWillGoOnShortVideo;
    public transient Workspace mWorkspace;
    public long maxDuration;
    public String md5;
    public int mentionEditTextLength;
    public ExtraMentionUserModel mentionUserModel;
    public Map<String, Object> metadataMap;
    public String microAppId;
    public C71518t microAppModel;
    public MultiEditVideoStatusRecordData multiEditVideoRecordData;
    public String musicId;
    public int musicUsageConfirmation;
    public float musicVolume;
    public C61288d mvCreateVideoData;
    public boolean needAddCommentSticker;
    public boolean needAddQaSticker;
    public String newDraftId;
    public String openPlatformClientKey;
    public String openPlatformExtra;
    public int photoCount;
    public String pic2VideoSource;
    public float previewStartTime;
    public List<String> publishDuetMentionedUserList;
    public int publishStage;
    public QaStruct qaStruct;
    public ReactionParams reactionParams;
    public int recordBgmDelay;
    public int recordMode;
    public C71418g replaceMusicModel;
    public int screenBrightness;
    public UrlModel sendToUserHead;
    public String sentenceId;
    public String sessionId;
    public String shareId;
    public String shootEnterMethod;
    public String shopDraftId;
    public SingleImageCoverBitmapData singleImageCoverBitmapData;
    public String smartCompileLabel;
    public SocialModel socialModel;
    public long startTime;
    public C69790a stickPointData;
    public StickerChallenge stickerChallenge;
    public StitchParams stitchParams;
    public StoryEditEtParam storyEditEtParam;
    public boolean successEnableAEC;
    public boolean supportRetake;
    public ArrayList<InteractionTagUserInfo> tagUserList;
    public String textEffectIds;
    public String textTypes;
    public List<String> texts;
    public TTStoryUploadModel ttStoryUploadModel;
    public C71872i uploadMiscInfoStruct;
    public UploadSpeedInfo uploadSpeedInfo;
    public boolean usePaint;
    public AudioEffectParam veAudioEffectParam;
    public AudioRecorderParam veAudioRecorderParam;
    public ClientCherEffectParam veCherEffectParam;
    public int videoCount;
    public int videoDurationFromVideoCutPage;
    public int videoEditorType;
    public String videoSpeed;
    public int videoType;
    public float voiceVolume;

    /* renamed from: com_ss_android_ugc_aweme_shortvideo_edit_VideoPublishEditModel_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m125069xc4a7b3f3(String str, String str2) {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext
    public int describeContents() {
        return 0;
    }

    public String getFxName() {
        return null;
    }

    public String getBindMvId() {
        return this.mBindMvId;
    }

    public int getCamera() {
        return this.mCameraPosition;
    }

    public String getCameraIds() {
        return this.cameraIds;
    }

    public String getCity() {
        return this.city;
    }

    public User getDuetAuthor() {
        return this.mDuetAuthor;
    }

    public String getDuetFrom() {
        return this.mDuetFrom;
    }

    public String getDuetHashTag() {
        return this.mDuetHashTag;
    }

    public String getEnterFrom() {
        return this.enterFrom;
    }

    public String getFilterIds() {
        return this.mCurFilterIds;
    }

    public int getFilterIndex() {
        return this.mSelectedId;
    }

    public String getFilterName() {
        return this.mCurFilterLabels;
    }

    public String getMicroAppId() {
        return this.microAppId;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public int getNewVersion() {
        return this.f158519i;
    }

    public int getOriginal() {
        return this.mOrigin;
    }

    public VideoFileInfo getOriginalVideoInfo() {
        return this.f158515e;
    }

    public String getOutputFile() {
        return this.mOutputFile;
    }

    public int getPrettify() {
        return this.mFaceBeauty;
    }

    public EditPreviewInfo getPreviewInfo() {
        return this.f158511a;
    }

    public ReactionParams getReactionParams() {
        return this.reactionParams;
    }

    public AVUploadSaveModel getSaveModel() {
        return this.f158520j;
    }

    public UrlModel getSendToUserHead() {
        return this.sendToUserHead;
    }

    public SharedARModel getSharedARModel() {
        return this.f158512b;
    }

    public String getSpeed() {
        return this.videoSpeed;
    }

    public int getStickPointType() {
        return this.f158522l;
    }

    public String getStickers() {
        return this.mStickerID;
    }

    public StitchParams getStitchParams() {
        return this.stitchParams;
    }

    public List<AVTextExtraStruct> getStructList() {
        return this.structList;
    }

    public String getSyncPlatforms() {
        return this.mSyncPlatforms;
    }

    public String getTagId() {
        return this.tagId;
    }

    public ArrayList<InteractionTagUserInfo> getTagUserList() {
        return this.tagUserList;
    }

    public TextStickerChallenges getTextStickerChallenges() {
        return this.f158516f;
    }

    public String getTitle() {
        return this.title;
    }

    public String getVideoCoverPath() {
        return this.f158513c;
    }

    public boolean isCommercialMusic() {
        return this.isCommerceMusic;
    }

    public boolean isOriginalSound() {
        return this.isOriginalSound;
    }

    public int isPrivate() {
        return this.isPrivate;
    }

    public String draftDir() {
        return uniqueVideoSessionDir(C70638dj.f158103f);
    }

    public String getEditFilterId() {
        String str = this.mSelectedFilterId;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getEditFilterName() {
        String str = this.mSelectedFilterLabel;
        if (str == null) {
            return "";
        }
        return str;
    }

    public Float getPreviewStartTime() {
        return Float.valueOf(this.previewStartTime);
    }

    public boolean isCommentReply() {
        return CommentUtils.isDataValid(this.commentVideoModel);
    }

    public boolean isCutSameVideoType() {
        if (this.cutSameEditData != null) {
            return true;
        }
        return false;
    }

    public int isMusic() {
        if (this.mMusicPath == null) {
            return 0;
        }
        return 1;
    }

    public boolean isPoi() {
        if (this.mPoiData != null) {
            return true;
        }
        return false;
    }

    public boolean isShoutout() {
        if (this.mShoutOutsData != null) {
            return true;
        }
        return false;
    }

    public boolean isUploadVideo() {
        if (this.mOrigin == 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(83268);
    }

    public CoverPublishModel getCoverPublishModel() {
        if (this.f158514d == null) {
            this.f158514d = new CoverPublishModel();
        }
        return this.f158514d;
    }

    public MultiEditVideoRecordData getCurMultiEditVideoRecordData() {
        if (!isMultiVideoEdit()) {
            return null;
        }
        return this.multiEditVideoRecordData.curMultiEditVideoRecordData;
    }

    public String getEditStickerIds() {
        InfoStickerModel infoStickerModel2 = this.infoStickerModel;
        if (infoStickerModel2 == null) {
            return "";
        }
        return infoStickerModel2.getInfoStickerIds();
    }

    public int getEffect() {
        EffectPointModel effectPointModel = this.mTimeEffect;
        if (effectPointModel == null) {
            return 0;
        }
        return Integer.parseInt(effectPointModel.getKey());
    }

    public int getFrom() {
        if (this.mFromCut) {
            return 0;
        }
        if (this.mFromMultiCut) {
            return 1;
        }
        return 3;
    }

    public int getImportVideoCount() {
        ArrayList<ImportVideoInfo> arrayList = this.importInfoList;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public String getLocalFinalPath() {
        AVUploadSaveModel aVUploadSaveModel = this.f158520j;
        if (aVUploadSaveModel == null) {
            return null;
        }
        return aVUploadSaveModel.getLocalFinalPath();
    }

    public String getLocalTempPath() {
        AVUploadSaveModel aVUploadSaveModel = this.f158520j;
        if (aVUploadSaveModel == null) {
            return null;
        }
        return aVUploadSaveModel.getLocalTempPath();
    }

    public long getMultiEditVideoStartTime() {
        if (!isMultiVideoEdit()) {
            return 0;
        }
        return getCurMultiEditVideoRecordData().startTime;
    }

    public String getMusicOrigin() {
        if (TextUtils.isEmpty(this.mMusicOrigin)) {
            return "original";
        }
        return this.mMusicOrigin;
    }

    public C69905c getOriginalRecordMusic() {
        if (!isMultiVideoEdit()) {
            return null;
        }
        return this.multiEditVideoRecordData.recordMusic;
    }

    public int getSpecialPoints() {
        EffectPointModel effectPointModel = this.mTimeEffect;
        if (effectPointModel == null) {
            return 0;
        }
        return effectPointModel.getEndPoint();
    }

    public int getTimeEffectStartPoint() {
        EffectPointModel effectPointModel = this.mTimeEffect;
        if (effectPointModel == null) {
            return 0;
        }
        return effectPointModel.getStartPoint();
    }

    public String getValidVideoCoverPath() {
        if (C84902i.m145892a(this.f158513c)) {
            return this.f158513c;
        }
        return null;
    }

    public boolean hasInfoStickers() {
        InfoStickerModel infoStickerModel2 = this.infoStickerModel;
        if (infoStickerModel2 == null || !C13617h.m24466b(infoStickerModel2.stickers)) {
            return false;
        }
        return true;
    }

    public boolean hasNotAudioRecord() {
        AudioRecorderParam audioRecorderParam = this.veAudioRecorderParam;
        if (audioRecorderParam == null || !audioRecorderParam.hasRecord()) {
            return true;
        }
        return false;
    }

    public boolean hasOriginalSound() {
        if (getWavFile() != null) {
            return true;
        }
        return false;
    }

    public boolean hasRecord() {
        AudioRecorderParam audioRecorderParam = this.veAudioRecorderParam;
        if (audioRecorderParam == null || !audioRecorderParam.hasRecord()) {
            return false;
        }
        return true;
    }

    public boolean hasRetake() {
        if (!isMultiVideoEdit()) {
            return false;
        }
        return this.multiEditVideoRecordData.curMultiEditVideoRecordData.hasRetake;
    }

    public boolean hasUploadFrameConditionInRecord() {
        if (!TextUtils.isEmpty(this.mStickerID)) {
            return true;
        }
        return false;
    }

    public boolean isAllowClearMusic() {
        if (this.isPhotoMvMode || !isMvThemeVideoType()) {
            return true;
        }
        return false;
    }

    public boolean isDisableOriginalSound() {
        AudioRecorderParam audioRecorderParam = this.veAudioRecorderParam;
        if (audioRecorderParam == null || audioRecorderParam.getNeedOriginalSound()) {
            return false;
        }
        return true;
    }

    public boolean isDuet() {
        if (!TextUtils.isEmpty(getDuetFrom())) {
            return true;
        }
        return false;
    }

    public boolean isFromCrash() {
        if (this.publishStage == 50) {
            return true;
        }
        return false;
    }

    public boolean isMediaFromGallery() {
        return TextUtils.equals(getAvetParameter().getContentSource(), "upload");
    }

    public boolean isMvThemeVideoType() {
        if (this.mvCreateVideoData == null) {
            return false;
        }
        int i = this.videoEditorType;
        if (i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    public boolean isSaveLocal() {
        AVUploadSaveModel aVUploadSaveModel = this.f158520j;
        if (aVUploadSaveModel == null || !aVUploadSaveModel.isSaveLocal()) {
            return false;
        }
        return true;
    }

    public boolean isSaveLocalWithWaterMark() {
        AVUploadSaveModel aVUploadSaveModel = this.f158520j;
        if (aVUploadSaveModel == null || !aVUploadSaveModel.isSaveLocalWithWaterMark()) {
            return false;
        }
        return true;
    }

    public boolean isSaveLocalWithoutWaterMark() {
        AVUploadSaveModel aVUploadSaveModel = this.f158520j;
        if (aVUploadSaveModel == null || aVUploadSaveModel.isWaterMark()) {
            return false;
        }
        return true;
    }

    public boolean isSaveToAlbum() {
        AVUploadSaveModel aVUploadSaveModel = this.f158520j;
        if (aVUploadSaveModel == null || !aVUploadSaveModel.getSaveToAlbum()) {
            return false;
        }
        return true;
    }

    public boolean isSaveToLocalPathInsteadOfAlbum() {
        AVUploadSaveModel aVUploadSaveModel = this.f158520j;
        if (aVUploadSaveModel == null || !aVUploadSaveModel.isSaveToAppPathInsteadOfAlbum()) {
            return false;
        }
        return true;
    }

    public boolean isStitchMode() {
        if (getStitchParams() != null) {
            return true;
        }
        return false;
    }

    public boolean isTemplateMv() {
        if (!isMvThemeVideoType() || this.isPhotoMvMode) {
            return false;
        }
        return true;
    }

    public boolean isUseMultiEdit() {
        if (!isMultiVideoEdit()) {
            return false;
        }
        return this.multiEditVideoRecordData.isUseMultiEdit;
    }

    public void resetVolume() {
        if (this.isFastImport || realHasOriginalSound()) {
            this.voiceVolume = 1.0f;
        }
    }

    public void setUseMultiEdit() {
        if (isMultiVideoEdit()) {
            this.multiEditVideoRecordData.isUseMultiEdit = true;
        }
    }

    public boolean shouldUploadExtractFrames() {
        if (hasUploadFrameConditionInRecord() || hasUploadFrameConditionInEdit()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public VideoPublishEditModel clone() {
        Parcel obtain = Parcel.obtain();
        obtain.writeValue(this);
        obtain.setDataPosition(0);
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obtain.readValue(VideoPublishEditModel.class.getClassLoader());
        obtain.recycle();
        return videoPublishEditModel;
    }

    public String audioPath() {
        if (getPreviewInfo() == null) {
            return null;
        }
        return getPreviewInfo().getVideoList().get(0).getAudioPath();
    }

    public boolean duetFilesExist() {
        if (!C84902i.m145892a(this.draftDuetExtraInfo.getDuetAudioPath()) || !C84902i.m145892a(this.draftDuetExtraInfo.getDuetVideoPath())) {
            return false;
        }
        return true;
    }

    public void generateVideoCoverPath() {
        if (TextUtils.isEmpty(this.f158513c) || !new File(this.f158513c).exists()) {
            this.f158513c = C71521v.C71522a.m126402a();
        }
    }

    public String getDescriptionByUpload() {
        if (C13617h.m24466b(this.importInfoList)) {
            return this.importInfoList.get(0).getDescription();
        }
        return "";
    }

    public ArrayList<TimeSpeedModelExtension> getFinalVideoList() {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData == null || !C13617h.m24466b(multiEditVideoStatusRecordData.editCutSegments)) {
            return CameraComponentModel.m123137a(this.mVideoSegmentsDesc);
        }
        return this.multiEditVideoRecordData.editCutSegments;
    }

    public C71164e getMainBusinessContext() {
        C71164e eVar = this.f158518h;
        if (eVar != null) {
            return eVar;
        }
        String mainBusinessData = super.getMainBusinessData();
        if (mainBusinessData != null) {
            try {
                this.f158518h = (C71164e) this.f158517g.mo46670a(mainBusinessData, C71164e.class);
            } catch (Exception unused) {
                return null;
            }
        }
        return this.f158518h;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext
    public String getMainBusinessData() {
        C71164e eVar;
        String mainBusinessData = super.getMainBusinessData();
        if (mainBusinessData != null || (eVar = this.f158518h) == null) {
            return mainBusinessData;
        }
        String b = this.f158517g.mo46674b(eVar);
        super.setMainBusinessData(b);
        return b;
    }

    public String getMusicIdByUpload() {
        if (C13617h.m24466b(this.importInfoList)) {
            return this.importInfoList.get(0).getMusicId();
        }
        return "";
    }

    public Integer getUploadSpeedSettingsIndex() {
        Integer num;
        C65450ef uploadSpeedEncodeSettings = getUploadSpeedEncodeSettings();
        if (uploadSpeedEncodeSettings == null || !uploadSpeedEncodeSettings.f147622b) {
            num = null;
        } else {
            num = Integer.valueOf(uploadSpeedEncodeSettings.f147621a);
        }
        C84911q.m145928d("UploadSpeeds , settingsIndex : ".concat(String.valueOf(num)));
        return num;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext
    public int getVideoLength() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        return getPreviewInfo().getPreviewVideoLength();
    }

    public String getVideoResolution() {
        return videoWidth() + "*" + videoHeight();
    }

    public String getWavFile() {
        if (audioPath() != null && new File(audioPath()).exists()) {
            return audioPath();
        }
        return null;
    }

    public boolean hasSubtitle() {
        C71164e mainBusinessContext = getMainBusinessContext();
        if (mainBusinessContext == null || C13603b.m24435a((Collection) C71073b.m125565a(mainBusinessContext, 11, EnumC71088d.TRACK_PAGE_EDIT))) {
            return false;
        }
        return true;
    }

    public boolean hasUploadFrameConditionInEdit() {
        ArrayList<EffectPointModel> arrayList = this.mEffectList;
        if ((arrayList == null || arrayList.isEmpty()) && !hasStickers()) {
            return false;
        }
        return true;
    }

    public boolean isPreviewInfoValid() {
        if (getPreviewInfo() != null && !getPreviewInfo().getVideoList().isEmpty()) {
            return true;
        }
        C84911q.m145926b("EditPreviewInfo in VideoPublishEditModel is null");
        return false;
    }

    public boolean isQaAnswer() {
        QaStruct qaStruct2 = this.qaStruct;
        if (qaStruct2 == null || qaStruct2.getQuestionId() == 0) {
            return false;
        }
        return true;
    }

    public boolean isReaction() {
        if (getReactionParams() == null || TextUtils.isEmpty(getReactionParams().reactionFromId)) {
            return false;
        }
        return true;
    }

    public boolean isRetakeVideo() {
        if (isMultiVideoEdit() && this.multiEditVideoRecordData.restoreMultiEditVideoRecordData != null && this.multiEditVideoRecordData.isMultiEditRetake) {
            return true;
        }
        return false;
    }

    public boolean isReverse() {
        EffectPointModel effectPointModel = this.mTimeEffect;
        if (effectPointModel == null || !"1".equals(effectPointModel.getKey())) {
            return false;
        }
        return true;
    }

    public boolean isUseTimeReverseEffect() {
        EffectPointModel effectPointModel = this.mTimeEffect;
        if (effectPointModel == null || !effectPointModel.getKey().equals("1")) {
            return false;
        }
        return true;
    }

    public boolean notUseCanvasSize() {
        if (videoWidth() <= videoHeight() || getCoverPublishModel().getNeedExpandCompiledSize()) {
            return false;
        }
        return true;
    }

    public String reverseVideoPath() {
        if (getPreviewInfo() == null) {
            return null;
        }
        return getPreviewInfo().reverseVideo();
    }

    public int segmentCounts() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        return getPreviewInfo().getVideoList().size();
    }

    public int sourceVideoHeight() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        return C71413b.m126122b(getPreviewInfo(), this.isFastImport);
    }

    public int sourceVideoWidth() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        return C71413b.m126112a(getPreviewInfo(), this.isFastImport);
    }

    public int videoFps() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        return C71413b.m126111a(getPreviewInfo());
    }

    public int videoHeight() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        return C71413b.m126123b(getPreviewInfo(), this.isFastImport, isStitchMode(), m125068c());
    }

    public String videoPath() {
        if (getPreviewInfo() == null) {
            return "";
        }
        return getPreviewInfo().getVideoList().get(0).getVideoPath();
    }

    public int videoWidth() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        return C71413b.m126113a(getPreviewInfo(), this.isFastImport, isStitchMode(), m125068c());
    }

    /* renamed from: c */
    private boolean m125068c() {
        if (!isUploadVideo() && !isDuet() && !isReaction() && !isStitchMode() && getSharedARModel() == null) {
            return isMultiVideoEdit();
        }
        return false;
    }

    public void copyMultiEditMusicInfo() {
        if (isMultiVideoEdit()) {
            getCurMultiEditVideoRecordData().musicPath = this.mMusicPath;
            getCurMultiEditVideoRecordData().musicVolume = this.musicVolume;
            getCurMultiEditVideoRecordData().originVolume = this.voiceVolume;
            getCurMultiEditVideoRecordData().musicTrimIn = this.mMusicStart;
        }
    }

    public String getContactAudioPathAsKey() {
        if (isMultiVideoEdit()) {
            String str = this.multiEditVideoRecordData.curMultiEditVideoRecordData.concatAudio;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        } else {
            StitchParams stitchParams2 = this.stitchParams;
            if (stitchParams2 != null && !TextUtils.isEmpty(stitchParams2.getConcatAudioPath())) {
                return this.stitchParams.getConcatAudioPath();
            }
        }
        return audioPath();
    }

    public String getContactVideoPathAsKey() {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData == null || multiEditVideoStatusRecordData.curMultiEditVideoRecordData == null) {
            StitchParams stitchParams2 = this.stitchParams;
            if (!(stitchParams2 == null || stitchParams2.getConcatVideoPath() == null || TextUtils.isEmpty(this.stitchParams.getConcatVideoPath()))) {
                return this.stitchParams.getConcatVideoPath();
            }
        } else {
            String str = this.multiEditVideoRecordData.curMultiEditVideoRecordData.concatVideo;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return videoPath();
    }

    public int[] getRecordVideoSize() {
        return new int[]{C71413b.m126113a(getPreviewInfo(), this.isFastImport, isStitchMode(), false), C71413b.m126123b(getPreviewInfo(), this.isFastImport, isStitchMode(), false)};
    }

    public boolean hasImageStickers() {
        if (hasInfoStickers()) {
            for (StickerItemModel stickerItemModel : this.infoStickerModel.stickers) {
                if (stickerItemModel.type == 11) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasOriginalAudio() {
        if ((!this.isFastImport && !isCutSameVideoType() && !realHasOriginalSound()) || this.isMuted) {
            return false;
        }
        if (isStitchMode()) {
            StitchParams stitchParams2 = this.stitchParams;
            if (stitchParams2 != null) {
                return stitchParams2.getEnableMic();
            }
            return true;
        } else if (this.isStickPointMode) {
            return false;
        } else {
            return true;
        }
    }

    public boolean hasReadTextAudio() {
        SimpleTextStickerData simpleTextStickerData;
        if (!hasInfoStickers()) {
            return false;
        }
        for (StickerItemModel stickerItemModel : this.infoStickerModel.stickers) {
            if (stickerItemModel != null && stickerItemModel.isTextSticker() && (simpleTextStickerData = (SimpleTextStickerData) C63244g.m114602a().mo73261G().mo46670a(stickerItemModel.extra, SimpleTextStickerData.class)) != null && simpleTextStickerData.getHasReadTextAudio()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasText() {
        InfoStickerModel infoStickerModel2 = this.infoStickerModel;
        if (infoStickerModel2 == null || C13603b.m24435a((Collection) infoStickerModel2.stickers)) {
            return false;
        }
        for (StickerItemModel stickerItemModel : this.infoStickerModel.stickers) {
            if (stickerItemModel.type == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean hasTextSticker() {
        if (!hasInfoStickers()) {
            return false;
        }
        for (StickerItemModel stickerItemModel : this.infoStickerModel.stickers) {
            if (stickerItemModel != null && stickerItemModel.isTextSticker()) {
                return true;
            }
        }
        return false;
    }

    public boolean isMultiVideoEditFeature() {
        if (!isMultiVideoEdit() || this.f158512b != null || isDuet() || isReaction() || isStitchMode() || this.containBackgroundVideo || !this.supportRetake) {
            return false;
        }
        return true;
    }

    public boolean isTimeEffectApply() {
        EffectPointModel effectPointModel = this.mTimeEffect;
        if (effectPointModel == null) {
            return false;
        }
        String key = effectPointModel.getKey();
        if (TextUtils.equals("1", key) || TextUtils.equals("2", key) || TextUtils.equals("3", key)) {
            return true;
        }
        return false;
    }

    public boolean realHasOriginalSound() {
        EditPreviewInfo previewInfo = getPreviewInfo();
        if (previewInfo == null) {
            return false;
        }
        for (EditVideoSegment editVideoSegment : previewInfo.getVideoList()) {
            if (editVideoSegment.getAudioPath() != null && new File(editVideoSegment.getAudioPath()).exists()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private String m125067b() {
        AbstractC27479br it = AbstractC27375ag.copyOf(this.infoStickerModel.stickers).iterator();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        while (it.hasNext()) {
            StickerItemModel stickerItemModel = (StickerItemModel) it.next();
            if (!TextUtils.isEmpty(stickerItemModel.stickerId) && stickerItemModel.type != 2) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                if (!TextUtils.isEmpty(stickerItemModel.tabId)) {
                    sb.append(stickerItemModel.tabId);
                } else if (this.infoStickerCategoryParams.getInfoStickerCategoryMap().containsKey(stickerItemModel.stickerId)) {
                    sb.append(this.infoStickerCategoryParams.getInfoStickerCategoryMap().get(stickerItemModel.stickerId));
                } else if (stickerItemModel.type == 10) {
                    sb.append("giphy");
                }
            }
        }
        return sb.toString();
    }

    public ArrayList<TimeSpeedModelExtension> deepCopyFinalVideoList() {
        ArrayList<TimeSpeedModelExtension> finalVideoList = getFinalVideoList();
        ArrayList<TimeSpeedModelExtension> arrayList = new ArrayList<>();
        if (!C84904k.m145909a(finalVideoList)) {
            Iterator<TimeSpeedModelExtension> it = finalVideoList.iterator();
            while (it.hasNext()) {
                TimeSpeedModelExtension next = it.next();
                TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) C14080a.m25675a(next);
                if (Build.VERSION.SDK_INT >= 26) {
                    timeSpeedModelExtension.recordExtras = next.getRecordExtras().deepCopy();
                } else {
                    timeSpeedModelExtension.recordExtras = GreenScreenMaterial.bytesToBundle(GreenScreenMaterial.bundleToBytes(next.recordExtras));
                }
                arrayList.add(timeSpeedModelExtension);
            }
        }
        return arrayList;
    }

    public String formatCameraLensInfo() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.cameraLensInfo.size(); i++) {
            String[] split = this.cameraLensInfo.get(i).split(":");
            for (String str : split) {
                if (!str.isEmpty()) {
                    hashSet.add(Integer.valueOf(str));
                }
            }
        }
        if (hashSet.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            sb.append(arrayList.get(i2));
            if (i2 != arrayList.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0015 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getDuetLayoutLogMode() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.draft.model.DuetExtraInfo r0 = r3.draftDuetExtraInfo
            r2 = 0
            if (r0 != 0) goto L_0x0006
            return r2
        L_0x0006:
            java.lang.String r1 = r0.getDuetLayoutMode()
            r1.hashCode()
            r0 = -1
            int r0 = r1.hashCode()
            switch(r0) {
                case -1984141450: goto L_0x0031;
                case 346401221: goto L_0x0028;
                case 1387629604: goto L_0x001f;
                case 1415681320: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            return r2
        L_0x0016:
            java.lang.String r0 = "green_screen"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x003a
            goto L_0x0015
        L_0x001f:
            java.lang.String r0 = "horizontal"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x003d
            goto L_0x0015
        L_0x0028:
            java.lang.String r0 = "picture_in_picture"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0040
            goto L_0x0015
        L_0x0031:
            java.lang.String r0 = "vertical"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0043
            goto L_0x0015
        L_0x003a:
            java.lang.String r0 = "2"
            return r0
        L_0x003d:
            java.lang.String r0 = "1"
            return r0
        L_0x0040:
            java.lang.String r0 = "3"
            return r0
        L_0x0043:
            java.lang.String r0 = "4"
            return r0
            switch-data {-1984141450->0x0031, 346401221->0x0028, 1387629604->0x001f, 1415681320->0x0016, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel.getDuetLayoutLogMode():java.lang.String");
    }

    public String getEditEffectList() {
        if (C13617h.m24465a(this.mEffectList)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(this.mEffectList.get(0).getKey());
        for (int i = 1; i < this.mEffectList.size(); i++) {
            sb.append(",").append(this.mEffectList.get(i).getKey());
        }
        return sb.toString();
    }

    public String getEditEffectListWithOutZero() {
        String str = "";
        if (C13617h.m24465a(this.mEffectList)) {
            return str;
        }
        String key = this.mEffectList.get(0).getKey();
        if (!key.equals("0")) {
            str = key;
        }
        StringBuilder sb = new StringBuilder(str);
        for (int i = 1; i < this.mEffectList.size(); i++) {
            if (!this.mEffectList.get(i).getKey().equals("0")) {
                sb.append(",").append(this.mEffectList.get(i).getKey());
            }
        }
        return sb.toString();
    }

    public String getInfoStickerList() {
        String str;
        F f = C71073b.m125572c(getMainBusinessContext()).f2750a;
        InfoStickerModel infoStickerModel2 = this.infoStickerModel;
        if (infoStickerModel2 == null || C13617h.m24465a(infoStickerModel2.stickers)) {
            return f;
        }
        if (!TextUtils.isEmpty(f)) {
            str = ",".concat(String.valueOf(f));
        } else {
            str = "";
        }
        return this.infoStickerModel.getNotEmptyInfoStickerIds() + str;
    }

    public List<MediaModel> getMediaModelList() {
        ArrayList arrayList = new ArrayList();
        if (getPreviewInfo() != null) {
            for (EditVideoSegment editVideoSegment : getPreviewInfo().getVideoList()) {
                boolean z = this.isFastImport;
                C89219l.m154721d(editVideoSegment, "");
                MediaModel mediaModel = new MediaModel(-1);
                mediaModel.f134662b = editVideoSegment.getVideoPath();
                mediaModel.f134672l = editVideoSegment.getVideoFileInfo().getWidth();
                mediaModel.f134673m = editVideoSegment.getVideoFileInfo().getHeight();
                mediaModel.f134668h = editVideoSegment.getVideoFileInfo().getDuration();
                if (z && editVideoSegment.getVideoCutInfo() != null) {
                    VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                    if (videoCutInfo == null) {
                        C89219l.m154715b();
                    }
                    mediaModel.f134679s = videoCutInfo.getSpeed();
                }
                arrayList.add(mediaModel);
            }
        }
        return arrayList;
    }

    public List<Integer> getVideoRotateArray() {
        if (getPreviewInfo() == null) {
            return Collections.singletonList(0);
        }
        ArrayList arrayList = new ArrayList();
        for (EditVideoSegment editVideoSegment : getPreviewInfo().getVideoList()) {
            if (editVideoSegment.getVideoCutInfo() != null) {
                arrayList.add(Integer.valueOf(editVideoSegment.getVideoCutInfo().getRotate()));
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(0);
        }
        return arrayList;
    }

    public boolean hasStickers() {
        List<InteractStickerStruct> list;
        List<InteractStickerStruct> list2;
        List<InteractStickerStruct> list3;
        C71164e mainBusinessContext = getMainBusinessContext();
        List<InteractStickerStruct> list4 = null;
        if (mainBusinessContext != null) {
            list4 = C71073b.m125565a(mainBusinessContext, 1, EnumC71088d.TRACK_PAGE_EDIT);
            list2 = C71073b.m125565a(mainBusinessContext, 10, EnumC71088d.TRACK_PAGE_EDIT);
            list3 = C71073b.m125565a(mainBusinessContext, 16, EnumC71088d.TRACK_PAGE_EDIT);
            list = C71073b.m125565a(mainBusinessContext, 11, EnumC71088d.TRACK_PAGE_EDIT);
        } else {
            list = null;
            list2 = null;
            list3 = null;
        }
        if (hasInfoStickers() || ((list4 != null && !list4.isEmpty() && list4.get(0).getPollStruct() != null) || ((list2 != null && !list2.isEmpty() && list2.get(0).getCountDownStickerStruct() != null) || ((list3 != null && list3.get(0).getDuetStickerStruct() != null) || (!C13603b.m24435a((Collection) list) && list.get(0).getCaptionStruct() != null))))) {
            return true;
        }
        return false;
    }

    public boolean isChangeMultiEditData() {
        if (!isMultiVideoEdit() || this.multiEditVideoRecordData.originMultiEditRecordData == null) {
            return false;
        }
        Pair<Integer, Integer> playInOutTime = getCurMultiEditVideoRecordData().getPlayInOutTime();
        Pair<Integer, Integer> playInOutTime2 = this.multiEditVideoRecordData.originMultiEditRecordData.getPlayInOutTime();
        if (((Integer) playInOutTime.first).equals(playInOutTime2.first) && ((Integer) playInOutTime.second).equals(playInOutTime2.second) && getCurMultiEditVideoRecordData().isEqual(this.multiEditVideoRecordData.originMultiEditRecordData)) {
            return false;
        }
        return true;
    }

    public boolean isMultiVideoEdit() {
        boolean z;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        if (C71817eu.m126801l(this)) {
            return C71817eu.m126802m(this);
        }
        if (this.mIsFromDraft) {
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = this.multiEditVideoRecordData;
            if (multiEditVideoStatusRecordData2 == null || !multiEditVideoStatusRecordData2.isSupportMultiEdit || this.multiEditVideoRecordData.curMultiEditVideoRecordData == null) {
                return false;
            }
            return true;
        } else if (isStitchMode()) {
            return false;
        } else {
            if (isMvThemeVideoType() || this.mFromCut || this.mFromMultiCut) {
                z = false;
            } else {
                z = true;
            }
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData3 = this.multiEditVideoRecordData;
            if (multiEditVideoStatusRecordData3 != null) {
                multiEditVideoStatusRecordData3.isSupportMultiEdit = z;
            }
            if (!z || (multiEditVideoStatusRecordData = this.multiEditVideoRecordData) == null || multiEditVideoStatusRecordData.curMultiEditVideoRecordData == null) {
                return false;
            }
            return true;
        }
    }

    public void setMultiEditBeautyMetadatas() {
        if (isMultiVideoEdit() && !C84904k.m145909a(this.multiEditVideoRecordData.editSegments)) {
            ArrayList arrayList = new ArrayList();
            Iterator<TimeSpeedModelExtension> it = this.multiEditVideoRecordData.editSegments.iterator();
            while (it.hasNext()) {
                TimeSpeedModelExtension next = it.next();
                if (!(next == null || next.getBeautyMetadata() == null)) {
                    arrayList.add(next.getBeautyMetadata());
                }
            }
            if (!C84904k.m145909a(arrayList)) {
                this.mBeautyMetadatas.clear();
                this.mBeautyMetadatas.addAll(arrayList);
            }
        }
    }

    public void setMultiEditCameraLensInfo() {
        if (isMultiVideoEdit() && !C84904k.m145909a(this.multiEditVideoRecordData.editSegments)) {
            ArrayList arrayList = new ArrayList();
            Iterator<TimeSpeedModelExtension> it = this.multiEditVideoRecordData.editSegments.iterator();
            while (it.hasNext()) {
                TimeSpeedModelExtension next = it.next();
                if (!(next == null || next.getCameraLensInfo() == null)) {
                    arrayList.add(next.getCameraLensInfo());
                }
            }
            if (!C84904k.m145909a(arrayList)) {
                this.cameraLensInfo.clear();
                this.cameraLensInfo.addAll(arrayList);
            }
        }
    }

    public void setMultiEditStickIds() {
        if (isMultiVideoEdit() && this.multiEditVideoRecordData.editSegments != null && !this.multiEditVideoRecordData.editSegments.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Iterator<TimeSpeedModelExtension> it = this.multiEditVideoRecordData.editSegments.iterator();
            while (it.hasNext()) {
                TimeSpeedModelExtension next = it.next();
                if (next != null && !TextUtils.isEmpty(next.getStickerId())) {
                    sb.append(next.getStickerId() + ",");
                }
            }
            this.mStickerID = sb.toString();
        }
    }

    public VideoPublishEditModel() {
        this.creativeFlowData = new CreativeFlowData();
        this.mAudioRecordIndex = -1;
        this.clickGoNextBtnTime = -1;
        this.aiMusicLogPbImprId = "";
        this.comFrom = 0;
        this.hasQaSticker = false;
        this.mentionEditTextLength = -1;
        this.mDesignerIdList = "";
        this.mOriginalStickerCount = 0;
        this.videoEditorType = 0;
        this.mCropVideo = false;
        this.mBeautyMetadatas = new ArrayList<>();
        this.needAddQaSticker = false;
        this.needAddCommentSticker = false;
        this.isAudioEnhance = false;
        this.mSelectedFilterIntensity = -1.0f;
        this.mRecordVideoSelectedFilterIntensity = -1.0f;
        this.mEffectList = new ArrayList<>();
        this.importInfoList = new ArrayList<>();
        this.clientId = "";
        this.mDuetFrom = "";
        this.loudnessBalanceParam = new LoudnessBalanceParam();
        this.publishStage = 0;
        this.mShootedShootMode = -1;
        this.newDraftId = "";
        this.publishDuetMentionedUserList = new ArrayList();
        this.isMuted = false;
        this.infoStickerCategoryParams = new InfoStickerCategoryParams();
        this.greenScreenMaterialList = new ArrayList<>();
        this.draftFromShoot = false;
        this.customStickerPaths = new ArrayList<>();
        this.videoDurationFromVideoCutPage = -1;
        this.isStoryEditMode = false;
        this.isWestWindowExistStr = "";
        this.shootEnterMethod = "";
        this.f158516f = new TextStickerChallenges();
        this.editMusicSyncMode = false;
        this.mSubtitleMusicChangeChecker = new C70995a();
        this.f158517g = new C27910f();
        this.isDuetGreenSrceen = false;
        this.uploadSpeedInfo = new UploadSpeedInfo();
        this.f158521k = new AtomicReference<>(null);
        this.f158522l = 0;
        this.isSoundLoop = false;
        this.textTypes = "";
        this.textEffectIds = "";
        this.pic2VideoSource = "";
        this.successEnableAEC = false;
    }

    public String getInfoStickerFrom() {
        C0692e<String, String> c = C71073b.m125572c(getMainBusinessContext());
        F f = c.f2750a;
        S s = c.f2751b;
        StringBuilder sb = new StringBuilder();
        if (f != null) {
            String[] split = f.split(",");
            for (String str : split) {
                if (!TextUtils.isEmpty(s)) {
                    sb.append((String) s);
                } else if (this.infoStickerCategoryParams.getInfoStickerCategoryMap().containsKey(str)) {
                    sb.append(this.infoStickerCategoryParams.getInfoStickerCategoryMap().get(str));
                }
            }
        }
        CommentVideoModel commentVideoModel2 = this.commentVideoModel;
        if (commentVideoModel2 != null && !TextUtils.isEmpty(commentVideoModel2.getAwemeId())) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append(",");
            }
            sb.append("comment_reply");
        }
        InfoStickerModel infoStickerModel2 = this.infoStickerModel;
        if (infoStickerModel2 == null || C13617h.m24465a(infoStickerModel2.stickers)) {
            return sb.toString();
        }
        return m125067b() + sb.toString();
    }

    public String getReadTextAllSpeakerId() {
        SimpleTextStickerData simpleTextStickerData;
        ArrayList arrayList = new ArrayList();
        if (hasInfoStickers()) {
            for (StickerItemModel stickerItemModel : this.infoStickerModel.stickers) {
                if (stickerItemModel != null && stickerItemModel.isTextSticker() && (simpleTextStickerData = (SimpleTextStickerData) C63244g.m114602a().mo73261G().mo46670a(stickerItemModel.extra, SimpleTextStickerData.class)) != null && simpleTextStickerData.getHasReadTextAudio() && !TextUtils.isEmpty(simpleTextStickerData.getSpeakerID())) {
                    arrayList.add(simpleTextStickerData.getSpeakerID());
                }
            }
        }
        String str = "";
        for (int i = 0; i < arrayList.size(); i++) {
            str = i == 0 ? (String) arrayList.get(i) : str + "," + ((String) arrayList.get(i));
        }
        return str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.concurrent.atomic.AtomicReference<com.ss.android.ugc.aweme.property.ef> */
    /* JADX WARN: Multi-variable type inference failed */
    public C65450ef getUploadSpeedEncodeSettings() {
        C65450ef efVar;
        List c;
        Object next;
        Object obj;
        List c2;
        C65450ef efVar2;
        AtomicReference<C65450ef> atomicReference = this.f158521k;
        UploadSpeedInfo uploadSpeedInfo2 = this.uploadSpeedInfo;
        if (!C16048b.m29633a().mo25421a(true, "enable_upload_speed_control_ve_encode_settings", false)) {
            efVar2 = null;
        } else if (uploadSpeedInfo2 == null || uploadSpeedInfo2.getSpeed() <= 0) {
            C65450ef[] a = C65457el.m117176a();
            if (a == null || (c = C89064i.m154502c(a, new C73838ab.C73840b())) == null) {
                efVar = null;
            } else {
                Iterator it = c.iterator();
                if (!it.hasNext()) {
                    next = null;
                } else {
                    next = it.next();
                    if (it.hasNext()) {
                        int i = ((C65450ef) next).f147623c;
                        do {
                            Object next2 = it.next();
                            int i2 = ((C65450ef) next2).f147623c;
                            if (i > i2) {
                                next = next2;
                                i = i2;
                            }
                        } while (it.hasNext());
                    }
                }
                C65450ef efVar3 = (C65450ef) next;
                efVar = efVar3;
                if (efVar3 != null) {
                    efVar3.f147621a = -1;
                    efVar = efVar3;
                }
            }
            C84911q.m145928d(new StringBuilder("UploadSpeeds --- speed : ").append(uploadSpeedInfo2 != null ? Long.valueOf(uploadSpeedInfo2.getSpeed()) : null).append(" ; setting : ").append(efVar).toString());
            efVar2 = efVar;
        } else {
            C65450ef[] a2 = C65457el.m117176a();
            if (a2 == null || a2.length == 0 || (c2 = C89064i.m154502c(a2, new C73838ab.C73841c())) == null) {
                obj = null;
            } else {
                int size = c2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((C65450ef) c2.get(i3)).f147621a = i3;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : c2) {
                    if (((long) ((C65450ef) obj2).f147623c) > uploadSpeedInfo2.getSpeed()) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    obj = null;
                } else {
                    obj = it2.next();
                    if (it2.hasNext()) {
                        int i4 = ((C65450ef) obj).f147623c;
                        do {
                            Object next3 = it2.next();
                            int i5 = ((C65450ef) next3).f147623c;
                            if (i4 > i5) {
                                obj = next3;
                                i4 = i5;
                            }
                        } while (it2.hasNext());
                    }
                }
            }
            C84911q.m145928d("UploadSpeeds --- speed : " + uploadSpeedInfo2.getSpeed() + " ; setting : " + obj);
            efVar2 = obj;
        }
        atomicReference.compareAndSet(null, efVar2 == 1 ? 1 : 0);
        return this.f158521k.get();
    }

    public void removeAudioEffectChallengeFromTitleAndStruct(AVChallenge aVChallenge) {
        removeTitleAndChallenge(aVChallenge);
    }

    public void setCommercialMusic(boolean z) {
        this.isCommerceMusic = z;
    }

    public void setCoverPublishModel(CoverPublishModel coverPublishModel) {
        this.f158514d = coverPublishModel;
    }

    public void setMicroAppId(String str) {
        this.microAppId = str;
    }

    public void setNewVersion(int i) {
        this.f158519i = i;
    }

    public void setOriginalSound(boolean z) {
        this.isOriginalSound = z;
    }

    public void setOriginalVideoInfo(VideoFileInfo videoFileInfo) {
        this.f158515e = videoFileInfo;
    }

    public void setPreviewInfo(EditPreviewInfo editPreviewInfo) {
        this.f158511a = editPreviewInfo;
    }

    public void setPreviewStartTime(float f) {
        this.previewStartTime = f;
    }

    public void setSaveModel(AVUploadSaveModel aVUploadSaveModel) {
        this.f158520j = aVUploadSaveModel;
    }

    public void setSharedARModel(SharedARModel sharedARModel) {
        this.f158512b = sharedARModel;
    }

    public void setStickPointType(int i) {
        this.f158522l = i;
    }

    public void setTagUserList(ArrayList<InteractionTagUserInfo> arrayList) {
        this.tagUserList = arrayList;
    }

    public void setTextStickerChallenges(TextStickerChallenges textStickerChallenges) {
        this.f158516f = textStickerChallenges;
    }

    public void setVideoCoverPath(String str) {
        this.f158513c = str;
    }

    public static VideoPublishEditModel makeCopy(VideoPublishEditModel videoPublishEditModel) {
        return videoPublishEditModel.clone();
    }

    public static String translateNullFilter(String str) {
        if (str == null) {
            return null;
        }
        return str.replace("null", "-1");
    }

    public void onlyUpdateSuperMainBusinessData(C71164e eVar) {
        super.setMainBusinessData(this.f158517g.mo46674b(eVar));
    }

    public boolean isAutoEnhanceEnable(boolean z) {
        if (!z || isDuet() || isStitchMode() || isShoutout()) {
            return false;
        }
        return true;
    }

    public void removeChallengeFromTitleAndStruct(Collection<AVChallenge> collection) {
        for (AVChallenge aVChallenge : collection) {
            removeTitleAndChallenge(aVChallenge);
        }
    }

    public void setMainBusinessContext(C71164e eVar) {
        if (this.f158518h != eVar) {
            this.f158518h = eVar;
            if (super.getMainBusinessData() != null) {
                super.setMainBusinessData(null);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext
    public void setMainBusinessData(String str) {
        if (!TextUtils.equals(super.getMainBusinessData(), str)) {
            super.setMainBusinessData(str);
            if (this.f158518h != null) {
                this.f158518h = null;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext
    public void setVideoLength(int i) {
        if (getPreviewInfo() != null) {
            m125069xc4a7b3f3("syz", "setVideoLength: videoLength=".concat(String.valueOf(i)));
            getPreviewInfo().setPreviewVideoLength(i);
        }
    }

    /* renamed from: a */
    private AVTextExtraStruct m125066a(AVChallenge aVChallenge) {
        if (aVChallenge == null || this.structList == null) {
            return null;
        }
        for (AVTextExtraStruct aVTextExtraStruct : this.structList) {
            if (aVChallenge.challengeName.equals(aVTextExtraStruct.getHashTagName())) {
                return aVTextExtraStruct;
            }
        }
        return null;
    }

    public static VideoExposureData asExposureData(Object obj) {
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        String videoPath = videoPublishEditModel.videoPath();
        float f = videoPublishEditModel.mVideoCoverStartTm;
        String mainBusinessData = videoPublishEditModel.getMainBusinessData();
        String str = videoPublishEditModel.mOutputFile;
        String videoPath2 = videoPublishEditModel.videoPath();
        String str2 = videoPublishEditModel.creationId;
        if (str2 == null) {
            str2 = UUID.randomUUID().toString();
        }
        return new VideoExposureData(videoPath, f, mainBusinessData, str, videoPath2, str2, videoPublishEditModel.isSaveLocal(), videoPublishEditModel.getLocalFinalPath(), videoPublishEditModel.f158520j, videoPublishEditModel.mOrigin, videoPublishEditModel.getDraftPrimaryKey(), videoPublishEditModel.mShootWay);
    }

    public static String getGiphyGifIds(ArrayList<GreenScreenMaterial> arrayList) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (arrayList == null) {
            return sb.toString();
        }
        Iterator<GreenScreenMaterial> it = arrayList.iterator();
        while (it.hasNext()) {
            GreenScreenMaterial next = it.next();
            if (next.getType() == 3 && !sb.toString().contains(next.getResId())) {
                if (sb.length() == 0) {
                    str = "";
                } else {
                    str = ",";
                }
                sb.append(str).append(next.getResId());
            }
        }
        return sb.toString();
    }

    public void removeTitleAndChallenge(AVChallenge aVChallenge) {
        AVTextExtraStruct a;
        if (aVChallenge != null) {
            if (!TextUtils.isEmpty(this.title)) {
                this.title = this.title.replace("#" + aVChallenge.challengeName + " ", "");
            }
            if (this.structList != null && !this.structList.isEmpty() && (a = m125066a(aVChallenge)) != null) {
                this.structList.remove(a);
            }
        }
    }

    public void setMultiEditChallenges(AVChallenge aVChallenge) {
        if (isMultiVideoEdit() && this.multiEditVideoRecordData.editSegments != null && !this.multiEditVideoRecordData.editSegments.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<TimeSpeedModelExtension> it = this.multiEditVideoRecordData.editSegments.iterator();
            while (it.hasNext()) {
                TimeSpeedModelExtension next = it.next();
                if (!(next == null || next.getHashtag() == null)) {
                    arrayList.addAll(next.getHashtag());
                }
            }
            if (!arrayList.isEmpty()) {
                if (this.challenges == null) {
                    this.challenges = new ArrayList();
                }
                if (aVChallenge != null) {
                    Iterator it2 = this.challenges.iterator();
                    while (it2.hasNext()) {
                        if (!aVChallenge.equals(it2.next())) {
                            it2.remove();
                        }
                    }
                } else {
                    this.challenges.clear();
                }
                this.challenges.addAll(arrayList);
            }
        }
    }

    public String uniqueVideoSessionDir(String str) {
        StringBuilder append = new StringBuilder().append(str);
        String str2 = getContactVideoPathAsKey().toString();
        if (this.isFastImport) {
            if (TextUtils.isEmpty(this.creationId)) {
                this.creationId = UUID.randomUUID().toString();
            }
            str2 = this.creationId;
        }
        C43213k.m86181a("[getUniqueName]: creation id = " + this.creationId + "   uniqueName = " + str2);
        return append.append(C13607d.m24442b(str2)).toString();
    }

    protected VideoPublishEditModel(Parcel parcel) {
        super(parcel);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        this.creativeFlowData = new CreativeFlowData();
        this.mAudioRecordIndex = -1;
        this.clickGoNextBtnTime = -1;
        this.aiMusicLogPbImprId = "";
        boolean z27 = false;
        this.comFrom = 0;
        this.hasQaSticker = false;
        this.mentionEditTextLength = -1;
        this.mDesignerIdList = "";
        this.mOriginalStickerCount = 0;
        this.videoEditorType = 0;
        this.mCropVideo = false;
        this.mBeautyMetadatas = new ArrayList<>();
        this.needAddQaSticker = false;
        this.needAddCommentSticker = false;
        this.isAudioEnhance = false;
        this.mSelectedFilterIntensity = -1.0f;
        this.mRecordVideoSelectedFilterIntensity = -1.0f;
        this.mEffectList = new ArrayList<>();
        this.importInfoList = new ArrayList<>();
        this.clientId = "";
        this.mDuetFrom = "";
        this.loudnessBalanceParam = new LoudnessBalanceParam();
        this.publishStage = 0;
        this.mShootedShootMode = -1;
        this.newDraftId = "";
        this.publishDuetMentionedUserList = new ArrayList();
        this.isMuted = false;
        this.infoStickerCategoryParams = new InfoStickerCategoryParams();
        this.greenScreenMaterialList = new ArrayList<>();
        this.draftFromShoot = false;
        this.customStickerPaths = new ArrayList<>();
        this.videoDurationFromVideoCutPage = -1;
        this.isStoryEditMode = false;
        this.isWestWindowExistStr = "";
        this.shootEnterMethod = "";
        this.f158516f = new TextStickerChallenges();
        this.editMusicSyncMode = false;
        this.mSubtitleMusicChangeChecker = new C70995a();
        this.f158517g = new C27910f();
        this.isDuetGreenSrceen = false;
        this.uploadSpeedInfo = new UploadSpeedInfo();
        this.f158521k = new AtomicReference<>(null);
        this.f158522l = 0;
        this.isSoundLoop = false;
        this.textTypes = "";
        this.textEffectIds = "";
        this.pic2VideoSource = "";
        this.successEnableAEC = false;
        this.mSelectedFilterId = parcel.readString();
        this.mSelectedFilterLabel = parcel.readString();
        this.mSelectedFilterResId = parcel.readString();
        setPreviewInfo((EditPreviewInfo) parcel.readParcelable(EditPreviewInfo.class.getClassLoader()));
        this.mDir = parcel.readString();
        this.mRecordFilterIds = parcel.readString();
        this.mRecordFilterLabels = parcel.readString();
        this.mRecordFilterValues = parcel.readString();
        this.mBeautyMobParam = (BeautyMobParam) parcel.readParcelable(BeautyMobParam.class.getClassLoader());
        this.mCurFilterLabels = parcel.readString();
        this.mCurFilterIds = parcel.readString();
        this.mSmoothSkinLabels = parcel.readString();
        this.commentVideoModel = (CommentVideoModel) parcel.readSerializable();
        this.mSubtitleMusicChangeChecker = (C70995a) parcel.readSerializable();
        this.mReshapeLabels = parcel.readString();
        this.videoSpeed = parcel.readString();
        this.cameraIds = parcel.readString();
        this.beautyType = parcel.readInt();
        this.mMusicPath = parcel.readString();
        this.mVideoSegmentsDesc = parcel.readString();
        this.mStickerPath = parcel.readString();
        this.mStickerID = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mFromCut = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mFromMultiCut = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.faceBeautyOpen = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mWillGoOnShortVideo = z4;
        this.mOrigin = parcel.readInt();
        this.mHardEncode = parcel.readInt();
        this.mRestoreType = parcel.readInt();
        this.mFaceBeauty = parcel.readInt();
        this.mSelectedId = parcel.readInt();
        this.mSelectedFilterIntensity = parcel.readFloat();
        this.mRecordVideoSelectedFilterIndex = parcel.readInt();
        this.mRecordVideoSelectedFilterIntensity = parcel.readFloat();
        this.mCameraPosition = parcel.readInt();
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.autoEnhanceOn = z5;
        this.autoEnhanceType = parcel.readInt();
        this.mMusicStart = parcel.readInt();
        this.mMusicEnd = parcel.readInt();
        this.mMusicOrigin = parcel.readString();
        this.mMusicShowRank = parcel.readInt();
        this.mMusicRecType = parcel.readInt();
        this.mUseFilter = parcel.readInt();
        this.mVideoCoverStartTm = parcel.readFloat();
        this.maxDuration = parcel.readLong();
        this.mTimeEffect = (EffectPointModel) parcel.readParcelable(EffectPointModel.class.getClassLoader());
        this.mEffectList = parcel.createTypedArrayList(EffectPointModel.CREATOR);
        this.importInfoList = parcel.createTypedArrayList(ImportVideoInfo.CREATOR);
        this.audioTrack = (UrlModel) parcel.readSerializable();
        this.musicId = parcel.readString();
        this.shareId = parcel.readString();
        this.clientId = parcel.readString();
        this.previewStartTime = parcel.readFloat();
        this.startTime = parcel.readLong();
        this.mOutputFile = parcel.readString();
        this.mId3Title = parcel.readString();
        this.mId3Author = parcel.readString();
        this.mId3Album = parcel.readString();
        this.mMusicType = parcel.readInt();
        this.mDuetFrom = parcel.readString();
        this.mDuetAuthor = (User) parcel.readSerializable();
        this.mDuetHashTag = parcel.readString();
        this.mShootMode = parcel.readInt();
        this.mShootedShootMode = parcel.readInt();
        this.creationId = parcel.readString();
        this.ccVid = parcel.readString();
        this.hotSpotTag = parcel.readString();
        this.sentenceId = parcel.readString();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.mDurationMode = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.isMuted = z7;
        this.draftId = parcel.readInt();
        this.newDraftId = parcel.readString();
        this.mEncodedAudioOutputFile = parcel.readString();
        this.mParallelUploadOutputFile = parcel.readString();
        this.voiceVolume = parcel.readFloat();
        this.musicVolume = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.mIsMultiVideo = z8;
        this.shopDraftId = parcel.readString();
        this.f158519i = parcel.readInt();
        this.f158520j = (AVUploadSaveModel) parcel.readParcelable(AVUploadSaveModel.class.getClassLoader());
        this.reactionParams = (ReactionParams) parcel.readParcelable(ReactionParams.class.getClassLoader());
        this.creativeFlowData = (CreativeFlowData) parcel.readParcelable(CreativeFlowData.class.getClassLoader());
        this.f158512b = (SharedARModel) parcel.readParcelable(SharedARModel.class.getClassLoader());
        this.recordMode = parcel.readInt();
        this.gameScore = parcel.readInt();
        this.mEyesLabels = parcel.readString();
        this.mTanningLabels = parcel.readString();
        this.f158513c = parcel.readString();
        this.microAppId = parcel.readString();
        this.extractFramesModel = (ExtractFramesModel) parcel.readSerializable();
        this.infoStickerModel = (InfoStickerModel) parcel.readParcelable(InfoStickerModel.class.getClassLoader());
        this.microAppModel = (C71518t) parcel.readSerializable();
        this.texts = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.usePaint = z9;
        this.videoType = parcel.readInt();
        this.socialModel = (SocialModel) parcel.readParcelable(SocialModel.class.getClassLoader());
        this.md5 = parcel.readString();
        this.multiEditVideoRecordData = (MultiEditVideoStatusRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.isStoryTextRecord = z10;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.supportRetake = z11;
        this.mentionUserModel = (ExtraMentionUserModel) parcel.readSerializable();
        this.mFirstStickerMusicIdsJson = parcel.readString();
        this.uploadMiscInfoStruct = (C71872i) parcel.readSerializable();
        this.videoEditorType = parcel.readInt();
        this.mvCreateVideoData = (C61288d) parcel.readSerializable();
        this.compileProbeResult = (CompileProbeResult) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.isFastImport = z12;
        this.veCherEffectParam = (ClientCherEffectParam) parcel.readParcelable(ClientCherEffectParam.class.getClassLoader());
        this.mOutVideoWidth = parcel.readInt();
        this.mOutVideoHeight = parcel.readInt();
        this.aiMusicLogPbImprId = parcel.readString();
        this.comFrom = parcel.readInt();
        this.mVideoCanvasWidth = parcel.readInt();
        this.mVideoCanvasHeight = parcel.readInt();
        this.veAudioEffectParam = (AudioEffectParam) parcel.readParcelable(AudioEffectParam.class.getClassLoader());
        this.aiMusicLogPbImprId = parcel.readString();
        this.comFrom = parcel.readInt();
        this.uploadSpeedInfo = (UploadSpeedInfo) parcel.readParcelable(UploadSpeedInfo.class.getClassLoader());
        this.fastImportErrorCode = parcel.readInt();
        if (parcel.readByte() == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.isCommerceMusic = z13;
        if (parcel.readByte() == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.isOriginalSound = z14;
        this.mBindMvId = parcel.readString();
        this.stickerChallenge = (StickerChallenge) parcel.readParcelable(StickerChallenge.class.getClassLoader());
        this.f158516f = (TextStickerChallenges) parcel.readParcelable(TextStickerChallenges.class.getClassLoader());
        this.metadataMap = C80357ds.m139324a(parcel.readString());
        if (parcel.readByte() != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.isStickPointMode = z15;
        this.mUploadPath = parcel.readString();
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.countDownModes = arrayList;
        parcel.readList(arrayList, Integer.class.getClassLoader());
        this.veAudioRecorderParam = (AudioRecorderParam) parcel.readParcelable(AudioRecorderParam.class.getClassLoader());
        this.textTypes = parcel.readString();
        this.textEffectIds = parcel.readString();
        this.videoCount = parcel.readInt();
        this.photoCount = parcel.readInt();
        this.mentionEditTextLength = parcel.readInt();
        this.pic2VideoSource = parcel.readString();
        if (parcel.readByte() == 1) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.mUseMusicBeforeEdit = z16;
        if (parcel.readByte() != 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.containBackgroundVideo = z17;
        this.stickPointData = (C69790a) parcel.readSerializable();
        this.mBeautyMetadatas = parcel.createTypedArrayList(BeautyMetadata.CREATOR);
        this.infoStickerCategoryParams = (InfoStickerCategoryParams) parcel.readParcelable(InfoStickerCategoryParams.class.getClassLoader());
        this.f158522l = parcel.readInt();
        this.duetLayout = parcel.readString();
        this.draftDuetExtraInfo = (DuetExtraInfo) parcel.readParcelable(DuetExtraInfo.class.getClassLoader());
        this.musicUsageConfirmation = parcel.readInt();
        this.stitchParams = (StitchParams) parcel.readParcelable(StitchParams.class.getClassLoader());
        this.greenScreenMaterialList = parcel.createTypedArrayList(GreenScreenMaterial.CREATOR);
        this.cameraLensInfo = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z18 = true;
        } else {
            z18 = false;
        }
        this.isPhotoMvMode = z18;
        if (parcel.readByte() != 0) {
            z19 = true;
        } else {
            z19 = false;
        }
        this.isDuetGreenSrceen = z19;
        if (parcel.readByte() != 0) {
            z20 = true;
        } else {
            z20 = false;
        }
        this.isPhotoMvMode1080p = z20;
        if (parcel.readByte() == 1) {
            z21 = true;
        } else {
            z21 = false;
        }
        this.isSoundLoop = Boolean.valueOf(z21);
        this.f158514d = (CoverPublishModel) parcel.readParcelable(CoverPublishModel.class.getClassLoader());
        this.customStickerPaths = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z22 = true;
        } else {
            z22 = false;
        }
        this.isPhotoMvMusic = z22;
        if (parcel.readByte() != 0) {
            z23 = true;
        } else {
            z23 = false;
        }
        this.isDraftMusicIllegal = z23;
        this.audioAecDelayTime = parcel.readLong();
        this.currentZoomValue = parcel.readFloat();
        this.enterFrom = parcel.readString();
        this.screenBrightness = parcel.readInt();
        this.mShoutOutsData = (C74418d) parcel.readSerializable();
        this.recordBgmDelay = parcel.readInt();
        this.duetFromDuetSticker = parcel.readInt();
        this.mDuetFromDuetButton = parcel.readInt();
        this.ttStoryUploadModel = (TTStoryUploadModel) parcel.readParcelable(TTStoryUploadModel.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z24 = true;
        } else {
            z24 = false;
        }
        this.isStoryEditMode = z24;
        this.canvasVideoData = (CanvasVideoData) parcel.readSerializable();
        this.storyEditEtParam = (StoryEditEtParam) parcel.readParcelable(StoryEditEtParam.class.getClassLoader());
        this.shootEnterMethod = parcel.readString();
        this.publishStage = parcel.readInt();
        this.singleImageCoverBitmapData = (SingleImageCoverBitmapData) parcel.readParcelable(SingleImageCoverBitmapData.class.getClassLoader());
        this.loudnessBalanceParam = (LoudnessBalanceParam) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z25 = true;
        } else {
            z25 = false;
        }
        this.draftFromShoot = z25;
        this.mPoiData = (PoiData) parcel.readSerializable();
        this.qaStruct = (QaStruct) parcel.readSerializable();
        this.clickGoNextBtnTime = parcel.readLong();
        this.mDesignerIdList = parcel.readString();
        this.mOriginalStickerCount = parcel.readInt();
        this.isWestWindowExistStr = parcel.readString();
        this.autoAttachedAnchor = (C39053a) parcel.readSerializable();
        ArrayList<InteractionTagUserInfo> arrayList2 = new ArrayList<>();
        this.tagUserList = arrayList2;
        parcel.readList(arrayList2, User.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z26 = true;
        } else {
            z26 = false;
        }
        this.isAudioEnhance = z26;
        this.openPlatformExtra = parcel.readString();
        this.openPlatformClientKey = parcel.readString();
        this.cut2EditTransferModel = (Cut2EditTransferModel) parcel.readParcelable(Cut2EditTransferModel.class.getClassLoader());
        this.editMusicSyncMode = parcel.readByte() != 0 ? true : z27;
        this.publishDuetMentionedUserList = parcel.createStringArrayList();
        this.draftSaveTime = parcel.readLong();
        this.sessionId = parcel.readString();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mSelectedFilterId);
        parcel.writeString(this.mSelectedFilterLabel);
        parcel.writeString(this.mSelectedFilterResId);
        parcel.writeParcelable(getPreviewInfo(), i);
        parcel.writeString(this.mDir);
        parcel.writeString(this.mRecordFilterIds);
        parcel.writeString(this.mRecordFilterLabels);
        parcel.writeString(this.mRecordFilterValues);
        parcel.writeParcelable(this.mBeautyMobParam, i);
        parcel.writeString(this.mCurFilterLabels);
        parcel.writeString(this.mCurFilterIds);
        parcel.writeString(this.mSmoothSkinLabels);
        parcel.writeSerializable(this.commentVideoModel);
        parcel.writeSerializable(this.mSubtitleMusicChangeChecker);
        parcel.writeString(this.mReshapeLabels);
        parcel.writeString(this.videoSpeed);
        parcel.writeString(this.cameraIds);
        parcel.writeInt(this.beautyType);
        parcel.writeString(this.mMusicPath);
        parcel.writeString(this.mVideoSegmentsDesc);
        parcel.writeString(this.mStickerPath);
        parcel.writeString(this.mStickerID);
        parcel.writeByte(this.mFromCut ? (byte) 1 : 0);
        parcel.writeByte(this.mFromMultiCut ? (byte) 1 : 0);
        parcel.writeByte(this.faceBeautyOpen ? (byte) 1 : 0);
        parcel.writeByte(this.mWillGoOnShortVideo ? (byte) 1 : 0);
        parcel.writeInt(this.mOrigin);
        parcel.writeInt(this.mHardEncode);
        parcel.writeInt(this.mRestoreType);
        parcel.writeInt(this.mFaceBeauty);
        parcel.writeInt(this.mSelectedId);
        parcel.writeFloat(this.mSelectedFilterIntensity);
        parcel.writeInt(this.mRecordVideoSelectedFilterIndex);
        parcel.writeFloat(this.mRecordVideoSelectedFilterIntensity);
        parcel.writeInt(this.mCameraPosition);
        parcel.writeInt(this.autoEnhanceOn ? 1 : 0);
        parcel.writeInt(this.autoEnhanceType);
        parcel.writeInt(this.mMusicStart);
        parcel.writeInt(this.mMusicEnd);
        parcel.writeString(this.mMusicOrigin);
        parcel.writeInt(this.mMusicShowRank);
        parcel.writeInt(this.mMusicRecType);
        parcel.writeInt(this.mUseFilter);
        parcel.writeFloat(this.mVideoCoverStartTm);
        parcel.writeLong(this.maxDuration);
        parcel.writeParcelable(this.mTimeEffect, i);
        parcel.writeTypedList(this.mEffectList);
        parcel.writeTypedList(this.importInfoList);
        parcel.writeSerializable(this.audioTrack);
        parcel.writeString(this.musicId);
        parcel.writeString(this.shareId);
        parcel.writeString(this.clientId);
        parcel.writeFloat(this.previewStartTime);
        parcel.writeLong(this.startTime);
        parcel.writeString(this.mOutputFile);
        parcel.writeString(this.mId3Title);
        parcel.writeString(this.mId3Author);
        parcel.writeString(this.mId3Album);
        parcel.writeInt(this.mMusicType);
        parcel.writeString(this.mDuetFrom);
        parcel.writeSerializable(this.mDuetAuthor);
        parcel.writeString(this.mDuetHashTag);
        parcel.writeInt(this.mShootMode);
        parcel.writeInt(this.mShootedShootMode);
        parcel.writeString(this.creationId);
        parcel.writeString(this.ccVid);
        parcel.writeString(this.hotSpotTag);
        parcel.writeString(this.sentenceId);
        parcel.writeByte(this.mDurationMode ? (byte) 1 : 0);
        parcel.writeByte(this.isMuted ? (byte) 1 : 0);
        parcel.writeInt(this.draftId);
        parcel.writeString(this.newDraftId);
        parcel.writeString(this.mEncodedAudioOutputFile);
        parcel.writeString(this.mParallelUploadOutputFile);
        parcel.writeFloat(this.voiceVolume);
        parcel.writeFloat(this.musicVolume);
        parcel.writeByte(this.mIsMultiVideo ? (byte) 1 : 0);
        parcel.writeString(this.shopDraftId);
        parcel.writeInt(this.f158519i);
        parcel.writeParcelable(this.f158520j, i);
        parcel.writeParcelable(this.reactionParams, i);
        parcel.writeParcelable(this.creativeFlowData, i);
        parcel.writeParcelable(this.f158512b, i);
        parcel.writeInt(this.recordMode);
        parcel.writeInt(this.gameScore);
        parcel.writeString(this.mEyesLabels);
        parcel.writeString(this.mTanningLabels);
        parcel.writeString(this.f158513c);
        parcel.writeString(this.microAppId);
        parcel.writeSerializable(this.extractFramesModel);
        parcel.writeParcelable(this.infoStickerModel, i);
        parcel.writeSerializable(this.microAppModel);
        parcel.writeStringList(this.texts);
        parcel.writeByte(this.usePaint ? (byte) 1 : 0);
        parcel.writeInt(this.videoType);
        parcel.writeParcelable(this.socialModel, i);
        parcel.writeString(this.md5);
        parcel.writeParcelable(this.multiEditVideoRecordData, i);
        parcel.writeByte(this.isStoryTextRecord ? (byte) 1 : 0);
        parcel.writeByte(this.supportRetake ? (byte) 1 : 0);
        parcel.writeSerializable(this.mentionUserModel);
        parcel.writeString(this.mFirstStickerMusicIdsJson);
        parcel.writeSerializable(this.uploadMiscInfoStruct);
        parcel.writeInt(this.videoEditorType);
        parcel.writeSerializable(this.mvCreateVideoData);
        parcel.writeSerializable(this.compileProbeResult);
        parcel.writeByte(this.isFastImport ? (byte) 1 : 0);
        parcel.writeParcelable(this.veCherEffectParam, i);
        parcel.writeInt(this.mOutVideoWidth);
        parcel.writeInt(this.mOutVideoHeight);
        parcel.writeString(this.aiMusicLogPbImprId);
        parcel.writeInt(this.comFrom);
        parcel.writeInt(this.mVideoCanvasWidth);
        parcel.writeInt(this.mVideoCanvasHeight);
        parcel.writeParcelable(this.veAudioEffectParam, i);
        parcel.writeString(this.aiMusicLogPbImprId);
        parcel.writeInt(this.comFrom);
        parcel.writeParcelable(this.uploadSpeedInfo, i);
        parcel.writeInt(this.fastImportErrorCode);
        parcel.writeByte(this.isCommerceMusic ? (byte) 1 : 0);
        parcel.writeByte(this.isOriginalSound ? (byte) 1 : 0);
        parcel.writeString(this.mBindMvId);
        parcel.writeParcelable(this.stickerChallenge, i);
        parcel.writeParcelable(this.f158516f, i);
        parcel.writeString(C80357ds.m139323a(this.metadataMap));
        parcel.writeByte(this.isStickPointMode ? (byte) 1 : 0);
        parcel.writeString(this.mUploadPath);
        parcel.writeList(this.countDownModes);
        parcel.writeParcelable(this.veAudioRecorderParam, i);
        parcel.writeString(this.textTypes);
        parcel.writeString(this.textEffectIds);
        parcel.writeInt(this.videoCount);
        parcel.writeInt(this.photoCount);
        parcel.writeInt(this.mentionEditTextLength);
        parcel.writeString(this.pic2VideoSource);
        parcel.writeByte(this.mUseMusicBeforeEdit ? (byte) 1 : 0);
        parcel.writeByte(this.containBackgroundVideo ? (byte) 1 : 0);
        parcel.writeSerializable(this.stickPointData);
        parcel.writeTypedList(this.mBeautyMetadatas);
        parcel.writeParcelable(this.infoStickerCategoryParams, i);
        parcel.writeInt(this.f158522l);
        parcel.writeString(this.duetLayout);
        parcel.writeParcelable(this.draftDuetExtraInfo, i);
        parcel.writeInt(this.musicUsageConfirmation);
        parcel.writeParcelable(this.stitchParams, i);
        parcel.writeTypedList(this.greenScreenMaterialList);
        parcel.writeStringList(this.cameraLensInfo);
        parcel.writeByte(this.isPhotoMvMode ? (byte) 1 : 0);
        parcel.writeByte(this.isDuetGreenSrceen ? (byte) 1 : 0);
        parcel.writeByte(this.isPhotoMvMode1080p ? (byte) 1 : 0);
        parcel.writeByte(this.isSoundLoop.booleanValue() ? (byte) 1 : 0);
        parcel.writeParcelable(this.f158514d, i);
        parcel.writeStringList(this.customStickerPaths);
        parcel.writeByte(this.isPhotoMvMusic ? (byte) 1 : 0);
        parcel.writeByte(this.isDraftMusicIllegal ? (byte) 1 : 0);
        parcel.writeLong(this.audioAecDelayTime);
        parcel.writeFloat(this.currentZoomValue);
        parcel.writeString(this.enterFrom);
        parcel.writeInt(this.screenBrightness);
        parcel.writeSerializable(this.mShoutOutsData);
        parcel.writeInt(this.recordBgmDelay);
        parcel.writeInt(this.duetFromDuetSticker);
        parcel.writeInt(this.mDuetFromDuetButton);
        parcel.writeParcelable(this.ttStoryUploadModel, i);
        parcel.writeByte(this.isStoryEditMode ? (byte) 1 : 0);
        parcel.writeSerializable(this.canvasVideoData);
        parcel.writeParcelable(this.storyEditEtParam, i);
        parcel.writeString(this.shootEnterMethod);
        parcel.writeInt(this.publishStage);
        parcel.writeParcelable(this.singleImageCoverBitmapData, i);
        parcel.writeSerializable(this.loudnessBalanceParam);
        parcel.writeByte(this.draftFromShoot ? (byte) 1 : 0);
        parcel.writeSerializable(this.mPoiData);
        parcel.writeSerializable(this.qaStruct);
        parcel.writeLong(this.clickGoNextBtnTime);
        parcel.writeString(this.mDesignerIdList);
        parcel.writeInt(this.mOriginalStickerCount);
        parcel.writeString(this.isWestWindowExistStr);
        parcel.writeSerializable(this.autoAttachedAnchor);
        parcel.writeList(this.tagUserList);
        parcel.writeByte(this.isAudioEnhance ? (byte) 1 : 0);
        parcel.writeString(this.openPlatformExtra);
        parcel.writeString(this.openPlatformClientKey);
        parcel.writeParcelable(this.cut2EditTransferModel, i);
        parcel.writeByte(this.editMusicSyncMode ? (byte) 1 : 0);
        parcel.writeStringList(this.publishDuetMentionedUserList);
        parcel.writeLong(this.draftSaveTime);
        parcel.writeString(this.sessionId);
    }
}

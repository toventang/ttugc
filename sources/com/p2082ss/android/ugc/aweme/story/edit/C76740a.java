package com.p2082ss.android.ugc.aweme.story.edit;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.StoryEditEtParam;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.story.base.model.EditContext;
import com.p2082ss.android.ugc.aweme.story.base.p4020a.C76611e;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditMusicModel;
import com.p2082ss.android.ugc.aweme.utils.C80357ds;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.a */
public final class C76740a {
    static {
        Covode.recordClassIndex(89736);
    }

    /* renamed from: a */
    public static final Bundle m134318a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        Bundle bundle = new Bundle();
        bundle.putString("creation_id", videoPublishEditModel.creationId);
        bundle.putSerializable("extra_video_publish_args", videoPublishEditModel);
        bundle.putString("shoot_way", videoPublishEditModel.mShootWay);
        bundle.putInt("publish_private_state", 0);
        bundle.putInt("publish_permission", 0);
        bundle.putInt("extra_auto_retry", C76611e.m134196a());
        return bundle;
    }

    /* renamed from: a */
    public static final VideoPublishEditModel m134319a(StoryEditModel storyEditModel) {
        C89219l.m154721d(storyEditModel, "");
        VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        videoPublishEditModel.creationId = storyEditModel.getCreationId();
        videoPublishEditModel.mShootWay = storyEditModel.getShootWay();
        videoPublishEditModel.mOrigin = storyEditModel.getOrigin();
        boolean z = false;
        videoPublishEditModel.isPrivate = 0;
        EditContext editContext = storyEditModel.getEditContext();
        if (editContext != null) {
            videoPublishEditModel.containBackgroundVideo = editContext.getContainBackgroundVideo();
            videoPublishEditModel.mStickerID = editContext.getStickers();
            videoPublishEditModel.extractFramesModel = editContext.getExtractFramesModel();
            videoPublishEditModel.mVideoSegmentsDesc = editContext.getVideoSegmentDesc();
            videoPublishEditModel.mCameraPosition = editContext.getCameraPosition();
            List<String> arTextList = editContext.getArTextList();
            if (arTextList == null) {
                arTextList = C89086z.INSTANCE;
            }
            videoPublishEditModel.arTextList = new ArrayList(arTextList);
            List<String> messageBubbleTexts = editContext.getMessageBubbleTexts();
            if (messageBubbleTexts == null) {
                messageBubbleTexts = C89086z.INSTANCE;
            }
            videoPublishEditModel.messageBubbleTexts = new ArrayList(messageBubbleTexts);
            List<String> cameraLensInfo = editContext.getCameraLensInfo();
            if (cameraLensInfo == null) {
                cameraLensInfo = C89086z.INSTANCE;
            }
            videoPublishEditModel.cameraLensInfo = new ArrayList<>(cameraLensInfo);
            videoPublishEditModel.cameraIds = editContext.getCameraIds();
            String metadataMapStr = editContext.getMetadataMapStr();
            if (!(metadataMapStr == null || metadataMapStr.length() == 0 || metadataMapStr == null)) {
                videoPublishEditModel.metadataMap = C80357ds.m139324a(metadataMapStr);
            }
            videoPublishEditModel.stickerInfo = editContext.getStickerInfo();
        }
        videoPublishEditModel.maxDuration = 15000;
        if (storyEditModel.getOrigin() == 0) {
            z = true;
        }
        videoPublishEditModel.mFromCut = z;
        C89219l.m154721d(storyEditModel, "");
        videoPublishEditModel.storyEditEtParam = new StoryEditEtParam("story_shoot_page", "story", C76748b.m134345b(storyEditModel), C76748b.m134341a(storyEditModel), storyEditModel.isMultiContent(), storyEditModel.getClips().size());
        StoryEditClipModel storyEditClipModel = (StoryEditClipModel) C89070n.m154583g((List) storyEditModel.getClips());
        if (storyEditClipModel != null) {
            m134321a(storyEditClipModel, videoPublishEditModel);
        }
        return videoPublishEditModel;
    }

    /* renamed from: b */
    public static final void m134322b(VideoPublishEditModel videoPublishEditModel, StoryEditClipModel storyEditClipModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(storyEditClipModel, "");
        storyEditClipModel.setInfoStickerModel(videoPublishEditModel.infoStickerModel);
        storyEditClipModel.setMainBusinessContextStr(videoPublishEditModel.getMainBusinessData());
        String str = videoPublishEditModel.textEffectIds;
        C89219l.m154716b(str, "");
        storyEditClipModel.setTextEffectIds(str);
        String str2 = videoPublishEditModel.textTypes;
        C89219l.m154716b(str2, "");
        storyEditClipModel.setTextTypes(str2);
        storyEditClipModel.setMentionTextList(videoPublishEditModel.mentionTextList);
        storyEditClipModel.setHashTagTextList(videoPublishEditModel.hashTagTextList);
    }

    /* renamed from: d */
    public static final void m134325d(StoryEditClipModel storyEditClipModel, VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(storyEditClipModel, "");
        C89219l.m154721d(videoPublishEditModel, "");
        videoPublishEditModel.infoStickerModel = storyEditClipModel.getInfoStickerModel();
        videoPublishEditModel.setMainBusinessData(storyEditClipModel.getMainBusinessContextStr());
        videoPublishEditModel.textEffectIds = storyEditClipModel.getTextEffectIds();
        videoPublishEditModel.textTypes = storyEditClipModel.getTextTypes();
        videoPublishEditModel.mentionTextList = storyEditClipModel.getMentionTextList();
        videoPublishEditModel.hashTagTextList = storyEditClipModel.getHashTagTextList();
    }

    /* renamed from: a */
    public static final void m134320a(VideoPublishEditModel videoPublishEditModel, StoryEditClipModel storyEditClipModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(storyEditClipModel, "");
        storyEditClipModel.setVoiceVolume(videoPublishEditModel.voiceVolume);
        storyEditClipModel.setMusicVolume(videoPublishEditModel.musicVolume);
        String str = videoPublishEditModel.mMusicPath;
        String str2 = videoPublishEditModel.musicId;
        String str3 = videoPublishEditModel.mMusicOrigin;
        int i = videoPublishEditModel.mMusicStart;
        int i2 = videoPublishEditModel.mMusicEnd;
        int i3 = videoPublishEditModel.mCurMusicLength;
        int i4 = videoPublishEditModel.mMusicShowRank;
        int i5 = videoPublishEditModel.mMusicRecType;
        Boolean bool = videoPublishEditModel.isSoundLoop;
        C89219l.m154716b(bool, "");
        storyEditClipModel.setEditMusicModel(new StoryEditMusicModel(str, str2, str3, i, i2, i3, i4, i5, bool.booleanValue(), C70005cr.m123611a().f156482a));
    }

    /* renamed from: b */
    public static final void m134323b(StoryEditClipModel storyEditClipModel, VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(storyEditClipModel, "");
        C89219l.m154721d(videoPublishEditModel, "");
        videoPublishEditModel.videoEditorType = storyEditClipModel.getVideoEditorType();
        videoPublishEditModel.mWorkspace = storyEditClipModel.getWorkspace();
        videoPublishEditModel.setPreviewInfo(storyEditClipModel.getPreviewMediaInfo());
        videoPublishEditModel.isFastImport = storyEditClipModel.isFastImport();
        videoPublishEditModel.mOutputFile = storyEditClipModel.getOutputFile();
        videoPublishEditModel.mParallelUploadOutputFile = storyEditClipModel.getParallelUploadOutputFile();
        videoPublishEditModel.mEncodedAudioOutputFile = storyEditClipModel.getEncodedAudioOutputFile();
        videoPublishEditModel.mOutVideoWidth = storyEditClipModel.getOutVideoWidth();
        videoPublishEditModel.mOutVideoHeight = storyEditClipModel.getOutVideoHeight();
        videoPublishEditModel.mVideoCanvasWidth = storyEditClipModel.getVideoCanvasWidth();
        videoPublishEditModel.mVideoCanvasHeight = storyEditClipModel.getVideoCanvasHeight();
        videoPublishEditModel.multiEditVideoRecordData = storyEditClipModel.getMultiEditVideoRecordData();
    }

    /* renamed from: c */
    public static final void m134324c(StoryEditClipModel storyEditClipModel, VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(storyEditClipModel, "");
        C89219l.m154721d(videoPublishEditModel, "");
        videoPublishEditModel.voiceVolume = storyEditClipModel.getVoiceVolume();
        videoPublishEditModel.musicVolume = storyEditClipModel.getMusicVolume();
        videoPublishEditModel.mMusicPath = storyEditClipModel.getEditMusicModel().getMusicPath();
        videoPublishEditModel.musicId = storyEditClipModel.getEditMusicModel().getMusicId();
        videoPublishEditModel.mMusicOrigin = storyEditClipModel.getEditMusicModel().getMusicOrigin();
        videoPublishEditModel.mMusicStart = storyEditClipModel.getEditMusicModel().getMusicStart();
        videoPublishEditModel.mMusicEnd = storyEditClipModel.getEditMusicModel().getMusicEnd();
        videoPublishEditModel.mCurMusicLength = storyEditClipModel.getEditMusicModel().getMusicLength();
        videoPublishEditModel.mMusicShowRank = storyEditClipModel.getEditMusicModel().getMusicShowRank();
        videoPublishEditModel.mMusicRecType = storyEditClipModel.getEditMusicModel().getMusicRecType();
        videoPublishEditModel.isSoundLoop = Boolean.valueOf(storyEditClipModel.getEditMusicModel().isMusicLoop());
    }

    /* renamed from: a */
    public static final void m134321a(StoryEditClipModel storyEditClipModel, VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(storyEditClipModel, "");
        C89219l.m154721d(videoPublishEditModel, "");
        if (storyEditClipModel.getSourceContentType() == 1) {
            videoPublishEditModel.videoCount = 1;
            videoPublishEditModel.photoCount = 0;
        } else {
            videoPublishEditModel.videoCount = 0;
            videoPublishEditModel.photoCount = 1;
        }
        videoPublishEditModel.canvasVideoData = storyEditClipModel.getCanvasVideoData();
        videoPublishEditModel.mCurFilterIds = storyEditClipModel.getMCurFilterIds();
        videoPublishEditModel.mSelectedFilterId = storyEditClipModel.getMSelectedFilterId();
        videoPublishEditModel.mSelectedFilterLabel = storyEditClipModel.getMSelectedFilterLabel();
        videoPublishEditModel.mSelectedFilterResId = storyEditClipModel.getMSelectedFilterResId();
        videoPublishEditModel.mCurFilterLabels = storyEditClipModel.getMCurFilterLabels();
        videoPublishEditModel.mSelectedId = storyEditClipModel.getSelectFilterIndex();
        videoPublishEditModel.mSelectedFilterIntensity = storyEditClipModel.getMSelectedFilterIntensity();
        videoPublishEditModel.setCoverPublishModel(storyEditClipModel.getCoverPublishModel());
        videoPublishEditModel.mEffectList = storyEditClipModel.getEffectList();
        videoPublishEditModel.isStoryEditMode = true;
        videoPublishEditModel.sessionId = storyEditClipModel.getSessionId();
        videoPublishEditModel.draftEditTransferModel = new DraftEditTransferModel(storyEditClipModel.getSessionId(), null);
        C63244g.m114602a().mo73275c();
        videoPublishEditModel.setNewVersion(3);
        m134323b(storyEditClipModel, videoPublishEditModel);
        m134324c(storyEditClipModel, videoPublishEditModel);
        m134325d(storyEditClipModel, videoPublishEditModel);
    }
}

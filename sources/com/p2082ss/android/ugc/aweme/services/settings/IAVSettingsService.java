package com.p2082ss.android.ugc.aweme.services.settings;

import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.port.AbstractC63145a;

/* renamed from: com.ss.android.ugc.aweme.services.settings.IAVSettingsService */
public interface IAVSettingsService {
    static {
        Covode.recordClassIndex(79957);
    }

    AbstractC63145a<Boolean> bubbleGuideShown();

    boolean downloadEffectOrMusicAfterEnterCamera();

    boolean enableFeedbackLog();

    boolean enableModelFileOnlyEnv();

    boolean enableNewMusicMarquee();

    boolean enablePreUploadByUser();

    boolean enableQaSticker();

    boolean enableSaveUploadVideo();

    boolean enableStitch();

    boolean enableStudioScreenRightCorner();

    boolean enableTaskDegradationOpti();

    boolean enableTitan();

    boolean enableUploadSyncIns();

    boolean enableUploadSyncInsStory();

    boolean enableUploadSyncTwitter();

    boolean getDuetStickerAB();

    String getEffectVersion();

    int getEnablePublishPrivacySetting();

    boolean getLongVideoPermittedValue();

    int getMvPlan();

    boolean getMvThemeRecordMode();

    boolean getPostDownloadSetting();

    boolean getPublishProgressOptimize();

    String[] getSharePostEffectIds();

    String getStickerArtistIconUrl();

    String getVESDKVersion();

    boolean isDuetAutoApplyEffectEnabled();

    boolean isEnableGetThumbsWithEffect();

    boolean isEnableUseVEGetThumbs();

    boolean isEnableVideoEditActivityUploadSpeedProbe();

    boolean isLongVideoPermitted();

    boolean isPhotoEditEnabled();

    boolean isPrivateAvailable();

    boolean needLoginBeforeRecord();

    long progressBarThreshold();

    int recommentMusicByAIPolicy();

    void setDefaultFilterForCamera(int i, int i2);

    void setEnablePreUploadByUser(boolean z);

    boolean shareVideo2GifEditable();

    boolean showDuetWithReact();

    boolean showMvThemeRecordMode();

    void updateABTestModel(C28022o oVar);
}

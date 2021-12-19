package com.p2082ss.android.ugc.gamora.editor.lightening.p4283c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: com.ss.android.ugc.gamora.editor.lightening.c.a */
final class C82386a {
    static {
        Covode.recordClassIndex(96220);
    }

    /* renamed from: a */
    public static void m142418a(VideoPublishEditModel videoPublishEditModel) {
        videoPublishEditModel.title = null;
        videoPublishEditModel.structList = null;
        videoPublishEditModel.isPrivate = 0;
        videoPublishEditModel.challenges = null;
        videoPublishEditModel.commentSetting = 0;
        videoPublishEditModel.compileProbeResult = null;
        videoPublishEditModel.commerceData = null;
        videoPublishEditModel.allowAutoCaptionSetting = 0;
        videoPublishEditModel.allowDownloadSetting = 0;
        videoPublishEditModel.microAppId = null;
        videoPublishEditModel.microAppModel = null;
        videoPublishEditModel.chain = null;
        videoPublishEditModel.disableDeleteChain = false;
        videoPublishEditModel.geofencingSetting = null;
        videoPublishEditModel.excludeUserList = null;
        videoPublishEditModel.allowRecommend = 0;
        videoPublishEditModel.isDraftMusicIllegal = false;
        videoPublishEditModel.playlist_id = null;
        videoPublishEditModel.playlist_name = null;
        videoPublishEditModel.mVideoCoverStartTm = 0.0f;
        if (videoPublishEditModel.veAudioRecorderParam != null) {
            videoPublishEditModel.veAudioRecorderParam.setAudioRecordIndex(-1);
        }
        videoPublishEditModel.setCoverPublishModel(new CoverPublishModel());
    }
}

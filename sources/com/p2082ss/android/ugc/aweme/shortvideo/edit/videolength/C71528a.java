package com.p2082ss.android.ugc.aweme.shortvideo.edit.videolength;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70785a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.videolength.a */
public final class C71528a {
    static {
        Covode.recordClassIndex(84071);
    }

    /* renamed from: a */
    public static final boolean m126415a(C69905c cVar) {
        if (cVar == null || cVar.isPgc()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m126417b(VideoPublishEditModel videoPublishEditModel) {
        if (!C70785a.m125070a() && m126416a(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m126416a(VideoPublishEditModel videoPublishEditModel) {
        EditPreviewInfo editPreviewInfo;
        if (videoPublishEditModel != null) {
            editPreviewInfo = videoPublishEditModel.getPreviewInfo();
        } else {
            editPreviewInfo = null;
        }
        if (editPreviewInfo == null || editPreviewInfo.getPreviewVideoLength() == 0) {
            if (videoPublishEditModel == null || videoPublishEditModel.videoDurationFromVideoCutPage < 61000) {
                return false;
            }
            return true;
        } else if (editPreviewInfo.getPreviewVideoLength() >= 61000) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static final void m126414a(VideoPublishEditModel videoPublishEditModel, String str) {
        if (videoPublishEditModel != null) {
            videoPublishEditModel.mMusicPath = null;
            videoPublishEditModel.musicId = str;
            videoPublishEditModel.mMusicStart = 0;
            videoPublishEditModel.isSoundLoop = false;
            videoPublishEditModel.musicVolume = 0.5f;
        }
    }
}

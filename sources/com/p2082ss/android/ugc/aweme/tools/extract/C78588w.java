package com.p2082ss.android.ugc.aweme.tools.extract;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.property.C65449ee;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.w */
public final class C78588w {

    /* renamed from: a */
    public static final C78589a f176625a = new C78589a((byte) 0);

    static {
        Covode.recordClassIndex(91722);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.w$a */
    public static final class C78589a {
        static {
            Covode.recordClassIndex(91723);
        }

        private C78589a() {
        }

        public /* synthetic */ C78589a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m137198a(VideoPublishEditModel videoPublishEditModel) {
            if (videoPublishEditModel == null || !C65449ee.m117170a()) {
                return false;
            }
            if (videoPublishEditModel.isMvThemeVideoType()) {
                return videoPublishEditModel.hasRecord();
            }
            if (videoPublishEditModel.mOrigin == 0 && videoPublishEditModel.isMusic() > 0 && (videoPublishEditModel.voiceVolume > 0.0f || videoPublishEditModel.hasRecord())) {
                return true;
            }
            if (((videoPublishEditModel.hasOriginalSound() || videoPublishEditModel.isFastImport || videoPublishEditModel.hasRecord()) && videoPublishEditModel.mMusicPath != null && (videoPublishEditModel.voiceVolume > 0.0f || videoPublishEditModel.hasRecord())) || videoPublishEditModel.veAudioEffectParam != null) {
                return true;
            }
            return false;
        }
    }
}

package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65414cx;
import com.p2082ss.android.ugc.aweme.property.p3609a.C65330a;
import com.p2082ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70863j;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.C70898f;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.videolength.C71528a;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.subtitle.p3873a.C73204a;
import com.p2082ss.android.ugc.aweme.utils.C80418fa;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.vesdk.VEUtils;
import dmt.p4542av.video.C88168aj;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bp */
public final class C70976bp {
    static {
        Covode.recordClassIndex(83470);
    }

    /* renamed from: c */
    public static final boolean m125306c() {
        if (C63244g.m114602a().mo73255A().mo93901a() || AVCommerceServiceImpl.m102988h().mo93962a()) {
            return false;
        }
        if (!m125300a() && !C65330a.m117012a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m125300a() {
        if (C63244g.m114602a().mo73255A().mo93901a() || C65414cx.m117133a() == 0 || AVCommerceServiceImpl.m102988h().mo93962a()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m125304b() {
        if (C63244g.m114602a().mo73255A().mo93901a() || C65414cx.m117133a() == 0 || AVCommerceServiceImpl.m102988h().mo93962a()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m125305b(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.getStitchParams() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static final boolean m125313i(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        return C70898f.m125188a();
    }

    /* renamed from: j */
    public static final boolean m125314j(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        return C89219l.m154714a((Object) "change_ban_music", (Object) videoPublishEditModel.mShootWay);
    }

    /* renamed from: a */
    public static final int m125298a(AbstractC72510a aVar) {
        C89219l.m154721d(aVar, "");
        AbstractC31071f value = aVar.mo114778C().getValue();
        if (value != null) {
            return value.mo56368j();
        }
        return 0;
    }

    /* renamed from: c */
    public static final boolean m125307c(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.isCutSameVideoType()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m125308d(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (!videoPublishEditModel.isMultiVideoEditFeature() || m125305b(videoPublishEditModel) || videoPublishEditModel.isCutSameVideoType()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static final boolean m125311g(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if ((videoPublishEditModel.isFastImport || videoPublishEditModel.hasOriginalSound()) && !videoPublishEditModel.isMuted) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static final boolean m125315k(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (!C73204a.m129256a() || videoPublishEditModel.isShoutout()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static final boolean m125316l(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (!m125306c() || !C71528a.m126417b(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static final boolean m125317m(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.mCurMusicLength > 0 && videoPublishEditModel.getVideoLength() < videoPublishEditModel.mCurMusicLength) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static final String m125319o(VideoPublishEditModel videoPublishEditModel) {
        String resolution;
        C89219l.m154721d(videoPublishEditModel, "");
        VideoFileInfo n = m125318n(videoPublishEditModel);
        if (n == null || (resolution = n.getResolution()) == null) {
            return "";
        }
        return resolution;
    }

    /* renamed from: p */
    public static final int m125320p(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        VideoFileInfo n = m125318n(videoPublishEditModel);
        if (n != null) {
            return n.getCodecType();
        }
        return -1;
    }

    /* renamed from: e */
    public static final boolean m125309e(VideoPublishEditModel videoPublishEditModel) {
        EditPreviewInfo previewInfo;
        C89219l.m154721d(videoPublishEditModel, "");
        if (!videoPublishEditModel.isFastImport || (previewInfo = videoPublishEditModel.getPreviewInfo()) == null) {
            return false;
        }
        Iterator<T> it = previewInfo.getVideoList().iterator();
        while (it.hasNext()) {
            if (VEUtils.getAudioFileInfo(it.next().getVideoPath(), new int[10]) >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m125310f(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (!C70863j.m125142a() || !m125323s(videoPublishEditModel) || videoPublishEditModel.isStickPointMode || m125305b(videoPublishEditModel) || videoPublishEditModel.editMusicSyncMode) {
            return false;
        }
        if ((videoPublishEditModel.isReaction() || m125307c(videoPublishEditModel) || m125311g(videoPublishEditModel) || videoPublishEditModel.isStickPointMode) && !m125313i(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static final boolean m125312h(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (!m125310f(videoPublishEditModel)) {
            return false;
        }
        if (videoPublishEditModel.isReaction() || m125307c(videoPublishEditModel) || m125311g(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public static final boolean m125322r(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        EffectPointModel effectPointModel = videoPublishEditModel.mTimeEffect;
        if (effectPointModel == null) {
            return false;
        }
        if (C89219l.m154714a((Object) effectPointModel.getKey(), (Object) "2") || C89219l.m154714a((Object) effectPointModel.getKey(), (Object) "3")) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private static final boolean m125323s(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.mOrigin == 0) {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            Boolean forbidVoiceChangeOnEditPage = iESSettingsProxy.getForbidVoiceChangeOnEditPage();
            C89219l.m154716b(forbidVoiceChangeOnEditPage, "");
            if (forbidVoiceChangeOnEditPage.booleanValue()) {
                return false;
            }
        } else if (!videoPublishEditModel.isReaction() && !m125307c(videoPublishEditModel) && !videoPublishEditModel.isStickPointMode) {
            return true;
        } else {
            IESSettingsProxy iESSettingsProxy2 = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy2, "");
            Boolean forbidVoiceChangeOnEditPage2 = iESSettingsProxy2.getForbidVoiceChangeOnEditPage();
            C89219l.m154716b(forbidVoiceChangeOnEditPage2, "");
            if (forbidVoiceChangeOnEditPage2.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m125301a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static final VideoFileInfo m125318n(VideoPublishEditModel videoPublishEditModel) {
        String videoPath;
        int[] a;
        C89219l.m154721d(videoPublishEditModel, "");
        if (!videoPublishEditModel.isUploadVideo()) {
            if (!(videoPublishEditModel.getOriginalVideoInfo() != null || (videoPath = videoPublishEditModel.videoPath()) == null || videoPath.length() == 0 || (a = C88168aj.m153237a(videoPublishEditModel.videoPath())) == null)) {
                videoPublishEditModel.setOriginalVideoInfo(new VideoFileInfo(a[0], a[1], (long) a[3], a[7], a[6], a[8], 0, 0, 192, null));
            }
            return videoPublishEditModel.getOriginalVideoInfo();
        }
        ArrayList<ImportVideoInfo> arrayList = videoPublishEditModel.importInfoList;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        Iterator<ImportVideoInfo> it = videoPublishEditModel.importInfoList.iterator();
        while (it.hasNext()) {
            ImportVideoInfo next = it.next();
            if (next.getBitRate() != 0 && next.getEncodeId() != 0 && next.getOriginFps() != 0) {
                return new VideoFileInfo(next.getVideoWidth(), next.getVideoHeight(), next.getDuration(), next.getOriginFps(), next.getBitRate(), next.getEncodeId(), 0, 0, 192, null);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if ((!p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r0.getKey(), (java.lang.Object) "0")) != false) goto L_0x0032;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m125321q(com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp.m125321q(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    /* renamed from: a */
    public static final C84425b m125299a(C84425b bVar, VideoPublishEditModel videoPublishEditModel) {
        Float valueOf;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(videoPublishEditModel, "");
        C84425b b = m125303b(bVar, videoPublishEditModel);
        String str = videoPublishEditModel.mSelectedFilterId;
        if (str == null) {
            str = "";
        }
        C84425b a = b.mo129406a("edit_filter_id", str);
        String str2 = videoPublishEditModel.mSelectedFilterLabel;
        if (str2 == null) {
            str2 = "";
        }
        C84425b a2 = a.mo129406a("edit_filter_name", str2);
        if (videoPublishEditModel.mSelectedFilterIntensity < 0.0f) {
            valueOf = "";
        } else {
            valueOf = Float.valueOf(videoPublishEditModel.mSelectedFilterIntensity);
        }
        C84425b a3 = a2.mo129405a("edit_filter_value", valueOf);
        C89219l.m154716b(a3, "");
        return a3;
    }

    /* renamed from: b */
    public static final C84425b m125303b(C84425b bVar, VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(videoPublishEditModel, "");
        C84425b a = bVar.mo129406a("shoot_filter_id_list", videoPublishEditModel.mRecordFilterIds).mo129406a("shoot_filter_name_list", videoPublishEditModel.mRecordFilterLabels).mo129406a("shoot_filter_value_list", videoPublishEditModel.mRecordFilterValues);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public static final boolean m125302a(VideoPublishEditModel videoPublishEditModel, String str) {
        int a;
        C89219l.m154721d(videoPublishEditModel, "");
        if (!TextUtils.isEmpty(str) && !videoPublishEditModel.isDuet() && !videoPublishEditModel.isReaction() && !videoPublishEditModel.isStickPointMode && (a = C80418fa.m139406a(str)) > 0 && videoPublishEditModel.getVideoLength() < a) {
            return true;
        }
        return false;
    }
}

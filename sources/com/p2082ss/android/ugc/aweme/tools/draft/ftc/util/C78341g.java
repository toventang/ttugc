package com.p2082ss.android.ugc.aweme.tools.draft.ftc.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.utils.C80418fa;
import dmt.p4542av.video.VEPreviewMusicParams;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.util.g */
public final class C78341g {

    /* renamed from: a */
    public static final C78341g f175937a = new C78341g();

    private C78341g() {
    }

    static {
        Covode.recordClassIndex(91460);
    }

    /* renamed from: a */
    public static C89378p<Integer, Integer> m136804a(VideoPublishEditModel videoPublishEditModel) {
        int videoWidth;
        int videoHeight;
        IVideoConfigService iVideoConfigService;
        IVideoConfigService iVideoConfigService2;
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.mVideoCanvasWidth <= 0 || videoPublishEditModel.mVideoCanvasHeight <= 0) {
            videoWidth = videoPublishEditModel.videoWidth();
            videoHeight = videoPublishEditModel.videoHeight();
            if (videoHeight == 0 || videoWidth == 0) {
                if (videoPublishEditModel.getOriginal() == 0) {
                    iVideoConfigService = C63238c.f143589p;
                } else {
                    iVideoConfigService = C63238c.f143588o;
                }
                C89219l.m154716b(iVideoConfigService, "");
                videoWidth = iVideoConfigService.getVideoWidth();
                if (videoPublishEditModel.getOriginal() == 0) {
                    iVideoConfigService2 = C63238c.f143589p;
                } else {
                    iVideoConfigService2 = C63238c.f143588o;
                }
                C89219l.m154716b(iVideoConfigService2, "");
                videoHeight = iVideoConfigService2.getVideoHeight();
            }
        } else {
            videoWidth = videoPublishEditModel.mVideoCanvasWidth;
            videoHeight = videoPublishEditModel.mVideoCanvasHeight;
        }
        return new C89378p<>(Integer.valueOf(videoWidth), Integer.valueOf(videoHeight));
    }

    /* renamed from: b */
    private static VEPreviewMusicParams m136806b(VideoPublishEditModel videoPublishEditModel) {
        int i;
        VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
        vEPreviewMusicParams.f200089i = videoPublishEditModel.isFastImport;
        vEPreviewMusicParams.f200088h = 2;
        vEPreviewMusicParams.f200081a = videoPublishEditModel.mMusicPath;
        vEPreviewMusicParams.f200082b = videoPublishEditModel.mMusicStart;
        String str = videoPublishEditModel.mMusicPath;
        C89219l.m154721d(videoPublishEditModel, "");
        vEPreviewMusicParams.f200083c = C80418fa.m139406a(str);
        if (C70005cr.m123611a().f156482a != null) {
            int i2 = vEPreviewMusicParams.f200083c;
            C69905c cVar = C70005cr.m123611a().f156482a;
            if (cVar == null) {
                C89219l.m154715b();
            }
            if (Math.abs(i2 - cVar.getShootDuration()) >= 1000) {
                C69905c cVar2 = C70005cr.m123611a().f156482a;
                if (cVar2 == null) {
                    C89219l.m154715b();
                }
                i = cVar2.getShootDuration();
                vEPreviewMusicParams.f200084d = i;
                vEPreviewMusicParams.f200085e = videoPublishEditModel.musicVolume;
                vEPreviewMusicParams.f200086f = videoPublishEditModel.musicId;
                vEPreviewMusicParams.f200087g = videoPublishEditModel.previewStartTime;
                Boolean bool = videoPublishEditModel.isSoundLoop;
                C89219l.m154716b(bool, "");
                vEPreviewMusicParams.f200092l = bool.booleanValue();
                return vEPreviewMusicParams;
            }
        }
        i = vEPreviewMusicParams.f200083c;
        vEPreviewMusicParams.f200084d = i;
        vEPreviewMusicParams.f200085e = videoPublishEditModel.musicVolume;
        vEPreviewMusicParams.f200086f = videoPublishEditModel.musicId;
        vEPreviewMusicParams.f200087g = videoPublishEditModel.previewStartTime;
        Boolean bool2 = videoPublishEditModel.isSoundLoop;
        C89219l.m154716b(bool2, "");
        vEPreviewMusicParams.f200092l = bool2.booleanValue();
        return vEPreviewMusicParams;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01bf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m136805a(android.content.Context r11, androidx.lifecycle.AbstractC1204m r12, android.view.SurfaceView r13, dmt.p4542av.video.C88303z r14, com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r15) {
        /*
        // Method dump skipped, instructions count: 460
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.ftc.util.C78341g.m136805a(android.content.Context, androidx.lifecycle.m, android.view.SurfaceView, dmt.av.video.z, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):void");
    }
}

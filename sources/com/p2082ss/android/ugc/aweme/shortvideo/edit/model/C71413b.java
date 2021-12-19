package com.p2082ss.android.ugc.aweme.shortvideo.edit.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.p2217f.C31095c;
import com.p2082ss.android.ugc.aweme.draft.C43209h;
import com.p2082ss.android.ugc.aweme.draft.C43213k;
import com.p2082ss.android.ugc.aweme.draft.model.C43233g;
import com.p2082ss.android.ugc.aweme.draft.model.DraftVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.vesdk.VECherEffectParam;
import com.p2082ss.android.vesdk.VESize;
import com.p2082ss.android.vesdk.VEUtils;
import dmt.p4542av.video.VEPreviewParams;
import java.io.File;
import java.util.List;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.b */
public final class C71413b {
    static {
        Covode.recordClassIndex(83947);
    }

    /* renamed from: a */
    public static final void m126121a(VideoPublishEditModel videoPublishEditModel) {
        String draftDir;
        List<EditVideoSegment> videoList;
        C89219l.m154721d(videoPublishEditModel, "");
        if (!videoPublishEditModel.isFastImport) {
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            if (!(previewInfo == null || (videoList = previewInfo.getVideoList()) == null)) {
                for (T t : videoList) {
                    C84902i.m145896b(t.getVideoPath());
                    C84902i.m145896b(t.getAudioPath());
                    C43213k.m86181a("[removePreviewRelatedFiles] removeFile = " + t.getVideoPath());
                    C43213k.m86181a("[removePreviewRelatedFiles] removeFile = " + t.getAudioPath());
                }
            }
            C84902i.m145886a(new File(videoPublishEditModel.draftDir()));
        }
        EditPreviewInfo previewInfo2 = videoPublishEditModel.getPreviewInfo();
        if (!(previewInfo2 == null || (draftDir = previewInfo2.getDraftDir()) == null || !C43209h.m86176c(draftDir))) {
            EditPreviewInfo previewInfo3 = videoPublishEditModel.getPreviewInfo();
            String str = null;
            C84902i.m145886a(new File(previewInfo3 != null ? previewInfo3.getDraftDir() : null));
            StringBuilder sb = new StringBuilder("[removePreviewRelatedFiles] removeDir fast import draftDir = ");
            EditPreviewInfo previewInfo4 = videoPublishEditModel.getPreviewInfo();
            if (previewInfo4 != null) {
                str = previewInfo4.getDraftDir();
            }
            C43213k.m86181a(sb.append(str).toString());
        }
        EditPreviewInfo previewInfo5 = videoPublishEditModel.getPreviewInfo();
        if (previewInfo5 != null) {
            m126125b(previewInfo5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p4600h.C89386u<com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment, java.lang.Long, long[]> m126119a(com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r24, boolean r25, long r26) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71413b.m126119a(com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo, boolean, long):h.u");
    }

    /* renamed from: a */
    public static final String m126120a() {
        return C70638dj.f158103f + "fast_import/" + System.currentTimeMillis() + '/';
    }

    /* renamed from: a */
    public static final VEPreviewParams m126118a(VideoPublishEditModel videoPublishEditModel, int i, int i2, int i3) {
        List g;
        int i4;
        VideoFileInfo videoFileInfo;
        C89219l.m154721d(videoPublishEditModel, "");
        VEPreviewParams vEPreviewParams = new VEPreviewParams();
        EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
        int size = previewInfo.getVideoList().size();
        String[] strArr = new String[size];
        for (int i5 = 0; i5 < size; i5++) {
            strArr[i5] = "";
        }
        vEPreviewParams.mVideoPaths = strArr;
        String[] strArr2 = new String[size];
        for (int i6 = 0; i6 < size; i6++) {
            strArr2[i6] = "";
        }
        vEPreviewParams.mAudioPaths = strArr2;
        int i7 = 0;
        for (T t : previewInfo.getVideoList()) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                C89070n.m154520a();
            }
            T t2 = t;
            vEPreviewParams.mVideoPaths[i7] = t2.getVideoPath();
            vEPreviewParams.mAudioPaths[i7] = t2.getAudioPath();
            VideoCutInfo videoCutInfo = t2.getVideoCutInfo();
            if (videoCutInfo != null) {
                if (vEPreviewParams.mSpeedArray == null) {
                    float[] fArr = new float[size];
                    for (int i9 = 0; i9 < size; i9++) {
                        fArr[i9] = 1.0f;
                    }
                    vEPreviewParams.mSpeedArray = fArr;
                }
                if (vEPreviewParams.mRotateArray == null) {
                    int[] iArr = new int[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        iArr[i10] = 0;
                    }
                    vEPreviewParams.mRotateArray = iArr;
                }
                if (vEPreviewParams.mVTrimIn == null) {
                    int[] iArr2 = new int[size];
                    for (int i11 = 0; i11 < size; i11++) {
                        iArr2[i11] = 0;
                    }
                    vEPreviewParams.mVTrimIn = iArr2;
                }
                if (vEPreviewParams.mVTrimOut == null) {
                    int[] iArr3 = new int[size];
                    for (int i12 = 0; i12 < size; i12++) {
                        iArr3[i12] = -1;
                    }
                    vEPreviewParams.mVTrimOut = iArr3;
                }
                vEPreviewParams.getSpeedArray()[i7] = videoCutInfo.getSpeed();
                vEPreviewParams.getRotateArray()[i7] = videoCutInfo.getRotate();
                vEPreviewParams.mVTrimIn[i7] = (int) videoCutInfo.getStart();
                vEPreviewParams.mVTrimOut[i7] = (int) videoCutInfo.getEnd();
            }
            if (videoPublishEditModel.videoEditorType == 11) {
                if (vEPreviewParams.mSpeedArray == null) {
                    float[] fArr2 = new float[size];
                    for (int i13 = 0; i13 < size; i13++) {
                        fArr2[i13] = 1.0f;
                    }
                    vEPreviewParams.mSpeedArray = fArr2;
                }
                if (vEPreviewParams.mRotateArray == null) {
                    int[] iArr4 = new int[size];
                    for (int i14 = 0; i14 < size; i14++) {
                        iArr4[i14] = 0;
                    }
                    vEPreviewParams.mRotateArray = iArr4;
                }
                if (vEPreviewParams.mVTrimIn == null) {
                    int[] iArr5 = new int[size];
                    for (int i15 = 0; i15 < size; i15++) {
                        iArr5[i15] = 0;
                    }
                    vEPreviewParams.mVTrimIn = iArr5;
                }
                if (vEPreviewParams.mVTrimOut == null) {
                    int[] iArr6 = new int[size];
                    for (int i16 = 0; i16 < size; i16++) {
                        iArr6[i16] = -1;
                    }
                    vEPreviewParams.mVTrimOut = iArr6;
                }
                int[] iArr7 = vEPreviewParams.mVTrimOut;
                if (i3 <= 0) {
                    EditVideoSegment editVideoSegment = (EditVideoSegment) C89070n.m154583g((List) videoPublishEditModel.getPreviewInfo().getVideoList());
                    i4 = (editVideoSegment == null || (videoFileInfo = editVideoSegment.getVideoFileInfo()) == null) ? 5000 : (int) videoFileInfo.getDuration();
                } else {
                    i4 = i3;
                }
                iArr7[i7] = i4;
            }
            i7 = i8;
        }
        vEPreviewParams.sceneIn = (int) previewInfo.getSceneIn();
        vEPreviewParams.sceneOut = (int) previewInfo.getSceneOut();
        vEPreviewParams.mPreviewWidth = previewInfo.getPreviewWidth();
        vEPreviewParams.mPreviewHeight = previewInfo.getPreviewHeight();
        if (i != -1) {
            vEPreviewParams.mPageType = i;
        }
        if (i2 != -1) {
            vEPreviewParams.mFps = i2;
        }
        vEPreviewParams.isFromCut = videoPublishEditModel.mFromCut;
        vEPreviewParams.mWorkspace = videoPublishEditModel.draftDir();
        vEPreviewParams.setCanvasWidth(videoPublishEditModel.mVideoCanvasWidth);
        vEPreviewParams.setCanvasHeight(videoPublishEditModel.mVideoCanvasHeight);
        vEPreviewParams.mVolume = videoPublishEditModel.voiceVolume;
        vEPreviewParams.mMusicVolume = videoPublishEditModel.musicVolume;
        vEPreviewParams.mMusicInPoint = videoPublishEditModel.mMusicStart;
        vEPreviewParams.mMusicOutPoint = videoPublishEditModel.mMusicEnd;
        vEPreviewParams.mMusicPath = videoPublishEditModel.mMusicPath;
        vEPreviewParams.isFastImport = videoPublishEditModel.isFastImport;
        vEPreviewParams.isCutSameType = videoPublishEditModel.isCutSameVideoType();
        vEPreviewParams.mIsFromDraft = videoPublishEditModel.mIsFromDraft;
        vEPreviewParams.videoEditorType = videoPublishEditModel.videoEditorType;
        vEPreviewParams.mvCreateVideoData = videoPublishEditModel.mvCreateVideoData;
        vEPreviewParams.recordData = videoPublishEditModel.multiEditVideoRecordData;
        vEPreviewParams.stitchParams = videoPublishEditModel.stitchParams;
        if (videoPublishEditModel.veCherEffectParam != null) {
            String[] matrix = videoPublishEditModel.veCherEffectParam.getMatrix();
            double[] duration = videoPublishEditModel.veCherEffectParam.getDuration();
            boolean[] segUseCher = videoPublishEditModel.veCherEffectParam.getSegUseCher();
            if (segUseCher == null) {
                C89219l.m154715b();
            }
            vEPreviewParams.veCherEffectParam = new VECherEffectParam(matrix, duration, segUseCher);
        }
        if (videoPublishEditModel.veAudioEffectParam != null) {
            vEPreviewParams.setVeAudioEffectParam(videoPublishEditModel.veAudioEffectParam);
        }
        if (videoPublishEditModel.isFastImport || videoPublishEditModel.isCutSameVideoType()) {
            vEPreviewParams.mAudioPaths = null;
        }
        vEPreviewParams.audioAecDelayTime = videoPublishEditModel.audioAecDelayTime;
        vEPreviewParams.isStoryEditMode = videoPublishEditModel.isStoryEditMode;
        vEPreviewParams.canvasVideoPreviewData = videoPublishEditModel.canvasVideoData;
        vEPreviewParams.singleImageCoverBitmapData = videoPublishEditModel.singleImageCoverBitmapData;
        vEPreviewParams.isVideoImageMixFastImport = C71817eu.m126799j(videoPublishEditModel);
        vEPreviewParams.setEnableMusicSync(C71817eu.m126800k(videoPublishEditModel));
        vEPreviewParams.isMusicSyncMode = videoPublishEditModel.editMusicSyncMode;
        String[] strArr3 = vEPreviewParams.mAudioPaths;
        if (!(strArr3 == null || (g = C89064i.m154506g(strArr3)) == null || !g.isEmpty())) {
            vEPreviewParams.mAudioPaths = null;
        }
        return vEPreviewParams;
    }

    /* renamed from: b */
    public static final VEPreviewParams m126124b(VideoPublishEditModel videoPublishEditModel) {
        return m126118a(videoPublishEditModel, 2, 30, -1);
    }

    /* renamed from: c */
    public static final boolean m126126c(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        String str = videoPublishEditModel.mShootWay;
        if (str != null) {
            return C89361p.m154874b(str, "miracle_game", false);
        }
        return false;
    }

    /* renamed from: a */
    public static final EditVideoSegment m126115a(DraftVideoSegment draftVideoSegment) {
        C89219l.m154721d(draftVideoSegment, "");
        EditVideoSegment editVideoSegment = new EditVideoSegment(draftVideoSegment.f100724h, draftVideoSegment.f100725i, m126117a(draftVideoSegment.f100724h));
        editVideoSegment.setVideoCutInfo(new VideoCutInfo((long) draftVideoSegment.f100719c, (long) draftVideoSegment.f100720d, draftVideoSegment.f100722f, draftVideoSegment.f100723g));
        return editVideoSegment;
    }

    /* renamed from: a */
    public static final int m126111a(EditPreviewInfo editPreviewInfo) {
        C89219l.m154721d(editPreviewInfo, "");
        if (editPreviewInfo.getVideoList().get(0).getVideoFileInfo().getFps() == -100) {
            editPreviewInfo.getVideoList().set(0, EditVideoSegment.copy$default(editPreviewInfo.getVideoList().get(0), null, null, m126117a(editPreviewInfo.getVideoList().get(0).getVideoPath()), null, 11, null));
        }
        return editPreviewInfo.getVideoList().get(0).getVideoFileInfo().getFps();
    }

    /* renamed from: b */
    private static void m126125b(EditPreviewInfo editPreviewInfo) {
        C89219l.m154721d(editPreviewInfo, "");
        String[] reverseVideoArray = editPreviewInfo.getReverseVideoArray();
        if (reverseVideoArray != null) {
            for (String str : reverseVideoArray) {
                C84902i.m145896b(str);
                C43213k.m86181a("[removeRelatedFiles] reverseVideoArray removeFile = ".concat(String.valueOf(str)));
            }
        }
        String[] reverseAudioArray = editPreviewInfo.getReverseAudioArray();
        if (reverseAudioArray != null) {
            for (String str2 : reverseAudioArray) {
                C84902i.m145896b(str2);
                C43213k.m86181a("[removeRelatedFiles] reverseAudioArray removeFile = ".concat(String.valueOf(str2)));
            }
        }
        String[] tempVideoArray = editPreviewInfo.getTempVideoArray();
        if (tempVideoArray != null) {
            for (String str3 : tempVideoArray) {
                C84902i.m145896b(str3);
                C43213k.m86181a("[removeRelatedFiles] tempVideoArray removeFile = ".concat(String.valueOf(str3)));
            }
        }
    }

    /* renamed from: a */
    public static final EditPreviewInfo m126114a(C43233g gVar) {
        C89219l.m154721d(gVar, "");
        EditPreviewInfo a = new C71419h(gVar.f100940a, gVar.f100941b, null, 28).mo113031a(m126115a(gVar.f100942c.get(0)));
        String str = gVar.f100942c.get(0).f100726j;
        if (str != null) {
            a.setReverseVideoArray(new String[]{str});
        }
        String str2 = gVar.f100942c.get(0).f100725i;
        if (str2 != null && C89361p.m154876c(str2, "reverse.wav", false)) {
            a.setReverseAudioArray(new String[]{str2});
        }
        String str3 = gVar.f100942c.get(0).f100727k;
        if (str3 != null) {
            a.setTempVideoArray(new String[]{str3});
        }
        return a;
    }

    /* renamed from: a */
    public static final EditVideoSegment m126116a(VideoSegment videoSegment) {
        C89219l.m154721d(videoSegment, "");
        EditVideoSegment editVideoSegment = new EditVideoSegment(videoSegment.mo110571a(false).toString(), null, new VideoFileInfo(videoSegment.f156714f, videoSegment.f156715g, videoSegment.f156710b, videoSegment.mo110570a(), videoSegment.mo110577c(), 0, 0, 0, 224, null));
        editVideoSegment.setVideoCutInfo(new VideoCutInfo(videoSegment.mo110578d(), videoSegment.mo110580e(), videoSegment.mo110582f(), videoSegment.f156718j));
        return editVideoSegment;
    }

    /* renamed from: a */
    public static final VideoFileInfo m126117a(String str) {
        int[] iArr = new int[10];
        if (str == null || VEUtils.getVideoFileInfo(str, iArr) != 0) {
            return new VideoFileInfo(0, 0, 0, 0, 0, 0, 0, 0, 240, null);
        }
        return new VideoFileInfo(iArr[0], iArr[1], (long) iArr[3], iArr[7], iArr[6], 0, 0, 0, 224, null);
    }

    /* renamed from: b */
    public static final int m126122b(EditPreviewInfo editPreviewInfo, boolean z) {
        C89219l.m154721d(editPreviewInfo, "");
        if (!z) {
            return editPreviewInfo.getVideoList().get(0).getVideoFileInfo().getHeight();
        }
        if (editPreviewInfo.getCalculateSourceHeight() <= 0) {
            VESize calcTargetRes = VEUtils.calcTargetRes(editPreviewInfo.getTotalVideoWidth(), editPreviewInfo.getTotalVideoHeight(), C31095c.m64296a(editPreviewInfo), Integer.MAX_VALUE);
            editPreviewInfo.setCalculateSourceWidth(calcTargetRes.width);
            editPreviewInfo.setCalculateSourceHeight(calcTargetRes.height);
        }
        return editPreviewInfo.getCalculateSourceHeight();
    }

    /* renamed from: a */
    public static final int m126112a(EditPreviewInfo editPreviewInfo, boolean z) {
        C89219l.m154721d(editPreviewInfo, "");
        if (!z) {
            return editPreviewInfo.getVideoList().get(0).getVideoFileInfo().getWidth();
        }
        if (editPreviewInfo.getCalculateSourceWidth() <= 0) {
            VESize calcTargetRes = VEUtils.calcTargetRes(editPreviewInfo.getTotalVideoWidth(), editPreviewInfo.getTotalVideoHeight(), C31095c.m64296a(editPreviewInfo), Integer.MAX_VALUE);
            editPreviewInfo.setCalculateSourceWidth(calcTargetRes.width);
            editPreviewInfo.setCalculateSourceHeight(calcTargetRes.height);
        }
        return editPreviewInfo.getCalculateSourceWidth();
    }

    /* renamed from: b */
    public static final int m126123b(EditPreviewInfo editPreviewInfo, boolean z, boolean z2, boolean z3) {
        C89219l.m154721d(editPreviewInfo, "");
        if (z || z3) {
            if (editPreviewInfo.getCalculateHeight() <= 0) {
                VESize calcTargetRes = VEUtils.calcTargetRes(editPreviewInfo.getTotalVideoWidth(), editPreviewInfo.getTotalVideoHeight(), C31095c.m64296a(editPreviewInfo), editPreviewInfo.getPreviewWidth());
                editPreviewInfo.setCalculateWidth(calcTargetRes.width);
                editPreviewInfo.setCalculateHeight(calcTargetRes.height);
            }
            return editPreviewInfo.getCalculateHeight();
        } else if (!z2 || editPreviewInfo.getVideoList().size() < 2) {
            return editPreviewInfo.getVideoList().get(0).getVideoFileInfo().getHeight();
        } else {
            return editPreviewInfo.getVideoList().get(1).getVideoFileInfo().getHeight();
        }
    }

    /* renamed from: a */
    public static final int m126113a(EditPreviewInfo editPreviewInfo, boolean z, boolean z2, boolean z3) {
        C89219l.m154721d(editPreviewInfo, "");
        if (z || z3) {
            if (editPreviewInfo.getCalculateWidth() <= 0) {
                VESize calcTargetRes = VEUtils.calcTargetRes(editPreviewInfo.getTotalVideoWidth(), editPreviewInfo.getTotalVideoHeight(), C31095c.m64296a(editPreviewInfo), editPreviewInfo.getPreviewWidth());
                editPreviewInfo.setCalculateWidth(calcTargetRes.width);
                editPreviewInfo.setCalculateHeight(calcTargetRes.height);
            }
            return editPreviewInfo.getCalculateWidth();
        } else if (!z2 || editPreviewInfo.getVideoList().size() < 2) {
            return editPreviewInfo.getVideoList().get(0).getVideoFileInfo().getWidth();
        } else {
            return editPreviewInfo.getVideoList().get(1).getVideoFileInfo().getWidth();
        }
    }
}

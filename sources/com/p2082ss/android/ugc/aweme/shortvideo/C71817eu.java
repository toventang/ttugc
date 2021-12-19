package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65341ak;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.StoryEditEtParam;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.eu */
public final class C71817eu {
    static {
        Covode.recordClassIndex(84362);
    }

    /* renamed from: f */
    public static final String m126795f(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.isStoryEditMode) {
            return "story-filter";
        }
        return "colorfilternew";
    }

    /* renamed from: b */
    public static final boolean m126791b(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null || videoPublishEditModel.mShoutOutsData == null) {
            return false;
        }
        return C89361p.m154872a(videoPublishEditModel.mShoutOutsData.getShoutOutsMode(), C74418d.MODE_POST, false);
    }

    /* renamed from: h */
    public static final boolean m126797h(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.isPhotoMvMode || videoPublishEditModel.canvasVideoData != null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static final boolean m126799j(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.photoCount <= 0 || videoPublishEditModel.videoCount <= 0 || !videoPublishEditModel.isFastImport) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static final boolean m126800k(VideoPublishEditModel videoPublishEditModel) {
        Cut2EditTransferModel cut2EditTransferModel;
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.mIsFromDraft && videoPublishEditModel.editMusicSyncMode) {
            return true;
        }
        if (videoPublishEditModel.mIsFromDraft || (cut2EditTransferModel = videoPublishEditModel.cut2EditTransferModel) == null || !cut2EditTransferModel.getMusicSyncMode()) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public static final boolean m126805p(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        Cut2EditTransferModel cut2EditTransferModel = videoPublishEditModel.cut2EditTransferModel;
        if (cut2EditTransferModel == null) {
            return videoPublishEditModel.isFastImport;
        }
        if (!cut2EditTransferModel.isVideoCompressed()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final String m126793d(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return null;
        }
        if (videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut || C89219l.m154714a((Object) m126792c(videoPublishEditModel), (Object) "photo_canvas")) {
            return "upload";
        }
        return "shoot";
    }

    /* renamed from: g */
    public static final int m126796g(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.ttStoryUploadModel != null) {
            return 40;
        }
        if (C71073b.m125568a(videoPublishEditModel)) {
            return 54;
        }
        if (videoPublishEditModel.isPhotoMvMode) {
            return 61;
        }
        if (videoPublishEditModel.isMvThemeVideoType()) {
            return 53;
        }
        if (videoPublishEditModel.isStitchMode()) {
            return 58;
        }
        if (videoPublishEditModel.isStickPointMode) {
            return 55;
        }
        if (videoPublishEditModel.isDuet()) {
            return 51;
        }
        return -1;
    }

    /* renamed from: i */
    public static final void m126798i(VideoPublishEditModel videoPublishEditModel) {
        EditPreviewInfo previewInfo;
        List<EditVideoSegment> videoList;
        C89219l.m154721d(videoPublishEditModel, "");
        if (!(videoPublishEditModel.mIsFromDraft || !videoPublishEditModel.isStitchMode() || (previewInfo = videoPublishEditModel.getPreviewInfo()) == null || (videoList = previewInfo.getVideoList()) == null)) {
            for (T t : videoList) {
                C84902i.m145896b(t.getVideoPath());
                C84902i.m145896b(t.getAudioPath());
            }
        }
    }

    /* renamed from: l */
    public static final boolean m126801l(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.mOrigin != 1) {
            return C65341ak.m117027a();
        }
        if (!C16048b.m29633a().mo25421a(true, "enable_shoot_adjust_addfeature", false) || C63244g.m114602a().mo73255A().mo93901a()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static final boolean m126802m(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        C89219l.m154721d(videoPublishEditModel, "");
        if (!m126801l(videoPublishEditModel)) {
            return false;
        }
        if (videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.getStitchParams() != null) {
            z = false;
        } else {
            z = true;
        }
        if (videoPublishEditModel.multiEditVideoRecordData != null) {
            videoPublishEditModel.multiEditVideoRecordData.isSupportMultiEdit = z;
        }
        if (!z || videoPublishEditModel.multiEditVideoRecordData == null || videoPublishEditModel.multiEditVideoRecordData.curMultiEditVideoRecordData == null) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static final boolean m126803n(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (!m126802m(videoPublishEditModel) || videoPublishEditModel.getSharedARModel() != null || videoPublishEditModel.isDuet() || videoPublishEditModel.isReaction() || videoPublishEditModel.containBackgroundVideo || !videoPublishEditModel.supportRetake || videoPublishEditModel.isCutSameVideoType() || videoPublishEditModel.isPhotoMvMode) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final String m126790a(VideoPublishEditModel videoPublishEditModel) {
        String contentSource;
        if (videoPublishEditModel == null) {
            return "";
        }
        if (videoPublishEditModel.storyEditEtParam != null) {
            StoryEditEtParam storyEditEtParam = videoPublishEditModel.storyEditEtParam;
            if (storyEditEtParam == null || (contentSource = storyEditEtParam.getContentSource()) == null) {
                return "";
            }
            return contentSource;
        } else if (videoPublishEditModel.getAvetParameter() != null) {
            return videoPublishEditModel.getAvetParameter().getContentSource();
        } else {
            if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut || videoPublishEditModel.isMvThemeVideoType()) {
                return "upload";
            }
            return "shoot";
        }
    }

    /* renamed from: c */
    public static final String m126792c(VideoPublishEditModel videoPublishEditModel) {
        String contentType;
        if (videoPublishEditModel == null) {
            return "";
        }
        if (videoPublishEditModel.storyEditEtParam != null) {
            StoryEditEtParam storyEditEtParam = videoPublishEditModel.storyEditEtParam;
            if (storyEditEtParam == null || (contentType = storyEditEtParam.getContentType()) == null) {
                return "";
            }
            return contentType;
        } else if (videoPublishEditModel.isPhotoMvMode) {
            return "slideshow";
        } else {
            if (videoPublishEditModel.isMvThemeVideoType()) {
                return "mv";
            }
            if (videoPublishEditModel.isStickPointMode || videoPublishEditModel.editMusicSyncMode) {
                return "sound_sync";
            }
            if (videoPublishEditModel.getAvetParameter() != null) {
                return videoPublishEditModel.getAvetParameter().getContentType();
            }
            if (videoPublishEditModel.canvasVideoData != null) {
                return "photo_canvas";
            }
            return "video";
        }
    }

    /* renamed from: e */
    public static final String m126794e(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.getOriginal() != 1) {
            return "";
        }
        if (videoPublishEditModel.isPhotoMvMode) {
            return UGCMonitor.TYPE_PHOTO;
        }
        if (videoPublishEditModel.isMvThemeVideoType()) {
            return "mv";
        }
        int i = videoPublishEditModel.mShootMode;
        if (i == 2) {
            return "fast_shoot";
        }
        if (i == 8) {
            return "video";
        }
        if (i == 10) {
            return "video_15";
        }
        if (i == 11) {
            return "video_60";
        }
        if (i == 14) {
            return "video_180";
        }
        if (i != 15) {
            return "";
        }
        return "fast_shoot";
    }

    /* renamed from: o */
    public static final boolean m126804o(VideoPublishEditModel videoPublishEditModel) {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        MultiEditVideoRecordData multiEditVideoRecordData2;
        List<MultiEditVideoSegmentRecordData> list2;
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.mOrigin != 1) {
            return false;
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = videoPublishEditModel.multiEditVideoRecordData;
        if (!(!(multiEditVideoStatusRecordData2 == null || (multiEditVideoRecordData2 = multiEditVideoStatusRecordData2.curMultiEditVideoRecordData) == null || (list2 = multiEditVideoRecordData2.segmentDataList) == null || !list2.isEmpty()) || (multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData) == null || (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) == null || (list = multiEditVideoRecordData.segmentDataList) == null)) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (hashSet.add(Integer.valueOf(t.rotate))) {
                    arrayList.add(t);
                }
            }
            if (arrayList.size() > 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r0 != null) goto L_0x0029;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.p2082ss.android.ugc.aweme.filter.FilterBean m126789a(com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3, com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o r4) {
        /*
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r4, r0)
            java.lang.String r0 = r3.mSelectedFilterId
            r2 = 0
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.filter.repository.a.q r1 = r4.mo86071f()     // Catch:{ NumberFormatException -> 0x001a }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x001a }
            com.ss.android.ugc.aweme.filter.FilterBean r0 = com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c.m94990b(r1, r0)     // Catch:{ NumberFormatException -> 0x001a }
            goto L_0x001b
        L_0x001a:
            r0 = r2
        L_0x001b:
            if (r0 != 0) goto L_0x0029
        L_0x001d:
            java.lang.String r1 = r3.mSelectedFilterResId
            if (r1 == 0) goto L_0x002a
            com.ss.android.ugc.aweme.filter.repository.a.q r0 = r4.mo86071f()     // Catch:{ NumberFormatException -> 0x002a }
            com.ss.android.ugc.aweme.filter.FilterBean r0 = com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c.m94987a(r0, r1)     // Catch:{ NumberFormatException -> 0x002a }
        L_0x0029:
            r2 = r0
        L_0x002a:
            if (r2 != 0) goto L_0x0036
            com.ss.android.ugc.aweme.filter.repository.a.q r1 = r4.mo86071f()
            int r0 = r3.mSelectedId
            com.ss.android.ugc.aweme.filter.FilterBean r2 = com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c.m94986a(r1, r0)
        L_0x0036:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.C71817eu.m126789a(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.filter.repository.a.o):com.ss.android.ugc.aweme.filter.FilterBean");
    }
}

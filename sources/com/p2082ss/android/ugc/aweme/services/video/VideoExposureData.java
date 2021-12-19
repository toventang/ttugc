package com.p2082ss.android.ugc.aweme.services.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.video.VideoExposureData */
public final class VideoExposureData {
    private final AVUploadSaveModel avUploadSaveModel;
    private final String creationId;
    private final String draftPrimaryKey;
    private final String inputVideoFile;
    private final boolean isSaveLocal;
    private final String localFinalPath;
    private final String mainBusinessData;
    private final int origin;
    private final String outPutFile;
    private final String path;
    private final String shootWay;
    private final float videoCoverStartTm;

    static {
        Covode.recordClassIndex(80032);
    }

    /* renamed from: com_ss_android_ugc_aweme_services_video_VideoExposureData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m120136xa2f3b436(int i) {
        return i;
    }

    public static /* synthetic */ VideoExposureData copy$default(VideoExposureData videoExposureData, String str, float f, String str2, String str3, String str4, String str5, boolean z, String str6, AVUploadSaveModel aVUploadSaveModel, int i, String str7, String str8, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = videoExposureData.path;
        }
        if ((i2 & 2) != 0) {
            f = videoExposureData.videoCoverStartTm;
        }
        if ((i2 & 4) != 0) {
            str2 = videoExposureData.mainBusinessData;
        }
        if ((i2 & 8) != 0) {
            str3 = videoExposureData.outPutFile;
        }
        if ((i2 & 16) != 0) {
            str4 = videoExposureData.inputVideoFile;
        }
        if ((i2 & 32) != 0) {
            str5 = videoExposureData.creationId;
        }
        if ((i2 & 64) != 0) {
            z = videoExposureData.isSaveLocal;
        }
        if ((i2 & 128) != 0) {
            str6 = videoExposureData.localFinalPath;
        }
        if ((i2 & 256) != 0) {
            aVUploadSaveModel = videoExposureData.avUploadSaveModel;
        }
        if ((i2 & 512) != 0) {
            i = videoExposureData.origin;
        }
        if ((i2 & 1024) != 0) {
            str7 = videoExposureData.draftPrimaryKey;
        }
        if ((i2 & 2048) != 0) {
            str8 = videoExposureData.shootWay;
        }
        return videoExposureData.copy(str, f, str2, str3, str4, str5, z, str6, aVUploadSaveModel, i, str7, str8);
    }

    public final String component1() {
        return this.path;
    }

    public final int component10() {
        return this.origin;
    }

    public final String component11() {
        return this.draftPrimaryKey;
    }

    public final String component12() {
        return this.shootWay;
    }

    public final float component2() {
        return this.videoCoverStartTm;
    }

    public final String component3() {
        return this.mainBusinessData;
    }

    public final String component4() {
        return this.outPutFile;
    }

    public final String component5() {
        return this.inputVideoFile;
    }

    public final String component6() {
        return this.creationId;
    }

    public final boolean component7() {
        return this.isSaveLocal;
    }

    public final String component8() {
        return this.localFinalPath;
    }

    public final AVUploadSaveModel component9() {
        return this.avUploadSaveModel;
    }

    public final VideoExposureData copy(String str, float f, String str2, String str3, String str4, String str5, boolean z, String str6, AVUploadSaveModel aVUploadSaveModel, int i, String str7, String str8) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        return new VideoExposureData(str, f, str2, str3, str4, str5, z, str6, aVUploadSaveModel, i, str7, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoExposureData)) {
            return false;
        }
        VideoExposureData videoExposureData = (VideoExposureData) obj;
        return C89219l.m154714a(this.path, videoExposureData.path) && Float.compare(this.videoCoverStartTm, videoExposureData.videoCoverStartTm) == 0 && C89219l.m154714a(this.mainBusinessData, videoExposureData.mainBusinessData) && C89219l.m154714a(this.outPutFile, videoExposureData.outPutFile) && C89219l.m154714a(this.inputVideoFile, videoExposureData.inputVideoFile) && C89219l.m154714a(this.creationId, videoExposureData.creationId) && this.isSaveLocal == videoExposureData.isSaveLocal && C89219l.m154714a(this.localFinalPath, videoExposureData.localFinalPath) && C89219l.m154714a(this.avUploadSaveModel, videoExposureData.avUploadSaveModel) && this.origin == videoExposureData.origin && C89219l.m154714a(this.draftPrimaryKey, videoExposureData.draftPrimaryKey) && C89219l.m154714a(this.shootWay, videoExposureData.shootWay);
    }

    public final int hashCode() {
        String str = this.path;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + m120135xa2f3b436(this.videoCoverStartTm)) * 31;
        String str2 = this.mainBusinessData;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.outPutFile;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.inputVideoFile;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.creationId;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.isSaveLocal;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode5 + i2) * 31;
        String str6 = this.localFinalPath;
        int hashCode6 = (i5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        AVUploadSaveModel aVUploadSaveModel = this.avUploadSaveModel;
        int hashCode7 = (((hashCode6 + (aVUploadSaveModel != null ? aVUploadSaveModel.hashCode() : 0)) * 31) + m120136xa2f3b436(this.origin)) * 31;
        String str7 = this.draftPrimaryKey;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.shootWay;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "VideoExposureData(path=" + this.path + ", videoCoverStartTm=" + this.videoCoverStartTm + ", mainBusinessData=" + this.mainBusinessData + ", outPutFile=" + this.outPutFile + ", inputVideoFile=" + this.inputVideoFile + ", creationId=" + this.creationId + ", isSaveLocal=" + this.isSaveLocal + ", localFinalPath=" + this.localFinalPath + ", avUploadSaveModel=" + this.avUploadSaveModel + ", origin=" + this.origin + ", draftPrimaryKey=" + this.draftPrimaryKey + ", shootWay=" + this.shootWay + ")";
    }

    public final AVUploadSaveModel getAvUploadSaveModel() {
        return this.avUploadSaveModel;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getDraftPrimaryKey() {
        return this.draftPrimaryKey;
    }

    public final String getInputVideoFile() {
        return this.inputVideoFile;
    }

    public final String getLocalFinalPath() {
        return this.localFinalPath;
    }

    public final String getMainBusinessData() {
        return this.mainBusinessData;
    }

    public final int getOrigin() {
        return this.origin;
    }

    public final String getOutPutFile() {
        return this.outPutFile;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final float getVideoCoverStartTm() {
        return this.videoCoverStartTm;
    }

    public final boolean isSaveLocal() {
        return this.isSaveLocal;
    }

    /* renamed from: com_ss_android_ugc_aweme_services_video_VideoExposureData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m120135xa2f3b436(float f) {
        return Float.floatToIntBits(f);
    }

    public VideoExposureData(String str, float f, String str2, String str3, String str4, String str5, boolean z, String str6, AVUploadSaveModel aVUploadSaveModel, int i, String str7, String str8) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        this.path = str;
        this.videoCoverStartTm = f;
        this.mainBusinessData = str2;
        this.outPutFile = str3;
        this.inputVideoFile = str4;
        this.creationId = str5;
        this.isSaveLocal = z;
        this.localFinalPath = str6;
        this.avUploadSaveModel = aVUploadSaveModel;
        this.origin = i;
        this.draftPrimaryKey = str7;
        this.shootWay = str8;
    }
}

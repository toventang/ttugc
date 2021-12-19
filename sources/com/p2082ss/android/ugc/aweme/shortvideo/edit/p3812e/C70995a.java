package com.p2082ss.android.ugc.aweme.shortvideo.edit.p3812e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.e.a */
public final class C70995a implements Serializable {

    /* renamed from: a */
    private AudioRecorderParam f158921a;

    /* renamed from: b */
    private MultiEditVideoRecordData f158922b;

    /* renamed from: c */
    private float f158923c;

    /* renamed from: d */
    private long f158924d;

    /* renamed from: e */
    private long f158925e;

    static {
        Covode.recordClassIndex(83489);
    }

    public final AudioRecorderParam getAudioRecordParam() {
        return this.f158921a;
    }

    public final MultiEditVideoRecordData getEditRecordData() {
        return this.f158922b;
    }

    public final long getRecordEndTime() {
        return this.f158925e;
    }

    public final long getRecordStartTime() {
        return this.f158924d;
    }

    public final float getVoiceVolume() {
        return this.f158923c;
    }

    public final void setAudioRecordParam(AudioRecorderParam audioRecorderParam) {
        this.f158921a = audioRecorderParam;
    }

    public final void setEditRecordData(MultiEditVideoRecordData multiEditVideoRecordData) {
        this.f158922b = multiEditVideoRecordData;
    }

    public final void setRecordEndTime(long j) {
        this.f158925e = j;
    }

    public final void setRecordStartTime(long j) {
        this.f158924d = j;
    }

    public final void setVoiceVolume(float f) {
        this.f158923c = f;
    }

    public final boolean hasChanged(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (hasOriginalAudioChange(videoPublishEditModel) || hasAudioRecorderChange(videoPublishEditModel) || hasVoiceVolumeChange(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public final boolean hasVoiceVolumeChange(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (this.f158923c != videoPublishEditModel.voiceVolume) {
            return true;
        }
        return false;
    }

    public final boolean hasAudioRecorderChange(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (this.f158921a == null && videoPublishEditModel.veAudioRecorderParam == null) {
            return false;
        }
        AudioRecorderParam audioRecorderParam = this.f158921a;
        if (audioRecorderParam != null) {
            return audioRecorderParam.hasChange(videoPublishEditModel.veAudioRecorderParam);
        }
        AudioRecorderParam audioRecorderParam2 = videoPublishEditModel.veAudioRecorderParam;
        if (audioRecorderParam2 == null) {
            C89219l.m154715b();
        }
        return audioRecorderParam2.hasChange(this.f158921a);
    }

    public final void getData(VideoPublishEditModel videoPublishEditModel) {
        long j;
        MultiEditVideoRecordData multiEditVideoRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData2;
        MultiEditVideoRecordData multiEditVideoRecordData3;
        C89219l.m154721d(videoPublishEditModel, "");
        MultiEditVideoRecordData multiEditVideoRecordData4 = null;
        if (videoPublishEditModel.veAudioRecorderParam == null) {
            this.f158921a = null;
        } else {
            if (this.f158921a == null) {
                this.f158921a = new AudioRecorderParam();
            }
            AudioRecorderParam audioRecorderParam = this.f158921a;
            if (audioRecorderParam == null) {
                C89219l.m154715b();
            }
            audioRecorderParam.copyFrom(videoPublishEditModel.veAudioRecorderParam);
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
        if (!(multiEditVideoStatusRecordData == null || (multiEditVideoRecordData3 = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) == null)) {
            multiEditVideoRecordData4 = multiEditVideoRecordData3.cloneSegmentDataList();
        }
        this.f158922b = multiEditVideoRecordData4;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = videoPublishEditModel.multiEditVideoRecordData;
        long j2 = 0;
        if (multiEditVideoStatusRecordData2 == null || (multiEditVideoRecordData2 = multiEditVideoStatusRecordData2.curMultiEditVideoRecordData) == null) {
            j = 0;
        } else {
            j = multiEditVideoRecordData2.startTime;
        }
        this.f158924d = j;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData3 = videoPublishEditModel.multiEditVideoRecordData;
        if (!(multiEditVideoStatusRecordData3 == null || (multiEditVideoRecordData = multiEditVideoStatusRecordData3.curMultiEditVideoRecordData) == null)) {
            j2 = multiEditVideoRecordData.endTime;
        }
        this.f158925e = j2;
        this.f158923c = videoPublishEditModel.voiceVolume;
    }

    public final boolean hasOriginalAudioChange(VideoPublishEditModel videoPublishEditModel) {
        long j;
        MultiEditVideoRecordData multiEditVideoRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData2;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        C89219l.m154721d(videoPublishEditModel, "");
        MultiEditVideoRecordData multiEditVideoRecordData3 = null;
        if (this.f158922b == null && ((multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData) == null || multiEditVideoStatusRecordData.curMultiEditVideoRecordData == null)) {
            return false;
        }
        MultiEditVideoRecordData multiEditVideoRecordData4 = this.f158922b;
        if (multiEditVideoRecordData4 == null) {
            return true;
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = videoPublishEditModel.multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData2 != null) {
            multiEditVideoRecordData3 = multiEditVideoStatusRecordData2.curMultiEditVideoRecordData;
        }
        if (multiEditVideoRecordData4.isEqual(multiEditVideoRecordData3)) {
            long j2 = this.f158924d;
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData3 = videoPublishEditModel.multiEditVideoRecordData;
            long j3 = 0;
            if (multiEditVideoStatusRecordData3 == null || (multiEditVideoRecordData2 = multiEditVideoStatusRecordData3.curMultiEditVideoRecordData) == null) {
                j = 0;
            } else {
                j = multiEditVideoRecordData2.startTime;
            }
            if (j2 == j) {
                long j4 = this.f158925e;
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData4 = videoPublishEditModel.multiEditVideoRecordData;
                if (!(multiEditVideoStatusRecordData4 == null || (multiEditVideoRecordData = multiEditVideoStatusRecordData4.curMultiEditVideoRecordData) == null)) {
                    j3 = multiEditVideoRecordData.endTime;
                }
                if (j4 != j3) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}

package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData */
public class MultiEditVideoRecordData implements Parcelable, Serializable {
    public static final Parcelable.Creator<MultiEditVideoRecordData> CREATOR = new Parcelable.Creator<MultiEditVideoRecordData>() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData.C714891 */

        static {
            Covode.recordClassIndex(84026);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MultiEditVideoRecordData[] newArray(int i) {
            return new MultiEditVideoRecordData[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MultiEditVideoRecordData createFromParcel(Parcel parcel) {
            return new MultiEditVideoRecordData(parcel);
        }
    };
    @AbstractC27891c(mo46611a = "concat_audio")
    public String concatAudio;
    @AbstractC27891c(mo46611a = "concat_video")
    public String concatVideo;
    @AbstractC27891c(mo46611a = "cover_path")
    public String coverPath;
    public String curRecordingDir;
    @AbstractC27891c(mo46611a = "end_time")
    public long endTime;
    @AbstractC27891c(mo46611a = "from_cut")
    public boolean fromCut;
    @AbstractC27891c(mo46611a = "has_retake")
    public boolean hasRetake;
    @AbstractC27891c(mo46611a = "is_single_video")
    public boolean isSingleVideo;
    @AbstractC27891c(mo46611a = "is_sound_loop")
    public boolean isSoundLoop;
    @AbstractC27891c(mo46611a = "left_slide_x")
    public float leftSlideX;
    @AbstractC27891c(mo46611a = "music_duration")
    public int musicDuration;
    @AbstractC27891c(mo46611a = "music_index")
    public int musicIndex = -1;
    @AbstractC27891c(mo46611a = "music_path")
    public String musicPath;
    @AbstractC27891c(mo46611a = "music_trimin")
    public int musicTrimIn;
    @AbstractC27891c(mo46611a = "music_volume")
    public float musicVolume = 0.5f;
    @AbstractC27891c(mo46611a = "origin_volume")
    public float originVolume = 0.5f;
    @AbstractC27891c(mo46611a = "video_duration")
    public int preVideoDuration;
    @AbstractC27891c(mo46611a = "right_slide_x")
    public float rightSlideX;
    @AbstractC27891c(mo46611a = "segment_list")
    public List<MultiEditVideoSegmentRecordData> segmentDataList;
    @AbstractC27891c(mo46611a = "start_time")
    public long startTime;
    @AbstractC27891c(mo46611a = "use_music")
    public boolean useMusic;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    private int m126268a() {
        return (int) (this.endTime - this.startTime);
    }

    static {
        Covode.recordClassIndex(84025);
    }

    public MultiEditVideoRecordData() {
    }

    public MultiEditVideoRecordData cloneSegmentDataList() {
        MultiEditVideoRecordData multiEditVideoRecordData = new MultiEditVideoRecordData();
        multiEditVideoRecordData.segmentDataList = new ArrayList();
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : this.segmentDataList) {
            multiEditVideoRecordData.segmentDataList.add(multiEditVideoSegmentRecordData.cloneData());
        }
        return multiEditVideoRecordData;
    }

    public boolean isPlaySingleSegmentMusic() {
        if (this.musicDuration + 1000 >= ((Integer) getPlayInOutTime().second).intValue() - ((Integer) getPlayInOutTime().first).intValue()) {
            return true;
        }
        return false;
    }

    public void resetTimeData() {
        List<MultiEditVideoSegmentRecordData> list = this.segmentDataList;
        if (!(list == null || list.isEmpty())) {
            this.startTime = 0;
            this.endTime = 0;
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : this.segmentDataList) {
                multiEditVideoSegmentRecordData.resetTime();
                this.endTime += multiEditVideoSegmentRecordData.videoLength / 1000;
            }
        }
    }

    public MultiEditVideoRecordData cloneData() {
        MultiEditVideoRecordData multiEditVideoRecordData = new MultiEditVideoRecordData();
        multiEditVideoRecordData.concatVideo = this.concatVideo;
        multiEditVideoRecordData.concatAudio = this.concatAudio;
        multiEditVideoRecordData.useMusic = this.useMusic;
        multiEditVideoRecordData.startTime = this.startTime;
        multiEditVideoRecordData.endTime = this.endTime;
        multiEditVideoRecordData.leftSlideX = this.leftSlideX;
        multiEditVideoRecordData.rightSlideX = this.rightSlideX;
        multiEditVideoRecordData.curRecordingDir = this.curRecordingDir;
        multiEditVideoRecordData.segmentDataList = new ArrayList();
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : this.segmentDataList) {
            multiEditVideoRecordData.segmentDataList.add(multiEditVideoSegmentRecordData.cloneData());
        }
        multiEditVideoRecordData.musicPath = this.musicPath;
        multiEditVideoRecordData.originVolume = this.originVolume;
        multiEditVideoRecordData.musicVolume = this.musicVolume;
        multiEditVideoRecordData.hasRetake = this.hasRetake;
        multiEditVideoRecordData.musicTrimIn = this.musicTrimIn;
        multiEditVideoRecordData.musicDuration = this.musicDuration;
        multiEditVideoRecordData.preVideoDuration = this.preVideoDuration;
        multiEditVideoRecordData.coverPath = this.coverPath;
        multiEditVideoRecordData.isSingleVideo = this.isSingleVideo;
        multiEditVideoRecordData.isSoundLoop = this.isSoundLoop;
        multiEditVideoRecordData.fromCut = this.fromCut;
        return multiEditVideoRecordData;
    }

    public List<MediaModel> convertMediaModelList() {
        List<MultiEditVideoSegmentRecordData> list = this.segmentDataList;
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : this.segmentDataList) {
            arrayList.add(multiEditVideoSegmentRecordData.convertModel());
        }
        if (this.isSingleVideo) {
            MediaModel mediaModel = (MediaModel) arrayList.get(0);
            mediaModel.f134677q = (int) this.startTime;
            mediaModel.f134678r = (int) this.endTime;
            mediaModel.f134668h = this.endTime - this.startTime;
        }
        return arrayList;
    }

    public Pair<Integer, Integer> getPlayInOutTime() {
        int i;
        int i2 = (int) this.startTime;
        if (m126268a() > 0) {
            i = m126268a();
        } else {
            List<MultiEditVideoSegmentRecordData> list = this.segmentDataList;
            if (list == null || list.isEmpty()) {
                i = 0;
            } else {
                long j = 0;
                for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : this.segmentDataList) {
                    j += multiEditVideoSegmentRecordData.getEndTime() - multiEditVideoSegmentRecordData.getStartTime();
                }
                i = (int) j;
            }
        }
        return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i2 + i));
    }

    public void copyData(MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData != null) {
            this.startTime = multiEditVideoRecordData.startTime;
            this.endTime = multiEditVideoRecordData.endTime;
            this.leftSlideX = multiEditVideoRecordData.leftSlideX;
            this.rightSlideX = multiEditVideoRecordData.rightSlideX;
            this.useMusic = multiEditVideoRecordData.useMusic;
            this.concatVideo = multiEditVideoRecordData.concatVideo;
            this.concatAudio = multiEditVideoRecordData.concatAudio;
            this.musicIndex = multiEditVideoRecordData.musicIndex;
            this.musicVolume = multiEditVideoRecordData.musicVolume;
            this.originVolume = multiEditVideoRecordData.originVolume;
            this.musicPath = multiEditVideoRecordData.musicPath;
            this.hasRetake = multiEditVideoRecordData.hasRetake;
            this.musicTrimIn = multiEditVideoRecordData.musicTrimIn;
            this.musicDuration = multiEditVideoRecordData.musicDuration;
            this.preVideoDuration = multiEditVideoRecordData.preVideoDuration;
            this.coverPath = multiEditVideoRecordData.coverPath;
            this.isSingleVideo = multiEditVideoRecordData.isSingleVideo;
            this.isSoundLoop = multiEditVideoRecordData.isSoundLoop;
            this.fromCut = multiEditVideoRecordData.fromCut;
        }
    }

    public boolean isEqual(MultiEditVideoRecordData multiEditVideoRecordData) {
        List<MultiEditVideoSegmentRecordData> list;
        List<MultiEditVideoSegmentRecordData> list2;
        if (multiEditVideoRecordData == null || (list = multiEditVideoRecordData.segmentDataList) == null || list.isEmpty() || (list2 = this.segmentDataList) == null || list2.isEmpty() || this.segmentDataList.size() != multiEditVideoRecordData.segmentDataList.size()) {
            return false;
        }
        for (int i = 0; i < this.segmentDataList.size(); i++) {
            if (!this.segmentDataList.get(i).isEqual(multiEditVideoRecordData.segmentDataList.get(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean isEqualWithDeleteStatus(MultiEditVideoRecordData multiEditVideoRecordData) {
        List<MultiEditVideoSegmentRecordData> list;
        List<MultiEditVideoSegmentRecordData> list2;
        if (multiEditVideoRecordData == null || (list = multiEditVideoRecordData.segmentDataList) == null || list.isEmpty() || (list2 = this.segmentDataList) == null || list2.isEmpty() || this.segmentDataList.size() != multiEditVideoRecordData.segmentDataList.size()) {
            return false;
        }
        for (int i = 0; i < this.segmentDataList.size(); i++) {
            if (!this.segmentDataList.get(i).isEqual(multiEditVideoRecordData.segmentDataList.get(i)) || this.segmentDataList.get(i).enable != multiEditVideoRecordData.segmentDataList.get(i).enable) {
                return false;
            }
        }
        return true;
    }

    protected MultiEditVideoRecordData(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.segmentDataList = parcel.createTypedArrayList(MultiEditVideoSegmentRecordData.CREATOR);
        boolean z5 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.useMusic = z;
        this.concatVideo = parcel.readString();
        this.concatAudio = parcel.readString();
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
        this.leftSlideX = parcel.readFloat();
        this.rightSlideX = parcel.readFloat();
        this.curRecordingDir = parcel.readString();
        if (parcel.readByte() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.hasRetake = z2;
        this.musicPath = parcel.readString();
        this.originVolume = parcel.readFloat();
        this.musicVolume = parcel.readFloat();
        this.musicTrimIn = parcel.readInt();
        this.musicDuration = parcel.readInt();
        this.preVideoDuration = parcel.readInt();
        this.coverPath = parcel.readString();
        if (parcel.readByte() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isSingleVideo = z3;
        if (parcel.readByte() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.isSoundLoop = z4;
        this.fromCut = parcel.readByte() == 1 ? true : z5;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.segmentDataList);
        parcel.writeByte(this.useMusic ? (byte) 1 : 0);
        parcel.writeString(this.concatVideo);
        parcel.writeString(this.concatAudio);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeFloat(this.leftSlideX);
        parcel.writeFloat(this.rightSlideX);
        parcel.writeString(this.curRecordingDir);
        parcel.writeByte(this.hasRetake ? (byte) 1 : 0);
        parcel.writeString(this.musicPath);
        parcel.writeFloat(this.originVolume);
        parcel.writeFloat(this.musicVolume);
        parcel.writeInt(this.musicTrimIn);
        parcel.writeInt(this.musicDuration);
        parcel.writeInt(this.preVideoDuration);
        parcel.writeString(this.coverPath);
        parcel.writeByte(this.isSingleVideo ? (byte) 1 : 0);
        parcel.writeByte(this.isSoundLoop ? (byte) 1 : 0);
        parcel.writeByte(this.fromCut ? (byte) 1 : 0);
    }
}

package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData */
public class MultiEditVideoSegmentRecordData implements Parcelable, Serializable {
    public static final Parcelable.Creator<MultiEditVideoSegmentRecordData> CREATOR = new Parcelable.Creator<MultiEditVideoSegmentRecordData>() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData.C714901 */

        static {
            Covode.recordClassIndex(84028);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MultiEditVideoSegmentRecordData[] newArray(int i) {
            return new MultiEditVideoSegmentRecordData[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MultiEditVideoSegmentRecordData createFromParcel(Parcel parcel) {
            return new MultiEditVideoSegmentRecordData(parcel);
        }
    };
    @AbstractC27891c(mo46611a = "speed")

    /* renamed from: a */
    private float f160193a;
    @AbstractC27891c(mo46611a = "audio_length")
    public long audioLength;
    @AbstractC27891c(mo46611a = "audio_path")
    public String audioPath;
    @AbstractC27891c(mo46611a = "audio_speed")
    public float audioSpeed;
    @AbstractC27891c(mo46611a = "startTime")

    /* renamed from: b */
    private long f160194b;
    @AbstractC27891c(mo46611a = "endTime")

    /* renamed from: c */
    private long f160195c;
    @AbstractC27891c(mo46611a = "draft_audio_path")
    public String draftAudioPath;
    @AbstractC27891c(mo46611a = "draft_video_path")
    public String draftVideoPath;
    @AbstractC27891c(mo46611a = "enable")
    public boolean enable;
    @AbstractC27891c(mo46611a = "frameLeakProbability")
    public int frameLeakProbability;
    @AbstractC27891c(mo46611a = "height")
    public int height;
    @AbstractC27891c(mo46611a = "edit_trim_state")
    public MultiEditTrimState multiEditTrimState;
    @AbstractC27891c(mo46611a = "music_sync_data")
    public MusicSyncData musicSyncData;
    @AbstractC27891c(mo46611a = "rotate")
    public int rotate;
    @AbstractC27891c(mo46611a = "scale")
    public float scale;
    @AbstractC27891c(mo46611a = "video_key")
    public int videoKey;
    @AbstractC27891c(mo46611a = "video_length")
    public long videoLength;
    @AbstractC27891c(mo46611a = "video_path")
    public String videoPath;
    @AbstractC27891c(mo46611a = "width")
    public int width;

    public int describeContents() {
        return 0;
    }

    public long getOriginEndTime() {
        return this.f160195c;
    }

    public long getOriginStartTime() {
        return this.f160194b;
    }

    public float getOriginVideoSpeed() {
        return this.f160193a;
    }

    static {
        Covode.recordClassIndex(84027);
    }

    public long getEndTime() {
        MusicSyncData musicSyncData2 = this.musicSyncData;
        if (musicSyncData2 != null) {
            return musicSyncData2.getVideoEnd();
        }
        return this.f160195c;
    }

    public long getStartTime() {
        MusicSyncData musicSyncData2 = this.musicSyncData;
        if (musicSyncData2 != null) {
            return musicSyncData2.getVideoStart();
        }
        return this.f160194b;
    }

    public float getVideoSpeed() {
        if (this.musicSyncData != null) {
            return 1.0f;
        }
        return this.f160193a;
    }

    public void resetTime() {
        this.f160194b = 0;
        this.f160195c = this.videoLength / 1000;
        this.frameLeakProbability = 0;
    }

    public MultiEditVideoSegmentRecordData() {
        this.f160193a = 1.0f;
        this.audioSpeed = 1.0f;
        this.width = 720;
        this.height = 1080;
        this.enable = true;
    }

    public MediaModel convertModel() {
        MediaModel mediaModel = new MediaModel(-1);
        mediaModel.f134662b = this.videoPath;
        mediaModel.f134668h = this.videoLength / 1000;
        mediaModel.f134672l = this.width;
        mediaModel.f134673m = this.height;
        mediaModel.f134677q = (int) this.f160194b;
        mediaModel.f134678r = (int) this.f160195c;
        mediaModel.f134679s = this.f160193a;
        return mediaModel;
    }

    public String toString() {
        return "MultiEditVideoSegmentRecordData{videoPath=" + this.videoPath + ", videoLength=" + this.videoLength + ", startTime=" + this.f160194b + ", endTime=" + this.f160195c + '}';
    }

    public MultiEditVideoSegmentRecordData cloneData() {
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = new MultiEditVideoSegmentRecordData();
        multiEditVideoSegmentRecordData.videoPath = this.videoPath;
        multiEditVideoSegmentRecordData.videoLength = this.videoLength;
        multiEditVideoSegmentRecordData.draftVideoPath = this.draftVideoPath;
        multiEditVideoSegmentRecordData.draftAudioPath = this.draftAudioPath;
        multiEditVideoSegmentRecordData.audioPath = this.audioPath;
        multiEditVideoSegmentRecordData.audioLength = this.audioLength;
        multiEditVideoSegmentRecordData.f160193a = this.f160193a;
        multiEditVideoSegmentRecordData.audioSpeed = this.audioSpeed;
        multiEditVideoSegmentRecordData.f160194b = this.f160194b;
        multiEditVideoSegmentRecordData.f160195c = this.f160195c;
        multiEditVideoSegmentRecordData.rotate = this.rotate;
        multiEditVideoSegmentRecordData.frameLeakProbability = this.frameLeakProbability;
        multiEditVideoSegmentRecordData.videoKey = this.videoKey;
        multiEditVideoSegmentRecordData.enable = this.enable;
        multiEditVideoSegmentRecordData.width = this.width;
        multiEditVideoSegmentRecordData.height = this.height;
        multiEditVideoSegmentRecordData.scale = this.scale;
        multiEditVideoSegmentRecordData.musicSyncData = this.musicSyncData;
        multiEditVideoSegmentRecordData.multiEditTrimState = this.multiEditTrimState;
        return multiEditVideoSegmentRecordData;
    }

    public void setVideoSpeed(float f) {
        if (this.musicSyncData == null) {
            this.f160193a = f;
        }
    }

    public void setEndTime(long j) {
        MusicSyncData musicSyncData2 = this.musicSyncData;
        if (musicSyncData2 != null) {
            this.musicSyncData = musicSyncData2.copy(musicSyncData2.getVideoStart(), j, this.musicSyncData.getVideoDuration());
        } else {
            this.f160195c = j;
        }
    }

    public void setStartTime(long j) {
        MusicSyncData musicSyncData2 = this.musicSyncData;
        if (musicSyncData2 != null) {
            this.musicSyncData = musicSyncData2.copy(j, musicSyncData2.getVideoEnd(), this.musicSyncData.getVideoDuration());
        } else {
            this.f160194b = j;
        }
    }

    public void copyData(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData) {
        if (multiEditVideoSegmentRecordData != null) {
            this.videoPath = multiEditVideoSegmentRecordData.videoPath;
            this.audioPath = multiEditVideoSegmentRecordData.audioPath;
            this.videoLength = multiEditVideoSegmentRecordData.videoLength;
            this.audioLength = multiEditVideoSegmentRecordData.audioLength;
            this.f160194b = multiEditVideoSegmentRecordData.f160194b;
            this.f160195c = multiEditVideoSegmentRecordData.f160195c;
            this.f160193a = multiEditVideoSegmentRecordData.f160193a;
            this.audioSpeed = multiEditVideoSegmentRecordData.audioSpeed;
            this.rotate = multiEditVideoSegmentRecordData.rotate;
            this.frameLeakProbability = multiEditVideoSegmentRecordData.frameLeakProbability;
            this.videoKey = multiEditVideoSegmentRecordData.videoKey;
            this.enable = multiEditVideoSegmentRecordData.enable;
            this.width = multiEditVideoSegmentRecordData.width;
            this.height = multiEditVideoSegmentRecordData.height;
            this.scale = multiEditVideoSegmentRecordData.scale;
            this.musicSyncData = multiEditVideoSegmentRecordData.musicSyncData;
            this.multiEditTrimState = multiEditVideoSegmentRecordData.multiEditTrimState;
        }
    }

    public boolean isEqual(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData) {
        if (multiEditVideoSegmentRecordData != null && TextUtils.equals(this.videoPath, multiEditVideoSegmentRecordData.videoPath) && this.videoLength == multiEditVideoSegmentRecordData.videoLength && TextUtils.equals(this.audioPath, multiEditVideoSegmentRecordData.audioPath) && this.audioLength == multiEditVideoSegmentRecordData.audioLength && this.f160193a == multiEditVideoSegmentRecordData.f160193a && this.audioSpeed == multiEditVideoSegmentRecordData.audioSpeed && this.f160194b == multiEditVideoSegmentRecordData.f160194b && this.f160195c == multiEditVideoSegmentRecordData.f160195c && this.rotate == multiEditVideoSegmentRecordData.rotate && this.musicSyncData == multiEditVideoSegmentRecordData.musicSyncData) {
            return true;
        }
        return false;
    }

    protected MultiEditVideoSegmentRecordData(Parcel parcel) {
        this.f160193a = 1.0f;
        this.audioSpeed = 1.0f;
        this.width = 720;
        this.height = 1080;
        boolean z = true;
        this.enable = true;
        this.videoPath = parcel.readString();
        this.draftVideoPath = parcel.readString();
        this.audioPath = parcel.readString();
        this.draftAudioPath = parcel.readString();
        this.videoLength = parcel.readLong();
        this.audioLength = parcel.readLong();
        this.f160193a = parcel.readFloat();
        this.f160194b = parcel.readLong();
        this.f160195c = parcel.readLong();
        this.rotate = parcel.readInt();
        this.audioSpeed = parcel.readFloat();
        this.frameLeakProbability = parcel.readInt();
        this.videoKey = parcel.readInt();
        this.enable = parcel.readByte() == 0 ? false : z;
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.scale = parcel.readFloat();
        this.musicSyncData = (MusicSyncData) parcel.readParcelable(MusicSyncData.class.getClassLoader());
        this.multiEditTrimState = (MultiEditTrimState) parcel.readParcelable(MultiEditTrimState.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoPath);
        parcel.writeString(this.draftVideoPath);
        parcel.writeString(this.audioPath);
        parcel.writeString(this.draftAudioPath);
        parcel.writeLong(this.videoLength);
        parcel.writeLong(this.audioLength);
        parcel.writeFloat(this.f160193a);
        parcel.writeLong(this.f160194b);
        parcel.writeLong(this.f160195c);
        parcel.writeInt(this.rotate);
        parcel.writeFloat(this.audioSpeed);
        parcel.writeInt(this.frameLeakProbability);
        parcel.writeInt(this.videoKey);
        parcel.writeByte(this.enable ? (byte) 1 : 0);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.scale);
        parcel.writeParcelable(this.musicSyncData, i);
        parcel.writeParcelable(this.multiEditTrimState, i);
    }
}

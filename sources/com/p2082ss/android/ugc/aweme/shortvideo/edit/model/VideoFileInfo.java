package com.p2082ss.android.ugc.aweme.shortvideo.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo */
public final class VideoFileInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<VideoFileInfo> CREATOR = new C71411b();
    public static final C71410a Companion = new C71410a((byte) 0);
    private final int bitrate;
    private final int codecType;
    private final long duration;
    private final int fps;
    private final int gop;
    private final int height;
    private final int keyFrameCount;
    private final int width;

    static {
        Covode.recordClassIndex(83943);
    }

    public VideoFileInfo(int i, int i2, long j) {
        this(i, i2, j, 0, 0, 0, 0, 0, 248, null);
    }

    public VideoFileInfo(int i, int i2, long j, int i3) {
        this(i, i2, j, i3, 0, 0, 0, 0, 240, null);
    }

    public VideoFileInfo(int i, int i2, long j, int i3, int i4) {
        this(i, i2, j, i3, i4, 0, 0, 0, 224, null);
    }

    public VideoFileInfo(int i, int i2, long j, int i3, int i4, int i5) {
        this(i, i2, j, i3, i4, i5, 0, 0, 192, null);
    }

    public VideoFileInfo(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        this(i, i2, j, i3, i4, i5, i6, 0, 128, null);
    }

    public static /* synthetic */ VideoFileInfo copy$default(VideoFileInfo videoFileInfo, int i, int i2, long j, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = videoFileInfo.width;
        }
        if ((i8 & 2) != 0) {
            i2 = videoFileInfo.height;
        }
        if ((i8 & 4) != 0) {
            j = videoFileInfo.duration;
        }
        if ((i8 & 8) != 0) {
            i3 = videoFileInfo.fps;
        }
        if ((i8 & 16) != 0) {
            i4 = videoFileInfo.bitrate;
        }
        if ((i8 & 32) != 0) {
            i5 = videoFileInfo.codecType;
        }
        if ((i8 & 64) != 0) {
            i6 = videoFileInfo.keyFrameCount;
        }
        if ((i8 & 128) != 0) {
            i7 = videoFileInfo.gop;
        }
        return videoFileInfo.copy(i, i2, j, i3, i4, i5, i6, i7);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final long component3() {
        return this.duration;
    }

    public final int component4() {
        return this.fps;
    }

    public final int component5() {
        return this.bitrate;
    }

    public final int component6() {
        return this.codecType;
    }

    public final int component7() {
        return this.keyFrameCount;
    }

    public final int component8() {
        return this.gop;
    }

    public final VideoFileInfo copy(int i, int i2, long j, int i3, int i4, int i5, int i6, int i7) {
        return new VideoFileInfo(i, i2, j, i3, i4, i5, i6, i7);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoFileInfo)) {
            return false;
        }
        VideoFileInfo videoFileInfo = (VideoFileInfo) obj;
        return this.width == videoFileInfo.width && this.height == videoFileInfo.height && this.duration == videoFileInfo.duration && this.fps == videoFileInfo.fps && this.bitrate == videoFileInfo.bitrate && this.codecType == videoFileInfo.codecType && this.keyFrameCount == videoFileInfo.keyFrameCount && this.gop == videoFileInfo.gop;
    }

    public final int hashCode() {
        long j = this.duration;
        return (((((((((((((this.width * 31) + this.height) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.fps) * 31) + this.bitrate) * 31) + this.codecType) * 31) + this.keyFrameCount) * 31) + this.gop;
    }

    public final String toString() {
        return "VideoFileInfo(width=" + this.width + ", height=" + this.height + ", duration=" + this.duration + ", fps=" + this.fps + ", bitrate=" + this.bitrate + ", codecType=" + this.codecType + ", keyFrameCount=" + this.keyFrameCount + ", gop=" + this.gop + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.fps);
        parcel.writeInt(this.bitrate);
        parcel.writeInt(this.codecType);
        parcel.writeInt(this.keyFrameCount);
        parcel.writeInt(this.gop);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo$a */
    public static final class C71410a {
        static {
            Covode.recordClassIndex(83944);
        }

        private C71410a() {
        }

        public /* synthetic */ C71410a(byte b) {
            this();
        }
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getCodecType() {
        return this.codecType;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getFps() {
        return this.fps;
    }

    public final int getGop() {
        return this.gop;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getKeyFrameCount() {
        return this.keyFrameCount;
    }

    public final int getWidth() {
        return this.width;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo$b */
    public static class C71411b implements Parcelable.Creator<VideoFileInfo> {
        static {
            Covode.recordClassIndex(83945);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VideoFileInfo[] newArray(int i) {
            return new VideoFileInfo[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VideoFileInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new VideoFileInfo(parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
    }

    public final String getResolution() {
        return new StringBuilder().append(this.width).append('*').append(this.height).toString();
    }

    public VideoFileInfo(int i, int i2, long j, int i3, int i4, int i5, int i6, int i7) {
        this.width = i;
        this.height = i2;
        this.duration = j;
        this.fps = i3;
        this.bitrate = i4;
        this.codecType = i5;
        this.keyFrameCount = i6;
        this.gop = i7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VideoFileInfo(int i, int i2, long j, int i3, int i4, int i5, int i6, int i7, int i8, C89214g gVar) {
        this(i, i2, j, (i8 & 8) != 0 ? -100 : i3, (i8 & 16) != 0 ? 0 : i4, (i8 & 32) != 0 ? -1 : i5, (i8 & 64) != 0 ? -1 : i6, (i8 & 128) != 0 ? -1 : i7);
    }
}

package com.p2082ss.android.ugc.aweme.shortvideo.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo */
public final class VideoCutInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<VideoCutInfo> CREATOR = new C71409a();
    private long end;
    private int rotate;
    private float speed;
    private long start;

    static {
        Covode.recordClassIndex(83941);
    }

    public static /* synthetic */ VideoCutInfo copy$default(VideoCutInfo videoCutInfo, long j, long j2, float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = videoCutInfo.start;
        }
        if ((i2 & 2) != 0) {
            j2 = videoCutInfo.end;
        }
        if ((i2 & 4) != 0) {
            f = videoCutInfo.speed;
        }
        if ((i2 & 8) != 0) {
            i = videoCutInfo.rotate;
        }
        return videoCutInfo.copy(j, j2, f, i);
    }

    public final long component1() {
        return this.start;
    }

    public final long component2() {
        return this.end;
    }

    public final float component3() {
        return this.speed;
    }

    public final int component4() {
        return this.rotate;
    }

    public final VideoCutInfo copy(long j, long j2, float f, int i) {
        return new VideoCutInfo(j, j2, f, i);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoCutInfo)) {
            return false;
        }
        VideoCutInfo videoCutInfo = (VideoCutInfo) obj;
        return this.start == videoCutInfo.start && this.end == videoCutInfo.end && Float.compare(this.speed, videoCutInfo.speed) == 0 && this.rotate == videoCutInfo.rotate;
    }

    public final int hashCode() {
        long j = this.start;
        long j2 = this.end;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Float.floatToIntBits(this.speed)) * 31) + this.rotate;
    }

    public final String toString() {
        return "VideoCutInfo(start=" + this.start + ", end=" + this.end + ", speed=" + this.speed + ", rotate=" + this.rotate + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeLong(this.start);
        parcel.writeLong(this.end);
        parcel.writeFloat(this.speed);
        parcel.writeInt(this.rotate);
    }

    public final long getEnd() {
        return this.end;
    }

    public final int getRotate() {
        return this.rotate;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final long getStart() {
        return this.start;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo$a */
    public static class C71409a implements Parcelable.Creator<VideoCutInfo> {
        static {
            Covode.recordClassIndex(83942);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VideoCutInfo[] newArray(int i) {
            return new VideoCutInfo[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VideoCutInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new VideoCutInfo(parcel.readLong(), parcel.readLong(), parcel.readFloat(), parcel.readInt());
        }
    }

    public final void setEnd(long j) {
        this.end = j;
    }

    public final void setRotate(int i) {
        this.rotate = i;
    }

    public final void setSpeed(float f) {
        this.speed = f;
    }

    public final void setStart(long j) {
        this.start = j;
    }

    public VideoCutInfo(long j, long j2, float f, int i) {
        this.start = j;
        this.end = j2;
        this.speed = f;
        this.rotate = i;
    }
}

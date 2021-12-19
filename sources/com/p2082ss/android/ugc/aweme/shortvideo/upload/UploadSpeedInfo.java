package com.p2082ss.android.ugc.aweme.shortvideo.upload;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo */
public final class UploadSpeedInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<UploadSpeedInfo> CREATOR = new C73834a();

    /* renamed from: a */
    private final long f165753a;

    /* renamed from: b */
    private String f165754b;

    /* renamed from: c */
    private final long f165755c;

    /* renamed from: d */
    private final long f165756d;

    /* renamed from: e */
    private int f165757e;

    static {
        Covode.recordClassIndex(86579);
    }

    public UploadSpeedInfo() {
        this(0, null, 0, 0, 0, 31, null);
    }

    public UploadSpeedInfo(long j) {
        this(j, null, 0, 0, 0, 30, null);
    }

    public UploadSpeedInfo(long j, String str) {
        this(j, str, 0, 0, 0, 28, null);
    }

    public UploadSpeedInfo(long j, String str, long j2) {
        this(j, str, j2, 0, 0, 24, null);
    }

    public UploadSpeedInfo(long j, String str, long j2, long j3) {
        this(j, str, j2, j3, 0, 16, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_shortvideo_upload_UploadSpeedInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m129895x7f20faf7(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_shortvideo_upload_UploadSpeedInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m129896x7f20faf7(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ UploadSpeedInfo copy$default(UploadSpeedInfo uploadSpeedInfo, long j, String str, long j2, long j3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = uploadSpeedInfo.f165753a;
        }
        if ((i2 & 2) != 0) {
            str = uploadSpeedInfo.f165754b;
        }
        if ((i2 & 4) != 0) {
            j2 = uploadSpeedInfo.f165755c;
        }
        if ((i2 & 8) != 0) {
            j3 = uploadSpeedInfo.f165756d;
        }
        if ((i2 & 16) != 0) {
            i = uploadSpeedInfo.f165757e;
        }
        return uploadSpeedInfo.copy(j, str, j2, j3, i);
    }

    public final long component1() {
        return this.f165753a;
    }

    public final String component2() {
        return this.f165754b;
    }

    public final long component3() {
        return this.f165755c;
    }

    public final long component4() {
        return this.f165756d;
    }

    public final int component5() {
        return this.f165757e;
    }

    public final UploadSpeedInfo copy(long j, String str, long j2, long j3, int i) {
        C89219l.m154721d(str, "");
        return new UploadSpeedInfo(j, str, j2, j3, i);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadSpeedInfo)) {
            return false;
        }
        UploadSpeedInfo uploadSpeedInfo = (UploadSpeedInfo) obj;
        return this.f165753a == uploadSpeedInfo.f165753a && C89219l.m154714a(this.f165754b, uploadSpeedInfo.f165754b) && this.f165755c == uploadSpeedInfo.f165755c && this.f165756d == uploadSpeedInfo.f165756d && this.f165757e == uploadSpeedInfo.f165757e;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_shortvideo_upload_UploadSpeedInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m129896x7f20faf7(this.f165753a) * 31;
        String str = this.f165754b;
        return ((((((com_ss_android_ugc_aweme_shortvideo_upload_UploadSpeedInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31) + m129896x7f20faf7(this.f165755c)) * 31) + m129896x7f20faf7(this.f165756d)) * 31) + m129895x7f20faf7(this.f165757e);
    }

    public final String toString() {
        return "UploadSpeedInfo(speed=" + this.f165753a + ", probeContext=" + this.f165754b + ", startTime=" + this.f165755c + ", endTime=" + this.f165756d + ", usedCompilerSettingGroup=" + this.f165757e + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeLong(this.f165753a);
        parcel.writeString(this.f165754b);
        parcel.writeLong(this.f165755c);
        parcel.writeLong(this.f165756d);
        parcel.writeInt(this.f165757e);
    }

    public final long getEndTime() {
        return this.f165756d;
    }

    public final String getProbeContext() {
        return this.f165754b;
    }

    public final long getSpeed() {
        return this.f165753a;
    }

    public final long getStartTime() {
        return this.f165755c;
    }

    public final int getUsedCompilerSettingGroup() {
        return this.f165757e;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo$a */
    public static class C73834a implements Parcelable.Creator<UploadSpeedInfo> {
        static {
            Covode.recordClassIndex(86580);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UploadSpeedInfo[] newArray(int i) {
            return new UploadSpeedInfo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UploadSpeedInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new UploadSpeedInfo(parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt());
        }
    }

    public final void setUsedCompilerSettingGroup(int i) {
        this.f165757e = i;
    }

    public final void setProbeContext(String str) {
        C89219l.m154721d(str, "");
        this.f165754b = str;
    }

    public UploadSpeedInfo(long j, String str, long j2, long j3, int i) {
        C89219l.m154721d(str, "");
        this.f165753a = j;
        this.f165754b = str;
        this.f165755c = j2;
        this.f165756d = j3;
        this.f165757e = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UploadSpeedInfo(long j, String str, long j2, long j3, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? -6 : j, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? -6 : j2, (i2 & 8) == 0 ? j3 : -6, (i2 & 16) != 0 ? -1 : i);
    }
}

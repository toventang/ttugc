package com.p2082ss.android.ugc.aweme.tools.policysecurity;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask */
public final class OriginalSoundUploadTask implements Parcelable {
    public static final Parcelable.Creator<OriginalSoundUploadTask> CREATOR = new C79022a();

    /* renamed from: a */
    public final String f177618a;

    /* renamed from: b */
    public final String f177619b;

    /* renamed from: c */
    public final String f177620c;

    /* renamed from: d */
    public final long f177621d;

    /* renamed from: e */
    public final String f177622e;

    /* renamed from: f */
    public transient String f177623f;

    /* renamed from: g */
    public int f177624g;

    /* renamed from: h */
    public boolean f177625h;

    /* renamed from: i */
    public int f177626i;

    /* renamed from: j */
    public boolean f177627j;

    /* renamed from: k */
    public int f177628k;

    static {
        Covode.recordClassIndex(92189);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginalSoundUploadTask)) {
            return false;
        }
        OriginalSoundUploadTask originalSoundUploadTask = (OriginalSoundUploadTask) obj;
        return C89219l.m154714a(this.f177618a, originalSoundUploadTask.f177618a) && C89219l.m154714a(this.f177619b, originalSoundUploadTask.f177619b) && C89219l.m154714a(this.f177620c, originalSoundUploadTask.f177620c) && this.f177621d == originalSoundUploadTask.f177621d && C89219l.m154714a(this.f177622e, originalSoundUploadTask.f177622e) && C89219l.m154714a(this.f177623f, originalSoundUploadTask.f177623f) && this.f177624g == originalSoundUploadTask.f177624g && this.f177625h == originalSoundUploadTask.f177625h && this.f177626i == originalSoundUploadTask.f177626i && this.f177627j == originalSoundUploadTask.f177627j && this.f177628k == originalSoundUploadTask.f177628k;
    }

    public final String toString() {
        return "OriginalSoundUploadTask(awemeId=" + this.f177618a + ", vid=" + this.f177619b + ", originalSoundPath=" + this.f177620c + ", updateTime=" + this.f177621d + ", unionId=" + this.f177622e + ", audioVid=" + this.f177623f + ", matchFactors=" + this.f177624g + ", isDraft=" + this.f177625h + ", origin=" + this.f177626i + ", isBackup=" + this.f177627j + ", queryTimes=" + this.f177628k + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f177618a);
        parcel.writeString(this.f177619b);
        parcel.writeString(this.f177620c);
        parcel.writeLong(this.f177621d);
        parcel.writeString(this.f177622e);
        parcel.writeString(this.f177623f);
        parcel.writeInt(this.f177624g);
        parcel.writeInt(this.f177625h ? 1 : 0);
        parcel.writeInt(this.f177626i);
        parcel.writeInt(this.f177627j ? 1 : 0);
        parcel.writeInt(this.f177628k);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask$a */
    public static class C79022a implements Parcelable.Creator<OriginalSoundUploadTask> {
        static {
            Covode.recordClassIndex(92190);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OriginalSoundUploadTask[] newArray(int i) {
            return new OriginalSoundUploadTask[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OriginalSoundUploadTask createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            long readLong = parcel.readLong();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            int readInt = parcel.readInt();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            int readInt2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new OriginalSoundUploadTask(readString, readString2, readString3, readLong, readString4, readString5, readInt, z2, readInt2, z, parcel.readInt());
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f177618a;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str2 = this.f177619b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str3 = this.f177620c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        long j = this.f177621d;
        int i8 = (((i7 + i3) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str4 = this.f177622e;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str5 = this.f177623f;
        if (str5 != null) {
            i5 = str5.hashCode();
        }
        int i10 = (((i9 + i5) * 31) + this.f177624g) * 31;
        boolean z = this.f177625h;
        int i11 = 1;
        if (z) {
            z = true;
        }
        int i12 = z ? 1 : 0;
        int i13 = z ? 1 : 0;
        int i14 = z ? 1 : 0;
        int i15 = (((i10 + i12) * 31) + this.f177626i) * 31;
        if (!this.f177627j) {
            i11 = 0;
        }
        return ((i15 + i11) * 31) + this.f177628k;
    }

    public /* synthetic */ OriginalSoundUploadTask(String str, String str2, String str3, long j, String str4, int i, boolean z, int i2, boolean z2, int i3) {
        this(str, str2, str3, j, str4, null, i, z, i2, z2, i3);
    }

    public OriginalSoundUploadTask(String str, String str2, String str3, long j, String str4, String str5, int i, boolean z, int i2, boolean z2, int i3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f177618a = str;
        this.f177619b = str2;
        this.f177620c = str3;
        this.f177621d = j;
        this.f177622e = str4;
        this.f177623f = str5;
        this.f177624g = i;
        this.f177625h = z;
        this.f177626i = i2;
        this.f177627j = z2;
        this.f177628k = i3;
    }
}

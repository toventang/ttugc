package dmt.p4542av.video;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.SingleImageCoverBitmapData */
public final class SingleImageCoverBitmapData implements Parcelable, Serializable {
    public static final Parcelable.Creator<SingleImageCoverBitmapData> CREATOR = new C88144a();

    /* renamed from: a */
    private final String f200058a;

    /* renamed from: b */
    private final int f200059b;

    /* renamed from: c */
    private final int f200060c;

    /* renamed from: d */
    private final long f200061d;

    /* renamed from: e */
    private final int f200062e;

    /* renamed from: f */
    private final int f200063f;

    /* renamed from: g */
    private final int f200064g;

    /* renamed from: h */
    private final Uri f200065h;

    static {
        Covode.recordClassIndex(104174);
    }

    public static /* synthetic */ SingleImageCoverBitmapData copy$default(SingleImageCoverBitmapData singleImageCoverBitmapData, String str, int i, int i2, long j, int i3, int i4, int i5, Uri uri, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = singleImageCoverBitmapData.f200058a;
        }
        if ((i6 & 2) != 0) {
            i = singleImageCoverBitmapData.f200059b;
        }
        if ((i6 & 4) != 0) {
            i2 = singleImageCoverBitmapData.f200060c;
        }
        if ((i6 & 8) != 0) {
            j = singleImageCoverBitmapData.f200061d;
        }
        if ((i6 & 16) != 0) {
            i3 = singleImageCoverBitmapData.f200062e;
        }
        if ((i6 & 32) != 0) {
            i4 = singleImageCoverBitmapData.f200063f;
        }
        if ((i6 & 64) != 0) {
            i5 = singleImageCoverBitmapData.f200064g;
        }
        if ((i6 & 128) != 0) {
            uri = singleImageCoverBitmapData.f200065h;
        }
        return singleImageCoverBitmapData.copy(str, i, i2, j, i3, i4, i5, uri);
    }

    /* renamed from: dmt_av_video_SingleImageCoverBitmapData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m153219x64c1556f(int i) {
        return i;
    }

    /* renamed from: dmt_av_video_SingleImageCoverBitmapData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m153220x64c1556f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public final String component1() {
        return this.f200058a;
    }

    public final int component2() {
        return this.f200059b;
    }

    public final int component3() {
        return this.f200060c;
    }

    public final long component4() {
        return this.f200061d;
    }

    public final int component5() {
        return this.f200062e;
    }

    public final int component6() {
        return this.f200063f;
    }

    public final int component7() {
        return this.f200064g;
    }

    public final Uri component8() {
        return this.f200065h;
    }

    public final SingleImageCoverBitmapData copy(String str, int i, int i2, long j, int i3, int i4, int i5, Uri uri) {
        C89219l.m154721d(str, "");
        return new SingleImageCoverBitmapData(str, i, i2, j, i3, i4, i5, uri);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleImageCoverBitmapData)) {
            return false;
        }
        SingleImageCoverBitmapData singleImageCoverBitmapData = (SingleImageCoverBitmapData) obj;
        return C89219l.m154714a(this.f200058a, singleImageCoverBitmapData.f200058a) && this.f200059b == singleImageCoverBitmapData.f200059b && this.f200060c == singleImageCoverBitmapData.f200060c && this.f200061d == singleImageCoverBitmapData.f200061d && this.f200062e == singleImageCoverBitmapData.f200062e && this.f200063f == singleImageCoverBitmapData.f200063f && this.f200064g == singleImageCoverBitmapData.f200064g && C89219l.m154714a(this.f200065h, singleImageCoverBitmapData.f200065h);
    }

    public final int hashCode() {
        String str = this.f200058a;
        int i = 0;
        int hashCode = (((((((((((((str != null ? str.hashCode() : 0) * 31) + m153219x64c1556f(this.f200059b)) * 31) + m153219x64c1556f(this.f200060c)) * 31) + m153220x64c1556f(this.f200061d)) * 31) + m153219x64c1556f(this.f200062e)) * 31) + m153219x64c1556f(this.f200063f)) * 31) + m153219x64c1556f(this.f200064g)) * 31;
        Uri uri = this.f200065h;
        if (uri != null) {
            i = uri.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SingleImageCoverBitmapData(sourcePath=" + this.f200058a + ", itemCoverWidth=" + this.f200059b + ", id=" + this.f200060c + ", date=" + this.f200061d + ", mediaType=" + this.f200062e + ", srcWidth=" + this.f200063f + ", srcHeight=" + this.f200064g + ", previewBitmapUri=" + this.f200065h + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f200058a);
        parcel.writeInt(this.f200059b);
        parcel.writeInt(this.f200060c);
        parcel.writeLong(this.f200061d);
        parcel.writeInt(this.f200062e);
        parcel.writeInt(this.f200063f);
        parcel.writeInt(this.f200064g);
        parcel.writeParcelable(this.f200065h, i);
    }

    public final long getDate() {
        return this.f200061d;
    }

    public final int getId() {
        return this.f200060c;
    }

    public final int getItemCoverWidth() {
        return this.f200059b;
    }

    public final int getMediaType() {
        return this.f200062e;
    }

    public final Uri getPreviewBitmapUri() {
        return this.f200065h;
    }

    public final String getSourcePath() {
        return this.f200058a;
    }

    public final int getSrcHeight() {
        return this.f200064g;
    }

    public final int getSrcWidth() {
        return this.f200063f;
    }

    /* renamed from: dmt.av.video.SingleImageCoverBitmapData$a */
    public static class C88144a implements Parcelable.Creator<SingleImageCoverBitmapData> {
        static {
            Covode.recordClassIndex(104175);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SingleImageCoverBitmapData[] newArray(int i) {
            return new SingleImageCoverBitmapData[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SingleImageCoverBitmapData createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new SingleImageCoverBitmapData(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Uri) parcel.readParcelable(SingleImageCoverBitmapData.class.getClassLoader()));
        }
    }

    public SingleImageCoverBitmapData(String str, int i, int i2, long j, int i3, int i4, int i5, Uri uri) {
        C89219l.m154721d(str, "");
        this.f200058a = str;
        this.f200059b = i;
        this.f200060c = i2;
        this.f200061d = j;
        this.f200062e = i3;
        this.f200063f = i4;
        this.f200064g = i5;
        this.f200065h = uri;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SingleImageCoverBitmapData(String str, int i, int i2, long j, int i3, int i4, int i5, Uri uri, int i6, C89214g gVar) {
        this(str, i, i2, j, i3, i4, i5, (i6 & 128) != 0 ? null : uri);
    }
}

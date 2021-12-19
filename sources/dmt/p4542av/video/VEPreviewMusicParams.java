package dmt.p4542av.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: dmt.av.video.VEPreviewMusicParams */
public class VEPreviewMusicParams implements Parcelable {
    public static final Parcelable.Creator<VEPreviewMusicParams> CREATOR = new Parcelable.Creator<VEPreviewMusicParams>() {
        /* class dmt.p4542av.video.VEPreviewMusicParams.C881491 */

        static {
            Covode.recordClassIndex(104182);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEPreviewMusicParams[] newArray(int i) {
            return new VEPreviewMusicParams[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEPreviewMusicParams createFromParcel(Parcel parcel) {
            return new VEPreviewMusicParams(parcel);
        }
    };

    /* renamed from: a */
    public String f200081a;

    /* renamed from: b */
    public int f200082b;

    /* renamed from: c */
    public int f200083c;

    /* renamed from: d */
    public int f200084d;

    /* renamed from: e */
    public float f200085e;

    /* renamed from: f */
    public String f200086f;

    /* renamed from: g */
    public float f200087g;

    /* renamed from: h */
    public int f200088h;

    /* renamed from: i */
    public boolean f200089i;

    /* renamed from: j */
    public int f200090j;

    /* renamed from: k */
    public int f200091k;

    /* renamed from: l */
    public boolean f200092l;

    /* renamed from: m */
    public boolean f200093m;

    /* renamed from: n */
    public int f200094n;

    /* renamed from: o */
    public double f200095o;

    /* renamed from: p */
    public double f200096p;

    /* renamed from: q */
    public double f200097q;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(104181);
    }

    public VEPreviewMusicParams() {
        this.f200088h = 1;
        this.f200085e = 1.0f;
    }

    public String toString() {
        return "VEPreviewMusicParams{mPath='" + this.f200081a + '\'' + ", mInPoint=" + this.f200082b + ", mDuration=" + this.f200083c + ", mVolume=" + this.f200085e + ", previewStartTime=" + this.f200087g + ", bgmdelay=" + this.f200094n + '}';
    }

    protected VEPreviewMusicParams(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        this.f200088h = 1;
        this.f200081a = parcel.readString();
        this.f200082b = parcel.readInt();
        this.f200083c = parcel.readInt();
        this.f200085e = parcel.readFloat();
        this.f200086f = parcel.readString();
        this.f200088h = parcel.readInt();
        this.f200087g = parcel.readFloat();
        if (parcel.readByte() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f200089i = z;
        this.f200090j = parcel.readInt();
        this.f200091k = parcel.readInt();
        this.f200092l = parcel.readByte() != 1 ? false : z2;
        this.f200094n = parcel.readInt();
        this.f200095o = parcel.readDouble();
        this.f200096p = parcel.readDouble();
        this.f200097q = parcel.readDouble();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f200081a);
        parcel.writeInt(this.f200082b);
        parcel.writeInt(this.f200083c);
        parcel.writeFloat(this.f200085e);
        parcel.writeString(this.f200086f);
        parcel.writeInt(this.f200088h);
        parcel.writeFloat(this.f200087g);
        parcel.writeInt(this.f200089i ? 1 : 0);
        parcel.writeInt(this.f200090j);
        parcel.writeInt(this.f200091k);
        parcel.writeByte(this.f200092l ? (byte) 1 : 0);
        parcel.writeInt(this.f200094n);
        parcel.writeDouble(this.f200095o);
        parcel.writeDouble(this.f200096p);
        parcel.writeDouble(this.f200097q);
    }
}

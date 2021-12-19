package android.support.p010v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new Parcelable.Creator<ParcelableVolumeInfo>() {
        /* class android.support.p010v4.media.session.ParcelableVolumeInfo.C01441 */

        static {
            Covode.recordClassIndex(165);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }
    };

    /* renamed from: a */
    public int f420a;

    /* renamed from: b */
    public int f421b;

    /* renamed from: c */
    public int f422c;

    /* renamed from: d */
    public int f423d;

    /* renamed from: e */
    public int f424e;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(164);
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f420a = parcel.readInt();
        this.f422c = parcel.readInt();
        this.f423d = parcel.readInt();
        this.f424e = parcel.readInt();
        this.f421b = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f420a);
        parcel.writeInt(this.f422c);
        parcel.writeInt(this.f423d);
        parcel.writeInt(this.f424e);
        parcel.writeInt(this.f421b);
    }

    public ParcelableVolumeInfo(int i, int i2, int i3, int i4, int i5) {
        this.f420a = i;
        this.f421b = i2;
        this.f422c = i3;
        this.f423d = i4;
        this.f424e = i5;
    }
}

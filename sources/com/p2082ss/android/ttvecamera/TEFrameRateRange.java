package com.p2082ss.android.ttvecamera;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.TEFrameRateRange */
public class TEFrameRateRange implements Parcelable {
    public static final Parcelable.Creator<TEFrameRateRange> CREATOR = new Parcelable.Creator<TEFrameRateRange>() {
        /* class com.p2082ss.android.ttvecamera.TEFrameRateRange.C307511 */

        static {
            Covode.recordClassIndex(37375);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TEFrameRateRange[] newArray(int i) {
            return new TEFrameRateRange[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TEFrameRateRange createFromParcel(Parcel parcel) {
            return new TEFrameRateRange(parcel);
        }
    };

    /* renamed from: a */
    public int f73613a;

    /* renamed from: b */
    public int f73614b;

    /* renamed from: c */
    public int f73615c = 1;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(37374);
    }

    public int hashCode() {
        return (this.f73613a * 65537) + 1 + this.f73614b;
    }

    /* renamed from: a */
    public final int[] mo55597a() {
        int i = this.f73613a;
        int i2 = this.f73615c;
        return new int[]{i / i2, this.f73614b / i2};
    }

    public String toString() {
        return "[" + (this.f73613a / this.f73615c) + ", " + (this.f73614b / this.f73615c) + "]";
    }

    /* renamed from: a */
    public static int m63137a(List<int[]> list) {
        if (list.size() > 0 && list.get(0)[1] > 1000) {
            return 1000;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TEFrameRateRange)) {
            return false;
        }
        TEFrameRateRange tEFrameRateRange = (TEFrameRateRange) obj;
        if (this.f73613a == tEFrameRateRange.f73613a && this.f73614b == tEFrameRateRange.f73614b) {
            return true;
        }
        return false;
    }

    protected TEFrameRateRange(Parcel parcel) {
        this.f73613a = parcel.readInt();
        this.f73614b = parcel.readInt();
        this.f73615c = parcel.readInt();
    }

    /* renamed from: a */
    public final int[] mo55598a(int i) {
        int i2 = this.f73613a;
        int i3 = this.f73615c;
        return new int[]{(i2 / i3) * i, (this.f73614b / i3) * i};
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f73613a);
        parcel.writeInt(this.f73614b);
        parcel.writeInt(this.f73615c);
    }

    public TEFrameRateRange(int i, int i2) {
        int i3 = 1;
        this.f73613a = i;
        this.f73614b = i2;
        this.f73615c = i2 > 1000 ? 1000 : i3;
    }
}

package com.p2082ss.android.ttvecamera;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ttvecamera.TEFrameSizei */
public class TEFrameSizei implements Parcelable {
    public static final Parcelable.Creator<TEFrameSizei> CREATOR = new Parcelable.Creator<TEFrameSizei>() {
        /* class com.p2082ss.android.ttvecamera.TEFrameSizei.C307521 */

        static {
            Covode.recordClassIndex(37377);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TEFrameSizei[] newArray(int i) {
            return new TEFrameSizei[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TEFrameSizei createFromParcel(Parcel parcel) {
            return new TEFrameSizei(parcel);
        }
    };

    /* renamed from: a */
    public int f73616a = 720;

    /* renamed from: b */
    public int f73617b = 1280;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(37376);
    }

    public TEFrameSizei() {
    }

    /* renamed from: a */
    public final boolean mo55606a() {
        if (this.f73616a <= 0 || this.f73617b <= 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f73616a * 65537) + 1 + this.f73617b;
    }

    public String toString() {
        return this.f73616a + "x" + this.f73617b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TEFrameSizei)) {
            return false;
        }
        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
        if (this.f73616a == tEFrameSizei.f73616a && this.f73617b == tEFrameSizei.f73617b) {
            return true;
        }
        return false;
    }

    protected TEFrameSizei(Parcel parcel) {
        this.f73616a = parcel.readInt();
        this.f73617b = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f73616a);
        parcel.writeInt(this.f73617b);
    }

    public TEFrameSizei(int i, int i2) {
        this.f73616a = i;
        this.f73617b = i2;
    }
}

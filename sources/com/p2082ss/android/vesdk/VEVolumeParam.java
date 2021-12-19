package com.p2082ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.VEVolumeParam */
public class VEVolumeParam implements Parcelable {
    public static final Parcelable.Creator<VEVolumeParam> CREATOR = new Parcelable.Creator<VEVolumeParam>() {
        /* class com.p2082ss.android.vesdk.VEVolumeParam.C852931 */

        static {
            Covode.recordClassIndex(99401);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEVolumeParam[] newArray(int i) {
            return new VEVolumeParam[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEVolumeParam createFromParcel(Parcel parcel) {
            return new VEVolumeParam(parcel);
        }
    };

    /* renamed from: a */
    public int f190874a = -1;

    /* renamed from: b */
    public float f190875b = -1.0f;

    /* renamed from: c */
    public boolean f190876c;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99400);
    }

    public VEVolumeParam() {
    }

    protected VEVolumeParam(Parcel parcel) {
        boolean z;
        this.f190875b = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f190876c = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f190875b);
        parcel.writeByte(this.f190876c ? (byte) 1 : 0);
    }
}

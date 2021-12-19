package com.p2082ss.android.vesdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.model.VEPrePlayParams */
public class VEPrePlayParams implements Parcelable {
    public static final Parcelable.Creator<VEPrePlayParams> CREATOR = new Parcelable.Creator<VEPrePlayParams>() {
        /* class com.p2082ss.android.vesdk.model.VEPrePlayParams.C855261 */

        static {
            Covode.recordClassIndex(99695);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEPrePlayParams[] newArray(int i) {
            return new VEPrePlayParams[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEPrePlayParams createFromParcel(Parcel parcel) {
            return new VEPrePlayParams(parcel);
        }
    };

    /* renamed from: a */
    public int f191587a;

    /* renamed from: b */
    public boolean f191588b;

    /* renamed from: c */
    public int f191589c;

    public int describeContents() {
        return 0;
    }

    public VEPrePlayParams() {
    }

    static {
        Covode.recordClassIndex(99694);
    }

    protected VEPrePlayParams(Parcel parcel) {
        boolean z;
        this.f191587a = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f191588b = z;
        this.f191589c = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f191587a);
        parcel.writeByte(this.f191588b ? (byte) 1 : 0);
        parcel.writeInt(this.f191589c);
    }
}

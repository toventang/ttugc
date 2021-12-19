package com.p2082ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.filterparam.VEBaseFilterParam */
public class VEBaseFilterParam implements Parcelable {
    public static final Parcelable.Creator<VEBaseFilterParam> CREATOR = new Parcelable.Creator<VEBaseFilterParam>() {
        /* class com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam.C854841 */

        static {
            Covode.recordClassIndex(99618);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEBaseFilterParam[] newArray(int i) {
            return new VEBaseFilterParam[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEBaseFilterParam createFromParcel(Parcel parcel) {
            return new VEBaseFilterParam(parcel);
        }
    };
    public int filterDurationType;
    public String filterName;
    public int filterType;

    public int describeContents() {
        return 0;
    }

    public VEBaseFilterParam() {
    }

    static {
        Covode.recordClassIndex(99617);
    }

    public String toString() {
        return "VEBaseFilterParam{filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEBaseFilterParam(Parcel parcel) {
        this.filterType = parcel.readInt();
        this.filterName = parcel.readString();
        this.filterDurationType = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.filterType);
        parcel.writeString(this.filterName);
        parcel.writeInt(this.filterDurationType);
    }
}

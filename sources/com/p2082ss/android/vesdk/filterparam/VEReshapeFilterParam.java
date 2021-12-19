package com.p2082ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.filterparam.VEReshapeFilterParam */
public class VEReshapeFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEReshapeFilterParam> CREATOR = new Parcelable.Creator<VEReshapeFilterParam>() {
        /* class com.p2082ss.android.vesdk.filterparam.VEReshapeFilterParam.C854991 */

        static {
            Covode.recordClassIndex(99647);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEReshapeFilterParam[] newArray(int i) {
            return new VEReshapeFilterParam[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEReshapeFilterParam createFromParcel(Parcel parcel) {
            return new VEReshapeFilterParam(parcel);
        }
    };
    public float cheekIntensity;
    public float eyeIntensity;
    public String resPath;

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99646);
    }

    public VEReshapeFilterParam() {
        this.filterName = "reshape filter";
        this.filterType = 13;
        this.filterDurationType = 1;
        this.resPath = "";
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEReshapeFilterParam{resPath='" + this.resPath + '\'' + ", eyeIntensity=" + this.eyeIntensity + ", cheekIntensity=" + this.cheekIntensity + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEReshapeFilterParam(Parcel parcel) {
        super(parcel);
        this.resPath = parcel.readString();
        this.eyeIntensity = parcel.readFloat();
        this.cheekIntensity = parcel.readFloat();
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.resPath);
        parcel.writeFloat(this.eyeIntensity);
        parcel.writeFloat(this.cheekIntensity);
    }
}

package com.p2082ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.filterparam.VEBlurFilterParam */
public class VEBlurFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEBlurFilterParam> CREATOR = new Parcelable.Creator<VEBlurFilterParam>() {
        /* class com.p2082ss.android.vesdk.filterparam.VEBlurFilterParam.C854861 */

        static {
            Covode.recordClassIndex(99622);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEBlurFilterParam[] newArray(int i) {
            return new VEBlurFilterParam[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEBlurFilterParam createFromParcel(Parcel parcel) {
            return new VEBlurFilterParam(parcel);
        }
    };
    public float intensity;

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99621);
    }

    public VEBlurFilterParam() {
        this.filterName = "ve_blur";
        this.filterType = 31;
        this.filterDurationType = 1;
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEBlurFilterParam{intensity=" + this.intensity + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEBlurFilterParam(Parcel parcel) {
        super(parcel);
        this.intensity = parcel.readFloat();
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.intensity);
    }
}

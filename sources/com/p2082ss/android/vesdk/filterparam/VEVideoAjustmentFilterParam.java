package com.p2082ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* renamed from: com.ss.android.vesdk.filterparam.VEVideoAjustmentFilterParam */
public class VEVideoAjustmentFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEVideoAjustmentFilterParam> CREATOR = new Parcelable.Creator<VEVideoAjustmentFilterParam>() {
        /* class com.p2082ss.android.vesdk.filterparam.VEVideoAjustmentFilterParam.C855031 */

        static {
            Covode.recordClassIndex(99655);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEVideoAjustmentFilterParam[] newArray(int i) {
            return new VEVideoAjustmentFilterParam[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEVideoAjustmentFilterParam createFromParcel(Parcel parcel) {
            return new VEVideoAjustmentFilterParam(parcel);
        }
    };
    public float[] ajustmentIntensity;
    public String[] ajustmentName;
    public int[] ajustmentType;

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99654);
    }

    public VEVideoAjustmentFilterParam() {
        this.filterName = "quality filter";
        this.filterType = 17;
        this.filterDurationType = 1;
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEVideoAjustmentFilterParam{ajustmentName=" + Arrays.toString(this.ajustmentName) + ", ajustmentType=" + Arrays.toString(this.ajustmentType) + ", ajustmentIntensity=" + Arrays.toString(this.ajustmentIntensity) + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEVideoAjustmentFilterParam(Parcel parcel) {
        super(parcel);
        this.ajustmentName = parcel.createStringArray();
        this.ajustmentType = parcel.createIntArray();
        this.ajustmentIntensity = parcel.createFloatArray();
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeStringArray(this.ajustmentName);
        parcel.writeIntArray(this.ajustmentType);
        parcel.writeFloatArray(this.ajustmentIntensity);
    }
}

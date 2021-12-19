package com.p2082ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.filterparam.VELensHdrFilterParam */
public class VELensHdrFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VELensHdrFilterParam> CREATOR = new Parcelable.Creator<VELensHdrFilterParam>() {
        /* class com.p2082ss.android.vesdk.filterparam.VELensHdrFilterParam.C854971 */

        static {
            Covode.recordClassIndex(99642);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VELensHdrFilterParam[] newArray(int i) {
            return new VELensHdrFilterParam[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VELensHdrFilterParam createFromParcel(Parcel parcel) {
            return new VELensHdrFilterParam(parcel);
        }
    };
    public String filterPath;
    public float intensity;

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99641);
    }

    public VELensHdrFilterParam() {
        this.filterName = "lens hdr filter";
        this.filterType = 33;
        this.filterPath = "";
        this.intensity = 1.0f;
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VELensHdrFilterParam{filterPath='" + this.filterPath + '\'' + ", intensity=" + this.intensity + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VELensHdrFilterParam(Parcel parcel) {
        super(parcel);
        this.filterPath = parcel.readString();
        this.intensity = parcel.readFloat();
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.filterPath);
        parcel.writeFloat(this.intensity);
    }
}

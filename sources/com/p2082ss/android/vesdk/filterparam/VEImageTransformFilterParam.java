package com.p2082ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.filterparam.VEImageTransformFilterParam */
public class VEImageTransformFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEImageTransformFilterParam> CREATOR = new Parcelable.Creator<VEImageTransformFilterParam>() {
        /* class com.p2082ss.android.vesdk.filterparam.VEImageTransformFilterParam.C854961 */

        static {
            Covode.recordClassIndex(99640);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEImageTransformFilterParam[] newArray(int i) {
            return new VEImageTransformFilterParam[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEImageTransformFilterParam createFromParcel(Parcel parcel) {
            return new VEImageTransformFilterParam(parcel);
        }
    };
    public float beginScale;
    public float endScale;

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99639);
    }

    public VEImageTransformFilterParam() {
        this.filterName = "image transform filter";
        this.filterType = 20;
        this.beginScale = 1.0f;
        this.endScale = 1.0f;
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEImageTransformFilterParam{beginScale=" + this.beginScale + ", endScale=" + this.endScale + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEImageTransformFilterParam(Parcel parcel) {
        super(parcel);
        this.beginScale = parcel.readFloat();
        this.endScale = parcel.readFloat();
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.beginScale);
        parcel.writeFloat(this.endScale);
    }
}

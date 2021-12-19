package com.p2082ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.filterparam.VEImageAddFilterParam */
public class VEImageAddFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEImageAddFilterParam> CREATOR = new Parcelable.Creator<VEImageAddFilterParam>() {
        /* class com.p2082ss.android.vesdk.filterparam.VEImageAddFilterParam.C854951 */

        static {
            Covode.recordClassIndex(99638);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEImageAddFilterParam[] newArray(int i) {
            return new VEImageAddFilterParam[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEImageAddFilterParam createFromParcel(Parcel parcel) {
            return new VEImageAddFilterParam(parcel);
        }
    };
    public float height;
    public String imagePath;
    public float width;

    /* renamed from: x */
    public float f191453x;

    /* renamed from: y */
    public float f191454y;

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99637);
    }

    public VEImageAddFilterParam() {
        this.filterName = "image add filter";
        this.filterType = 21;
        this.imagePath = "";
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEImageAddFilterParam{imagePath='" + this.imagePath + '\'' + ", x=" + this.f191453x + ", y=" + this.f191454y + ", width=" + this.width + ", height=" + this.height + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEImageAddFilterParam(Parcel parcel) {
        super(parcel);
        this.imagePath = parcel.readString();
        this.f191453x = parcel.readFloat();
        this.f191454y = parcel.readFloat();
        this.width = parcel.readFloat();
        this.height = parcel.readFloat();
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.imagePath);
        parcel.writeFloat(this.f191453x);
        parcel.writeFloat(this.f191454y);
        parcel.writeFloat(this.width);
        parcel.writeFloat(this.height);
    }
}

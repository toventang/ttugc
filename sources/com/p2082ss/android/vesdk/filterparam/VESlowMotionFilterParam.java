package com.p2082ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.filterparam.VESlowMotionFilterParam */
public class VESlowMotionFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VESlowMotionFilterParam> CREATOR = new Parcelable.Creator<VESlowMotionFilterParam>() {
        /* class com.p2082ss.android.vesdk.filterparam.VESlowMotionFilterParam.C855001 */

        static {
            Covode.recordClassIndex(99649);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VESlowMotionFilterParam[] newArray(int i) {
            return new VESlowMotionFilterParam[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VESlowMotionFilterParam createFromParcel(Parcel parcel) {
            return new VESlowMotionFilterParam(parcel);
        }
    };
    public int seqIn;
    public int seqOut;
    public int slowMotionDuration;
    public float slowMotionSpeed;
    public int timeMode;

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99648);
    }

    public VESlowMotionFilterParam() {
        this.filterName = "new slow effect";
        this.filterType = 25;
        this.filterDurationType = 1;
        this.seqIn = -1;
        this.slowMotionSpeed = 1.0f;
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VESlowMotionFilterParam{seqIn=" + this.seqIn + ", seqOut=" + this.seqOut + ", slowMotionDuration=" + this.slowMotionDuration + ", slowMotionSpeed=" + this.slowMotionSpeed + ", timeMode=" + this.timeMode + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VESlowMotionFilterParam(Parcel parcel) {
        super(parcel);
        this.seqIn = parcel.readInt();
        this.seqOut = parcel.readInt();
        this.slowMotionDuration = parcel.readInt();
        this.slowMotionSpeed = parcel.readFloat();
        this.timeMode = parcel.readInt();
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.seqIn);
        parcel.writeInt(this.seqOut);
        parcel.writeInt(this.slowMotionDuration);
        parcel.writeFloat(this.slowMotionSpeed);
        parcel.writeInt(this.timeMode);
    }
}

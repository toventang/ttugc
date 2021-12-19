package com.p2082ss.android.vesdk.clipparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.clipparam.VEClipTimelineParam */
public class VEClipTimelineParam implements Parcelable {
    public static final Parcelable.Creator<VEClipTimelineParam> CREATOR = new Parcelable.Creator<VEClipTimelineParam>() {
        /* class com.p2082ss.android.vesdk.clipparam.VEClipTimelineParam.C854091 */

        static {
            Covode.recordClassIndex(99528);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEClipTimelineParam[] newArray(int i) {
            return new VEClipTimelineParam[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEClipTimelineParam createFromParcel(Parcel parcel) {
            return new VEClipTimelineParam(parcel);
        }
    };
    public float[] curveSpeedPointX;
    public float[] curveSpeedPointY;
    public boolean isReverseCurveSpeed;
    public double speed;
    public int trimIn;
    public int trimOut;

    public int describeContents() {
        return 0;
    }

    public VEClipTimelineParam() {
        this.speed = 1.0d;
    }

    static {
        Covode.recordClassIndex(99527);
    }

    public String toString() {
        return "trimIn: " + this.trimIn + " trimOut: " + this.trimOut + " speed: " + this.speed;
    }

    protected VEClipTimelineParam(Parcel parcel) {
        boolean z;
        this.trimIn = parcel.readInt();
        this.trimOut = parcel.readInt();
        this.speed = parcel.readDouble();
        this.curveSpeedPointX = parcel.createFloatArray();
        this.curveSpeedPointY = parcel.createFloatArray();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isReverseCurveSpeed = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.trimIn);
        parcel.writeInt(this.trimOut);
        parcel.writeDouble(this.speed);
        parcel.writeFloatArray(this.curveSpeedPointX);
        parcel.writeFloatArray(this.curveSpeedPointY);
        parcel.writeByte(this.isReverseCurveSpeed ? (byte) 1 : 0);
    }
}

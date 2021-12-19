package com.p2082ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.VECherEffectParam */
public class VECherEffectParam implements Parcelable {
    public static final Parcelable.Creator<VECherEffectParam> CREATOR = new Parcelable.Creator<VECherEffectParam>() {
        /* class com.p2082ss.android.vesdk.VECherEffectParam.C852131 */

        static {
            Covode.recordClassIndex(99279);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VECherEffectParam[] newArray(int i) {
            return new VECherEffectParam[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VECherEffectParam createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            double[] dArr = new double[(readInt * 2)];
            parcel.readDoubleArray(dArr);
            boolean[] zArr = new boolean[readInt2];
            parcel.readBooleanArray(zArr);
            return new VECherEffectParam(strArr, dArr, zArr);
        }
    };
    private double[] duration;
    private int length;
    private String[] matrix;
    private boolean[] segUseCher;
    private int totalNum;

    public int describeContents() {
        return 0;
    }

    public double[] getDuration() {
        return this.duration;
    }

    public String[] getMatrix() {
        return this.matrix;
    }

    public boolean[] getSegUseCher() {
        return this.segUseCher;
    }

    static {
        Covode.recordClassIndex(99278);
    }

    public void setDuration(double[] dArr) {
        this.duration = dArr;
    }

    public void setMatrix(String[] strArr) {
        this.matrix = strArr;
    }

    public void setSegUseCher(boolean[] zArr) {
        this.segUseCher = zArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.matrix.length);
        parcel.writeInt(this.totalNum);
        parcel.writeStringArray(this.matrix);
        parcel.writeDoubleArray(this.duration);
        parcel.writeBooleanArray(this.segUseCher);
    }

    public VECherEffectParam(String[] strArr, double[] dArr, boolean[] zArr) {
        this(strArr, dArr, strArr.length, zArr);
    }

    private VECherEffectParam(String[] strArr, double[] dArr, int i, boolean[] zArr) {
        this.matrix = strArr;
        this.duration = dArr;
        this.length = i;
        this.segUseCher = zArr;
        this.totalNum = zArr.length;
    }
}

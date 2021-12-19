package com.p2082ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.ss.android.vesdk.filterparam.VEColorHslFilterParam */
public class VEColorHslFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEColorHslFilterParam> CREATOR = new Parcelable.Creator<VEColorHslFilterParam>() {
        /* class com.p2082ss.android.vesdk.filterparam.VEColorHslFilterParam.C854901 */

        static {
            Covode.recordClassIndex(99629);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEColorHslFilterParam[] newArray(int i) {
            return new VEColorHslFilterParam[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEColorHslFilterParam createFromParcel(Parcel parcel) {
            return new VEColorHslFilterParam(parcel);
        }
    };
    public ArrayList<HslParam> hslParamArrayList;
    public int type;
    public int version;

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99628);
    }

    public VEColorHslFilterParam() {
        this.filterName = "color_adjust_hsl";
        this.filterType = 36;
        this.filterDurationType = 1;
        this.hslParamArrayList = new ArrayList<>();
        this.version = 1;
        this.type = 0;
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEColorHslFilterParam{, version = " + this.version + "]', type = " + this.type + "]'}";
    }

    protected VEColorHslFilterParam(Parcel parcel) {
        super(parcel);
        this.version = parcel.readInt();
        this.type = parcel.readInt();
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.version);
        parcel.writeInt(this.type);
    }
}

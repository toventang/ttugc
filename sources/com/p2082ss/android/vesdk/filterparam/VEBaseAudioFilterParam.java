package com.p2082ss.android.vesdk.filterparam;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam */
public class VEBaseAudioFilterParam extends VEBaseFilterParam {
    static {
        Covode.recordClassIndex(99616);
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    public VEBaseAudioFilterParam() {
        this.filterName = "audio filter";
        this.filterType = 1;
        this.filterDurationType = 1;
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEBaseAudioFilterParam{filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEBaseAudioFilterParam(Parcel parcel) {
        super(parcel);
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}

package com.p2082ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.filterparam.VEAudioLoudnessBalanceFilter */
public class VEAudioLoudnessBalanceFilter extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioLoudnessBalanceFilter> CREATOR = new Parcelable.Creator<VEAudioLoudnessBalanceFilter>() {
        /* class com.p2082ss.android.vesdk.filterparam.VEAudioLoudnessBalanceFilter.C854801 */

        static {
            Covode.recordClassIndex(99609);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEAudioLoudnessBalanceFilter[] newArray(int i) {
            return new VEAudioLoudnessBalanceFilter[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEAudioLoudnessBalanceFilter createFromParcel(Parcel parcel) {
            return new VEAudioLoudnessBalanceFilter(parcel);
        }
    };
    public double avgLoudness;
    public boolean enable;
    public double peakLoudness;
    public double targetLoudness;

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam, com.p2082ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public int describeContents() {
        return 0;
    }

    public VEAudioLoudnessBalanceFilter() {
        this.filterName = "loudness balance";
    }

    static {
        Covode.recordClassIndex(99608);
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam, com.p2082ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public String toString() {
        return "VEAudioLoudnessBalanceFilter{avgLoudness: " + this.avgLoudness + ", peakLoudness: " + this.peakLoudness + ", targetLoudness: '" + this.targetLoudness + ", filterName: '" + this.filterName + ", filterType: '" + this.filterType + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEAudioLoudnessBalanceFilter(Parcel parcel) {
        super(parcel);
        this.avgLoudness = parcel.readDouble();
        this.peakLoudness = parcel.readDouble();
        this.targetLoudness = parcel.readDouble();
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam, com.p2082ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeDouble(this.avgLoudness);
        parcel.writeDouble(this.peakLoudness);
        parcel.writeDouble(this.targetLoudness);
    }
}

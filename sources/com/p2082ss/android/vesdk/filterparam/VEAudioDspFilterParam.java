package com.p2082ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.filterparam.VEAudioDspFilterParam */
public class VEAudioDspFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioDspFilterParam> CREATOR = new Parcelable.Creator<VEAudioDspFilterParam>() {
        /* class com.p2082ss.android.vesdk.filterparam.VEAudioDspFilterParam.C854771 */

        static {
            Covode.recordClassIndex(99603);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEAudioDspFilterParam[] newArray(int i) {
            return new VEAudioDspFilterParam[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEAudioDspFilterParam createFromParcel(Parcel parcel) {
            return new VEAudioDspFilterParam(parcel);
        }
    };
    public String jsonDir;

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam, com.p2082ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public int describeContents() {
        return super.describeContents();
    }

    static {
        Covode.recordClassIndex(99602);
    }

    public VEAudioDspFilterParam() {
        this.filterName = "audio dsp filter";
        this.jsonDir = "audio dsp use inbuilt json";
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam, com.p2082ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public String toString() {
        return "VEAudioDspFilterParam{jsonPath='" + this.jsonDir + '\'' + '}';
    }

    protected VEAudioDspFilterParam(Parcel parcel) {
        super(parcel);
        this.jsonDir = parcel.readString();
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam, com.p2082ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.jsonDir);
    }
}

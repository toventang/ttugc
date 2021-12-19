package com.p2082ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.filterparam.VEAudioFadeFilterParam */
public class VEAudioFadeFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioFadeFilterParam> CREATOR = new Parcelable.Creator<VEAudioFadeFilterParam>() {
        /* class com.p2082ss.android.vesdk.filterparam.VEAudioFadeFilterParam.C854791 */

        static {
            Covode.recordClassIndex(99607);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEAudioFadeFilterParam[] newArray(int i) {
            return new VEAudioFadeFilterParam[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEAudioFadeFilterParam createFromParcel(Parcel parcel) {
            return new VEAudioFadeFilterParam(parcel);
        }
    };
    public int fadeInLength;
    public int fadeOutLength;

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam, com.p2082ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public int describeContents() {
        return 0;
    }

    public VEAudioFadeFilterParam() {
        this.filterName = "audio fading";
    }

    static {
        Covode.recordClassIndex(99606);
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam, com.p2082ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public String toString() {
        return "VEAudioFadeFilterParam{fadeInLength=" + this.fadeInLength + ", fadeOutLength=" + this.fadeOutLength + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEAudioFadeFilterParam(Parcel parcel) {
        super(parcel);
        this.fadeInLength = parcel.readInt();
        this.fadeOutLength = parcel.readInt();
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam, com.p2082ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.fadeInLength);
        parcel.writeInt(this.fadeOutLength);
    }
}

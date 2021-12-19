package com.p2082ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.filterparam.VEAudioSamiFilterParam */
public class VEAudioSamiFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioSamiFilterParam> CREATOR = new Parcelable.Creator<VEAudioSamiFilterParam>() {
        /* class com.p2082ss.android.vesdk.filterparam.VEAudioSamiFilterParam.C854821 */

        static {
            Covode.recordClassIndex(99613);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEAudioSamiFilterParam[] newArray(int i) {
            return new VEAudioSamiFilterParam[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEAudioSamiFilterParam createFromParcel(Parcel parcel) {
            return new VEAudioSamiFilterParam(parcel);
        }
    };
    public boolean enable = true;
    public String samiModelPath;
    public String samiParam;
    public int samiType;

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam, com.p2082ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99612);
    }

    public VEAudioSamiFilterParam() {
        this.filterName = "audio sami filter";
        this.samiModelPath = "";
        this.samiParam = "";
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam, com.p2082ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public String toString() {
        return "VEAudioSamiFilterParam{filterType=" + this.filterType + ", filterName='" + this.filterName + ", filterDurationType=" + this.filterDurationType + ", samiModelPath=" + this.samiModelPath + ", samiType=" + this.samiType + ", samiParam=" + this.samiParam + ", enable=" + this.enable + '}';
    }

    protected VEAudioSamiFilterParam(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.samiModelPath = parcel.readString();
        this.samiType = parcel.readInt();
        this.samiParam = parcel.readString();
        this.enable = parcel.readByte() == 0 ? false : z;
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam, com.p2082ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.samiModelPath);
        parcel.writeInt(this.samiType);
        parcel.writeString(this.samiParam);
        parcel.writeByte(this.enable ? (byte) 1 : 0);
    }
}

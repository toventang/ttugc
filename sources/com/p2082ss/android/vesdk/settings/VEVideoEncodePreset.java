package com.p2082ss.android.vesdk.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.settings.VEVideoEncodePreset */
public enum VEVideoEncodePreset implements Parcelable {
    ENCODE_LEVEL_ULTRAFAST,
    ENCODE_LEVEL_SUPERFAST,
    ENCODE_LEVEL_VERYFAST,
    ENCODE_LEVEL_FASTER,
    ENCODE_LEVEL_FAST,
    ENCODE_LEVEL_MEDIUM,
    ENCODE_LEVEL_SLOW,
    ENCODE_LEVEL_SLOWER,
    ENCODE_LEVEL_VERYSLOW,
    ENCODE_LEVEL_PLACEBO;
    
    public static final Parcelable.Creator<VEVideoEncodePreset> CREATOR = new Parcelable.Creator<VEVideoEncodePreset>() {
        /* class com.p2082ss.android.vesdk.settings.VEVideoEncodePreset.C855641 */

        static {
            Covode.recordClassIndex(99742);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEVideoEncodePreset[] newArray(int i) {
            return new VEVideoEncodePreset[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEVideoEncodePreset createFromParcel(Parcel parcel) {
            return VEVideoEncodePreset.values()[parcel.readInt()];
        }
    };

    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99741);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}

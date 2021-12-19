package com.p2082ss.android.vesdk.settings;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.settings.VEVideoEncodeProfile */
public enum VEVideoEncodeProfile implements Parcelable {
    ENCODE_PROFILE_UNKNOWN,
    ENCODE_PROFILE_BASELINE,
    ENCODE_PROFILE_MAIN,
    ENCODE_PROFILE_HIGH;
    
    public static final Parcelable.Creator<VEVideoEncodeProfile> CREATOR = new Parcelable.Creator<VEVideoEncodeProfile>() {
        /* class com.p2082ss.android.vesdk.settings.VEVideoEncodeProfile.C855651 */

        static {
            Covode.recordClassIndex(99744);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEVideoEncodeProfile[] newArray(int i) {
            return new VEVideoEncodeProfile[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEVideoEncodeProfile createFromParcel(Parcel parcel) {
            return VEVideoEncodeProfile.values()[parcel.readInt()];
        }
    };

    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99743);
    }

    public static VEVideoEncodeProfile valueOfString(String str) {
        VEVideoEncodeProfile vEVideoEncodeProfile = ENCODE_PROFILE_UNKNOWN;
        if (TextUtils.isEmpty(str)) {
            return vEVideoEncodeProfile;
        }
        if ("baseline".equals(str)) {
            return ENCODE_PROFILE_BASELINE;
        }
        if ("main".equals(str)) {
            return ENCODE_PROFILE_MAIN;
        }
        if ("high".equals(str)) {
            return ENCODE_PROFILE_HIGH;
        }
        return vEVideoEncodeProfile;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}

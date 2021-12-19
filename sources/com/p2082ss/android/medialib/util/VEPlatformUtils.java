package com.p2082ss.android.medialib.util;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.medialib.util.VEPlatformUtils */
public final class VEPlatformUtils {
    static {
        Covode.recordClassIndex(36548);
    }

    /* renamed from: a */
    public static VEPlatform m60796a() {
        VEPlatform vEPlatform = VEPlatform.PLATFORM_UNKNOWN;
        String str = Build.HARDWARE;
        if (str.matches("qcom")) {
            return VEPlatform.PLATFORM_QCOM;
        }
        if (str.matches("mt[0-9]*")) {
            return VEPlatform.PLATFORM_MTK;
        }
        if (str.matches("kirin[0-9]*")) {
            return VEPlatform.PLATFORM_HISI;
        }
        return vEPlatform;
    }

    /* renamed from: com.ss.android.medialib.util.VEPlatformUtils$VEPlatform */
    public enum VEPlatform implements Parcelable {
        PLATFORM_UNKNOWN,
        PLATFORM_QCOM,
        PLATFORM_MTK,
        PLATFORM_HISI,
        PLATFORM_EXYNOS;
        
        public static final Parcelable.Creator<VEPlatform> CREATOR = new Parcelable.Creator<VEPlatform>() {
            /* class com.p2082ss.android.medialib.util.VEPlatformUtils.VEPlatform.C300571 */

            static {
                Covode.recordClassIndex(36550);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ VEPlatform[] newArray(int i) {
                return new VEPlatform[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ VEPlatform createFromParcel(Parcel parcel) {
                return VEPlatform.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(36549);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }
}

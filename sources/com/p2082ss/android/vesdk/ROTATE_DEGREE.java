package com.p2082ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.ROTATE_DEGREE */
public enum ROTATE_DEGREE implements Parcelable {
    ROTATE_NONE,
    ROTATE_90,
    ROTATE_180,
    ROTATE_270;
    
    public static final Parcelable.Creator<ROTATE_DEGREE> CREATOR = new Parcelable.Creator<ROTATE_DEGREE>() {
        /* class com.p2082ss.android.vesdk.ROTATE_DEGREE.C851891 */

        static {
            Covode.recordClassIndex(99238);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ROTATE_DEGREE[] newArray(int i) {
            return new ROTATE_DEGREE[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ROTATE_DEGREE createFromParcel(Parcel parcel) {
            return ROTATE_DEGREE.values()[parcel.readInt()];
        }
    };

    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99237);
    }

    public static int[] toIntArray(ROTATE_DEGREE[] rotate_degreeArr) {
        if (rotate_degreeArr == null) {
            return null;
        }
        int length = rotate_degreeArr.length;
        int[] iArr = new int[rotate_degreeArr.length];
        for (int i = 0; i < length; i++) {
            if (rotate_degreeArr[i] == null) {
                iArr[i] = 0;
            } else {
                iArr[i] = rotate_degreeArr[i].ordinal();
            }
        }
        return iArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}

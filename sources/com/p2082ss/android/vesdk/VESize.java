package com.p2082ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.VESize */
public class VESize implements Parcelable {
    public static final Parcelable.Creator<VESize> CREATOR = new Parcelable.Creator<VESize>() {
        /* class com.p2082ss.android.vesdk.VESize.C852681 */

        static {
            Covode.recordClassIndex(99364);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VESize[] newArray(int i) {
            return new VESize[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VESize createFromParcel(Parcel parcel) {
            return new VESize(parcel);
        }
    };
    public int height = 1280;
    public int width = 720;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99363);
    }

    public boolean isValid() {
        if (this.width <= 0 || this.height <= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.width + "*" + this.height;
    }

    protected VESize(Parcel parcel) {
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (obj instanceof VESize) {
            VESize vESize = (VESize) obj;
            if (this.width == vESize.width && this.height == vESize.height) {
                return true;
            }
            return false;
        }
        return false;
    }

    public VESize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }
}

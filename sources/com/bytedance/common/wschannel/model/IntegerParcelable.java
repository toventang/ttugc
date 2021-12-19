package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class IntegerParcelable implements Parcelable {
    public static final Parcelable.Creator<IntegerParcelable> CREATOR = new Parcelable.Creator<IntegerParcelable>() {
        /* class com.bytedance.common.wschannel.model.IntegerParcelable.C137611 */

        static {
            Covode.recordClassIndex(15803);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ IntegerParcelable[] newArray(int i) {
            return new IntegerParcelable[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IntegerParcelable createFromParcel(Parcel parcel) {
            return new IntegerParcelable(parcel);
        }
    };

    /* renamed from: a */
    public final int f33434a;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(15802);
    }

    public IntegerParcelable(int i) {
        this.f33434a = i;
    }

    protected IntegerParcelable(Parcel parcel) {
        this.f33434a = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f33434a);
    }
}

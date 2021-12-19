package com.google.android.gms.internal.p1949h;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.h.e */
public class C25759e {

    /* renamed from: a */
    private static final ClassLoader f60878a = C25759e.class.getClassLoader();

    private C25759e() {
    }

    static {
        Covode.recordClassIndex(31174);
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m49734a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m49735a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}

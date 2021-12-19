package com.google.android.p1920a;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.a.c */
public final class C25063c {
    private C25063c() {
    }

    static {
        Covode.recordClassIndex(30427);
        C25063c.class.getClassLoader();
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m48038a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }
}

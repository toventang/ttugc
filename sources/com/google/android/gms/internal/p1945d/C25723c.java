package com.google.android.gms.internal.p1945d;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.d.c */
public class C25723c {

    /* renamed from: a */
    private static final ClassLoader f60851a = C25723c.class.getClassLoader();

    private C25723c() {
    }

    static {
        Covode.recordClassIndex(31138);
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m49674a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m49675a(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}

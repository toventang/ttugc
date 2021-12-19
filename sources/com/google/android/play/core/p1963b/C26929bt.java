package com.google.android.play.core.p1963b;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.play.core.b.bt */
public final class C26929bt {
    static {
        Covode.recordClassIndex(32404);
        C26929bt.class.getClassLoader();
    }

    private C26929bt() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m53497a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m53498a(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}

package com.bytedance.creativex.p936a;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.a.a */
public final class C14080a {
    static {
        Covode.recordClassIndex(16147);
    }

    /* renamed from: a */
    public static final <T extends Parcelable> T m25675a(T t) {
        C89219l.m154721d(t, "");
        Parcel obtain = Parcel.obtain();
        C89219l.m154716b(obtain, "");
        obtain.writeValue(t);
        obtain.setDataPosition(0);
        Object readValue = obtain.readValue(t.getClass().getClassLoader());
        Objects.requireNonNull(readValue, "null cannot be cast to non-null type T");
        T t2 = (T) ((Parcelable) readValue);
        obtain.recycle();
        return t2;
    }
}

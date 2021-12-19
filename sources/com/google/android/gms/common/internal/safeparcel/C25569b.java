package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.b */
public final class C25569b {
    static {
        Covode.recordClassIndex(30974);
    }

    /* renamed from: a */
    public static void m49357a(Parcel parcel, int i, String[] strArr) {
        if (strArr != null) {
            int a = m49347a(parcel, i);
            parcel.writeStringArray(strArr);
            m49359b(parcel, a);
        }
    }

    /* renamed from: a */
    public static <T extends Parcelable> void m49356a(Parcel parcel, int i, T[] tArr, int i2) {
        if (tArr != null) {
            int a = m49347a(parcel, i);
            int length = tArr.length;
            parcel.writeInt(length);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m49358a(parcel, t, i2);
                }
            }
            m49359b(parcel, a);
        }
    }

    /* renamed from: a */
    private static <T extends Parcelable> void m49358a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: a */
    public static int m49347a(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: b */
    public static void m49359b(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: a */
    public static void m49355a(Parcel parcel, int i, boolean z) {
        m49348a(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: b */
    public static void m49360b(Parcel parcel, int i, int i2) {
        m49348a(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: a */
    public static void m49348a(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: a */
    public static void m49349a(Parcel parcel, int i, long j) {
        m49348a(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: b */
    public static <T extends Parcelable> void m49361b(Parcel parcel, int i, List<T> list) {
        if (list != null) {
            int a = m49347a(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                T t = list.get(i2);
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m49358a(parcel, t, 0);
                }
            }
            m49359b(parcel, a);
        }
    }

    /* renamed from: a */
    public static void m49350a(Parcel parcel, int i, Bundle bundle) {
        if (bundle != null) {
            int a = m49347a(parcel, i);
            parcel.writeBundle(bundle);
            m49359b(parcel, a);
        }
    }

    /* renamed from: a */
    public static void m49351a(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder != null) {
            int a = m49347a(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m49359b(parcel, a);
        }
    }

    /* renamed from: a */
    public static void m49353a(Parcel parcel, int i, String str) {
        if (str != null) {
            int a = m49347a(parcel, i);
            parcel.writeString(str);
            m49359b(parcel, a);
        }
    }

    /* renamed from: a */
    public static void m49354a(Parcel parcel, int i, List<String> list) {
        if (list != null) {
            int a = m49347a(parcel, i);
            parcel.writeStringList(list);
            m49359b(parcel, a);
        }
    }

    /* renamed from: a */
    public static void m49352a(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable != null) {
            int a = m49347a(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m49359b(parcel, a);
        }
    }
}

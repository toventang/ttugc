package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.internal.safeparcel.a */
public final class C25567a {
    static {
        Covode.recordClassIndex(30972);
    }

    /* renamed from: a */
    public static int m49330a(Parcel parcel) {
        String str;
        int readInt = parcel.readInt();
        int a = m49331a(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((65535 & readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            if (valueOf.length() != 0) {
                str = "Expected object header. Got 0x".concat(valueOf);
            } else {
                str = new String("Expected object header. Got 0x");
            }
            throw new C25568a(str, parcel);
        }
        int i = a + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        throw new C25568a(new StringBuilder(54).append("Size read is invalid start=").append(dataPosition).append(" end=").append(i).toString(), parcel);
    }

    /* renamed from: b */
    public static void m49334b(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m49331a(parcel, i));
    }

    /* renamed from: c */
    public static boolean m49338c(Parcel parcel, int i) {
        m49333a(parcel, i, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static int m49339d(Parcel parcel, int i) {
        m49333a(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: e */
    public static long m49340e(Parcel parcel, int i) {
        m49333a(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: a */
    public static int m49331a(Parcel parcel, int i) {
        if ((i & -65536) != -65536) {
            return (i >> 16) & 65535;
        }
        return parcel.readInt();
    }

    /* renamed from: f */
    public static String m49341f(Parcel parcel, int i) {
        int a = m49331a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + a);
        return readString;
    }

    /* renamed from: g */
    public static IBinder m49342g(Parcel parcel, int i) {
        int a = m49331a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + a);
        return readStrongBinder;
    }

    /* renamed from: h */
    public static Bundle m49343h(Parcel parcel, int i) {
        int a = m49331a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + a);
        return readBundle;
    }

    /* renamed from: i */
    public static String[] m49344i(Parcel parcel, int i) {
        int a = m49331a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + a);
        return createStringArray;
    }

    /* renamed from: j */
    public static ArrayList<String> m49345j(Parcel parcel, int i) {
        int a = m49331a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + a);
        return createStringArrayList;
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.a$a */
    public static class C25568a extends RuntimeException {
        static {
            Covode.recordClassIndex(30973);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C25568a(java.lang.String r5, android.os.Parcel r6) {
            /*
                r4 = this;
                int r3 = r6.dataPosition()
                int r2 = r6.dataSize()
                java.lang.String r0 = java.lang.String.valueOf(r5)
                int r0 = r0.length()
                int r1 = r0 + 41
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r1)
                java.lang.StringBuilder r1 = r0.append(r5)
                java.lang.String r0 = " Parcel: pos="
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.StringBuilder r1 = r0.append(r3)
                java.lang.String r0 = " size="
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.C25567a.C25568a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    /* renamed from: k */
    public static void m49346k(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new C25568a(new StringBuilder(37).append("Overread allowed size end=").append(i).toString(), parcel);
        }
    }

    /* renamed from: b */
    public static <T> T[] m49336b(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int a = m49331a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + a);
        return tArr;
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m49337c(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int a = m49331a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + a);
        return createTypedArrayList;
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m49332a(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int a = m49331a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + a);
        return createFromParcel;
    }

    /* renamed from: b */
    public static void m49335b(Parcel parcel, int i, int i2) {
        if (i != i2) {
            String hexString = Integer.toHexString(i);
            throw new C25568a(new StringBuilder(String.valueOf(hexString).length() + 46).append("Expected size ").append(i2).append(" got ").append(i).append(" (0x").append(hexString).append(")").toString(), parcel);
        }
    }

    /* renamed from: a */
    public static void m49333a(Parcel parcel, int i, int i2) {
        int a = m49331a(parcel, i);
        if (a != i2) {
            String hexString = Integer.toHexString(a);
            throw new C25568a(new StringBuilder(String.valueOf(hexString).length() + 46).append("Expected size ").append(i2).append(" got ").append(a).append(" (0x").append(hexString).append(")").toString(), parcel);
        }
    }
}

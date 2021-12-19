package com.p2082ss.android.ugc.tools.p4341d.p4342a;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.d.a.a */
public final class C84409a {
    static {
        Covode.recordClassIndex(98374);
    }

    /* renamed from: a */
    public static final int m145194a(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        try {
            Parcel obtain = Parcel.obtain();
            C89219l.m154716b(obtain, "");
            obtain.writeBundle(bundle);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            return dataSize;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: b */
    public static final byte[] m145196b(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        Parcel obtain = Parcel.obtain();
        C89219l.m154716b(obtain, "");
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        C89219l.m154716b(marshall, "");
        return marshall;
    }

    /* renamed from: a */
    public static final Bundle m145195a(byte[] bArr) {
        C89219l.m154721d(bArr, "");
        Parcel obtain = Parcel.obtain();
        C89219l.m154716b(obtain, "");
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(C84412c.class.getClassLoader());
        obtain.recycle();
        if (readBundle == null) {
            return new Bundle();
        }
        return readBundle;
    }
}

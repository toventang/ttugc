package com.google.android.datatransport.runtime;

import android.util.Base64;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.EnumC25111d;
import com.google.android.datatransport.runtime.C25141c;

/* renamed from: com.google.android.datatransport.runtime.k */
public abstract class AbstractC25162k {

    /* renamed from: com.google.android.datatransport.runtime.k$a */
    public static abstract class AbstractC25163a {
        static {
            Covode.recordClassIndex(30529);
        }

        /* renamed from: a */
        public abstract AbstractC25163a mo41124a(EnumC25111d dVar);

        /* renamed from: a */
        public abstract AbstractC25163a mo41125a(String str);

        /* renamed from: a */
        public abstract AbstractC25163a mo41126a(byte[] bArr);

        /* renamed from: a */
        public abstract AbstractC25162k mo41127a();
    }

    static {
        Covode.recordClassIndex(30528);
    }

    /* renamed from: a */
    public abstract String mo41119a();

    /* renamed from: b */
    public abstract byte[] mo41120b();

    /* renamed from: c */
    public abstract EnumC25111d mo41121c();

    /* renamed from: d */
    public static AbstractC25163a m48261d() {
        return new C25141c.C25142a().mo41124a(EnumC25111d.DEFAULT);
    }

    public final String toString() {
        String encodeToString;
        Object[] objArr = new Object[3];
        objArr[0] = mo41119a();
        objArr[1] = mo41121c();
        if (mo41120b() == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(mo41120b(), 2);
        }
        objArr[2] = encodeToString;
        return C1764a.m5928a("TransportContext(%s, %s, %s)", objArr);
    }
}

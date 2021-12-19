package com.p2082ss.android.ugc.playerkit.p4323c;

import android.text.TextUtils;
import androidx.p025c.C0490e;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.playerkit.c.b */
public final class C84184b {

    /* renamed from: a */
    public static boolean f187862a;

    /* renamed from: b */
    public static volatile String f187863b;

    /* renamed from: c */
    public static volatile C0490e<String, List<C84185a>> f187864c = new C0490e<>(4);

    /* renamed from: d */
    public static AbstractC84183a f187865d;

    /* renamed from: com.ss.android.ugc.playerkit.c.b$a */
    public static class C84185a {

        /* renamed from: a */
        int f187866a;

        /* renamed from: b */
        String f187867b;

        static {
            Covode.recordClassIndex(98087);
        }

        public final int hashCode() {
            return this.f187866a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass() && this.f187866a == ((C84185a) obj).f187866a) {
                return true;
            }
            return false;
        }

        public C84185a(int i, String str) {
            this.f187866a = i;
            this.f187867b = str;
        }
    }

    static {
        Covode.recordClassIndex(98086);
    }

    /* renamed from: a */
    public static void m144764a(String str) {
        if (!TextUtils.isEmpty(str) && f187864c.mo2091a(str) == null) {
            f187864c.mo2092a(str, new CopyOnWriteArrayList());
        }
    }
}

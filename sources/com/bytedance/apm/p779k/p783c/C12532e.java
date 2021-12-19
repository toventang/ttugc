package com.bytedance.apm.p779k.p783c;

import android.os.Build;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.apm.k.c.e */
public final class C12532e {

    /* renamed from: a */
    private AbstractC12527a f30441a;

    static {
        Covode.recordClassIndex(14348);
    }

    /* renamed from: com.bytedance.apm.k.c.e$a */
    public static class C12533a {

        /* renamed from: a */
        public static C12532e f30442a = new C12532e((byte) 0);

        static {
            Covode.recordClassIndex(14349);
        }
    }

    private C12532e() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f30441a = new C12528b();
        } else {
            this.f30441a = new C12529c();
        }
    }

    /* synthetic */ C12532e(byte b) {
        this();
    }
}

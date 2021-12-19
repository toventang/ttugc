package com.bytedance.p1399im.core.p1408d;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1431d.AbstractC19968d;

/* renamed from: com.bytedance.im.core.d.u */
public final class C19672u {

    /* renamed from: a */
    public int f46728a;

    /* renamed from: b */
    public int f46729b;

    /* renamed from: c */
    public String f46730c;

    /* renamed from: d */
    public long f46731d;

    /* renamed from: e */
    public String f46732e;

    /* renamed from: f */
    public String f46733f;

    /* renamed from: g */
    public String f46734g;

    /* renamed from: h */
    public Throwable f46735h;

    static {
        Covode.recordClassIndex(22516);
    }

    private C19672u() {
    }

    /* renamed from: com.bytedance.im.core.d.u$a */
    public static class C19673a {

        /* renamed from: a */
        public C19672u f46736a;

        static {
            Covode.recordClassIndex(22517);
        }

        /* renamed from: a */
        public final C19673a mo31628a() {
            this.f46736a.f46728a = -10;
            return this;
        }

        private C19673a() {
            this.f46736a = new C19672u((byte) 0);
        }

        /* synthetic */ C19673a(byte b) {
            this();
        }

        /* renamed from: a */
        public final C19673a mo31629a(int i) {
            this.f46736a.f46729b = i;
            return this;
        }

        /* renamed from: a */
        public final C19673a mo31630a(String str) {
            this.f46736a.f46730c = str;
            return this;
        }
    }

    /* renamed from: a */
    public static C19673a m36755a() {
        return new C19673a((byte) 0);
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder("IMError{code=").append(this.f46728a).append(", status=").append(this.f46729b).append(", statusMsg=").append(this.f46730c).append(", check").append(this.f46731d).append(", checkMsg=$").append(this.f46732e).append(", logId=").append(this.f46733f).append(", ext=").append(this.f46734g).append(", throwable=");
        Throwable th = this.f46735h;
        if (th != null) {
            str = Log.getStackTraceString(th);
        } else {
            str = null;
        }
        return append.append(str).append("}").toString();
    }

    /* synthetic */ C19672u(byte b) {
        this();
    }

    /* renamed from: a */
    public static C19672u m36756a(AbstractC19968d dVar) {
        C19672u uVar = new C19672u();
        uVar.f46728a = dVar.mo31852a();
        uVar.f46729b = dVar.mo31853b();
        uVar.f46730c = dVar.mo31854c();
        uVar.f46731d = dVar.mo31855d();
        uVar.f46732e = dVar.mo31856e();
        uVar.f46733f = dVar.mo31857f();
        uVar.f46734g = dVar.mo31858g();
        return uVar;
    }
}

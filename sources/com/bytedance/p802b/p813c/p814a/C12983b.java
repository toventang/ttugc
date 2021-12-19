package com.bytedance.p802b.p813c.p814a;

import android.content.SharedPreferences;
import android.os.Process;
import com.bytedance.apm.C12397c;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1782z.p1783a.p1784a.AbstractC23724c;
import com.bytedance.p1782z.p1783a.p1784a.C23723b;
import com.bytedance.p802b.p813c.C12978a;
import com.bytedance.p802b.p813c.C12997b;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p802b.p834j.p838d.AbstractC13106a;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.b.c.a.b */
public final class C12983b {

    /* renamed from: a */
    public AtomicBoolean f31617a;

    /* renamed from: b */
    public C12989d f31618b;

    /* renamed from: c */
    public C12987c f31619c;

    /* renamed from: d */
    public SharedPreferences f31620d;

    /* renamed from: e */
    public AbstractC13106a f31621e;

    /* renamed from: f */
    public C12978a.AbstractC12979a f31622f;

    /* renamed from: g */
    private AbstractC23724c f31623g;

    static {
        Covode.recordClassIndex(14819);
    }

    /* renamed from: com.bytedance.b.c.a.b$a */
    public static final class C12986a {

        /* renamed from: a */
        public static final C12983b f31626a = new C12983b((byte) 0);

        static {
            Covode.recordClassIndex(14822);
        }
    }

    private C12983b() {
        this.f31617a = new AtomicBoolean(false);
        try {
            this.f31623g = C23723b.m44832a(C12397c.f29931a);
        } catch (Throwable unused) {
        }
        this.f31619c = new C12987c(this.f31623g);
        this.f31618b = new C12989d(this.f31619c, this.f31623g);
    }

    /* renamed from: a */
    public final boolean mo20835a() {
        boolean z;
        if (this.f31621e.mo20901a()) {
            this.f31620d.edit().putString(C13037a.m23436d(), Process.myPid() + "," + this.f31621e.mo20901a()).apply();
            return true;
        }
        Map<String, ?> all = this.f31620d.getAll();
        if (all != null) {
            Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    if (((String) it.next().getValue()).split(",")[1].equals("true")) {
                        z = true;
                        break;
                    }
                } catch (Throwable unused) {
                }
            }
            C12997b.EnumC12998a a = C12997b.m23324a();
            if (!z || this.f31621e.mo20901a() || a == C12997b.EnumC12998a.TOP_APP || a == C12997b.EnumC12998a.FOREGROUND) {
                return true;
            }
            return false;
        }
        z = false;
        C12997b.EnumC12998a a2 = C12997b.m23324a();
        if (!z) {
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        if (0 == 0) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20836b() {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p802b.p813c.p814a.C12983b.mo20836b():void");
    }

    /* synthetic */ C12983b(byte b) {
        this();
    }
}

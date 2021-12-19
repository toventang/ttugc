package com.facebook.internal;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.internal.p1894a.p1896b.C24677a;
import java.util.UUID;

/* renamed from: com.facebook.internal.a */
public class C24667a {

    /* renamed from: a */
    private static C24667a f58591a;

    /* renamed from: b */
    private UUID f58592b;

    /* renamed from: c */
    private Intent f58593c;

    /* renamed from: d */
    private int f58594d;

    static {
        Covode.recordClassIndex(28820);
    }

    /* renamed from: a */
    public final Intent mo40495a() {
        if (C24677a.m47209a(this)) {
            return null;
        }
        try {
            return this.f58593c;
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return null;
        }
    }

    /* renamed from: b */
    public final UUID mo40497b() {
        if (C24677a.m47209a(this)) {
            return null;
        }
        try {
            return this.f58592b;
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return null;
        }
    }

    /* renamed from: c */
    public final int mo40498c() {
        if (C24677a.m47209a(this)) {
            return 0;
        }
        try {
            return this.f58594d;
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return 0;
        }
    }

    /* renamed from: e */
    private static C24667a m47191e() {
        if (C24677a.m47209a(C24667a.class)) {
            return null;
        }
        try {
            return f58591a;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24667a.class);
            return null;
        }
    }

    /* renamed from: d */
    public final boolean mo40499d() {
        if (C24677a.m47209a(this)) {
            return false;
        }
        try {
            return m47190a(this);
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return false;
        }
    }

    public C24667a(int i) {
        this(i, UUID.randomUUID());
    }

    /* renamed from: a */
    public final void mo40496a(Intent intent) {
        if (!C24677a.m47209a(this)) {
            try {
                this.f58593c = intent;
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    /* renamed from: a */
    private static synchronized boolean m47190a(C24667a aVar) {
        synchronized (C24667a.class) {
            MethodCollector.m26663i(7137);
            if (C24677a.m47209a(C24667a.class)) {
                MethodCollector.m26664o(7137);
                return false;
            }
            try {
                C24667a e = m47191e();
                f58591a = aVar;
                if (e != null) {
                    MethodCollector.m26664o(7137);
                    return true;
                }
                MethodCollector.m26664o(7137);
                return false;
            } catch (Throwable th) {
                C24677a.m47208a(th, C24667a.class);
                MethodCollector.m26664o(7137);
                return false;
            }
        }
    }

    private C24667a(int i, UUID uuid) {
        this.f58592b = uuid;
        this.f58594d = i;
    }

    /* renamed from: a */
    public static synchronized C24667a m47189a(UUID uuid, int i) {
        synchronized (C24667a.class) {
            MethodCollector.m26663i(6984);
            if (C24677a.m47209a(C24667a.class)) {
                MethodCollector.m26664o(6984);
                return null;
            }
            try {
                C24667a e = m47191e();
                if (e == null || !e.mo40497b().equals(uuid) || e.mo40498c() != i) {
                    MethodCollector.m26664o(6984);
                    return null;
                }
                m47190a((C24667a) null);
                MethodCollector.m26664o(6984);
                return e;
            } catch (Throwable th) {
                C24677a.m47208a(th, C24667a.class);
                MethodCollector.m26664o(6984);
                return null;
            }
        }
    }
}

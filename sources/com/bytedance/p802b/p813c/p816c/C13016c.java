package com.bytedance.p802b.p813c.p816c;

import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p813c.C12978a;
import com.bytedance.p802b.p813c.p815b.C13001c;
import com.bytedance.p802b.p813c.p816c.p817a.C13008d;
import com.bytedance.p802b.p821e.p822a.C13037a;

/* renamed from: com.bytedance.b.c.c.c */
public final class C13016c {

    /* renamed from: a */
    public long f31710a;

    /* renamed from: b */
    public C12978a.AbstractC12980b f31711b;

    /* renamed from: c */
    private boolean f31712c;

    /* renamed from: d */
    private AbstractC13020f f31713d;

    /* renamed from: e */
    private C13001c f31714e;

    /* renamed from: f */
    private boolean f31715f;

    /* renamed from: g */
    private boolean f31716g;

    static {
        Covode.recordClassIndex(14852);
    }

    /* renamed from: a */
    public final synchronized boolean mo20869a() {
        return this.f31715f;
    }

    /* renamed from: com.bytedance.b.c.c.c$a */
    public static final class C13017a {

        /* renamed from: a */
        public static final C13016c f31717a = new C13016c((byte) 0);

        static {
            Covode.recordClassIndex(14853);
        }
    }

    private C13016c() {
        this.f31713d = new C13008d();
    }

    /* synthetic */ C13016c(byte b) {
        this();
    }

    /* renamed from: a */
    public final synchronized void mo20868a(C13001c cVar) {
        if (cVar != null) {
            if (C13037a.m23435c() || cVar.f31675f) {
                this.f31714e = cVar;
                if (this.f31716g) {
                    if (!this.f31712c) {
                        this.f31712c = true;
                        this.f31715f = true;
                        this.f31713d.mo20863a(cVar);
                    }
                } else if (cVar.f31670a) {
                    this.f31712c = true;
                    this.f31715f = true;
                    this.f31713d.mo20863a(cVar);
                } else {
                    this.f31712c = false;
                    this.f31713d.mo20864c();
                }
            }
        }
    }
}

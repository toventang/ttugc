package com.bytedance.apm.p773f;

import com.bytedance.apm.p773f.C12464c;
import com.bytedance.apm.trace.C12609b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.apm.f.a */
public final class C12451a {

    /* renamed from: a */
    private C12464c f30246a;

    /* renamed from: b */
    private C12609b.C12610a f30247b;

    static {
        Covode.recordClassIndex(14261);
    }

    private C12451a() {
    }

    /* renamed from: com.bytedance.apm.f.a$a */
    public static final class C12452a {

        /* renamed from: a */
        public static final C12451a f30248a = new C12451a((byte) 0);

        static {
            Covode.recordClassIndex(14262);
        }
    }

    /* renamed from: b */
    public final synchronized C12609b.C12610a mo20284b() {
        if (this.f30247b == null) {
            this.f30247b = new C12609b.C12610a(new C12609b.C12610a.C12611a(), (byte) 0);
        }
        return this.f30247b;
    }

    /* renamed from: a */
    public final synchronized C12464c mo20282a() {
        if (this.f30246a == null) {
            C12464c.C12465a aVar = new C12464c.C12465a();
            this.f30246a = new C12464c(aVar.f30282a, aVar.f30283b, aVar.f30284c, aVar.f30287f, aVar.f30285d, aVar.f30288g, aVar.f30286e);
        }
        return this.f30246a;
    }

    /* synthetic */ C12451a(byte b) {
        this();
    }

    /* renamed from: a */
    public final synchronized void mo20283a(C12464c cVar) {
        this.f30246a = cVar;
    }
}

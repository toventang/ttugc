package com.bytedance.p802b.p813c.p816c;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1782z.p1783a.p1784a.AbstractC23724c;
import com.bytedance.p802b.p813c.C12978a;
import com.bytedance.p802b.p813c.p815b.C13001c;
import com.bytedance.p802b.p834j.p838d.AbstractC13106a;

/* renamed from: com.bytedance.b.c.c.d */
public final class C13018d {

    /* renamed from: a */
    public boolean f31718a;

    /* renamed from: b */
    public AbstractC23724c f31719b;

    /* renamed from: c */
    public AbstractC13021g f31720c;

    /* renamed from: d */
    public AbstractC13021g f31721d;

    /* renamed from: e */
    public AbstractC13021g f31722e;

    /* renamed from: f */
    public AbstractC13021g f31723f;

    /* renamed from: g */
    public AbstractC13021g f31724g;

    /* renamed from: h */
    private boolean f31725h;

    /* renamed from: i */
    private boolean f31726i;

    /* renamed from: j */
    private AbstractC13106a f31727j;

    /* renamed from: k */
    private AbstractC13021g f31728k;

    /* renamed from: l */
    private C13001c f31729l;

    static {
        Covode.recordClassIndex(14854);
    }

    /* renamed from: b */
    public final synchronized void mo20873b() {
        m23366a(this.f31724g);
    }

    /* renamed from: c */
    public final synchronized void mo20874c() {
        m23366a(this.f31720c);
    }

    /* renamed from: d */
    public final synchronized void mo20875d() {
        m23366a(this.f31721d);
    }

    /* renamed from: e */
    public final synchronized void mo20876e() {
        m23366a(this.f31722e);
    }

    /* renamed from: f */
    public final synchronized void mo20877f() {
        m23366a(this.f31723f);
    }

    /* renamed from: a */
    public final synchronized void mo20870a() {
        AbstractC13021g gVar = this.f31728k;
        if (gVar != null) {
            if (this.f31725h) {
                gVar.mo20854a();
                this.f31725h = false;
            }
        }
    }

    public C13018d(AbstractC13106a aVar) {
        this.f31727j = aVar;
    }

    /* renamed from: a */
    private void m23366a(AbstractC13021g gVar) {
        boolean z;
        if (this.f31725h && this.f31718a) {
            this.f31728k = gVar;
            C13001c cVar = this.f31729l;
            AbstractC13106a aVar = this.f31727j;
            if (aVar == null || !aVar.mo20901a()) {
                z = true;
            } else {
                z = false;
            }
            gVar.mo20855a(cVar, z);
        }
    }

    /* renamed from: a */
    public final synchronized void mo20871a(C13001c cVar) {
        if (!this.f31725h) {
            if (this.f31718a) {
                this.f31729l = cVar;
                boolean z = true;
                this.f31725h = true;
                C13015b.f31709a = C12978a.m23302a().mo20832b();
                if (this.f31727j.mo20901a()) {
                    z = false;
                }
                this.f31726i = z;
                mo20874c();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo20872a(boolean z) {
        AbstractC13021g gVar = this.f31728k;
        if (gVar != null) {
            if (this.f31725h) {
                if (this.f31726i != z) {
                    this.f31726i = z;
                    gVar.mo20856a(z);
                }
            }
        }
    }
}

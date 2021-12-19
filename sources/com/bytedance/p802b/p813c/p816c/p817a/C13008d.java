package com.bytedance.p802b.p813c.p816c.p817a;

import com.bytedance.apm.C12397c;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1782z.p1783a.p1784a.C23723b;
import com.bytedance.p802b.p813c.p815b.C13001c;
import com.bytedance.p802b.p813c.p816c.AbstractC13020f;
import com.bytedance.p802b.p813c.p816c.AbstractC13021g;
import com.bytedance.p802b.p813c.p816c.C13018d;
import com.bytedance.p802b.p834j.C13104c;
import com.bytedance.p802b.p834j.p838d.AbstractC13106a;
import com.bytedance.p802b.p834j.p838d.C13107b;

/* renamed from: com.bytedance.b.c.c.a.d */
public final class C13008d extends C13107b implements AbstractC13020f {

    /* renamed from: a */
    private volatile C13018d f31692a = new C13018d(this.f31693b);

    /* renamed from: b */
    private AbstractC13106a f31693b = ((AbstractC13106a) C13104c.m23566a(AbstractC13106a.class));

    /* renamed from: c */
    private AbstractC13021g f31694c = new C13010f(this.f31692a);

    /* renamed from: d */
    private AbstractC13021g f31695d = new C13011g(this.f31692a);

    /* renamed from: e */
    private AbstractC13021g f31696e = new C13012h(this.f31692a);

    /* renamed from: f */
    private AbstractC13021g f31697f = new C13006c(this.f31692a);

    /* renamed from: g */
    private AbstractC13021g f31698g = new C13009e(this.f31692a);

    static {
        Covode.recordClassIndex(14844);
    }

    @Override // com.bytedance.p802b.p834j.p838d.C13107b, com.bytedance.p802b.p834j.p838d.AbstractC13108c
    /* renamed from: a */
    public final void mo20838a() {
        this.f31692a.mo20872a(false);
    }

    @Override // com.bytedance.p802b.p834j.p838d.C13107b, com.bytedance.p802b.p834j.p838d.AbstractC13108c
    /* renamed from: b */
    public final void mo20839b() {
        this.f31692a.mo20872a(true);
    }

    @Override // com.bytedance.p802b.p813c.p816c.AbstractC13020f
    /* renamed from: c */
    public final void mo20864c() {
        this.f31692a.mo20870a();
    }

    public C13008d() {
        C13018d dVar = this.f31692a;
        AbstractC13021g gVar = this.f31694c;
        AbstractC13021g gVar2 = this.f31695d;
        AbstractC13021g gVar3 = this.f31696e;
        AbstractC13021g gVar4 = this.f31697f;
        AbstractC13021g gVar5 = this.f31698g;
        if (!dVar.f31718a) {
            dVar.f31720c = gVar;
            dVar.f31721d = gVar2;
            dVar.f31722e = gVar3;
            dVar.f31723f = gVar4;
            dVar.f31724g = gVar5;
            try {
                dVar.f31719b = C23723b.m44832a(C12397c.f29931a);
            } catch (Throwable unused) {
            }
            dVar.f31718a = true;
        }
        this.f31693b.mo20900a(this);
    }

    @Override // com.bytedance.p802b.p813c.p816c.AbstractC13020f
    /* renamed from: a */
    public final void mo20863a(C13001c cVar) {
        this.f31692a.mo20871a(cVar);
    }
}

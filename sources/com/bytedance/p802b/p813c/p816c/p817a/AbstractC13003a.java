package com.bytedance.p802b.p813c.p816c.p817a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1782z.p1783a.p1784a.AbstractC23724c;
import com.bytedance.p802b.p813c.p815b.C13001c;
import com.bytedance.p802b.p813c.p816c.AbstractC13002a;
import com.bytedance.p802b.p813c.p816c.C13015b;
import com.bytedance.p802b.p813c.p816c.C13018d;
import com.bytedance.p802b.p813c.p816c.C13019e;
import com.bytedance.p802b.p841k.p845d.AbstractRunnableC13123a;
import com.bytedance.p802b.p841k.p845d.C13124b;
import com.bytedance.p802b.p841k.p845d.EnumC13126c;

/* renamed from: com.bytedance.b.c.c.a.a */
public abstract class AbstractC13003a extends AbstractC13002a {

    /* renamed from: b */
    protected boolean f31679b;

    /* renamed from: c */
    private C13001c f31680c;

    /* renamed from: d */
    private AbstractRunnableC13123a f31681d = new AbstractRunnableC13123a(mo20859c(), mo20859c()) {
        /* class com.bytedance.p802b.p813c.p816c.p817a.AbstractC13003a.C130041 */

        static {
            Covode.recordClassIndex(14840);
        }

        public final void run() {
            AbstractC13003a.this.mo20857b();
        }
    };

    static {
        Covode.recordClassIndex(14839);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo20858b(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract long mo20859c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo20860d();

    @Override // com.bytedance.p802b.p813c.p816c.AbstractC13021g, com.bytedance.p802b.p813c.p816c.AbstractC13002a
    /* renamed from: a */
    public final void mo20854a() {
        super.mo20854a();
        C13124b.m23597a(EnumC13126c.IO).mo20944b(this.f31681d);
    }

    /* renamed from: b */
    public final void mo20857b() {
        boolean z;
        if (!C13015b.m23362a()) {
            double a = C13019e.m23375a();
            AbstractC23724c cVar = this.f31678a.f31719b;
            if (cVar == null || (z = cVar.mo39164a((float) a))) {
                z = C13015b.m23363a(this.f31680c, a, this.f31679b);
            }
            if (mo20858b(z)) {
                C13124b.m23597a(EnumC13126c.IO).mo20944b(this.f31681d);
            }
        } else if (mo20860d()) {
            C13124b.m23597a(EnumC13126c.IO).mo20944b(this.f31681d);
        }
    }

    public AbstractC13003a(C13018d dVar) {
        super(dVar);
    }

    @Override // com.bytedance.p802b.p813c.p816c.AbstractC13021g, com.bytedance.p802b.p813c.p816c.AbstractC13002a
    /* renamed from: a */
    public void mo20856a(boolean z) {
        super.mo20856a(z);
        C13124b.m23597a(EnumC13126c.IO).mo20944b(this.f31681d);
        this.f31678a.mo20873b();
    }

    @Override // com.bytedance.p802b.p813c.p816c.AbstractC13021g, com.bytedance.p802b.p813c.p816c.AbstractC13002a
    /* renamed from: a */
    public final void mo20855a(C13001c cVar, boolean z) {
        super.mo20855a(cVar, z);
        this.f31680c = cVar;
        this.f31679b = z;
        C13124b.m23597a(EnumC13126c.IO).mo20943a(this.f31681d);
    }
}

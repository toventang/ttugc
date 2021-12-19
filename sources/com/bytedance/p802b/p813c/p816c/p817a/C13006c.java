package com.bytedance.p802b.p813c.p816c.p817a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p813c.p815b.C13001c;
import com.bytedance.p802b.p813c.p816c.AbstractC13002a;
import com.bytedance.p802b.p813c.p816c.C13018d;
import com.bytedance.p802b.p841k.p845d.AbstractRunnableC13123a;
import com.bytedance.p802b.p841k.p845d.C13124b;
import com.bytedance.p802b.p841k.p845d.EnumC13126c;

/* renamed from: com.bytedance.b.c.c.a.c */
final class C13006c extends AbstractC13002a {

    /* renamed from: b */
    public volatile boolean f31688b;

    /* renamed from: c */
    private AbstractRunnableC13123a f31689c;

    static {
        Covode.recordClassIndex(14842);
    }

    @Override // com.bytedance.p802b.p813c.p816c.AbstractC13021g, com.bytedance.p802b.p813c.p816c.AbstractC13002a
    /* renamed from: a */
    public final void mo20854a() {
        super.mo20854a();
        C13124b.m23597a(EnumC13126c.LIGHT_WEIGHT).mo20944b(this.f31689c);
    }

    @Override // com.bytedance.p802b.p813c.p816c.AbstractC13021g, com.bytedance.p802b.p813c.p816c.AbstractC13002a
    /* renamed from: a */
    public final void mo20856a(boolean z) {
        super.mo20856a(z);
        this.f31688b = z;
    }

    public C13006c(final C13018d dVar) {
        super(dVar);
        long j;
        if (this.f31688b) {
            j = 1200000;
        } else {
            j = 120000;
        }
        this.f31689c = new AbstractRunnableC13123a(j) {
            /* class com.bytedance.p802b.p813c.p816c.p817a.C13006c.C130071 */

            static {
                Covode.recordClassIndex(14843);
            }

            public final void run() {
                boolean z = C13006c.this.f31688b;
                dVar.mo20873b();
            }
        };
    }

    @Override // com.bytedance.p802b.p813c.p816c.AbstractC13021g, com.bytedance.p802b.p813c.p816c.AbstractC13002a
    /* renamed from: a */
    public final void mo20855a(C13001c cVar, boolean z) {
        super.mo20855a(cVar, z);
        C13124b.m23597a(EnumC13126c.LIGHT_WEIGHT).mo20943a(this.f31689c);
    }
}

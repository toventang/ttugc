package com.bytedance.p802b.p813c.p816c.p817a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p813c.p816c.C13018d;

/* renamed from: com.bytedance.b.c.c.a.g */
final class C13011g extends AbstractC13003a {

    /* renamed from: c */
    private int f31699c;

    static {
        Covode.recordClassIndex(14847);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p802b.p813c.p816c.p817a.AbstractC13003a
    /* renamed from: c */
    public final long mo20859c() {
        if (this.f31679b) {
            return 300000;
        }
        return 5000;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p802b.p813c.p816c.p817a.AbstractC13003a
    /* renamed from: d */
    public final boolean mo20860d() {
        this.f31699c = 0;
        this.f31678a.mo20874c();
        return true;
    }

    public C13011g(C13018d dVar) {
        super(dVar);
    }

    @Override // com.bytedance.p802b.p813c.p816c.AbstractC13021g, com.bytedance.p802b.p813c.p816c.p817a.AbstractC13003a, com.bytedance.p802b.p813c.p816c.AbstractC13002a
    /* renamed from: a */
    public final void mo20856a(boolean z) {
        if (z) {
            this.f31699c = 0;
        }
        super.mo20856a(z);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p802b.p813c.p816c.p817a.AbstractC13003a
    /* renamed from: b */
    public final boolean mo20858b(boolean z) {
        if (z) {
            int i = this.f31699c + 1;
            this.f31699c = i;
            if (i < 2) {
                return false;
            }
            this.f31699c = 0;
            this.f31678a.mo20876e();
            return true;
        }
        this.f31699c = 0;
        this.f31678a.mo20874c();
        return true;
    }
}

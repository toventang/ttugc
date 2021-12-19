package com.p2082ss.android.ugc.aweme.search.p3686d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.search.d.d */
public final class C67365d {

    /* renamed from: a */
    public int f150937a = Integer.MIN_VALUE;

    /* renamed from: b */
    private final int f150938b;

    /* renamed from: c */
    private final AbstractC67363b f150939c;

    static {
        Covode.recordClassIndex(78995);
    }

    /* renamed from: a */
    public final void mo106287a(int i) {
        if (m119412b(this.f150937a, i)) {
            this.f150939c.mo106286l();
        }
    }

    public C67365d(int i, AbstractC67363b bVar) {
        this.f150938b = i;
        this.f150939c = bVar;
    }

    /* renamed from: b */
    private boolean m119412b(int i, int i2) {
        int i3 = this.f150938b;
        if (i3 > 0 && (i2 - i) - 1 <= i3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo106288a(int i, int i2) {
        if (i > this.f150937a) {
            this.f150937a = i;
            if (m119412b(i, i2)) {
                this.f150939c.mo106286l();
            }
        }
    }
}

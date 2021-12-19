package com.p2082ss.android.ugc.aweme.setting.p3723k;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39159o;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.AbstractC35320a;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.C35321b;
import com.p2082ss.android.ugc.aweme.setting.model.C68182l;

/* renamed from: com.ss.android.ugc.aweme.setting.k.e */
public final class C68123e extends C35321b<C68182l, AbstractC68122d> implements AbstractC39159o {
    static {
        Covode.recordClassIndex(80319);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        if (this.f83349c != null) {
            ((AbstractC68122d) this.f83349c).mo108687a(((AbstractC35320a) this.f83348b).mData);
        }
    }

    /* renamed from: a */
    public final void mo108688a(String str) {
        ((C68182l) this.f83348b).mo108722a(str);
    }

    public C68123e(C68182l lVar, AbstractC68122d dVar) {
        super(lVar, dVar);
        ((AbstractC35320a) this.f83348b).addNotifyListener(this);
    }
}

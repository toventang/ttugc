package com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39159o;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.AbstractC35320a;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.C35321b;
import com.p2082ss.android.ugc.aweme.qrcode.p3655d.C66393c;
import com.p2082ss.android.ugc.aweme.qrcode.p3655d.C66394d;

/* renamed from: com.ss.android.ugc.aweme.qrcode.presenter.a.i */
public final class C66436i extends C35321b<C66394d, AbstractC66420a> implements AbstractC39159o {
    static {
        Covode.recordClassIndex(77970);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        if (this.f83349c != null) {
            ((AbstractC66420a) this.f83349c).mo79959a((C66393c) ((AbstractC35320a) this.f83348b).mData);
        }
    }

    /* renamed from: a */
    public final void mo105359a(String str) {
        ((C66394d) this.f83348b).mo105314a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        if (this.f83349c != null) {
            ((AbstractC66420a) this.f83349c).mo79960a(exc);
        }
    }

    public C66436i(C66394d dVar, AbstractC66420a aVar) {
        super(dVar, aVar);
        dVar.addNotifyListener(this);
    }
}

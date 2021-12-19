package com.p2082ss.android.ugc.aweme.share.p3763k.p3765b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.common.AbstractC39159o;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.AbstractC35320a;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.C35321b;
import com.p2082ss.android.ugc.aweme.share.p3763k.p3764a.C69276b;

/* renamed from: com.ss.android.ugc.aweme.share.k.b.d */
public final class C69281d extends C35321b<C69276b, AbstractC69279b> implements AbstractC39159o {
    static {
        Covode.recordClassIndex(81611);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        if (((AbstractC35320a) this.f83348b).mData.f152645a != 0 || !((AbstractC35320a) this.f83348b).mData.f152647c) {
            if (this.f83349c != null) {
                C34485a aVar = new C34485a(((AbstractC35320a) this.f83348b).mData.f152645a);
                aVar.setErrorMsg(((AbstractC35320a) this.f83348b).mData.f152646b);
                ((AbstractC69279b) this.f83349c).mo109525a(aVar);
            }
        } else if (this.f83349c == null) {
        }
    }

    /* renamed from: a */
    public final void mo109589a(String str) {
        ((C69276b) this.f83348b).mo109586a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        if (this.f83349c != null) {
            ((AbstractC69279b) this.f83349c).mo109525a(exc);
        }
    }

    public C69281d(C69276b bVar, AbstractC69279b bVar2) {
        super(bVar, bVar2);
        ((AbstractC35320a) this.f83348b).addNotifyListener(this);
    }
}

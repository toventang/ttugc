package com.p2082ss.android.ugc.aweme.share.p3763k.p3765b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.common.AbstractC39159o;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.AbstractC35320a;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.C35321b;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68068c;
import com.p2082ss.android.ugc.aweme.share.p3763k.p3764a.C69274a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* renamed from: com.ss.android.ugc.aweme.share.k.b.c */
public final class C69280c extends C35321b<C69274a, AbstractC69278a> implements AbstractC39159o {
    static {
        Covode.recordClassIndex(81610);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        if (((AbstractC35320a) this.f83348b).mData.f152645a == 0 && ((AbstractC35320a) this.f83348b).mData.f152647c) {
            if (this.f83349c != null) {
                ((AbstractC69278a) this.f83349c).mo109516h();
            }
            AbstractC81915c.m141874a(new C68068c());
        } else if (this.f83349c != null) {
            C34485a aVar = new C34485a(((AbstractC35320a) this.f83348b).mData.f152645a);
            aVar.setErrorMsg(((AbstractC35320a) this.f83348b).mData.f152646b);
            ((AbstractC69278a) this.f83349c).mo109515a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo109588a(String str) {
        ((C69274a) this.f83348b).mo109584a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        if (this.f83349c != null) {
            ((AbstractC69278a) this.f83349c).mo109515a(exc);
        }
    }

    public C69280c(C69274a aVar, AbstractC69278a aVar2) {
        super(aVar, aVar2);
        ((AbstractC35320a) this.f83348b).addNotifyListener(this);
    }
}

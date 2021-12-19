package com.p2082ss.android.ugc.aweme.sticker.p3981q;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.presenter.AbstractC30029f;
import com.p2082ss.android.medialib.presenter.C30049i;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75638o;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.q.e */
public final class C75669e implements AbstractC75638o {

    /* renamed from: a */
    private final AbstractC31193a f170090a;

    static {
        Covode.recordClassIndex(88600);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.q.e$a */
    static final class C75670a implements C30049i.AbstractC30051b {

        /* renamed from: a */
        final /* synthetic */ AbstractC75638o.AbstractC75639a f170091a;

        static {
            Covode.recordClassIndex(88601);
        }

        C75670a(AbstractC75638o.AbstractC75639a aVar) {
            this.f170091a = aVar;
        }

        @Override // com.p2082ss.android.medialib.presenter.AbstractC30029f.AbstractC30030a
        /* renamed from: a */
        public final void mo53182a() {
            this.f170091a.mo119340a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75638o
    /* renamed from: a */
    public final void mo119365a() {
        AbstractC30029f c = this.f170090a.mo56803c();
        if (c != null) {
            c.mo53178a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75638o
    /* renamed from: b */
    public final void mo119368b() {
        AbstractC30029f c = this.f170090a.mo56803c();
        if (c != null) {
            c.mo53181b();
        }
    }

    public C75669e(AbstractC31193a aVar) {
        C89219l.m154721d(aVar, "");
        this.f170090a = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75638o
    /* renamed from: a */
    public final void mo119366a(AbstractC75638o.AbstractC75639a aVar) {
        C75670a aVar2;
        AbstractC30029f c = this.f170090a.mo56803c();
        if (c != null) {
            if (aVar != null) {
                aVar2 = new C75670a(aVar);
            } else {
                aVar2 = null;
            }
            c.mo53179a(aVar2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75638o
    /* renamed from: a */
    public final void mo119367a(boolean z) {
        AbstractC30029f c = this.f170090a.mo56803c();
        if (c != null) {
            c.mo53180a(z);
        }
    }
}

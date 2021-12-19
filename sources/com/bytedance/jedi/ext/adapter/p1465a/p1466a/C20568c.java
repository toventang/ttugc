package com.bytedance.jedi.ext.adapter.p1465a.p1466a;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.p1465a.AbstractC20593c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.jedi.ext.adapter.a.a.c */
public final class C20568c extends AbstractC20571d implements AbstractC20593c {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f48698a = {new C89232y(C89204ab.m154669a(C20568c.class), "content", "getContent()Landroid/view/View;")};

    /* renamed from: b */
    public final AbstractC89171a<C89391z> f48699b;

    /* renamed from: c */
    private final AbstractC89244h f48700c;

    @Override // com.bytedance.jedi.ext.adapter.p1465a.AbstractC20593c
    /* renamed from: a */
    public final View mo33846a() {
        return (View) this.f48700c.getValue();
    }

    static {
        Covode.recordClassIndex(24100);
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.a.c$a */
    static final class C20569a extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C20568c f48701a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f48702b;

        static {
            Covode.recordClassIndex(24101);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20569a(C20568c cVar, ViewGroup viewGroup) {
            super(0);
            this.f48701a = cVar;
            this.f48702b = viewGroup;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            View a = C20572e.m38772a(this.f48702b, R.layout.vh);
            this.f48701a.mo33850a(a, R.id.erj, R.id.eri);
            AbstractC89171a<C89391z> aVar = this.f48701a.f48699b;
            if (aVar != null) {
                this.f48701a.mo33849a(R.id.erj, a).setOnClickListener(new View$OnClickListenerC20570a(aVar));
            }
            return a;
        }

        /* renamed from: com.bytedance.jedi.ext.adapter.a.a.c$a$a */
        static final class View$OnClickListenerC20570a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AbstractC89171a f48703a;

            static {
                Covode.recordClassIndex(24102);
            }

            View$OnClickListenerC20570a(AbstractC89171a aVar) {
                this.f48703a = aVar;
            }

            public final void onClick(View view) {
                this.f48703a.invoke();
            }
        }
    }

    public /* synthetic */ C20568c(ViewGroup viewGroup) {
        this(viewGroup, null);
    }

    @Override // com.bytedance.jedi.ext.adapter.p1465a.AbstractC20593c
    /* renamed from: a */
    public final void mo33847a(int i) {
        switch (i) {
            case 241:
                mo33851b();
                return;
            case 242:
                mo33852b(R.id.eri);
                return;
            case 243:
                mo33852b(R.id.erj);
                return;
            default:
                return;
        }
    }

    public C20568c(ViewGroup viewGroup, AbstractC89171a<C89391z> aVar) {
        C89219l.m154719c(viewGroup, "");
        this.f48699b = aVar;
        this.f48700c = C89250i.m154773a((AbstractC89171a) new C20569a(this, viewGroup));
    }
}

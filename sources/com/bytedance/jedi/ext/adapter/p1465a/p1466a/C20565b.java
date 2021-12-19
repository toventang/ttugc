package com.bytedance.jedi.ext.adapter.p1465a.p1466a;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.p1465a.AbstractC20595e;
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

/* renamed from: com.bytedance.jedi.ext.adapter.a.a.b */
public final class C20565b extends AbstractC20571d implements AbstractC20595e {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f48692a = {new C89232y(C89204ab.m154669a(C20565b.class), "content", "getContent()Landroid/view/View;")};

    /* renamed from: b */
    public final AbstractC89171a<C89391z> f48693b;

    /* renamed from: c */
    private final AbstractC89244h f48694c;

    @Override // com.bytedance.jedi.ext.adapter.p1465a.AbstractC20595e
    /* renamed from: a */
    public final View mo33842a() {
        return (View) this.f48694c.getValue();
    }

    static {
        Covode.recordClassIndex(24097);
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.a.b$a */
    static final class C20566a extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C20565b f48695a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f48696b;

        static {
            Covode.recordClassIndex(24098);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20566a(C20565b bVar, ViewGroup viewGroup) {
            super(0);
            this.f48695a = bVar;
            this.f48696b = viewGroup;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            View a = C20572e.m38772a(this.f48696b, R.layout.vg);
            this.f48695a.mo33850a(a, R.id.erh, R.id.d_3, R.id.erl, R.id.erp);
            AbstractC89171a<C89391z> aVar = this.f48695a.f48693b;
            if (aVar != null) {
                this.f48695a.mo33849a(R.id.erl, a).setOnClickListener(new View$OnClickListenerC20567a(aVar));
            }
            return a;
        }

        /* renamed from: com.bytedance.jedi.ext.adapter.a.a.b$a$a */
        static final class View$OnClickListenerC20567a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AbstractC89171a f48697a;

            static {
                Covode.recordClassIndex(24099);
            }

            View$OnClickListenerC20567a(AbstractC89171a aVar) {
                this.f48697a = aVar;
            }

            public final void onClick(View view) {
                this.f48697a.invoke();
            }
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.p1465a.AbstractC20595e
    /* renamed from: a */
    public final void mo33843a(int i) {
        switch (i) {
            case 241:
                mo33852b(R.id.erh);
                return;
            case 242:
                mo33852b(R.id.d_3);
                return;
            case 243:
                mo33852b(R.id.erp);
                return;
            case 244:
                mo33852b(R.id.erl);
                return;
            default:
                return;
        }
    }

    public C20565b(ViewGroup viewGroup, AbstractC89171a<C89391z> aVar) {
        C89219l.m154719c(viewGroup, "");
        this.f48693b = aVar;
        this.f48694c = C89250i.m154773a((AbstractC89171a) new C20566a(this, viewGroup));
    }
}

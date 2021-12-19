package com.bytedance.hybrid.spark.p1110d;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.p1107a.AbstractC15510f;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21137b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hybrid.spark.d.b */
public final class C15547b implements AbstractC15510f {

    /* renamed from: a */
    public final AbstractC89171a<C89391z> f37902a;

    /* renamed from: b */
    private final C21137b f37903b;

    /* renamed from: c */
    private final View f37904c;

    /* renamed from: com.bytedance.hybrid.spark.d.b$a */
    static final class View$OnClickListenerC15548a implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC15548a f37905a = new View$OnClickListenerC15548a();

        static {
            Covode.recordClassIndex(17810);
        }

        View$OnClickListenerC15548a() {
        }

        public final void onClick(View view) {
        }
    }

    static {
        Covode.recordClassIndex(17809);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15510f
    /* renamed from: a */
    public final void mo25251a() {
        if (this.f37903b.getDisableMaskClose()) {
            this.f37904c.setOnClickListener(View$OnClickListenerC15548a.f37905a);
        } else {
            this.f37904c.setOnClickListener(new View$OnClickListenerC15549b(this));
        }
    }

    /* renamed from: com.bytedance.hybrid.spark.d.b$b */
    static final class View$OnClickListenerC15549b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C15547b f37906a;

        static {
            Covode.recordClassIndex(17811);
        }

        View$OnClickListenerC15549b(C15547b bVar) {
            this.f37906a = bVar;
        }

        public final void onClick(View view) {
            AbstractC89171a<C89391z> aVar = this.f37906a.f37902a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public C15547b(C21137b bVar, View view, AbstractC89171a<C89391z> aVar) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(view, "");
        this.f37903b = bVar;
        this.f37904c = view;
        this.f37902a = aVar;
    }
}

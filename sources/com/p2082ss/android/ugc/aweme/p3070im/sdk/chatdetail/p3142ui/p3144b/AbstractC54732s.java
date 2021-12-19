package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b;

import android.view.View;
import com.airbnb.epoxy.AbstractC1956s;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.s */
public abstract class AbstractC54732s extends AbstractC1956s<View> {

    /* renamed from: h */
    public AbstractC89171a<C89391z> f125460h;

    static {
        Covode.recordClassIndex(64447);
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: b */
    public final int mo5792b() {
        return R.layout.a7y;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.s$a */
    static final class View$OnClickListenerC54733a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC54732s f125461a;

        static {
            Covode.recordClassIndex(64448);
        }

        View$OnClickListenerC54733a(AbstractC54732s sVar) {
            this.f125461a = sVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89171a<C89391z> aVar = this.f125461a.f125460h;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: a */
    public final /* synthetic */ void mo5788a(View view) {
        View view2 = view;
        C89219l.m154721d(view2, "");
        super.mo5788a(view2);
        view2.setOnClickListener(new View$OnClickListenerC54733a(this));
    }
}

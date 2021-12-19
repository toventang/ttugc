package com.p2082ss.android.ugc.aweme.multi.p3461a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.anchor.multi.p2313a.C33506b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34673c;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import com.p2082ss.android.ugc.aweme.multi.C60202d;
import com.p2082ss.android.ugc.aweme.multi.p3462ui.DialogC60307b;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.a.a */
public final class C60191a extends C60195b {
    static {
        Covode.recordClassIndex(70720);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.p3461a.C60195b
    /* renamed from: a */
    public final boolean mo97876a(C60202d dVar) {
        C89219l.m154721d(dVar, "");
        if (dVar.mo97898g() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.a.a$a */
    static final class View$OnClickListenerC60192a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC60201c f137207a;

        /* renamed from: b */
        final /* synthetic */ C60191a f137208b;

        /* renamed from: c */
        final /* synthetic */ AbstractC34673c f137209c;

        /* renamed from: d */
        final /* synthetic */ C60202d f137210d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f137211e;

        static {
            Covode.recordClassIndex(70721);
        }

        View$OnClickListenerC60192a(AbstractC60201c cVar, C60191a aVar, AbstractC34673c cVar2, C60202d dVar, AbstractC89172b bVar) {
            this.f137207a = cVar;
            this.f137208b = aVar;
            this.f137209c = cVar2;
            this.f137210d = dVar;
            this.f137211e = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC60201c cVar = this.f137207a;
            C60202d dVar = this.f137210d;
            cVar.mo97892c(C33506b.m68654a(dVar, cVar, this.f137208b.mo97876a(dVar)));
            this.f137211e.invoke(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.a.a$b */
    static final class C60193b extends AbstractC89220m implements AbstractC89172b<AbstractC60201c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f137212a;

        static {
            Covode.recordClassIndex(70722);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60193b(AbstractC89172b bVar) {
            super(1);
            this.f137212a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC60201c cVar) {
            C89219l.m154721d(cVar, "");
            this.f137212a.invoke(false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.a.a$c */
    static final class C60194c extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC34673c f137213a;

        /* renamed from: b */
        final /* synthetic */ C60202d f137214b;

        static {
            Covode.recordClassIndex(70723);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60194c(AbstractC34673c cVar, C60202d dVar) {
            super(1);
            this.f137213a = cVar;
            this.f137214b = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            Context context = this.f137213a.mo59617g().getContext();
            C89219l.m154716b(context, "");
            new DialogC60307b(context, this.f137214b, booleanValue).show();
            if (booleanValue) {
                for (AbstractC60201c cVar : this.f137214b.f137229a) {
                    cVar.mo97870a(this.f137214b);
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.anchor.multi.p2313a.AbstractC33504a, com.p2082ss.android.ugc.aweme.multi.p3461a.C60195b
    /* renamed from: b */
    public final void mo59605b(C60202d dVar, AbstractC34673c cVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(cVar, "");
        super.mo59605b(dVar, cVar);
        if (dVar.mo97898g() < 2) {
            mo59604a(dVar, cVar);
            return;
        }
        C60194c cVar2 = new C60194c(cVar, dVar);
        AbstractC60201c cVar3 = (AbstractC60201c) C89070n.m154579f((List) dVar.f137229a);
        cVar3.mo97864a().mo97881a(false);
        cVar.mo59618h().setOnClickListener(new View$OnClickListenerC60192a(cVar3, this, cVar, dVar, cVar2));
        m109705a(dVar, new C60193b(cVar2));
        try {
            Object f = C89070n.m154579f((List) dVar.f137229a);
            cVar.mo59615e().setText(R.string.h_c);
            C89379q.m157068constructorimpl((AbstractC60201c) f);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        cVar.mo59617g().setVisibility(0);
        TextView f2 = cVar.mo59616f();
        f2.setVisibility(0);
        f2.setText("(" + dVar.mo97898g() + ')');
    }
}

package com.p2082ss.android.ugc.aweme.editSticker.p2877a;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23322d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.a.j */
public final class C45837j extends AbstractC45824b {
    static {
        Covode.recordClassIndex(54360);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45824b
    /* renamed from: c */
    public final View mo77177c() {
        MethodCollector.m26663i(10380);
        LinearLayout d = mo77178d();
        LinearLayout a = mo77171a(2131230934, R.string.axv);
        a.setOnClickListener(new View$OnClickListenerC45839b(this));
        d.addView(a);
        MethodCollector.m26664o(10380);
        return d;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.a.j$a */
    static final class View$OnClickListenerC45838a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C45837j f106792a;

        static {
            Covode.recordClassIndex(54361);
        }

        View$OnClickListenerC45838a(C45837j jVar) {
            this.f106792a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f106792a.mo77172a();
            AbstractC45840k kVar = this.f106792a.f106786i;
            if (kVar != null) {
                kVar.mo77192b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.a.j$b */
    static final class View$OnClickListenerC45839b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C45837j f106793a;

        static {
            Covode.recordClassIndex(54362);
        }

        View$OnClickListenerC45839b(C45837j jVar) {
            this.f106793a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f106793a.mo77176b();
            AbstractC45840k kVar = this.f106793a.f106786i;
            if (kVar != null) {
                kVar.mo77192b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45824b
    /* renamed from: a */
    public final boolean mo77175a(C23322d dVar) {
        C89219l.m154721d(dVar, "");
        C23322d.C23324b bVar = new C23322d.C23324b();
        bVar.f55280a = 2131230934;
        bVar.f55282c = R.string.axv;
        bVar.f55285f = new View$OnClickListenerC45838a(this);
        dVar.mo38015a(bVar);
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45837j(View view, AbstractC45840k kVar) {
        super(view, kVar);
        C89219l.m154721d(view, "");
    }
}

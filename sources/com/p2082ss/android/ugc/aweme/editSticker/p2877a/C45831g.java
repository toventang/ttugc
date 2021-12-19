package com.p2082ss.android.ugc.aweme.editSticker.p2877a;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23322d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.a.g */
public final class C45831g extends AbstractC45824b {
    static {
        Covode.recordClassIndex(54354);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45824b
    /* renamed from: c */
    public final View mo77177c() {
        MethodCollector.m26663i(10692);
        LinearLayout d = mo77178d();
        LinearLayout a = mo77171a(2131230933, R.string.be2);
        a.setOnClickListener(new View$OnClickListenerC45833b(this));
        d.addView(a);
        MethodCollector.m26664o(10692);
        return d;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.a.g$a */
    static final class View$OnClickListenerC45832a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C45831g f106790a;

        static {
            Covode.recordClassIndex(54355);
        }

        View$OnClickListenerC45832a(C45831g gVar) {
            this.f106790a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f106790a.mo77172a();
            AbstractC45840k kVar = this.f106790a.f106786i;
            if (kVar != null) {
                kVar.mo77192b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.a.g$b */
    static final class View$OnClickListenerC45833b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C45831g f106791a;

        static {
            Covode.recordClassIndex(54356);
        }

        View$OnClickListenerC45833b(C45831g gVar) {
            this.f106791a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f106791a.mo77176b();
            AbstractC45840k kVar = this.f106791a.f106786i;
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
        bVar.f55280a = 2131230933;
        bVar.f55282c = R.string.be2;
        bVar.f55285f = new View$OnClickListenerC45832a(this);
        dVar.mo38015a(bVar);
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45831g(View view, AbstractC45840k kVar) {
        super(view, kVar);
        C89219l.m154721d(view, "");
    }
}

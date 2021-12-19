package com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3859a;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23322d;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45824b;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.a */
public final class C72832a extends AbstractC45824b {

    /* renamed from: l */
    public final boolean f163445l;

    static {
        Covode.recordClassIndex(85523);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45824b
    /* renamed from: c */
    public final View mo77177c() {
        MethodCollector.m26663i(12048);
        LinearLayout d = mo77178d();
        if (!this.f163445l) {
            LinearLayout a = mo77171a(2131230934, R.string.x0);
            a.setOnClickListener(new View$OnClickListenerC72835c(this));
            View e = mo77179e();
            d.addView(a);
            d.addView(e);
        }
        LinearLayout a2 = mo77171a(2131232201, R.string.xk);
        a2.setOnClickListener(new View$OnClickListenerC72836d(this));
        d.addView(a2);
        MethodCollector.m26664o(12048);
        return d;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.a$a */
    static final class View$OnClickListenerC72833a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72832a f163446a;

        static {
            Covode.recordClassIndex(85524);
        }

        View$OnClickListenerC72833a(C72832a aVar) {
            this.f163446a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f163446a.mo77172a();
            AbstractC45840k kVar = this.f163446a.f106786i;
            if (kVar != null) {
                kVar.mo77192b();
            }
            this.f163446a.f106783f.mo77280b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.a$b */
    static final class View$OnClickListenerC72834b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72832a f163447a;

        static {
            Covode.recordClassIndex(85525);
        }

        View$OnClickListenerC72834b(C72832a aVar) {
            this.f163447a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f163447a.mo77172a();
            AbstractC45840k kVar = this.f163447a.f106786i;
            if (kVar != null) {
                kVar.mo77195e();
            }
            this.f163447a.f106783f.mo77280b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.a$c */
    static final class View$OnClickListenerC72835c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72832a f163448a;

        static {
            Covode.recordClassIndex(85526);
        }

        View$OnClickListenerC72835c(C72832a aVar) {
            this.f163448a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f163448a.mo77176b();
            AbstractC45840k kVar = this.f163448a.f106786i;
            if (kVar != null) {
                kVar.mo77192b();
            }
            this.f163448a.f106783f.mo77280b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.a$d */
    static final class View$OnClickListenerC72836d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72832a f163449a;

        static {
            Covode.recordClassIndex(85527);
        }

        View$OnClickListenerC72836d(C72832a aVar) {
            this.f163449a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f163449a.mo77176b();
            AbstractC45840k kVar = this.f163449a.f106786i;
            if (kVar != null) {
                kVar.mo77195e();
            }
            this.f163449a.f106783f.mo77280b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45824b
    /* renamed from: a */
    public final boolean mo77175a(C23322d dVar) {
        C89219l.m154721d(dVar, "");
        if (!this.f163445l) {
            C23322d.C23324b bVar = new C23322d.C23324b();
            bVar.f55280a = 2131230934;
            bVar.f55282c = R.string.x0;
            bVar.f55285f = new View$OnClickListenerC72833a(this);
            dVar.mo38015a(bVar);
            mo77173a(2);
        }
        C23322d.C23324b bVar2 = new C23322d.C23324b();
        bVar2.f55280a = 2131232201;
        bVar2.f55282c = R.string.xk;
        bVar2.f55285f = new View$OnClickListenerC72834b(this);
        dVar.mo38015a(bVar2);
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72832a(View view, AbstractC45840k kVar, boolean z) {
        super(view, kVar);
        C89219l.m154721d(view, "");
        this.f163445l = z;
    }
}

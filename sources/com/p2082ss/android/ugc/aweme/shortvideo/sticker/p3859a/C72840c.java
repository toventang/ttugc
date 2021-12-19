package com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3859a;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23322d;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45824b;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.c */
public final class C72840c extends AbstractC45824b {

    /* renamed from: l */
    public VideoPublishEditModel f163452l;

    static {
        Covode.recordClassIndex(85531);
    }

    /* renamed from: h */
    private final boolean m128617h() {
        if (this.f163452l == null) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45824b
    /* renamed from: c */
    public final View mo77177c() {
        MethodCollector.m26663i(11907);
        LinearLayout d = mo77178d();
        LinearLayout a = mo77171a(2131230935, R.string.axf);
        a.setOnClickListener(new View$OnClickListenerC72843c(this));
        LinearLayout a2 = mo77171a(2131230937, R.string.axa);
        a2.setOnClickListener(new View$OnClickListenerC72844d(this));
        if (m128617h()) {
            d.addView(a);
            d.addView(mo77179e());
        }
        d.addView(a2);
        MethodCollector.m26664o(11907);
        return d;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.c$a */
    static final class View$OnClickListenerC72841a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72840c f163453a;

        static {
            Covode.recordClassIndex(85532);
        }

        View$OnClickListenerC72841a(C72840c cVar) {
            this.f163453a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f163453a.mo77172a();
            AbstractC45840k kVar = this.f163453a.f106786i;
            if (kVar != null) {
                kVar.mo77193c();
            }
            this.f163453a.f106783f.mo77280b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.c$b */
    static final class View$OnClickListenerC72842b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72840c f163454a;

        static {
            Covode.recordClassIndex(85533);
        }

        View$OnClickListenerC72842b(C72840c cVar) {
            this.f163454a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f163454a.mo77172a();
            AbstractC45840k kVar = this.f163454a.f106786i;
            if (kVar != null) {
                kVar.mo77191a();
            }
            this.f163454a.f106783f.mo77280b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.c$c */
    static final class View$OnClickListenerC72843c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72840c f163455a;

        static {
            Covode.recordClassIndex(85534);
        }

        View$OnClickListenerC72843c(C72840c cVar) {
            this.f163455a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f163455a.mo77176b();
            AbstractC45840k kVar = this.f163455a.f106786i;
            if (kVar != null) {
                kVar.mo77193c();
            }
            this.f163455a.f106783f.mo77280b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.c$d */
    static final class View$OnClickListenerC72844d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72840c f163456a;

        static {
            Covode.recordClassIndex(85535);
        }

        View$OnClickListenerC72844d(C72840c cVar) {
            this.f163456a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f163456a.mo77176b();
            AbstractC45840k kVar = this.f163456a.f106786i;
            if (kVar != null) {
                kVar.mo77191a();
            }
            this.f163456a.f106783f.mo77280b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45824b
    /* renamed from: a */
    public final boolean mo77175a(C23322d dVar) {
        C89219l.m154721d(dVar, "");
        if (m128617h()) {
            C23322d.C23324b bVar = new C23322d.C23324b();
            bVar.f55280a = 2131230935;
            bVar.f55282c = R.string.axf;
            bVar.f55285f = new View$OnClickListenerC72841a(this);
            dVar.mo38015a(bVar);
            mo77173a(2);
        }
        C23322d.C23324b bVar2 = new C23322d.C23324b();
        bVar2.f55280a = 2131230937;
        bVar2.f55282c = R.string.axa;
        bVar2.f55285f = new View$OnClickListenerC72842b(this);
        dVar.mo38015a(bVar2);
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72840c(View view, AbstractC45840k kVar) {
        super(view, kVar);
        C89219l.m154721d(view, "");
    }
}

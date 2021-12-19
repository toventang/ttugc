package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3819qa;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23322d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45824b;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k;
import com.p2082ss.android.ugc.aweme.qasticker.C65863a;
import com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.EditPageQaStickerViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.d */
public final class C71260d extends AbstractC45824b {

    /* renamed from: l */
    public final EditPageQaStickerViewModel f159710l;

    static {
        Covode.recordClassIndex(83776);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45824b
    /* renamed from: c */
    public final View mo77177c() {
        MethodCollector.m26663i(9808);
        LinearLayout d = mo77178d();
        LinearLayout a = mo77171a(2131230934, R.string.axv);
        a.setOnClickListener(new View$OnClickListenerC71263c(this));
        LinearLayout a2 = mo77171a(2131230961, R.string.f0e);
        a2.setOnClickListener(new View$OnClickListenerC71264d(this));
        d.addView(a2);
        d.addView(mo77179e());
        d.addView(a);
        MethodCollector.m26664o(9808);
        return d;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.d$a */
    static final class View$OnClickListenerC71261a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C71260d f159711a;

        static {
            Covode.recordClassIndex(83777);
        }

        View$OnClickListenerC71261a(C71260d dVar) {
            this.f159711a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f159711a.mo77172a();
            AbstractC45840k kVar = this.f159711a.f106786i;
            if (kVar != null) {
                kVar.mo77192b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.d$c */
    static final class View$OnClickListenerC71263c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C71260d f159713a;

        static {
            Covode.recordClassIndex(83779);
        }

        View$OnClickListenerC71263c(C71260d dVar) {
            this.f159713a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f159713a.mo77176b();
            AbstractC45840k kVar = this.f159713a.f106786i;
            if (kVar != null) {
                kVar.mo77192b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.d$d */
    static final class View$OnClickListenerC71264d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C71260d f159714a;

        static {
            Covode.recordClassIndex(83780);
        }

        View$OnClickListenerC71264d(C71260d dVar) {
            this.f159714a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f159714a.mo77176b();
            AbstractC45840k kVar = this.f159714a.f106786i;
            if (kVar != null) {
                kVar.mo77196f();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.d$b */
    static final class View$OnClickListenerC71262b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C71260d f159712a;

        static {
            Covode.recordClassIndex(83778);
        }

        View$OnClickListenerC71262b(C71260d dVar) {
            this.f159712a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C65863a aVar = this.f159712a.f159710l.f185407b;
            if (aVar.f148412b != null) {
                C39162r.m79460a("click_question_to_text", aVar.mo105008a().f188764a);
            }
            this.f159712a.mo77172a();
            AbstractC45840k kVar = this.f159712a.f106786i;
            if (kVar != null) {
                kVar.mo77196f();
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
        bVar.f55285f = new View$OnClickListenerC71261a(this);
        dVar.mo38015a(bVar);
        C23322d.C23324b bVar2 = new C23322d.C23324b();
        bVar2.f55280a = 2131230961;
        bVar2.f55282c = R.string.f0e;
        bVar2.f55285f = new View$OnClickListenerC71262b(this);
        dVar.mo38015a(bVar2);
        mo77173a(2);
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71260d(View view, AbstractC45840k kVar) {
        super(view, kVar);
        C89219l.m154721d(view, "");
        Context context = this.f106782e;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) context).mo33800a(EditPageQaStickerViewModel.class);
        C89219l.m154716b(a, "");
        this.f159710l = (EditPageQaStickerViewModel) a;
    }
}

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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.b */
public final class C72837b extends AbstractC45824b {
    static {
        Covode.recordClassIndex(85528);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45824b
    /* renamed from: c */
    public final View mo77177c() {
        MethodCollector.m26663i(12488);
        LinearLayout d = mo77178d();
        LinearLayout a = mo77171a(2131230937, R.string.axa);
        a.setOnClickListener(new View$OnClickListenerC72839b(this));
        d.addView(a);
        MethodCollector.m26664o(12488);
        return d;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.b$a */
    static final class View$OnClickListenerC72838a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72837b f163450a;

        static {
            Covode.recordClassIndex(85529);
        }

        View$OnClickListenerC72838a(C72837b bVar) {
            this.f163450a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f163450a.mo77172a();
            AbstractC45840k kVar = this.f163450a.f106786i;
            if (kVar != null) {
                kVar.mo77191a();
            }
            this.f163450a.f106783f.mo77280b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.b$b */
    static final class View$OnClickListenerC72839b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72837b f163451a;

        static {
            Covode.recordClassIndex(85530);
        }

        View$OnClickListenerC72839b(C72837b bVar) {
            this.f163451a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f163451a.mo77176b();
            AbstractC45840k kVar = this.f163451a.f106786i;
            if (kVar != null) {
                kVar.mo77191a();
            }
            this.f163451a.f106783f.mo77280b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45824b
    /* renamed from: a */
    public final boolean mo77175a(C23322d dVar) {
        C89219l.m154721d(dVar, "");
        C23322d.C23324b bVar = new C23322d.C23324b();
        bVar.f55280a = 2131230937;
        bVar.f55282c = R.string.axa;
        bVar.f55285f = new View$OnClickListenerC72838a(this);
        dVar.mo38015a(bVar);
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72837b(View view, AbstractC45840k kVar) {
        super(view, kVar);
        C89219l.m154721d(view, "");
    }
}

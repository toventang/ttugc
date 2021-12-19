package com.p2082ss.android.ugc.aweme.inbox.p3272g;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.inbox.C56309ac;
import com.p2082ss.android.ugc.aweme.inbox.C56407f;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66620d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.g.e */
public final class C56440e extends AbstractC56447g<C56309ac> {

    /* renamed from: g */
    private final AbstractC66620d f128710g;

    static {
        Covode.recordClassIndex(66260);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.g.e$a */
    static final class View$OnClickListenerC56441a implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC56441a f128711a = new View$OnClickListenerC56441a();

        static {
            Covode.recordClassIndex(66261);
        }

        View$OnClickListenerC56441a() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C56407f.m102373a(C564421.f128712a);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.inbox.p3272g.AbstractC56447g
    /* renamed from: b */
    public final void mo93408b(C56520b bVar) {
        C89219l.m154721d(bVar, "");
        super.mo93408b(bVar);
        this.f128710g.mo61469a(bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56440e(AbstractC66620d dVar) {
        super((View) dVar);
        C89219l.m154721d(dVar, "");
        this.f128710g = dVar;
        dVar.setEnterFrom("notification_page");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.inbox.ad] */
    @Override // com.p2082ss.android.ugc.aweme.inbox.p3272g.AbstractC56447g
    /* renamed from: a */
    public final /* synthetic */ void mo93406a(C56309ac acVar) {
        C56309ac acVar2 = acVar;
        C89219l.m154721d(acVar2, "");
        this.f128710g.mo61470a(acVar2.f128460a, acVar2.f128461b);
        this.f128710g.setOutClickListener(View$OnClickListenerC56441a.f128711a);
    }
}

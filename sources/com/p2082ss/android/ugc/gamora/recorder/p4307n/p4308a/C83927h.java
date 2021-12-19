package com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.ktx.C22227b;
import com.bytedance.scene.navigation.C22239d;
import com.p2082ss.android.ugc.aweme.shortvideo.C69838ap;
import com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.AbstractC83906b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.n.a.h */
public final class C83927h extends AbstractC22219j {

    /* renamed from: c */
    public static final C83928a f187351c = new C83928a((byte) 0);

    /* renamed from: a */
    C83908c f187352a;

    /* renamed from: b */
    final AbstractC83906b f187353b;

    /* renamed from: d */
    private RecyclerView f187354d;

    /* renamed from: e */
    private final AbstractC89244h f187355e = C89250i.m154773a((AbstractC89171a) new C83930c(this));

    /* renamed from: f */
    private final AbstractC89171a<C89391z> f187356f;

    static {
        Covode.recordClassIndex(97818);
    }

    /* renamed from: a */
    private final AbstractC83906b.AbstractC83907a m144358a() {
        return (AbstractC83906b.AbstractC83907a) this.f187355e.getValue();
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.n.a.h$a */
    public static final class C83928a {
        static {
            Covode.recordClassIndex(97819);
        }

        private C83928a() {
        }

        public /* synthetic */ C83928a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.n.a.h$c */
    static final class C83930c extends AbstractC89220m implements AbstractC89171a<C83905a> {

        /* renamed from: a */
        final /* synthetic */ C83927h f187358a;

        static {
            Covode.recordClassIndex(97821);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83930c(C83927h hVar) {
            super(0);
            this.f187358a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C83905a invoke() {
            return new C83905a(new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.C83927h.C83930c.C839311 */

                /* renamed from: a */
                final /* synthetic */ C83930c f187359a;

                static {
                    Covode.recordClassIndex(97822);
                }

                {
                    this.f187359a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    C83927h hVar = this.f187359a.f187358a;
                    C83908c cVar = hVar.f187352a;
                    if (cVar == null) {
                        C89219l.m154710a("adapter");
                    }
                    cVar.mo128803a(C83937j.m144371a(hVar.f187353b));
                    return C89391z.f203057a;
                }
            });
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        this.f187353b.mo128797b(m144358a());
        this.f187356f.invoke();
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.n.a.h$b */
    static final class View$OnClickListenerC83929b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83927h f187357a;

        static {
            Covode.recordClassIndex(97820);
        }

        View$OnClickListenerC83929b(C83927h hVar) {
            this.f187357a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C22239d a = C22227b.m41825a(this.f187357a);
            if (a == null) {
                C89219l.m154715b();
            }
            a.mo36524E();
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        View c = mo36475c(R.id.clo);
        C89219l.m154716b(c, "");
        View findViewById = c.findViewById(R.id.dgv);
        C89219l.m154716b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f187354d = recyclerView;
        if (recyclerView == null) {
            C89219l.m154710a("toolbarHiddenRecyclerView");
        }
        mo36486t();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.f187352a = new C83908c(C83937j.m144371a(this.f187353b));
        RecyclerView recyclerView2 = this.f187354d;
        if (recyclerView2 == null) {
            C89219l.m154710a("toolbarHiddenRecyclerView");
        }
        C83908c cVar = this.f187352a;
        if (cVar == null) {
            C89219l.m154710a("adapter");
        }
        recyclerView2.setAdapter(cVar);
        C69838ap apVar = new C69838ap(mo36486t());
        Drawable a = C0643b.m2369a(mo36486t(), (int) R.drawable.h9);
        if (a == null) {
            C89219l.m154715b();
        }
        apVar.mo4960a(a);
        RecyclerView recyclerView3 = this.f187354d;
        if (recyclerView3 == null) {
            C89219l.m154710a("toolbarHiddenRecyclerView");
        }
        recyclerView3.mo4402a(apVar);
        c.setOnClickListener(new View$OnClickListenerC83929b(this));
        this.f187353b.mo128793a(m144358a());
    }

    public C83927h(AbstractC83906b bVar, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        this.f187353b = bVar;
        this.f187356f = aVar;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.bi1, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }
}

package com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a;

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
import com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.AbstractC52708i;
import com.p2082ss.android.ugc.aweme.shortvideo.C69838ap;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.l.a.f */
public final class C52697f extends AbstractC22219j {

    /* renamed from: c */
    public static final C52698a f121303c = new C52698a((byte) 0);

    /* renamed from: a */
    C52685b f121304a;

    /* renamed from: b */
    final AbstractC52708i f121305b;

    /* renamed from: d */
    private RecyclerView f121306d;

    /* renamed from: e */
    private final AbstractC89244h f121307e = C89250i.m154773a((AbstractC89171a) new C52700c(this));

    /* renamed from: f */
    private final AbstractC89171a<C89391z> f121308f;

    static {
        Covode.recordClassIndex(62093);
    }

    /* renamed from: a */
    private final AbstractC52708i.AbstractC52709a m97568a() {
        return (AbstractC52708i.AbstractC52709a) this.f121307e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a.f$a */
    public static final class C52698a {
        static {
            Covode.recordClassIndex(62094);
        }

        private C52698a() {
        }

        public /* synthetic */ C52698a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a.f$c */
    static final class C52700c extends AbstractC89220m implements AbstractC89171a<C52684a> {

        /* renamed from: a */
        final /* synthetic */ C52697f f121310a;

        static {
            Covode.recordClassIndex(62096);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52700c(C52697f fVar) {
            super(0);
            this.f121310a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C52684a invoke() {
            return new C52684a(new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.C52697f.C52700c.C527011 */

                /* renamed from: a */
                final /* synthetic */ C52700c f121311a;

                static {
                    Covode.recordClassIndex(62097);
                }

                {
                    this.f121311a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    C52697f fVar = this.f121311a.f121310a;
                    C52685b bVar = fVar.f121304a;
                    if (bVar == null) {
                        C89219l.m154710a("adapter");
                    }
                    bVar.mo88370a(C52707h.m97577a(fVar.f121305b));
                    return C89391z.f203057a;
                }
            });
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        this.f121305b.mo88385b(m97568a());
        this.f121308f.invoke();
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a.f$b */
    static final class View$OnClickListenerC52699b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52697f f121309a;

        static {
            Covode.recordClassIndex(62095);
        }

        View$OnClickListenerC52699b(C52697f fVar) {
            this.f121309a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C22239d a = C22227b.m41825a(this.f121309a);
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
        this.f121306d = recyclerView;
        if (recyclerView == null) {
            C89219l.m154710a("toolbarHiddenRecyclerView");
        }
        mo36486t();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.f121304a = new C52685b(C52707h.m97577a(this.f121305b));
        RecyclerView recyclerView2 = this.f121306d;
        if (recyclerView2 == null) {
            C89219l.m154710a("toolbarHiddenRecyclerView");
        }
        C52685b bVar = this.f121304a;
        if (bVar == null) {
            C89219l.m154710a("adapter");
        }
        recyclerView2.setAdapter(bVar);
        C69838ap apVar = new C69838ap(mo36486t());
        Drawable a = C0643b.m2369a(mo36486t(), (int) R.drawable.h9);
        if (a == null) {
            C89219l.m154715b();
        }
        apVar.mo4960a(a);
        RecyclerView recyclerView3 = this.f121306d;
        if (recyclerView3 == null) {
            C89219l.m154710a("toolbarHiddenRecyclerView");
        }
        recyclerView3.mo4402a(apVar);
        c.setOnClickListener(new View$OnClickListenerC52699b(this));
        this.f121305b.mo88381a(m97568a());
    }

    public C52697f(AbstractC52708i iVar, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(aVar, "");
        this.f121305b = iVar;
        this.f121308f = aVar;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.a38, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }
}

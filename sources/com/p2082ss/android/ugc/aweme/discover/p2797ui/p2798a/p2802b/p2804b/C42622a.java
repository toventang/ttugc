package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.p2804b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.AbstractC42621b;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67441f;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.b.a */
public final class C42622a extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final AbstractC89244h f99429a;

    /* renamed from: b */
    public C67441f f99430b;

    /* renamed from: c */
    public final AbstractC42621b f99431c;

    /* renamed from: d */
    private final AbstractC89244h f99432d;

    static {
        Covode.recordClassIndex(50726);
    }

    /* renamed from: a */
    public final View mo72820a() {
        return (View) this.f99432d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.b.a$b */
    static final class C42624b extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ View f99434a;

        static {
            Covode.recordClassIndex(50728);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42624b(View view) {
            super(0);
            this.f99434a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f99434a.findViewById(R.id.axs);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.b.a$c */
    static final class C42625c extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ View f99435a;

        static {
            Covode.recordClassIndex(50729);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42625c(View view) {
            super(0);
            this.f99435a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f99435a.findViewById(R.id.ew5);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.b.a$a */
    public static final class View$OnClickListenerC42623a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42622a f99433a;

        static {
            Covode.recordClassIndex(50727);
        }

        public View$OnClickListenerC42623a(C42622a aVar) {
            this.f99433a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            View view2 = this.f99433a.itemView;
            C89219l.m154716b(view2, "");
            view2.setVisibility(8);
            AbstractC42621b bVar = this.f99433a.f99431c;
            C67441f fVar = this.f99433a.f99430b;
            if (fVar == null) {
                C89219l.m154710a("mFilterMore");
            }
            bVar.mo72809a(fVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42622a(View view, AbstractC42621b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        this.f99431c = bVar;
        this.f99432d = C89250i.m154773a((AbstractC89171a) new C42624b(view));
        this.f99429a = C89250i.m154773a((AbstractC89171a) new C42625c(view));
    }
}

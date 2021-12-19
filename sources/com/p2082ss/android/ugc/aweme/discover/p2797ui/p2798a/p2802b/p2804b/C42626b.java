package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.p2804b;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.C42604a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.AbstractC42621b;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67438c;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67442g;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.b.b */
public final class C42626b extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final AbstractC89244h f99436a;

    /* renamed from: b */
    public final C42604a f99437b;

    /* renamed from: c */
    public final AbstractC42621b f99438c;

    /* renamed from: d */
    private final AbstractC89244h f99439d;

    static {
        Covode.recordClassIndex(50730);
    }

    /* renamed from: a */
    public final ImageView mo72822a() {
        return (ImageView) this.f99439d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.b.b$b */
    static final class C42628b extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ View f99442a;

        static {
            Covode.recordClassIndex(50732);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42628b(View view) {
            super(0);
            this.f99442a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f99442a.findViewById(R.id.b1w);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.b.b$c */
    static final class C42629c extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ View f99443a;

        static {
            Covode.recordClassIndex(50733);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42629c(View view) {
            super(0);
            this.f99443a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f99443a.findViewById(R.id.b24);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.b.b$a */
    public static final class View$OnClickListenerC42627a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42626b f99440a;

        /* renamed from: b */
        final /* synthetic */ C67442g f99441b;

        static {
            Covode.recordClassIndex(50731);
        }

        public View$OnClickListenerC42627a(C42626b bVar, C67442g gVar) {
            this.f99440a = bVar;
            this.f99441b = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C67438c filterOptionStruct = this.f99441b.getFilterOptionStruct();
            if (filterOptionStruct != null) {
                filterOptionStruct.selectOption(this.f99441b);
            }
            this.f99440a.f99437b.notifyDataSetChanged();
            this.f99440a.f99438c.mo72810b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42626b(View view, C42604a aVar, AbstractC42621b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        this.f99437b = aVar;
        this.f99438c = bVar;
        this.f99436a = C89250i.m154773a((AbstractC89171a) new C42628b(view));
        this.f99439d = C89250i.m154773a((AbstractC89171a) new C42629c(view));
    }
}

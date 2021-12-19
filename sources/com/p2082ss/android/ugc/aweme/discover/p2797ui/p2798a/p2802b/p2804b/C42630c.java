package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.p2804b;

import android.view.View;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.C42604a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.AbstractC42621b;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67436a;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67443h;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.b.c */
public final class C42630c extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final C42604a f99444a;

    /* renamed from: b */
    public final AbstractC42621b f99445b;

    /* renamed from: c */
    private final AbstractC89244h f99446c;

    static {
        Covode.recordClassIndex(50734);
    }

    /* renamed from: a */
    public final TuxTextCell mo72824a() {
        return (TuxTextCell) this.f99446c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.b.c$b */
    static final class C42632b extends AbstractC89220m implements AbstractC89171a<TuxTextCell> {

        /* renamed from: a */
        final /* synthetic */ View f99450a;

        static {
            Covode.recordClassIndex(50736);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42632b(View view) {
            super(0);
            this.f99450a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextCell invoke() {
            return this.f99450a.findViewById(R.id.b28);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.b.c$a */
    public static final class C42631a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC23293c.C23309j f99447a;

        /* renamed from: b */
        final /* synthetic */ C42630c f99448b;

        /* renamed from: c */
        final /* synthetic */ C67443h f99449c;

        static {
            Covode.recordClassIndex(50735);
        }

        public C42631a(AbstractC23293c.C23309j jVar, C42630c cVar, C67443h hVar) {
            this.f99447a = jVar;
            this.f99448b = cVar;
            this.f99449c = hVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C67436a activityOptionStruct = this.f99449c.getActivityOptionStruct();
            if (activityOptionStruct != null) {
                activityOptionStruct.selectOption(this.f99449c, z);
            }
            this.f99448b.f99445b.mo72810b();
            this.f99447a.mo37959c(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42630c(View view, C42604a aVar, AbstractC42621b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        this.f99444a = aVar;
        this.f99445b = bVar;
        this.f99446c = C89250i.m154773a((AbstractC89171a) new C42632b(view));
    }
}
